package com.felangm.programuts;
//15 Agustus 2019 - 10116152 - Moch Sholehudin Mawardi - AKB 4
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {

    EditText u;
    EditText p;
    Button l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        u = (EditText) findViewById(R.id.EditTextu);
        p = (EditText) findViewById(R.id.EditTextp);
        l = (Button)findViewById(R.id.button);

        login();
    }
    public void login(){
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(u.getText().toString().equals("admin")&&p.getText().toString().equals("admin")){
                    Intent home=new Intent(LoginActivity.this, WelcomeActivity.class);
                    startActivity(home);
                    finish();
                }else {
                    Toast.makeText(LoginActivity.this,"Login anda gagal, periksa kembali username dan password anda",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
