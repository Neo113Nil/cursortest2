package com.meta.analytics.dsp.uinode;

import android.app.Activity;

/* renamed from: com.facebook.ads.redexgen.X.Kp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0531Kp {
    public static final C0531Kp A04 = new C0531Kp(new C0788Um(), new C0787Ul());
    public final InterfaceC0530Ko A02;
    public final InterfaceC0546Le A03;
    public boolean A01 = true;
    public long A00 = -1;

    public C0531Kp(InterfaceC0546Le interfaceC0546Le, InterfaceC0530Ko interfaceC0530Ko) {
        this.A03 = interfaceC0546Le;
        this.A02 = interfaceC0530Ko;
    }

    public static C0531Kp A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A50();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        Activity lastResumedActivity = this.A02.A7G();
        boolean z = true;
        if (lastResumedActivity != null) {
            return true;
        }
        synchronized (C0531Kp.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A50() - this.A00 >= 1000) {
                z = false;
            }
            return z;
        }
    }
}
