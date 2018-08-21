package com.mjd.three_test;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by admin on 2018-8-20.
 */

public interface Retrofit_Api {
    //https://app.tuozhe8.com/api.php/api/Circle/posts_lists?token=&version=1.7&page=1&order=hot

    @POST("api.php/api/Circle/posts_lists")
    Observable<DetailsBean> getDetails(@Query("token") String token, @Query("version") String version, @Query("page") String page, @Query("order") String order);
}
