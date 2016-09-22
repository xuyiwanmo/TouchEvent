package com.easyhoms.event;

import android.app.Application;

import org.xutils.x;

/**
 * Created by 德医互联 on 2016/9/22.
 */

public class BaseApp extends Application {
    public static BaseApp sApp;
    public static StringBuilder result;

    public static BaseApp getIntance(){
        return sApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sApp=this;
        result=new StringBuilder("");
        x.Ext.init(this);
        x.Ext.setDebug(true); // 是否输出debug日志
    }
}
