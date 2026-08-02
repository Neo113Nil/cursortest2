package com.meta.analytics.dsp.uinode;

import android.os.Build;
import android.os.Bundle;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01363u {
    public static final InterfaceC01353t A01;
    public final Object A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A01 = new C0376Ef();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A01 = new C0377Eg();
        } else {
            A01 = new C0919Zs();
        }
    }

    public C01363u() {
        this.A00 = A01.AAW(this);
    }

    public C01363u(Object obj) {
        this.A00 = obj;
    }

    public final C01343s A00(int i) {
        return null;
    }

    public final C01343s A01(int i) {
        return null;
    }

    public final Object A02() {
        return this.A00;
    }

    public final List<C01343s> A03(String str, int i) {
        return null;
    }

    public final boolean A04(int i, int i2, Bundle bundle) {
        return false;
    }
}
