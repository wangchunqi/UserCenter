package com.example.administrator.usercenter.presenter;

import com.example.administrator.usercenter.bean.Data;
import com.example.administrator.usercenter.model.Model3Port;
import com.example.administrator.usercenter.model.Model3Toos;
import com.example.administrator.usercenter.view.View3Port;

/**
 * Created by Administrator on 2018/1/10/010.
 */

public class Present3Toos implements Model3Toos.OnFinish{
    View3Port port3;
    Model3Toos toos3;

    public Present3Toos(View3Port port3) {
        this.port3 = port3;
        toos3=new Model3Toos(this);
    }
    public void getuser(String uid){
        toos3.getData(uid);
    }
    @Override
    public void finish(Data data) {
    port3.showData(data);
    }
}
