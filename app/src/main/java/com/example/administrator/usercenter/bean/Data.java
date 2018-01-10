package com.example.administrator.usercenter.bean;

/**
 * Created by Administrator on 2018/1/10/010.
 */

public class Data {


    /**
     * msg : 获取用户信息成功
     * code : 0
     * data : {"age":null,"appkey":"80d9a01dba3aada5","appsecret":"17CDCE48FBB3D9CEA6A1599300A7CBC8","createtime":"2017-11-17T13:41:35","email":null,"fans":0,"follow":0,"gender":null,"icon":null,"latitude":null,"longitude":null,"mobile":"13509090909","money":null,"nickname":null,"password":"94E3FA7E637B0803B4034D7B1B165B83","praiseNum":null,"token":"B4AD76A4EBC068AF6376DCC03C5EFAF4","uid":1135,"userId":null,"username":"13509090909"}
     */

    public String msg;
    public String code;
    public DataBean data;

    public static class DataBean {
        /**
         * age : null
         * appkey : 80d9a01dba3aada5
         * appsecret : 17CDCE48FBB3D9CEA6A1599300A7CBC8
         * createtime : 2017-11-17T13:41:35
         * email : null
         * fans : 0
         * follow : 0
         * gender : null
         * icon : null
         * latitude : null
         * longitude : null
         * mobile : 13509090909
         * money : null
         * nickname : null
         * password : 94E3FA7E637B0803B4034D7B1B165B83
         * praiseNum : null
         * token : B4AD76A4EBC068AF6376DCC03C5EFAF4
         * uid : 1135
         * userId : null
         * username : 13509090909
         */

        public Object age;
        public String appkey;
        public String appsecret;
        public String createtime;
        public Object email;
        public int fans;
        public int follow;
        public Object gender;
        public Object icon;
        public Object latitude;
        public Object longitude;
        public String mobile;
        public Object money;
        public Object nickname;
        public String password;
        public Object praiseNum;
        public String token;
        public int uid;
        public Object userId;
        public String username;
    }
}
