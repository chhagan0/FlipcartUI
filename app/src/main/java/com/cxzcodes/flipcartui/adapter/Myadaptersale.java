package com.cxzcodes.flipcartui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.cxzcodes.flipcartui.ProductDetails;
import com.cxzcodes.flipcartui.model.MyDataModel;
import com.cxzcodes.flipkartui.R;

import java.util.List;

public class Myadaptersale extends RecyclerView.Adapter<Myadaptersale.MyViewHolder> {

    private static List<MyDataModel> dataList;
    private static Context context;

    public Myadaptersale(List<MyDataModel> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycle_sale, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MyDataModel data = dataList.get(position);


        holder.imageView.setImageResource(data.getImageResId());
        holder.textViewName.setText(data.getName());
        holder.price.setText(data.getPrice());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textViewName;
        TextView price;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textViewName = itemView.findViewById(R.id.textViewName);
            price = itemView.findViewById(R.id.tvprice);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        MyDataModel clickedItem = dataList.get(position);

                        Intent intent = new Intent(context, ProductDetails.class)
                                .putExtra("name", clickedItem.getName())
                                .putExtra("price", clickedItem.getPrice())
                                .putExtra("desc", clickedItem.getdesc());
                        intent.putExtra("image", clickedItem.getImageResId());


                        context.startActivity(intent);
                    }
                }
            });
        }
    }
}


