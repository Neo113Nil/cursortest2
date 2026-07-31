package com.amazon.a;

import android.app.Activity;

/* compiled from: CrossPlatformPluginUtils.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f623a = new com.amazon.a.a.o.c("CrossPlatformPluginUtils");

    private static boolean a() {
        if (a.b() != null) {
            return a.b().h();
        }
        return false;
    }

    public static void a(Activity activity) {
        com.amazon.a.a.o.a.a.a(a.d(), "AppstoreSDK not initialized");
        if (a()) {
            return;
        }
        a.b().c(activity);
        com.amazon.a.a.o.c cVar = f623a;
        if (com.amazon.a.a.o.c.f599a) {
            cVar.a("Notified Visibility for activity:" + activity);
        }
    }
}
