package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᖟ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0916 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Handler f2210;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1041 f2211;

    public C0916(Context context, String str, String str2) {
        this.f2211 = new C1041(context, str, str2);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Handler m4240() {
        Handler handler;
        synchronized (C0916.class) {
            try {
                if (f2210 == null) {
                    HandlerThread handlerThread = new HandlerThread(StringFog.decrypt("dgHFSqkSiY1uENNuqRmZ\n", "PWS8HMh+/Og=\n"));
                    handlerThread.start();
                    f2210 = new Handler(handlerThread.getLooper());
                }
                handler = f2210;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m4241(String str) {
        C1041 c1041 = this.f2211;
        c1041.getClass();
        try {
            C0987 c0987 = c1041.f2634;
            synchronized (c0987) {
                c0987.f2361.delete(C0987.f2360, StringFog.decrypt("4Bq/H8M=\n", "i3/GIvwiWyI=\n"), new String[]{str});
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m4242(String str) {
        C1041 c1041 = this.f2211;
        c1041.getClass();
        try {
            String m4280 = c1041.f2634.m4280(str);
            if (m4280 == null || TextUtils.isEmpty(m4280)) {
                return m4280;
            }
            try {
                return c1041.f2635.m4328(m4280);
            } catch (C1074 unused) {
                return "";
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4243(String str, String str2) {
        C1041 c1041 = this.f2211;
        c1041.getClass();
        try {
            c1041.f2634.m4282(str, c1041.f2635.m4329(str2));
        } catch (Throwable unused) {
        }
    }
}
