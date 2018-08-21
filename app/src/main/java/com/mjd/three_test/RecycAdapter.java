package com.mjd.three_test;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by admin on 2018-8-20.
 */

public class RecycAdapter extends RecyclerView.Adapter<RecyclerHolder> {
    private Context mContext;
    private List<DetailsBean.DataBean> mData;

    public RecycAdapter(Context context, List<DetailsBean.DataBean> data) {
        mContext = context;
        mData = data;
    }

    @Override
    public RecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_recyc, null);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerHolder holder, int position) {
        holder.item_simple.setImageURI(mData.get(position).getCreated_user().getAvatar());
        holder.item_title.setText(mData.get(position).getCreated_user().getNick_name());
        holder.item_tv.setText(mData.get(position).getContent());
        Glide.with(mContext).load(mData.get(position).getAttaches().get(0)).into(holder.item_image1);
        Glide.with(mContext).load(mData.get(position).getAttaches().get(0)).into(holder.item_image2);
        Glide.with(mContext).load(mData.get(position).getAttaches().get(0)).into(holder.item_image3);
        Glide.with(mContext).load(mData.get(position).getAttaches().get(0)).into(holder.item_image4);
        Glide.with(mContext).load(mData.get(position).getAttaches().get(0)).into(holder.item_image5);
        Glide.with(mContext).load(mData.get(position).getAttaches().get(0)).into(holder.item_image6);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
