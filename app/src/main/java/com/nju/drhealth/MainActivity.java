package com.nju.drhealth;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button guahao;
    private Button daoyi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        guahao = (Button)findViewById(R.id.guahao);
        daoyi = (Button)findViewById(R.id.daoyi);
        guahao.setOnClickListener(this);
        daoyi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.guahao:
//                Toast.makeText(this,"你按下了挂号按钮",Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(MainActivity.this,GuahaoActivity.class);
                startActivity(intent1);
                break;
            case R.id.daoyi:
//                Toast.makeText(this,"你按下了导医按钮",Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(MainActivity.this,DaoyiActivity.class);
                startActivity(intent2);
                break;
            default:
        }
    }
}
