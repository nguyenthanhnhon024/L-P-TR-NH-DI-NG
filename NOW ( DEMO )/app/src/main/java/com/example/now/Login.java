package com.example.now;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.now.Database.DB_Login;

public class Login extends AppCompatActivity {
    private ImageView img1 ;
    private Button btndn,btsdt,btdk;
    private EditText edttk;
    private EditText edtmk;

    DB_Login db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        img1 = (ImageView) findViewById(R.id.back);
        img1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
        btsdt = (Button) findViewById(R.id.btdt);
        btdk = (Button) findViewById(R.id.btdk) ;

        btsdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View VIEW) {
                Intent INTENT_02 = new Intent(Login.this, SendOTPActivity.class);
                startActivity(INTENT_02);
            }
        });

        //Nút đăng nhập
        db= new DB_Login(this);
        edttk = (EditText) findViewById(R.id.ettk);
        edtmk = (EditText) findViewById(R.id.etmk);
        btndn = (Button) findViewById(R.id.btdn);

        btndn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = edttk.getText().toString();
                String pass = edtmk.getText().toString();
                boolean Check = db.userpass(user,pass);
                if(Check==true ){
                    Intent intent = new Intent(getApplicationContext(),Login_Success.class);
                    intent.putExtra("user", edttk.getText().toString());
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"Sai tài khoản hoặc mật khẩu",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, register.class);
                startActivity(intent);
            }
        });
    }
}