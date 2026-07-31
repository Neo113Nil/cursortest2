package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.າ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0756 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static C0756 f1690;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public C0851 f1691;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public ChoreographerFrameCallbackC0805 f1692;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public boolean f1695;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final HashMap f1694 = new HashMap();

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Handler f1693 = new Handler(Looper.getMainLooper());

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized C0756 m4155() {
        C0756 c0756;
        synchronized (C0756.class) {
            try {
                if (f1690 == null) {
                    f1690 = new C0756();
                }
                c0756 = f1690;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0756;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4156(C0756 c0756) {
        if (c0756.f1695 || new HashMap(c0756.f1694).isEmpty()) {
            return;
        }
        c0756.f1695 = true;
        AbstractC1026.m4313(new C0796(c0756));
    }
}
