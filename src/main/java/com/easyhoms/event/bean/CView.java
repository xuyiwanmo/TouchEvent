package com.easyhoms.event.bean;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.easyhoms.event.BaseApp;
import com.easyhoms.event.SPUtils;

import static com.easyhoms.event.bean.ALayout.TAG;

/**
 * Created by 德医互联 on 2016/9/22.
 */

public class CView extends View {
    public CView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
       // super.onTouchEvent(event);
        Log.i(TAG,"CView  onTouchEvent");
        BaseApp.getIntance().result.append("CView  onTouchEvent\n");
        mCallback.showText();
        return (boolean)SPUtils.get(getContext(), "c1",false);

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        Log.i(TAG,"CView  dispatchTouchEvent");
        BaseApp.getIntance().result.append("CView  dispatchTouchEvent\n");
        mCallback.showText();
        return super.dispatchTouchEvent(ev);

    }

    TextCallback mCallback;

    public void setCallback(TextCallback callback) {
        mCallback = callback;
    }

}
