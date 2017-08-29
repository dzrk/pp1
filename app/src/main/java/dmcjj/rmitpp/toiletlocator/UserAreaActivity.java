package dmcjj.rmitpp.toiletlocator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        TextView tvWelcomeMsg = (TextView) findViewById(R.id.tvTest);
        EditText etUsername = (EditText) findViewById(R.id.etUsername);
        EditText etEmail = (EditText) findViewById(R.id.etEmail);
        etEmail.setText("admin@admin.com");
        etUsername.setText("admin");
        tvWelcomeMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapsIntent = new Intent(UserAreaActivity.this, MapsActivity.class);
                UserAreaActivity.this.startActivity(mapsIntent);
            }
        });
    }
}