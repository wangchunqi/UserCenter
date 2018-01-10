package com.example.administrator.usercenter.model;

import com.example.administrator.usercenter.api.MyApi;
import com.example.administrator.usercenter.api.MyService;
import com.example.administrator.usercenter.bean.Bean;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2018/1/10/010.
 */

public class Model2Toos implements Model2Port {
    private Onfinish2 onfinish2;

    public Model2Toos(Onfinish2 onfinish2) {
        this.onfinish2 = onfinish2;
    }
    @Override
    public void get(String phone, String pass) {
        Retrofit retrofit=new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(MyApi.url)
                .build();
        MyService service=retrofit.create(MyService.class);
        Observable<Bean> data=service.getBean(phone,pass);
        data.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Bean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Bean bean) {
                     onfinish2.finish(bean);
                    }
                });
    }
    public interface Onfinish2{
        void finish(Bean bean);
    }
}
