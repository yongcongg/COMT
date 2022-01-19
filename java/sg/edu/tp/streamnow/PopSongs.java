package sg.edu.tp.streamnow;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class PopSongs extends AppCompatActivity {

    SongCollection songCollection = new SongCollection();
    static ArrayList<Song> favList = new ArrayList<Song>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_songs);

        //Initialize and assign variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation4);

        //set home selected
        bottomNavigationView.setSelectedItemId(R.id.search);

        //Perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.search:
                        startActivity(new Intent(getApplicationContext(), Search.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.library:
                        startActivity(new Intent(getApplicationContext(), MyLibrary.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }

    public void handleSelection(View myView) {
        String resourceId = getResources().getResourceEntryName(myView.getId());
        int currentArrayIndex = (int) songCollection.searchSongById(resourceId);
        Log.d("temasek", "The index in the array for this song is :" + currentArrayIndex);
        sendDataToActivity(currentArrayIndex);
    }

    public void sendDataToActivity(int index){
        Intent intent = new Intent(this, PlaySongActivity.class);
        intent.putExtra("index", index);
        startActivity(intent);
    }

    public void addToFavorite(View myview){
        String songID = myview.getContentDescription().toString();
        int currentArrayIndex = (int) songCollection.searchSongById(songID);
        Song song = songCollection.getCurrentSong(currentArrayIndex);
        Log.d("temasek", "addToFavorite: " + currentArrayIndex);
        Toast.makeText(this, song.getTitle() + " is added into liked playlist", Toast.LENGTH_SHORT).show();
        favList.add(song);
    }


}