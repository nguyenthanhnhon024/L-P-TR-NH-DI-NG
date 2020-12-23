package com.example.now;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.now.DTO.Account;
import com.example.now.Database.DB_Login;

public class register extends AppCompatActivity {
    private ImageView img1 ;
    EditText taikhoan,matkhau,matkhau2;
    Button dangki;
    DB_Login db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        db = new DB_Login(this);


        taikhoan = (EditText) findViewById(R.id.ettk);
        matkhau = (EditText) findViewById(R.id.etmk);
        matkhau2 = (EditText) findViewById(R.id.etmk2);
        dangki =  findViewById(R.id.btdk);

        img1 = (ImageView) findViewById(R.id.back);
        img1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        dangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = taikhoan.getText().toString();
                String s2 = matkhau.getText().toString();
                String s3 = matkhau2.getText().toString();

                if(s1.equals("") || s2.equals("") || s3.equals("")){
                    Toast.makeText(getApplicationContext(),"Bạn chưa nhập đủ",Toast.LENGTH_SHORT).show();
                }else{
                    if (s2.equals(s3)){
                        boolean chkuser = db.chkuser(s1);
                        if(chkuser==true){
                            boolean insert= db.insertData(s1,s2);
                            if(insert==true){
                                Toast.makeText(getApplicationContext(),"Đăng kí thành công",Toast.LENGTH_SHORT).show();
                            }
                        }
                        else {
                            Toast.makeText((getApplicationContext()),"Tài khoản đã tồn tại",Toast.LENGTH_SHORT).show();
                        }
                    }else {Toast.makeText(getApplicationContext(),"Mật khẩu không khớp",Toast.LENGTH_SHORT).show();}
                }
            }
        });
    }
}