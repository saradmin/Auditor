package ru.oke64.auditor.auditor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Screen2 extends AppCompatActivity  implements OnClickListener {

    Button btn2screen3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);



        btn2screen3 = (Button) findViewById(R.id.btn2screen3);
        btn2screen3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn2screen3:
                // TODO Call second activity
`                Intent intent = new Intent(this, Screen4.class);
                startActivity(intent);
                break;
            default:
                break;
        }





    }
}
