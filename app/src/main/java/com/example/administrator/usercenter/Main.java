package com.example.administrator.usercenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.usercenter.bean.Bean;
import com.example.administrator.usercenter.bean.WL;
import com.example.administrator.usercenter.presenter.PrensentToos;
import com.example.administrator.usercenter.view.ViewPort;

/**
 * Created by Administrator on 2018/1/10/010.
 */

public class Main extends AppCompatActivity implements ViewPort, View.OnClickListener {
    private EditText mPhone;
    private EditText mPass;
    private Button mZc2;
    private PrensentToos toos;
    private TextView tv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initView();
    }

    private void initView() {
        mPhone = (EditText) findViewById(R.id.phone);
        mPass = (EditText) findViewById(R.id.pass);
        mZc2 = (Button) findViewById(R.id.zc2);
        tv = (TextView) findViewById(R.id.tv);
        mZc2.setOnClickListener(this);
        toos=new PrensentToos(this);

    }

    @Override
    public void show(WL wl) {
        if(wl.code.equals("0"))
        {
            startActivity(new Intent(Main.this,MainActivity.class));
            Toast.makeText(this,wl.msg,
                    Toast.LENGTH_LONG).show();
            finish();
        }
        else
        {
            Toast.makeText(this,wl.msg,
                    Toast.LENGTH_LONG).show();
        }
        tv.setText(wl.msg);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.zc2:
                // TODO 18/01/10
                String name=mPhone.getText().toString().trim();
                String pass=mPass.getText().toString().trim();
                if (name!=null){
                    if (pass!=null){
                        toos.getData(name,pass);
                    }else {
                        Toast.makeText(this,"请输入密码",Toast.LENGTH_LONG).show();
                    }
                }else {
                    Toast.makeText(this, "请输入账号", Toast.LENGTH_LONG).show();
                }
                break;
            default:
                break;
        }
    }

}
