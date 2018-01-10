package com.example.administrator.usercenter.presenter;

import android.util.Log;

import com.example.administrator.usercenter.bean.WL;
import com.example.administrator.usercenter.model.ModelToos;
import com.example.administrator.usercenter.view.ViewPort;

/**
 * Created by Administrator on 2018/1/10/010.
 */

public class PrensentToos implements ModelToos.OnFinish {
    ModelToos toos;
    ViewPort port;

    public PrensentToos(ViewPort port) {
        this.port = port;
        toos=new ModelToos(this);
    }
public void getData(String phone,String pass){
        toos.getUser(phone,pass);
}
    @Override
    public void finish(WL wl) {
        Log.d("+++++++++++++",wl.msg);
        port.show(wl);
    }
}
