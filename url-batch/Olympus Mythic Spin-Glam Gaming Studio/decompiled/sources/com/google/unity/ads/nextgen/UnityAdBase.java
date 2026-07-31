package com.google.unity.ads.nextgen;

import android.app.Activity;
import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public abstract class UnityAdBase<AdT, CallbackT> {
    protected final Activity activity;
    protected AdT ad;
    protected final CallbackT callback;
    protected final Executor executor;

    protected UnityAdBase(Activity activity, CallbackT callbackt, Executor executor) {
        this.activity = activity;
        this.callback = callbackt;
        this.executor = executor;
    }
}
