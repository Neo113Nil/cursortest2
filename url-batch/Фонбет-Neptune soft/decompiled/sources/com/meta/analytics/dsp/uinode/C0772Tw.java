package com.meta.analytics.dsp.uinode;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Tw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0772Tw extends RD {
    public final /* synthetic */ C0768Ts A00;

    public C0772Tw(C0768Ts c0768Ts) {
        this.A00 = c0768Ts;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r0.A07() == false) goto L6;
     */
    @Override // com.meta.analytics.dsp.uinode.RD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A03() {
        boolean z;
        C0548Lg c0548Lg;
        WeakReference weakReference;
        WeakReference weakReference2;
        C0548Lg c0548Lg2;
        z = this.A00.A05;
        if (!z) {
            c0548Lg2 = this.A00.A01;
        }
        c0548Lg = this.A00.A01;
        c0548Lg.A05();
        weakReference = this.A00.A0A;
        if (weakReference.get() != null) {
            weakReference2 = this.A00.A0A;
            ((InterfaceC0595Nb) weakReference2.get()).ABj();
        }
    }
}
