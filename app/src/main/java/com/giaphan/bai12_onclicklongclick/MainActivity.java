package com.giaphan.bai12_onclicklongclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtnumberA;
    private EditText edtnumberB;
    private Button btnTong;
    private int a, b;
    private String tong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtnumberA = (EditText) findViewById(R.id.numberA);
        edtnumberB = (EditText) findViewById(R.id.numberB);
        btnTong = (Button) findViewById(R.id.btnTong);

        btnTong.setOnClickListener(this);

//        btnTong.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (!edtnumberA.getText().toString().equals("") && !edtnumberB.getText().toString().equals("")) {
//                    a = Integer.parseInt(edtnumberA.getText().toString());
//                    b = Integer.parseInt(edtnumberB.getText().toString());
//                    tong = String.valueOf(a + b);
//                    Toast.makeText(MainActivity.this, "Ket qua phep cong A + B la: " + tong, Toast.LENGTH_LONG).show();
//                } else {
//                    Toast.makeText(MainActivity.this, "Ban nhap du lieu chua dung", Toast.LENGTH_LONG).show();
//                }
//            }
//        });
        btnTong.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "Day la su kien LongClickListener",Toast.LENGTH_LONG).show();
                return false;
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnTong:
                if (!edtnumberA.getText().toString().equals("") && !edtnumberB.getText().toString().equals("")){
                    a = Integer.parseInt(edtnumberA.getText().toString());
                    b = Integer.parseInt(edtnumberB.getText().toString());
                    tong = String.valueOf(a+b);
                    Toast.makeText(MainActivity.this,"Ket qua phep cong A + B la: "+tong,Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this,"Ban nhap du lieu chua dung",Toast.LENGTH_LONG).show();
                } break;
            default:
                break;
        }
    }
}