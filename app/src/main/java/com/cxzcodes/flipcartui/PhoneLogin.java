package com.cxzcodes.flipkartui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

 import com.cxzcodes.flipkartui.MainActivity;
import com.cxzcodes.flipkartui.R;

public class PhoneLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_login);
        TextView number = findViewById(R.id.tvuseemail);
        ImageView cancel = findViewById(R.id.cancel);

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PhoneLogin.this, com.cxzcodes.flipkartui.Emaillogin.class);

                startActivity(i);
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PhoneLogin.this, MainActivity.class);

                startActivity(i);
            }
        });
    }
}