package com.moe.framework;

import android.app.Activity;
import android.os.Bundle;

import com.moe.widget.ShadowView;

public class Test extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new ShadowView(this));
    }
}