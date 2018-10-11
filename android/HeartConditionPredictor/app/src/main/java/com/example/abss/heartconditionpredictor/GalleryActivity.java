package com.example.abss.heartconditionpredictor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;


import java.util.ArrayList;

public class GalleryActivity extends AppCompatActivity {
    private final String image_titles[] = {
            "Thal Distribution",
            "Sex Distribution",
            "Slope Peak Exercise Distribution",
            "Age Distribution",
            "Chest Pain Type Distribution",
            "Exercised Induced Agina Distribution",
            "Fasting Blood Sugar Distribution",
            "Major Vessels Distribution",
            "Max Heart rate Distribution",
            "Oldpeak Distribution",
            "Resting Blood Pressure Distribution",
            "Resting ECR Distribution",
            "Serum Cholestrol Distribution",
    };

    private final Integer image_ids[] = {
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7,
            R.drawable.img8,
            R.drawable.img9,
            R.drawable.img10,
            R.drawable.img11,
            R.drawable.img12,
            R.drawable.img13,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        Toast.makeText(GalleryActivity.this, "On Create inside the Gallery",Toast.LENGTH_LONG).show();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.imagegallery);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),1);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<CreateList> createLists = prepareData();
        MyAdapter adapter = new MyAdapter(getApplicationContext(), createLists);
        recyclerView.setAdapter(adapter);
    }
    private ArrayList<CreateList> prepareData(){

        ArrayList<CreateList> theimage = new ArrayList<>();
        for(int i = 0; i< image_titles.length; i++){
            CreateList createList = new CreateList();
            createList.setImage_title(image_titles[i]);
            createList.setImage_ID(image_ids[i]);
            theimage.add(createList);
        }
        return theimage;
    }
}
