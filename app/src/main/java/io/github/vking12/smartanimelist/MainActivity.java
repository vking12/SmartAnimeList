package io.github.vking12.smartanimelist;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int invalidPasswordCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkPassword(View view){
        EditText password = (EditText) findViewById(R.id.password);
        TextView introMessage = (TextView) findViewById(R.id.TitleDescrPswd);

        String passwordInput = password.getText().toString();

        if(passwordInput.equals("gurrenlagann")){
            Intent intent = new Intent(this, DisplayHomeActivity.class);
            startActivity(intent);
        } else {
            ++invalidPasswordCount;
            String responseToPassword = "Invalid password entered " + invalidPasswordCount + " times!";
            introMessage.setText(responseToPassword);
            introMessage.setTextColor(Color.RED);
        }
    }
}
