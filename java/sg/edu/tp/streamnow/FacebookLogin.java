package sg.edu.tp.streamnow;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class FacebookLogin extends AppCompatActivity {

    private CallbackManager mCallBackManager;
    private FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;
    private TextView textViewUser;
    private LoginButton loginButton;
    private ImageView mLogo;
    private AccessTokenTracker accessTokenTracker;


    @Override
    protected void onStart() {
        super.onStart();
        mFirebaseAuth.addAuthStateListener(authStateListener);
        FirebaseUser currentUser = mFirebaseAuth.getCurrentUser();
        if (currentUser != null){
            Intent intent = new Intent(FacebookLogin.this, MainActivity.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(authStateListener != null){
            mFirebaseAuth.removeAuthStateListener(authStateListener);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_login);

        AccessToken accessToken = AccessToken.getCurrentAccessToken();
        boolean isLoggedIn = accessToken != null && !accessToken.isExpired();

        mFirebaseAuth = FirebaseAuth.getInstance();
        FacebookSdk.sdkInitialize(getApplicationContext());

        loginButton = findViewById(R.id.login_button);
        loginButton.setReadPermissions("email", "public_profile");
        mCallBackManager = CallbackManager.Factory.create();

        loginButton.registerCallback(mCallBackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                Log.d("facebooklogin", "onSuccess:" + loginResult);
                handleFacebookToken(loginResult.getAccessToken());
            }

            @Override
            public void onCancel() {
                Log.d("facebooklogin", "onCancel: ");

            }

            @Override
            public void onError(FacebookException error) {
                Log.d("facebooklogin", "onError: "+error);
            }
        });

        authStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null){
                    Intent intent = new Intent(FacebookLogin.this, MainActivity.class);
                    startActivity(intent);
                    finishAffinity();
                }
            }
        };


        accessTokenTracker = new AccessTokenTracker() {
            @Override
            protected void onCurrentAccessTokenChanged(AccessToken oldAccessToken, AccessToken currentAccessToken) {
                if (currentAccessToken == null){
                    mFirebaseAuth.signOut();
                }
            }
        };
    }
     private void handleFacebookToken(AccessToken token) {
         Log.d("facebooklogin", "handleFacebookToken: " + token);

         AuthCredential credential = FacebookAuthProvider.getCredential(token.getToken());
         mFirebaseAuth.signInWithCredential(credential).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
             @Override
             public void onComplete(@NonNull Task<AuthResult> task) {
                 if(task.isSuccessful()){
                     Log.d("facebooklogin", "sign in with credential: successful ");
                     FirebaseUser user = mFirebaseAuth.getCurrentUser();
                     Intent intent = new Intent(FacebookLogin.this, MainActivity.class);
                     startActivity(intent);
                     finish();
                 }else {
                     Log.d("facebooklogin", "sign in with credential: unsuccessful ");
                     Toast.makeText(FacebookLogin.this, "Authentication failed" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                     Intent intent = new Intent(FacebookLogin.this, StartPage.class);
                     startActivity(intent);
                     finish();
                 }
             }
         });
     }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Pass the activity result back to the Facebook SDK
        mCallBackManager.onActivityResult(requestCode, resultCode, data);
    }



}