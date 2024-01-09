package com.cxzcodes.flipcartui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.cxzcodes.flipkartui.R;

public class ProductDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String price = intent.getStringExtra("price");
        String desc = intent.getStringExtra("desc");
        int imageResId = intent.getIntExtra("image", 0);
        TextView descc = findViewById(R.id.itemdesc);
        TextView priceTextView = findViewById(R.id.price);

        ImageView imageView = findViewById(R.id.itemimage);

        descc.setText(desc);
        priceTextView.setText(price);
         imageView.setImageResource(imageResId);
    }
}