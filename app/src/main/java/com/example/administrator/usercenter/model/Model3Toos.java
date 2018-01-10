package com.example.administrator.usercenter.model;

import com.example.administrator.usercenter.api.MyApi;
import com.example.administrator.usercenter.api.MyService;
import com.example.administrator.usercenter.bean.Data;
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
public class Model3Toos implements Model3Port{
    OnFinish onFinish;
    public Model3Toos(OnFinish onFinish) {
        this.onFinish = onFinish;
    }
    @Override
    public void getData(String uid) {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(MyApi.url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        MyService service=retrofit.create(MyService.class);
        Observable<Data> data = service.getData(uid);
        data.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Data>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Data data) {
                        onFinish.finish(data);
                    }
                });
    }
    public interface OnFinish{
        void finish(Data data);
    }
}
