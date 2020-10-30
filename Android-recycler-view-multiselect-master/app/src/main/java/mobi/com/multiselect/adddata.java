package mobi.com.multiselect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

import mobi.com.multiselect.Adapters.AdapterListInbox;

public class adddata extends AppCompatActivity
{
   EditText name,course,email,purl;
   Button submit,back;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adddata);

        name=(EditText)findViewById(R.id.add_name);
        email=(EditText)findViewById(R.id.add_email);
        purl=(EditText)findViewById(R.id.add_purl);

        back=(Button)findViewById(R.id.add_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AdapterListInbox.class));
                finish();
            }
        });

        submit=(Button)findViewById(R.id.add_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processinsert();
            }
        });
    }

    private void processinsert()
    {
        Map<String, Object> map=new HashMap<>();
        map.put("name",name.getText().toString());
        map.put("email",email.getText().toString());
        map.put("purl",purl.getText().toString());


    }
}