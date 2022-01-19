package sg.edu.tp.streamnow;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Search extends AppCompatActivity {

    TextView searchBar;
    ImageButton Pop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        //Initialize and assign variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation2);

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
                        return true;

                    case R.id.library:
                        startActivity(new Intent(getApplicationContext(), MyLibrary.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        Pop = findViewById(R.id.PopBtn);
        Pop.setOnClickListener(v -> {
            Intent intent = new Intent(Search.this, PopSongs.class);
            startActivity(intent);
        });

        searchBar = findViewById(R.id.editTextTextPersonName);
        searchBar.setOnClickListener(v -> {
            Intent intent = new Intent(Search.this, SearchSong.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        });

    }

}