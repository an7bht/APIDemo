package com.example.apidemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TestApi  extends AppCompatActivity {
    Button btnclick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testapi);

        btnclick = (Button) findViewById(R.id.btntest);
        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click();
            }
        });
    }

    private void click() {
        Intent i=new Intent(TestApi.this,MainActivity.class);
        startActivity(i);
    }
}
