package com.example.eduthon_aimers.Video;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.eduthon_aimers.R;

import java.util.ArrayList;

public class YoutubeAdapter extends RecyclerView.Adapter<YoutubeViewHolder> {
    ArrayList<DataSetList> arrayList;
    Context context;

    public YoutubeAdapter(ArrayList<DataSetList> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public YoutubeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.video_per_row,viewGroup,false);
        return new YoutubeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull YoutubeViewHolder youtubeViewHolder, int i) {

        final DataSetList current = arrayList.get(i);

        youtubeViewHolder.webView.loadUrl(current.getLink());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}