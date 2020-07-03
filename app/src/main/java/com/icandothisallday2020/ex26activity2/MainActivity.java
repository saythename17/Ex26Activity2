package com.icandothisallday2020.ex26activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.et);
    }

    public void click(View view) {
        //Second Activity 에 전달할 data 를 et 에게 얻어옴
        String s= et.getText().toString();
        //Second Activity 를 실행할 Intent(택배기사) 객체 생성
        Intent intent=new Intent(this, Second_Activity.class);
        //SecondActivity 에 전달할 데이터 intent 에 추가
        intent.putExtra("Name",s);//parameter: 식별자,value
        intent.putExtra("Age",20);//putExtra()에 제한X 계속 넣어도됨
        //택배기사(Intent)를 통해 실행 요청
        startActivity(intent);
        finish();
    }
}
