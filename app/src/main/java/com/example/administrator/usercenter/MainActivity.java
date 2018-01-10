package com.example.administrator.usercenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.usercenter.bean.Bean;
import com.example.administrator.usercenter.presenter.Present2Toos;
import com.example.administrator.usercenter.view.VIew2Port;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,VIew2Port {

    private EditText mPhone;
    private EditText mPass;
    private Button mDc;
    private Button mZc;
    private Present2Toos toos2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mPhone = (EditText) findViewById(R.id.phone);
        mPass = (EditText) findViewById(R.id.pass);
        mDc = (Button) findViewById(R.id.dc);
        mDc.setOnClickListener(this);
        mZc = (Button) findViewById(R.id.zc);
        mZc.setOnClickListener(this);
        toos2=new Present2Toos(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.dc:
                // TODO 18/01/10
                String name=mPhone.getText().toString().trim();
                String pass=mPass.getText().toString().trim();
                if (name!=null){
                    if (pass!=null){
                        //13522481234
                        toos2.getUser(name,pass);
                    }else {
                        Toast.makeText(this,"请输入密码",Toast.LENGTH_LONG).show();
                    }
                }else {
                    Toast.makeText(this, "请输入账号", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.zc:
                // TODO 18/01/10
                startActivity(new Intent(this,Main.class));
                break;
            default:
                break;
        }
    }

    @Override
    public void show(Bean bean) {
        if (bean.code.equals("0")) {
            Toast.makeText(this, bean.msg, Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this, Main2.class);
            intent.putExtra("uid", bean.data.uid + "");
            startActivity(intent);
        }
    }
}
