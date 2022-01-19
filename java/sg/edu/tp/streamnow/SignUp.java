package sg.edu.tp.streamnow;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity {
    TextView btn;
    FirebaseAuth mAuth;
    EditText inputEmail, inputPassword, inputConfirmPassword;
    ImageButton confirmBtn;
    ImageButton backBtn;


    @Override
    protected void onStart() {
        super.onStart();
        if (mAuth.getCurrentUser() != null){
            Toast.makeText(SignUp.this, "Please login into your account", Toast.LENGTH_SHORT).show();
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        LottieAnimationView lottieCheckedDone = findViewById(R.id.loading);

        mAuth = FirebaseAuth.getInstance();

        btn = findViewById(R.id.alreadyHaveAccount);
        inputEmail = findViewById(R.id.inputEmail);
        inputPassword = findViewById(R.id.inputPassword);
        inputConfirmPassword = findViewById(R.id.inputConfirmPassword);
        confirmBtn = findViewById(R.id.confirmBtn);
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(v -> {
            new Intent(SignUp.this, StartPage.class);
        });

        confirmBtn.setOnClickListener(v -> {
            String email = inputEmail.getText().toString().trim();
            String password = inputPassword.getText().toString().trim();
            String confirmPassword = inputConfirmPassword.getText().toString().trim();

            if (TextUtils.isEmpty(email)) {
                inputEmail.setError("Email is required");
                inputEmail.requestFocus();
                return;
            }

            if (TextUtils.isEmpty(password)) {
                inputPassword.setError("Password is required");
                inputPassword.requestFocus();
                return;
            }

            if (password.length() < 6) {
                inputPassword.setError("Password must have more than 6 characters");
                inputPassword.requestFocus();
                return;
            }

            if (!password.equals(confirmPassword)) {
                inputConfirmPassword.setError("Please make sure your passwords match");
                inputConfirmPassword.requestFocus();
                return;
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                inputEmail.setError("Please enter a valid email address");
                inputEmail.requestFocus();
                return;
            }


            lottieCheckedDone.setVisibility(View.VISIBLE);
            closeKeyboard();

            //register the user

            mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(SignUp.this, "User Created", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(SignUp.this, MainActivity.class);
                        startActivity(intent);

                    } else {
                        Toast.makeText(SignUp.this, "Error!" + " " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        lottieCheckedDone.setVisibility(View.GONE);
                    }
                }

            });
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