
package com.cxzcodes.flipkartui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.cxzcodes.flipkartui.MainActivity;
import com.cxzcodes.flipkartui.R;

public class Emaillogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emaillogin);
        ImageView cancel = findViewById(R.id.cancel);

        TextView number = findViewById(R.id.tvphonenumber);

         number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Emaillogin.this, com.cxzcodes.flipkartui.PhoneLogin.class);

                startActivity(i);
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Emaillogin.this, MainActivity.class);

                startActivity(i);
            }
        });
    }
}