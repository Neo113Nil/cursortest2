package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.facebook.ads.redexgen.X.Vd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0804Vd implements InterfaceC0448Hd {
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0448Hd
    public final C0803Vc A4c(Looper looper, Handler.Callback callback) {
        return new C0803Vc(new Handler(looper, callback));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0448Hd
    public final long A5T() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0448Hd
    public final long AGs() {
        return SystemClock.uptimeMillis();
    }
}
