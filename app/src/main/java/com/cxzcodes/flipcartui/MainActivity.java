package com.cxzcodes.flipkartui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.cxzcodes.flipcartui.adapter.MyAdapter;
import com.cxzcodes.flipcartui.adapter.Myadaptersale;
import com.cxzcodes.flipcartui.model.MyDataModel;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageSlider imageSlider = findViewById(R.id.image_slider);
         List<SlideModel> imageList = new ArrayList<>();
        imageList.add(new SlideModel("https://rukminim2.flixcart.com/fk-p-flap/1600/270/image/e72a333d048f834c.jpg?q=20", ScaleTypes.FIT));
        imageList.add(new SlideModel("https://rukminim2.flixcart.com/fk-p-flap/1600/270/image/585a93b0ebfd39c2.jpg?q=20" ,ScaleTypes.FIT));
        imageList.add(new SlideModel("https://rukminim2.flixcart.com/fk-p-flap/1600/270/image/fd68bbdcaea79197.jpg?q=20" ,ScaleTypes.FIT));
        imageSlider.setImageList(imageList);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerView recyclerView2 = findViewById(R.id.recyclerview2);
        RecyclerView recyclerView3 = findViewById(R.id.recyclerview3);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        int spanCount = 2;
        recyclerView3.setLayoutManager(new GridLayoutManager(this, spanCount, GridLayoutManager.VERTICAL, false));

        List<MyDataModel> dataList = generateDummyData();
        MyAdapter adapter = new MyAdapter(dataList, this);
        recyclerView.setAdapter(adapter);


        List<MyDataModel> dataList2 = generateDummyData2();
        Myadaptersale adapter2 = new Myadaptersale(dataList2, this);
        recyclerView2.setAdapter(adapter2);
        List<MyDataModel> dataList3 = generateDummyData3();
        Myadaptersale adapter3 = new Myadaptersale(dataList3, this);
        recyclerView3.setAdapter(adapter3);


    }
    private List<MyDataModel> generateDummyData() {
        List<MyDataModel> dataList = new ArrayList<>();
        dataList.add(new MyDataModel("Electronics", "",R.drawable.electronics,""));
        dataList.add(new MyDataModel("Fashion","", R.drawable.fashion,""));
        dataList.add(new MyDataModel("Furniture","", R.drawable.furniture,""));
        dataList.add(new MyDataModel("Grocery","", R.drawable.grocery,""));
        dataList.add(new MyDataModel("Mobile","", R.drawable.mobile,""));
        dataList.add(new MyDataModel("Travel","", R.drawable.travel,""));
        dataList.add(new MyDataModel("Electronics","", R.drawable.electronics,""));
        dataList.add(new MyDataModel("Fashion","", R.drawable.fashion,""));

        return dataList;
    }
    private List<MyDataModel> generateDummyData2() {
        List<MyDataModel> dataList = new ArrayList<>();
        dataList.add(new MyDataModel("watch", "5000",R.drawable.noice,"Noise ColorFit Ultra 3 Bluetooth Calling Smart Watch with Biggest 1.96\" AMOLED Display, Premium Metallic Build, Functional Crown, Gesture Control with Metallic Strap (Jet Black: Elite Edition)"));
        dataList.add(new MyDataModel("Cover","300", R.drawable.cover,"EGOTUDE TPU+Plastic Compatible With Iphone 15 | Frosted Translucent Matte Anti-Fingerprint Hard Back Cover Case , Black"));
        dataList.add(new MyDataModel("Laptop","80000", R.drawable.laptop,"\n" +
                "ASUS TUF Gaming F15 - AI Powered Gaming Laptop, Intel Core i5-11400H 11th Gen, 15.6-inch (39.62 cm) FHD 144Hz, (8GB/1TB/4GB NVIDIA RTX 2050/Win 11/Backlit KB/Black/2.30 kg),FX506HF-HN026W"));
        return dataList;
    }
    private List<MyDataModel> generateDummyData3() {
        List<MyDataModel> dataList = new ArrayList<>();

        dataList.add(new MyDataModel("watch", "5000",R.drawable.noice,"Noise ColorFit Ultra 3 Bluetooth Calling Smart Watch with Biggest 1.96\" AMOLED Display, Premium Metallic Build, Functional Crown, Gesture Control with Metallic Strap (Jet Black: Elite Edition)"));
        dataList.add(new MyDataModel("Cover","300", R.drawable.cover,"EGOTUDE TPU+Plastic Compatible With Iphone 15 | Frosted Translucent Matte Anti-Fingerprint Hard Back Cover Case , Black"));
        dataList.add(new MyDataModel("Laptop","80000", R.drawable.laptop,"\n" +
                "ASUS TUF Gaming F15 - AI Powered Gaming Laptop, Intel Core i5-11400H 11th Gen, 15.6-inch (39.62 cm) FHD 144Hz, (8GB/1TB/4GB NVIDIARTX 2050/Win 11/Backlit KB/Black/2.30 kg),FX506HF-HN026W"));
        dataList.add(new MyDataModel("watch", "5000",R.drawable.noice,"Noise ColorFit Ultra 3 Bluetooth Calling Smart Watch with Biggest 1.96\" AMOLED Display, Premium Metallic Build, Functional Crown, Gesture Control with Metallic Strap (Jet Black: Elite Edition)"));
        dataList.add(new MyDataModel("Cover","300", R.drawable.cover,"EGOTUDE TPU+Plastic Compatible With Iphone 15 | Frosted Translucent Matte Anti-Fingerprint Hard Back Cover Case , Black"));
        dataList.add(new MyDataModel("Laptop","80000", R.drawable.laptop,"\n" +
                "ASUS TUF Gaming F15 - AI Powered Gaming Laptop, Intel Core i5-11400H 11th Gen, 15.6-inch (39.62 cm) FHD 144Hz, (8GB/1TB/4GB NVIDIARTX 2050/Win 11/Backlit KB/Black/2.30 kg),FX506HF-HN026W"));
        return dataList;

    }
}