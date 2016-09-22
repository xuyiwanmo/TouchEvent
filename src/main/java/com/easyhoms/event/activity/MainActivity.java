package com.easyhoms.event.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.easyhoms.event.BaseApp;
import com.easyhoms.event.R;
import com.easyhoms.event.bean.ALayout;
import com.easyhoms.event.bean.BLayout;
import com.easyhoms.event.bean.CView;
import com.easyhoms.event.bean.TextCallback;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

@ContentView(R.layout.activity_main)
public class MainActivity extends BaseActivity implements TextCallback {
    @ViewInject(R.id.a)
    ALayout a;
    @ViewInject(R.id.b)
    BLayout b;
    @ViewInject(R.id.c)
    CView c;
    @ViewInject(R.id.result)
    TextView result;
    @ViewInject(R.id.clear)
    TextView clear;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        a.setCallback(this);
        b.setCallback(this);
        c.setCallback(this);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BaseApp.getIntance().result = new StringBuilder();
                result.setText("");
            }
        });
    }

    @Override
    public void showText() {
        result.setText(BaseApp.getIntance().result.toString());
    }

    @Override
    protected void onResume() {
        super.onResume();
        BaseApp.getIntance().result = new StringBuilder();
    }
}
