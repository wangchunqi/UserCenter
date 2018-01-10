package com.example.administrator.usercenter.presenter;

import com.example.administrator.usercenter.bean.Bean;
import com.example.administrator.usercenter.model.Model2Port;
import com.example.administrator.usercenter.model.Model2Toos;
import com.example.administrator.usercenter.view.VIew2Port;

/**
 * Created by Administrator on 2018/1/10/010.
 */

public class Present2Toos implements Model2Toos.Onfinish2 {
    VIew2Port port2;
    Model2Toos toos2;

    public Present2Toos(VIew2Port port2) {
        this.port2 = port2;
        toos2=new Model2Toos(this);
    }
public void getUser(String name,String pass){
        toos2.get(name,pass);
}
    @Override
    public void finish(Bean bean) {
        port2.show(bean);
    }
}
