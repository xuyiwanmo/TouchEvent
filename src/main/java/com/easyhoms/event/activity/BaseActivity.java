package com.easyhoms.event.activity;

import android.app.Activity;
import android.os.Bundle;

import org.xutils.x;

/**
 * Created by 德医互联 on 2016/9/22.
 */

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
    }
}
