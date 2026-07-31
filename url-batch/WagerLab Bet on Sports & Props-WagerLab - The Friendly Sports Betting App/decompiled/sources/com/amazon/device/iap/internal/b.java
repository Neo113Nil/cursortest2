package com.amazon.device.iap.internal;

import android.app.Application;
import android.content.Context;

/* compiled from: ImplementationFactory.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f678a = new b();
    private static final String b = b.class.getName();
    private static volatile e c;

    private b() {
    }

    public static b a() {
        return f678a;
    }

    public e a(Context context) {
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    if (com.amazon.a.a.a((Application) context.getApplicationContext())) {
                        c = new com.amazon.device.iap.internal.c.e();
                    } else {
                        c = new com.amazon.device.iap.internal.a.d();
                    }
                }
            }
        }
        return c;
    }
}
