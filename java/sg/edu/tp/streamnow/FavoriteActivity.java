package sg.edu.tp.streamnow;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FavoriteActivity extends AppCompatActivity {

    RecyclerView favList;
    SongAdaptor songAdaptor;
    TextView imageButton;
    SongCollection songCollection = new SongCollection();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        favList = findViewById(R.id.RecyclerView);

        //Initialize and assign variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation10);

        //set home selected
        bottomNavigationView.setSelectedItemId(R.id.library);

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

        songAdaptor = new SongAdaptor(PopSongs.favList);
        favList.setAdapter(songAdaptor);
        favList.setLayoutManager(new LinearLayoutManager(this));

    }


}