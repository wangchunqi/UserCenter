package com.example.administrator.usercenter.bean;

/**
 * Created by Administrator on 2018/1/10/010.
 */

public class Bean {
    /**
     * msg : 登录成功
     * code : 0
     * data : {"age":null,"appkey":"4c17d9250210436d","appsecret":"7C64369D117C7B71AD3F164D6069DF89","createtime":"2018-01-10T11:13:51","email":null,"fans":null,"follow":null,"gender":null,"icon":null,"latitude":null,"longitude":null,"mobile":"13522483483","money":null,"nickname":null,"password":"8F669074CAF5513351A2DE5CC22AC04C","praiseNum":null,"token":"30D75B8E7ED2E8A1807D75692DC1F635","uid":11364,"userId":null,"username":"13522483483"}
     */

    public String msg;
    public String code;
    public Data.DataBean data;

    public static class DataBean {
        /**
         * age : null
         * appkey : 4c17d9250210436d
         * appsecret : 7C64369D117C7B71AD3F164D6069DF89
         * createtime : 2018-01-10T11:13:51
         * email : null
         * fans : null
         * follow : null
         * gender : null
         * icon : null
         * latitude : null
         * longitude : null
         * mobile : 13522483483
         * money : null
         * nickname : null
         * password : 8F669074CAF5513351A2DE5CC22AC04C
         * praiseNum : null
         * token : 30D75B8E7ED2E8A1807D75692DC1F635
         * uid : 11364
         * userId : null
         * username : 13522483483
         */

        public Object age;
        public String appkey;
        public String appsecret;
        public String createtime;
        public Object email;
        public Object fans;
        public Object follow;
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
