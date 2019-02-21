package com.example.bottomnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView =(TextView)findViewById(R.id.textview);
        bottomNavigationView =(BottomNavigationView)findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){


                    case R.id.home :
                        textView.setText("Home Activity");
                        //Toast.makeText(getApplicationContext(),"Home Activity clicked",Toast.LENGTH_LONG).show();
                        break;

                    case R.id.camera :
                        textView.setText("Camera Activity");
                        break;

                    case R.id.profile:
                        textView.setText("Prfile Activity");
                }
                return true;
            }
        });
    }
}
