package luka.kiria.ge.myapplication.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import luka.kiria.ge.myapplication.R;
import luka.kiria.ge.myapplication.app.AppMainActivity;

public class MainActivity extends AppCompatActivity implements Contract.MainView {

    private TextView usernameTextView;
    private TextView passwordTextView;
    private Button loginButton;

    private Contract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new LoginPresenter(this);

        usernameTextView = findViewById(R.id.usernameEditText);
        passwordTextView = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPressed();
            }
        });
    }

    private void loginPressed() {
        String username = usernameTextView.getText().toString();
        String password = passwordTextView.getText().toString();
        presenter.loginAttempt(username, password);
    }

    protected enum InvalidInput {
        CORRECT,
        SHORT_PASSWORD,
        SHORT_USERNAME,
        SHORT_BOTH
    }

    @Override
    public void signalInvalidInput(InvalidInput error) {
        String res = "";
        if (error == InvalidInput.SHORT_PASSWORD) {
            res = "პაროლი";
        } else if (error == InvalidInput.SHORT_USERNAME) {
            res = "მომხმარებლის სახელი";
        } else if (error == InvalidInput.SHORT_BOTH) {
            res = "მომხმარებლის სახელი და პაროლი";
        }

        Toast.makeText(this, res + " არ უნდა იყოს 3 სიმბოლოზე პატარა",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void signalSuccessfulLogin(String sessionID) {
        Intent intent = new Intent(MainActivity.this, AppMainActivity.class);
        intent.putExtra("sessionID", sessionID);
        startActivity(intent);
    }


}
