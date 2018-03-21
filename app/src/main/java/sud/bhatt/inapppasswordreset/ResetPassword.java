package sud.bhatt.inapppasswordreset;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResetPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        Intent intent = getIntent();
        String action = intent.getAction();
        Uri data = intent.getData();


        TextView inputView = findViewById(R.id.input);
        inputView.setText("" + action + data);
    }
}
