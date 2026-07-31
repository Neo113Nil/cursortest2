package com.amazon.a.a.l;

import android.app.Activity;
import android.content.Intent;

/* compiled from: ActivityResult.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f543a;
    private final int b;
    private final int c;
    private final Intent d;

    public a(Activity activity, int i, int i2, Intent intent) {
        this.f543a = activity;
        this.b = i;
        this.c = i2;
        this.d = intent;
    }

    public Activity a() {
        return this.f543a;
    }

    public int b() {
        return this.b;
    }

    public Intent c() {
        return this.d;
    }

    public int d() {
        return this.c;
    }

    public String toString() {
        return "ActivtyResult: [ requestCode: " + this.b + ", resultCode: " + this.c + ", activity: " + this.f543a + ", intent: " + this.d + "]";
    }
}
