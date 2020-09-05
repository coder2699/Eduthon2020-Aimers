package com.example.eduthon_aimers.Video;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eduthon_aimers.R;

import java.util.ArrayList;

public class VideoActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    ArrayList<DataSetList> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();                  // in Activity

        setContentView(R.layout.activity_video);
        LinearLayoutManager HorizontalLayout;
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        HorizontalLayout = new LinearLayoutManager(VideoActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(HorizontalLayout);
        recyclerView.setHasFixedSize(true);
        arrayList = new ArrayList<DataSetList>();
        //https://www.youtube.com/watch?v=YVfyYrEmzgM
        DataSetList dataSetList = new DataSetList("https://www.youtube.com/embed/oRddkNOTeZI");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/k388Q8xvsXg");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/1FX_4JI0dc0");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/88xGJLedzWg");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/wGXI0KpkR50");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/xtgelpLCzFw");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/LiEGspEwZ-E");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/W1rY3puMKeQ");
        arrayList.add(dataSetList);

        YoutubeAdapter youtubeAdapter = new YoutubeAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(youtubeAdapter);

    }
}