package com.ldh.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText textName,textAge,textAddress,textHobby,textGPA,textChamNgon,textMonAn;
    private Button button;
    private RadioButton b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getMessage();

            }
        });
    }
    public void anhXa()
    {
        textName = (EditText) findViewById(R.id.textName);
        textAge = (EditText) findViewById(R.id.textAge);
        textAddress = (EditText) findViewById(R.id.textAddress);
        textHobby = (EditText) findViewById(R.id.textHobby);
        textGPA = (EditText) findViewById(R.id.textGPA);
        textChamNgon = (EditText) findViewById(R.id.text_cham_ngon);
        textMonAn = (EditText) findViewById(R.id.text_mon_an);
        b1 = (RadioButton)findViewById(R.id.rb1);
        b2 = (RadioButton)findViewById(R.id.rb2);
        b3 = (RadioButton)findViewById(R.id.rb3);
        button = (Button) findViewById(R.id.button);
    }
    public void getMessage()
    {
        String tName = textName.getText().toString();
        String tAge = textAge.getText().toString();
        String tAddress = textAddress.getText().toString();
        String tHobby = textHobby.getText().toString();
        String tGPA = textGPA.getText().toString();
        String tChamNgon = textChamNgon.getText().toString();
        String tMonAn = textMonAn.getText().toString();
        if (tName.length()==0 ||tAge.length()==0||tAddress.length()==0||tHobby.length()==0||tGPA.length()==0||tChamNgon.length()==0||tMonAn.length()==0||(!b1.isChecked() && !b2.isChecked() && !b3.isChecked()))
        {
            Toast.makeText(this, "Bạn điền thiếu kìa :3", Toast.LENGTH_SHORT).show();
        }
        else
        {
            openActivity2();
        }
    }
    public void openActivity2()
    {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}