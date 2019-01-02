package com.example.genuinemeaning;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

private String[]PostModel;
public PostAdapter(String[]PostModel){
    this.PostModel=PostModel;
}


    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item,parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder postViewHolder, int position) {
    String title=PostModel[position];
    postViewHolder.PostTitle.setText(title);


    }

    @Override
    public int getItemCount() {
        return PostModel.length;
    }

    public class PostViewHolder extends RecyclerView.ViewHolder{

    ImageView PostImage;
    TextView PostTitle,PostDesc;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            PostImage=itemView.findViewById(R.id.PostImage);
            PostTitle=itemView.findViewById(R.id.PostTitle);
            PostTitle=itemView.findViewById(R.id.PostTitle);
        }
    }
}
