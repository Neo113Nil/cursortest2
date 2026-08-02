package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* renamed from: com.facebook.ads.redexgen.X.Sq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0740Sq implements InterfaceC0649Pd {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0738So A01;

    public C0740Sq(C0738So c0738So, int i) {
        this.A01 = c0738So;
        this.A00 = i;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0649Pd
    public final void AAu() {
        this.A01.A0R(false, this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0649Pd
    public final void ABH(int i) {
        C0738So.A02(this.A01, i);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0649Pd
    public final void ABY(float f) {
        boolean z;
        z = this.A01.A08;
        if (!z) {
            this.A01.A0G(f);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0649Pd
    public final void AD7(boolean z) {
        this.A01.A0Q(z);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0649Pd
    public final void ADX(String str) {
        C0889Yn c0889Yn;
        MC mc;
        InterfaceC0577Mj interfaceC0577Mj;
        c0889Yn = this.A01.A0D;
        c0889Yn.A0E().A2z(str);
        mc = this.A01.A0H;
        interfaceC0577Mj = this.A01.A0J;
        mc.A43(interfaceC0577Mj.A6y());
        this.A01.A0H(3);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0649Pd
    public final void AGq() {
        FullScreenAdToolbar fullScreenAdToolbar;
        FullScreenAdToolbar fullScreenAdToolbar2;
        this.A01.A09 = false;
        fullScreenAdToolbar = this.A01.A0I;
        fullScreenAdToolbar.setProgressImmediate(0.0f);
        fullScreenAdToolbar2 = this.A01.A0I;
        fullScreenAdToolbar2.setToolbarActionMode(2);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0649Pd
    public final void AGr(float f) {
        FullScreenAdToolbar fullScreenAdToolbar;
        fullScreenAdToolbar = this.A01.A0I;
        fullScreenAdToolbar.setProgress(100.0f * f);
    }
}
