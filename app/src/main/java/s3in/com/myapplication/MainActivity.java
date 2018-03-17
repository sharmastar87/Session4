package s3in.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final String USERNAME = "harish";
    final String PASSWORD = "harish10";

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = (EditText) findViewById(R.id.username_edit_text);
        passwordEditText = (EditText) findViewById(R.id.password_edit_text);
        button = (Button) findViewById(R.id.login_button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int viewId = view.getId();
        switch (viewId){
            case R.id.login_button:
                String userName = usernameEditText.getEditableText().toString();
                String password = passwordEditText.getEditableText().toString();

                if(USERNAME.equals(userName) && PASSWORD.equals(password)){
                    Toast.makeText(MainActivity.this, "Successfully Login !", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "Please enter valid credentials !", Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
