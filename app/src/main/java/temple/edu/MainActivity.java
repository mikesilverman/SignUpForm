package temple.edu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {
    String userName;
    String userEmail;
    String userPassword;
    String userPasswordConf;
    EditText name;
    EditText email;
    EditText password;
    EditText confirmPassword;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.FormActivity);
        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        confirmPassword = (EditText) findViewById(R.id.confirmPassword);
        submitButton = (button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userName = name.getText().toString();
                userEmail = email.getText().toString();
                userPassword = password.getText().toString();
                userPasswordConf = confirmPassword.getText().toString();
                if (userName.matches("") || userEmail.matches("") || userPassword.matches("") || userPasswordConf.matches("")) {
                    makeText(getApplicationContext(), text: "Error, one or more fields is empty", Toast.LENGTH_SHORT).show();
                }
                else if (!userPassword.equals(userPasswordConf)) {
                    makeText(getApplicationContext(), "Error, passwords do not match", Toast.LENGTH_SHORT).show();
                }
                else {
                    makeText(getApplicationContext(), text: "Welcome to the application, " + userName, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}