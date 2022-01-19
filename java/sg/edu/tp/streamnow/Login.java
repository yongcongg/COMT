package sg.edu.tp.streamnow;

import android.content.Context;
import android.content.Intent;
import android.hardware.input.InputManager;
import android.os.Bundle;
import android.os.IInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethod;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.jetbrains.annotations.NotNull;

public class Login extends AppCompatActivity {

    TextView btn;
    EditText inputEmail, inputPassword;
    ImageButton btnLogin;
    ImageButton backBtn;
    FirebaseAuth mAuth;
    TextView forgotPasswordBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LottieAnimationView lottieCheckedDone = findViewById(R.id.loading);


        mAuth = FirebaseAuth.getInstance();

        inputEmail = findViewById(R.id.enterEmail);
        inputPassword = findViewById(R.id.enterPassword);
        btnLogin = findViewById(R.id.login);
        forgotPasswordBtn = findViewById(R.id.forgotPassword);

        backBtn = findViewById(R.id.backBtn1);
        backBtn.setOnClickListener(v -> {
            startActivity(new Intent(Login.this, StartPage.class));
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = inputEmail.getText().toString().trim();
                String password = inputPassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    inputEmail.setError("Email is required");
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    inputPassword.setError("Password is required");
                    return;
                }

                if (password.length() < 6) {
                    inputPassword.setError("Password must have more than 6 characters");
                    return;
                }


                if (!email.contains("@")) {
                    inputEmail.setError("Please enter a valid email address");
                    return;
                }

                lottieCheckedDone.setVisibility(View.VISIBLE);
                closeKeyboard();

                //authenticate user
                mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), MainActivity.class));

                        } else {
                            Toast.makeText(Login.this, "" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            lottieCheckedDone.setVisibility(View.INVISIBLE);
                            closeKeyboard();
                        }
                    }
                });

            }
        });


        btn = findViewById(R.id.dontHaveAnAccount);
        btn.setOnClickListener((v -> {
            startActivity(new Intent(Login.this,SignUp.class));
        }));

        forgotPasswordBtn.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, ForgetPassword.class);
            startActivity(intent);
        });


    }

    private void closeKeyboard() {
        View view = this.getCurrentFocus();
        if (view != null){
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

}