package rs.com.splashex;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
      new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {
              Intent i= new Intent(splashActivity.this,MainActivity.class);
              startActivity(i);
         finish();
          }
      },5000);
    }
}
