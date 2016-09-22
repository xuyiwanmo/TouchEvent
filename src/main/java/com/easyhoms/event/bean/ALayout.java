package com.easyhoms.event.bean;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import com.easyhoms.event.BaseApp;
import com.easyhoms.event.SPUtils;

/**
 * Created by 德医互联 on 2016/9/22.
 */

public class ALayout extends LinearLayout {
    TextCallback mCallback;

    public void setCallback(TextCallback callback) {
        mCallback = callback;
    }

    public static final String TAG="zhang";
    public ALayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        super.onTouchEvent(ev);
        Log.i(TAG,"ALayout  onTouchEvent");
        BaseApp.getIntance().result.append("ALayout  onTouchEvent\n");
        mCallback.showText();
        return (boolean) SPUtils.get(getContext(), "a2",false);

    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        super.onInterceptTouchEvent(ev);
        Log.i(TAG,"ALayout  onInterceptTouchEvent");
        BaseApp.getIntance().result.append("ALayout  onInterceptTouchEvent\n");
        mCallback.showText();
        return (boolean)SPUtils.get(getContext(), "a1",false);

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
     //   super.dispatchTouchEvent(ev);
        Log.i(TAG,"ALayout  dispatchTouchEvent");
        BaseApp.getIntance().result.append("ALayout  dispatchTouchEvent\n");
        mCallback.showText();
        return super.dispatchTouchEvent(ev);

    }



}
