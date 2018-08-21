package com.mjd.three_test;

import android.util.Log;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by admin on 2018-8-20.
 */

public class Model_List {
    public void getdata(String token, String version, String page, String order, final Imodel_list imodel_list){
        RetrofitClient
                .getInstance()
                .getApi()
                .getDetails(token, version, page, order)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<DetailsBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("TAG", "onNext: shibai"+e.getLocalizedMessage());
                    }

                    @Override
                    public void onNext(DetailsBean detailsBean) {
                        Log.i("TAG", "成功:"+detailsBean.getMessage());
                        imodel_list.modelSuccess(detailsBean);
                    }
                });
    }
}
