package sg.edu.tp.streamnow;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class MyLibrary extends AppCompatActivity {

    TextView name, email;
    Button signOutBtn;
    private ImageView profile_pic;

    private FirebaseAuth mFirebaseAuth;

    GoogleSignInClient mGoogleSignInClient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_library);

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
                        return true;
                }
                return false;
            }
        });

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
        mFirebaseAuth = FirebaseAuth.getInstance();

        profile_pic = findViewById(R.id.showProfile);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);

        signOutBtn = findViewById(R.id.signOutBtn);
        signOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    // ...
                    case R.id.signOutBtn:
                        signOut();
                        finish();
                        // ...
                    }
                }
        });


        FirebaseUser mFirebaseUser = mFirebaseAuth.getCurrentUser();

        if (mFirebaseUser != null) {
            String personName = mFirebaseUser.getDisplayName();
            String personEmail = mFirebaseUser.getEmail();
            Uri personPhoto = mFirebaseUser.getPhotoUrl();

            name.setText(personName);
            email.setText(personEmail);
            Picasso.get().load(personPhoto).placeholder(R.drawable.profile_pic).into(profile_pic);
        }

    }

    private void signOut() {
        mFirebaseAuth.signOut();
        Toast.makeText(MyLibrary.this, "Signed out successfully", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MyLibrary.this, StartPage.class);
        startActivity(intent);
        finish();
        // ...
    }//end of signOut

    public void gotoFavoriteActivity(View view) {
        Intent intent = new Intent(this, FavoriteActivity.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }

}