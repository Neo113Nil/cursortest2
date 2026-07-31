package com.iab.omid.library.fyber;

import android.content.Context;

/* loaded from: classes14.dex */
public final class Omid {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static b INSTANCE = new b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.a();
    }

    public static boolean isActive() {
        return INSTANCE.b();
    }

    public static void updateLastActivity() {
        INSTANCE.c();
    }
}
