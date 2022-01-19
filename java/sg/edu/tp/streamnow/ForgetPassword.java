package sg.edu.tp.streamnow;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgetPassword extends AppCompatActivity {

    EditText ResetPassword;
    ImageButton resetBtn;

    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        ResetPassword = findViewById(R.id.ResetPassword);
        resetBtn = findViewById(R.id.resetBtn);

        auth = FirebaseAuth.getInstance();

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetPassword();
                closeKeyboard();
            }
        });

    }

    public void resetPassword(){
        String email = ResetPassword.getText().toString().trim();

        if (email.isEmpty()){
            ResetPassword.setError("Email is required!");
            ResetPassword.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            ResetPassword.setError("Please provide a valid email");
            ResetPassword.requestFocus();
            return;
        }

        auth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {

                if (task.isSuccessful()){
                    Toast.makeText(ForgetPassword.this, "Please check your email to reset password", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(ForgetPassword.this, "Error, please try again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void backBtn(View view){
        Intent openMainActivity = new Intent(ForgetPassword.this, Login.class);
        openMainActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivityIfNeeded(openMainActivity, 0);
        finish();
    }

    private void closeKeyboard() {
        View view = this.getCurrentFocus();
        if (view != null){
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

}