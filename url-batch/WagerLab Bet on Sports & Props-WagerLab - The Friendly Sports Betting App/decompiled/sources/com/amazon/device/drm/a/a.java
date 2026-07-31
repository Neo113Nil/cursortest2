package com.amazon.device.drm.a;

import android.app.Application;
import android.content.Context;

/* compiled from: LicenseImplementationFactory.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f660a = new a();
    private static volatile c b;

    private a() {
    }

    public static a a() {
        return f660a;
    }

    public c a(Context context) {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    if (com.amazon.a.a.a((Application) context.getApplicationContext())) {
                        b = new com.amazon.device.drm.a.d.c();
                    } else {
                        b = new com.amazon.device.drm.a.b.c();
                    }
                }
            }
        }
        return b;
    }
}
