package com.mjd.three_test;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by admin on 2018-8-20.
 */

public class RecyclerHolder extends RecyclerView.ViewHolder {

    public SimpleDraweeView item_simple;
    public TextView item_title,item_tv;
    public ImageView item_image1,item_image2,item_image3,item_image4,item_image5,item_image6;

    public RecyclerHolder(View itemView) {
        super(itemView);
        item_simple = itemView.findViewById(R.id.item_simple);
        item_title = itemView.findViewById(R.id.item_title);
        item_tv = itemView.findViewById(R.id.item_tv);
        item_image1 = itemView.findViewById(R.id.item_image1);
        item_image2 = itemView.findViewById(R.id.item_image2);
        item_image3 = itemView.findViewById(R.id.item_image3);
        item_image4 = itemView.findViewById(R.id.item_image4);
        item_image5 = itemView.findViewById(R.id.item_image5);
        item_image6 = itemView.findViewById(R.id.item_image6);
    }
}
