package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* compiled from: WindVanePlugin.java */
/* loaded from: classes4.dex */
public abstract class g {
    protected Context a;
    protected Object b;
    protected WindVaneWebView c;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.a = context;
        this.c = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.b = obj;
        this.c = windVaneWebView;
    }
}
