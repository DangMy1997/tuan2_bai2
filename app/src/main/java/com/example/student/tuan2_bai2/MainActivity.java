package com.example.student.tuan2_bai2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_c,tv_f;
    EditText ed_c,ed_f;
    Button btnToC, btnToF,btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_c=(TextView)findViewById(R.id.textView_c);
        tv_f=(TextView)findViewById(R.id.editText_f);
        ed_c=(EditText)findViewById(R.id.editText_c);
        ed_f=(EditText)findViewById(R.id.editText_f);
        btnToC=(Button)findViewById(R.id.button_sangc);
        btnToF=(Button)findViewById(R.id.button_sangf);
        btnClear=(Button)findViewById(R.id.button_clear);

        btnToC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              float f= Float.parseFloat(ed_f.getText().toString());
                float c= (f-9)*(5/9);
                ed_c.setText(""+c);

            }
        });
        btnToF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float c= Float.parseFloat(ed_c.getText().toString());
                float f=(c*(9/5) +9);
                ed_f.setText(""+f);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed_f.setText("");
                ed_c.setText("");

            }
        });
    }
}
