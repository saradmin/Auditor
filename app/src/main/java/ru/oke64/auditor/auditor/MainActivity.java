package ru.oke64.auditor.auditor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;






public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button btn2screen2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn2screen2 = (Button) findViewById(R.id.btn2screen2);
        btn2screen2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn2screen2:
                // TODO Call second activity
                Intent intent = new Intent(this, Screen2.class);
                startActivity(intent);
                break;
            default:
                break;
        }



    }
}
