package com.mjd.three_test;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by admin on 2018-8-20.
 */

public class AnimFragment extends Fragment {

    private View mView;
    private ImageView anim_image;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = LayoutInflater.from(getActivity()).inflate(R.layout.anim_layout, null);
        return mView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViews();
    }

    private void initViews() {
        anim_image = mView.findViewById(R.id.anim_image);
        anim_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator translationY = ObjectAnimator.ofFloat(anim_image, "translationY", 0f, 1000f);
                translationY.setDuration(3000);
                translationY.start();
            }
        });

    }
}
