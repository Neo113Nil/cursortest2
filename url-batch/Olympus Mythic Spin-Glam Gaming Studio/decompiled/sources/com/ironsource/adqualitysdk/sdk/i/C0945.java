package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᘧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0945 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC1130 f2251;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public boolean f2252 = false;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Handler f2250 = new Handler(Looper.getMainLooper());

    /* renamed from: ﻛ, reason: contains not printable characters */
    public C0961 f2249 = new C0961(this);

    public C0945(InterfaceC1130 interfaceC1130) {
        this.f2251 = interfaceC1130;
        AbstractC0698 m4143 = AbstractC0698.m4143();
        C0961 c0961 = this.f2249;
        synchronized (m4143) {
            m4143.f1553.add(c0961);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4244() {
        this.f2250.removeCallbacksAndMessages(null);
        if (this.f2249 != null) {
            AbstractC0698 m4143 = AbstractC0698.m4143();
            C0961 c0961 = this.f2249;
            synchronized (m4143) {
                m4143.f1553.remove(c0961);
            }
            this.f2249 = null;
        }
    }
}
