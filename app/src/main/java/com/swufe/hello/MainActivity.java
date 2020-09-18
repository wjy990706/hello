package com.swufe.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText inp1  ;
    String inputtext ;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inp1  = findViewById(R.id.inputText);
//        inputtext = inp1.getText().toString();
        text1 =findViewById(R.id.textView1);
    }

    public void onButtonClick(View view){
        Log.d("click", "onButtonClick: yes!");

        inputtext = inp1.getText().toString();
        float temperature1 = Float.parseFloat(inputtext);

        float temperature2 = (float) (32+temperature1*1.8);


        Toast.makeText(MainActivity.this,"换算成功！",Toast.LENGTH_SHORT).show();
        text1.setText(String.valueOf(temperature2) + "华氏度");
// useless massage
    }

}