package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓲ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0860 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static C0860 f2084;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1082 f2086 = new C1082();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0568 f2085 = new C0568();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static synchronized void m4220() {
        synchronized (C0860.class) {
            f2084 = null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized C0860 m4221() {
        C0860 c0860;
        synchronized (C0860.class) {
            try {
                if (f2084 == null) {
                    f2084 = new C0860();
                }
                c0860 = f2084;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0860;
    }
}
