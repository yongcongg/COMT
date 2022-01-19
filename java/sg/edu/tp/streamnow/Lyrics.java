package sg.edu.tp.streamnow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.jmusixmatch.MusixMatch;

public class Lyrics extends AppCompatActivity {

    String songLyrics = "";
    String songArtists = "";
    String songTitles = "";
    TextView songLyricsView;
    TextView Artist;
    TextView Title;
    ImageView songPicture;
    private int drawable;

    String apiKey = "cc0b4dcd653b656e271903b62616bbb7";
    MusixMatch musixMatch = new MusixMatch(apiKey);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics);
        findViewById(R.id.songTitle).setSelected(true);

        Bundle lyrics = this.getIntent().getExtras();
        songLyrics = lyrics.getString("lyrics");
        songLyricsView = findViewById(R.id.songLyricsView);
        songLyricsView.setText(songLyrics);

        Bundle songTitle = this.getIntent().getExtras();
        songTitles = songTitle.getString("songTitle");
        Title = findViewById(R.id.songTitle);
        Title.setText(songTitles);

        Bundle songArtist = this.getIntent().getExtras();
        songArtists = songArtist.getString("songArtist");
        Artist = findViewById(R.id.songArtists);
        Artist.setText(songArtists);

        Bundle songDrawable = this.getIntent().getExtras();
        drawable = songDrawable.getInt("songDrawable");
        songPicture= findViewById(R.id.imageView4);
        songPicture.setImageResource(drawable);

    }
    public void backBtn(View view){
        Intent openMainActivity = new Intent(this, PlaySongActivity.class);
        openMainActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivityIfNeeded(openMainActivity, 0);
        finish();
    }


}