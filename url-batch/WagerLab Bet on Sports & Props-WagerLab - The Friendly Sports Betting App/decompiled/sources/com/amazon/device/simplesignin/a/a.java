package com.amazon.device.simplesignin.a;

import android.app.Application;
import android.content.Context;

/* compiled from: HandlerFactory.java */
/* loaded from: classes3.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f696a = "a";
    private static final a b = new a();
    private static volatile b c;

    private a() {
    }

    static a a() {
        return b;
    }

    b a(Context context) {
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    if (b(context)) {
                        c = new com.amazon.device.simplesignin.a.c.b();
                        com.amazon.device.simplesignin.a.d.a.a(f696a, "SDK initialized in Sandbox mode.");
                    } else {
                        c = new com.amazon.device.simplesignin.a.a.b();
                        com.amazon.device.simplesignin.a.d.a.a(f696a, "SDK initialized in Production mode.");
                    }
                }
            }
        }
        return c;
    }

    boolean b(Context context) {
        return com.amazon.a.a.a((Application) context.getApplicationContext());
    }
}
