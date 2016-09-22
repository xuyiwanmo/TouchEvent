package com.easyhoms.event.bean;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import com.easyhoms.event.BaseApp;
import com.easyhoms.event.SPUtils;

import static com.easyhoms.event.bean.ALayout.TAG;

/**
 * Created by 德医互联 on 2016/9/22.
 */

public class BLayout extends LinearLayout {
    public BLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
     //   super.onTouchEvent(ev);
        Log.i(TAG,"BLayout  onTouchEvent");
        BaseApp.getIntance().result.append("BLayout  onTouchEvent\n");
        mCallback.showText();
        return (boolean) SPUtils.get(getContext(), "b2",false);

    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
      //  super.onInterceptTouchEvent(ev);
        Log.i(TAG,"BLayout  onInterceptTouchEvent");
        BaseApp.getIntance().result.append("BLayout  onInterceptTouchEvent\n");
        mCallback.showText();
        return (boolean) SPUtils.get(getContext(), "b1",false);

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
     //   super.dispatchTouchEvent(ev);
        Log.i(TAG,"BLayout  dispatchTouchEvent");
        BaseApp.getIntance().result.append("BLayout  dispatchTouchEvent\n");
        mCallback.showText();
        return super.dispatchTouchEvent(ev);

    }

    TextCallback mCallback;

    public void setCallback(TextCallback callback) {
        mCallback = callback;
    }

}
