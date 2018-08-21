package com.mjd.three_test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by admin on 2018-8-20.
 */

public class ListFragment extends Fragment implements Iview_list {

    private View mView;
    private RecyclerView recyclerview;
    private String token = "";
    private String version = "1.7";
    private String page = "1";
    private String order = "hot";
    private List<DetailsBean.DataBean> mData;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = LayoutInflater.from(getActivity()).inflate(R.layout.list_layout, null);
        return mView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViews();
    }

    private void initViews() {
        recyclerview = mView.findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        Presenter_List presenter_list = new Presenter_List(this);
        presenter_list.getdatas(token, version, page, order);
    }

    @Override
    public void viewSuccess(DetailsBean detailsBean) {
        mData = detailsBean.getData();
        RecycAdapter recycAdapter = new RecycAdapter(getActivity(), mData);
        recyclerview.setAdapter(recycAdapter);
    }
}
