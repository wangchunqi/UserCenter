package com.example.administrator.usercenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.usercenter.bean.Data;
import com.example.administrator.usercenter.presenter.Present2Toos;
import com.example.administrator.usercenter.presenter.Present3Toos;
import com.example.administrator.usercenter.view.View3Port;

/**
 * Created by Administrator on 2018/1/10/010.
 */

public class Main2 extends AppCompatActivity implements View.OnClickListener,View3Port {
    private ImageView mImage;
    private TextView mTv1;
    private TextView mTv2;
    private Button mBut;
    private Present3Toos toos3;
    private  Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        initView();
    }

    private void initView() {
        mImage = (ImageView) findViewById(R.id.image);
        mTv1 = (TextView) findViewById(R.id.tv1);
        mTv2 = (TextView) findViewById(R.id.tv2);
        mBut = (Button) findViewById(R.id.but);
        mBut.setOnClickListener(this);
        toos3=new Present3Toos(this);
        intent=getIntent();
        String uid = intent.getStringExtra("uid");
        toos3.getuser(uid);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but:
                // TODO 18/01/10
                intent=getIntent();
                intent.clone();
                mTv1.setText("");
                mTv2.setText("");
                startActivity(new Intent(Main2.this,MainActivity.class));
                finish();
                break;
            default:
                break;
        }
    }

    @Override
    public void showData(Data data) {
        mTv1.setText(data.data.username);
        mTv2.setText(data.data.mobile);
    }
}
