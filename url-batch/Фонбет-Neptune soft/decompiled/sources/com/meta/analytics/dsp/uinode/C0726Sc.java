package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Sc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0726Sc implements InterfaceC0638Os {
    public final /* synthetic */ C0725Sb A00;

    public C0726Sc(C0725Sb c0725Sb) {
        this.A00 = c0725Sb;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0638Os
    public final void ADb(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0638Os
    public final void ADd(View view) {
        TS ts = (TS) view;
        ts.A16();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) ts.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
