package sg.edu.tp.streamnow;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlaySongActivity extends AppCompatActivity{

    //attributes
    private String title = "";
    private String artiste = "";
    private String fileLink = "";
    private String songLocation = "";
    private String songLength = "";
    private String mvVideo = "";
    private int drawable;
    private String lyrics = "";
    private int currentIndex = -1;

    //3 attributes are used to play the music
    private MediaPlayer player = new MediaPlayer();
    private ImageButton btnPlayPause = null;
    private SongCollection songCollection = new SongCollection();

    List<Song> shuffleList = Arrays.asList(songCollection.songs);

    SeekBar seekBar;
    Handler handler = new Handler();

    ImageButton repeatBtn;
    ImageButton shuffleBtn;
    Boolean repeatFlag = false;
    Boolean shuffleFlag = false;


    ArrayList<Song> favList = new ArrayList<Song>();

    @Override
    protected void onStart() {
        super.onStart();
        seekBar.setMax(player.getDuration());
        handler.removeCallbacks(p_bar);
        handler.postDelayed(p_bar, 500);
        Log.d("seekbar", "working");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_play_song);
        btnPlayPause = findViewById(R.id.btnPlayPause);

        //get the index value from the intent, which was brought from the first screen
        Bundle songData = this.getIntent().getExtras();
        currentIndex = songData.getInt("index");
        Log.d("temasek", "Retrieved position is :" + currentIndex);
        displaySongBasedOnIndex(currentIndex);
        playSong(fileLink);
        findViewById(R.id.txtSongTitle).setSelected(true);

        seekBar = findViewById(R.id.seekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String musicProgress = "";
                TextView timeProgress = (TextView) findViewById(R.id.currentSongLength);

                int min = progress/1000/60;
                int sec = progress/1000%60;

                musicProgress += min + ":";

                if (sec < 10) musicProgress += "0";
                musicProgress += sec;

                timeProgress.setText(musicProgress);
                }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                player.seekTo(seekBar.getProgress());

            }
        });

        repeatBtn = findViewById(R.id.loopbtn);
        shuffleBtn = findViewById(R.id.shuffleBtn);


    }//end of onCreate


    Runnable p_bar = new Runnable() {
        @Override
        public void run() {
            if (player != null && player.isPlaying()) {
                seekBar.setProgress(player.getCurrentPosition());
            }
            handler.postDelayed(this, 500);
        }
    };//end of p_bar runnable

    //method is to retrieve the song data for displaying purpose
    public void displaySongBasedOnIndex(int selectedIndex) {
        Song song = songCollection.getCurrentSong(currentIndex);
        title = song.getTitle() ;
        artiste = song.getArtiste();
        fileLink = song.getFileLink();
        drawable = song.getDrawable();
        songLocation = song.getSongLocation();
        songLength = song.getSongLength();

        TextView txtSongLength = findViewById(R.id.txtSongLength);
        txtSongLength.setText(songLength);

        TextView txtTitle = findViewById(R.id.txtSongTitle);
        txtTitle.setText(title);

        TextView txtArtiste = findViewById(R.id.txtArtist);//the id must be the same as the component on the page
        txtArtiste.setText(artiste);

        TextView txtSongLocation = findViewById(R.id.txtSongLocation);
        txtSongLocation.setText(songLocation);

        ImageView iCoverArt = findViewById(R.id.imgCoverArt);
        iCoverArt.setImageResource(drawable);
    }//end of DisplaySongBasedOnIndex

    public void playSong(String songUrl) {
            try {
                Log.d("temasek", "Playing");
                player.reset();
                player.setDataSource(songUrl);
                player.prepare();
                player.start();
                gracefullyStopsWhenMusicEnds();
                btnPlayPause.setBackgroundResource(R.drawable.play);
                setTitle(title);

            }
            catch (IOException e) {
                e.printStackTrace();
            }
    }//end of playSong


    public void playOrPauseMusic(View view) {
        if (player.isPlaying()) { //if player is playing
            player.pause();
            btnPlayPause.setBackgroundResource(R.drawable.pause);

        } else {
            player.start();
            btnPlayPause.setBackgroundResource(R.drawable.play);
        }
    }//end of playOrPauseMusic

    private void gracefullyStopsWhenMusicEnds() {
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onCompletion(MediaPlayer mp) {

                if (repeatFlag){
                    playOrPauseMusic(null);
                    Log.d("temasek", "song repeat");

                }else {
                    btnPlayPause.setBackgroundResource(R.drawable.pause);
                }

                if (shuffleFlag){
                    currentIndex = songCollection.getNextSong(currentIndex);
                    displaySongBasedOnIndex(currentIndex);
                    playSong(fileLink);
                }

            }
        });
    }//end of gracefullyStopsWhenMusicEnds

    public void playPrevious(View view) {
        currentIndex = songCollection.getPrevSong(currentIndex);
        Log.d("temasek", "After playPrevious, the index is now :" + currentIndex);
        displaySongBasedOnIndex(currentIndex);
        playSong(fileLink);
    }//end of playPrevious

    public void playNext(View view) {
        currentIndex = songCollection.getNextSong(currentIndex);
        Log.d("temasek", "After playNext, the index is now :" + currentIndex);
        displaySongBasedOnIndex(currentIndex);
        playSong(fileLink);
    }//end of playNext

    public void repeatSong(View view) {

        if (repeatFlag) { //if repeatFlag is true
            repeatBtn.setBackgroundResource(R.drawable.loop);

        } else { //if repeatFlag is false
            repeatBtn.setBackgroundResource(R.drawable.loop_on);
            }
        repeatFlag = !repeatFlag;
    }//end of repeat song

    public void shuffleSong(View view) {

        if (shuffleFlag) {
            shuffleBtn.setBackgroundResource(R.drawable.shuffle);
            songCollection  = new SongCollection();
            Log.d("temasek", "shuffle off");

        } else
        { shuffleBtn.setBackgroundResource(R.drawable.shuffle_on);
            Collections.shuffle(shuffleList);
            shuffleList.toArray(songCollection.songs);
            Log.d("temasek", String.valueOf(shuffleList));
        }
        shuffleFlag = !shuffleFlag;
    }//end of shuffle song

    public void mvVieo (View view){
        Song song = songCollection.getCurrentSong(currentIndex);
        String mvVideoLink = song.getMvLink();
        String songLocation = song.getSongLocation();
        String songTitle = song.getTitle();
        String songArtist = song.getArtiste();
        Log.d("youtubeMV", "mvVieo: " + mvVideoLink);
        sendDataToActivity(mvVideoLink, songLocation, songTitle, songArtist);
    }

    private void sendDataToActivity(String mvVideoLink, String songLocation, String songTitle, String songArtist) {
        Intent intent = new Intent(this, MusicVideo.class);
        intent.putExtra("mvVideoLink", mvVideoLink);
        intent.putExtra("songLocation", songLocation);
        intent.putExtra("songTitle", songTitle);
        intent.putExtra("songArtist", songArtist);
        player.pause();
        btnPlayPause.setBackgroundResource(R.drawable.pause);
        startActivity(intent);
    }

    public void openLyrics(View view){
        Song song = songCollection.getCurrentSong(currentIndex);
        String lyrics = song.getLyrics();
        String songTitle = song.getTitle();
        String songArtist = song.getArtiste();
        int songDrawable = song.getDrawable();
        sendDataToActivity(lyrics, songTitle, songArtist, songDrawable);
    }

    private void sendDataToActivity(String lyrics, String songTitle, String songArtist, int songDrawable) {
        Intent intent = new Intent(this, Lyrics.class);
        intent.putExtra("lyrics", lyrics);
        intent.putExtra("songTitle", songTitle);
        intent.putExtra("songArtist", songArtist);
        intent.putExtra("songDrawable", songDrawable);
        startActivity(intent);
    }
}