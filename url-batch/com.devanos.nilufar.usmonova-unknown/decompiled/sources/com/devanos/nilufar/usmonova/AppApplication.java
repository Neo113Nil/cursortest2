package com.devanos.nilufar.usmonova;

import android.app.Application;
import android.content.Context;
import kotlin.Metadata;
import o.AbstractC0048Bt;
import o.AbstractC0896dH;
import o.UQ;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/devanos/nilufar/usmonova/AppApplication;", "Landroid/app/Application;", "<init>", "()V", "Lo/bY;", "onCreate", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppApplication extends Application {
    public static final int $stable = 8;

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        Context context = UQ.a;
        Context applicationContext = getApplicationContext();
        AbstractC0048Bt.m(applicationContext, "getApplicationContext(...)");
        UQ.a = applicationContext;
        AbstractC0896dH.d("App", "init pkg=com.devanos.nilufar.usmonova");
    }
}
