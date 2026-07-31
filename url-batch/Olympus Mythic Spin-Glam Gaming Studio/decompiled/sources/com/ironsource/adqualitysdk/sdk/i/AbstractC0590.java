package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ԍ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC0590 extends AbstractC1173 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static C0600 f976;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static synchronized AbstractC0590 m4087() {
        C0600 c0600;
        synchronized (AbstractC0590.class) {
            try {
                if (f976 == null) {
                    f976 = new C0600();
                }
                c0600 = f976;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0600;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    public abstract boolean mo4088();

    /* renamed from: ﮉ, reason: contains not printable characters */
    public abstract void mo4089();

    /* renamed from: ﮌ, reason: contains not printable characters */
    public abstract boolean mo4090();

    /* renamed from: ﮐ, reason: contains not printable characters */
    public abstract boolean mo4091();

    /* renamed from: ﱟ, reason: contains not printable characters */
    public abstract boolean mo4092();

    /* renamed from: ﱡ, reason: contains not printable characters */
    public abstract boolean mo4093();

    /* renamed from: ﺙ, reason: contains not printable characters */
    public abstract boolean mo4094();

    /* renamed from: ﻏ, reason: contains not printable characters */
    public abstract String mo4095();

    /* renamed from: ﻛ, reason: contains not printable characters */
    public abstract HashMap mo4096();

    /* renamed from: ｋ, reason: contains not printable characters */
    public abstract int mo4097();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public abstract int mo4098();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo4099(Context context, C0783 c0783, boolean z);

    /* renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo4100(Context context, C1007 c1007, C0495 c0495, C0433 c0433, boolean z);
}
