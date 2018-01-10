package com.example.administrator.usercenter.api;

import com.example.administrator.usercenter.bean.Bean;
import com.example.administrator.usercenter.bean.Data;
import com.example.administrator.usercenter.bean.WL;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2018/1/10/010.
 */

public interface MyService {
    @GET("reg")
    Observable<WL> getWL(@Query("mobile")String mobile,@Query("password")String password);
    @GET("login")
    Observable<Bean> getBean(@Query("mobile")String mobile,@Query("password")String password);
    @GET("getUserInfo")
    Observable<Data> getData(@Query("uid")String uid);
}
