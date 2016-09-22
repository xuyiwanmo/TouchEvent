package com.easyhoms.event.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.easyhoms.event.R;
import com.easyhoms.event.SPUtils;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

@ContentView(R.layout.activity_config)
public class ConfigActivity extends BaseActivity {

    @ViewInject(R.id.group)
    LinearLayout mGroup;
    @ViewInject(R.id.show)
    TextView show;

    public static String[] str=new String[]{"a1","a2","b1","b2","c1"};
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int size =mGroup.getChildCount();
        for (i = 0; i < size; i++) {
            CheckBox rb= (CheckBox) mGroup.getChildAt(i);
            rb.setTag(i);
            rb.setChecked((boolean)SPUtils.get(ConfigActivity.this,str[(int)rb.getTag()],false));
        }

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initConfig();
                startActivity(new Intent(ConfigActivity.this,MainActivity.class));
            }
        });

    }

    private void initConfig() {
        int size =mGroup.getChildCount();
        for (i = 0; i < size; i++) {
            CheckBox rb= (CheckBox) mGroup.getChildAt(i);
            SPUtils.put(ConfigActivity.this,str[i],rb.isChecked());
        }
    }
}
