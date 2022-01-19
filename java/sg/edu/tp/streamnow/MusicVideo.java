package sg.edu.tp.streamnow;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MusicVideo extends YouTubeBaseActivity {

    ImageButton playBtn;
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    String mvLink = "";
    String songLocation = "";
    String songTitle = "";
    String songArtist = "";

    @Override
    protected void onStart() {
        super.onStart();
        youTubePlayerView.initialize("AIzaSyAyL6SO2tQtY92HtgDx4j3RBi7lNJuhULU", onInitializedListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_video);

        Bundle SongLocation = this.getIntent().getExtras();
        songLocation = SongLocation.getString("songLocation");
        TextView songLocations = findViewById(R.id.SongLocation);
        songLocations.setText(songLocation);

        Bundle SongTitle = this.getIntent().getExtras();
        songTitle = SongTitle.getString("songTitle");
        TextView songTitles = findViewById(R.id.songTitle);
        songTitles.setText(songTitle);
        findViewById(R.id.songTitle).setSelected(true);

        Bundle SongArtist = this.getIntent().getExtras();
        songArtist = SongArtist.getString("songArtist");
        TextView songArtists = findViewById(R.id.SongArtist);
        songArtists.setText(songArtist);

        playBtn = findViewById(R.id.btnPlayPause2);
        playBtn.setBackgroundResource(R.drawable.pause);

        Bundle mvMusicLink = this.getIntent().getExtras();
        mvLink = mvMusicLink.getString("mvVideoLink");
        Log.d("youtubeMV", "MV link" + mvLink);

        youTubePlayerView = findViewById(R.id.YoutubePlayer);

        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo(mvLink);
                youTubePlayer.setFullscreen(false);
                playBtn.setBackgroundResource(R.drawable.play);
                Toast.makeText(MusicVideo.this, "Playing video " + songTitle, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Toast.makeText(MusicVideo.this, "Error, " + youTubeInitializationResult, Toast.LENGTH_SHORT).show();
            }
        };


    }
    public void backBtn(View view){
        Intent openMainActivity = new Intent(MusicVideo.this, PlaySongActivity.class);
        openMainActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivityIfNeeded(openMainActivity, 0);
        finish();
    }

}