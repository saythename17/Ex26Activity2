package com.icandothisallday2020.ex26activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);
        tv=findViewById(R.id.tv);
        //이 액티비티를 실행한 intent(택배기사) 참조
        Intent intent=getIntent();
        //intent 객체에게 추가데이터 얻기
        String name=intent.getStringExtra("Name");
        int age=intent.getIntExtra("Age",-17);
        //두 번째 파라미터: 전달받은 값이없을 경우를 대비한 default 값
        //전달 받은 값 tv에 보여주기
        tv.setText(name+"\n"+age);
    }
}
