package com.mjd.three_test;

/**
 * Created by admin on 2018-8-20.
 */

public class Presenter_List implements Ipresenter_list {
    private Iview_list mIview_list;
    private Model_List mModel_list;

    public Presenter_List(Iview_list iview_list) {
        mIview_list = iview_list;
        mModel_list = new Model_List();
    }

    public void getdatas(String token, String version, String page, String order){
        mModel_list.getdata(token, version, page, order, new Imodel_list() {
            @Override
            public void modelSuccess(DetailsBean detailsBean) {
                mIview_list.viewSuccess(detailsBean);
            }
        });
    }

    @Override
    public void Destroys() {
        if (mIview_list != null){
            mIview_list = null;
        }
    }
}
