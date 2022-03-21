package com.example.novelkaryatereliye;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListNovelAdapter extends RecyclerView.Adapter <ListNovelAdapter.ListViewHolder> {
    private ArrayList<Novel> listNovel;

    public ListNovelAdapter(ArrayList<Novel> list) {
        this.listNovel = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_novel, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Novel novel = listNovel.get(position);
        Glide.with(holder.itemView.getContext())
                .load(novel.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(novel.getName());
        holder.tvDetail.setText(novel.getDetail());

    }

    @Override
    public int getItemCount() {
        return listNovel.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        ListViewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.img_item_novel);
            tvName = itemview.findViewById(R.id.tv_item_name);
            tvDetail = itemview.findViewById(R.id.tv_item_detail);
        }
    }
}
