package com.example.administrator.usercenter.model;

import com.example.administrator.usercenter.api.MyApi;
import com.example.administrator.usercenter.api.MyService;
import com.example.administrator.usercenter.bean.WL;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2018/1/10/010.
 */

public class ModelToos implements ModelPort {
    OnFinish onFinish;

    public ModelToos(OnFinish onFinish) {
        this.onFinish = onFinish;
    }

    @Override
    public void getUser(String phone,String pass) {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(MyApi.url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        MyService service=retrofit.create(MyService.class);
        Observable<WL> wl = service.getWL(phone, pass);
                 wl.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WL>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(WL wl) {
                      onFinish.finish(wl);
                    }
                });
    }
    public interface OnFinish{
        void finish(WL wl);
    }
}
