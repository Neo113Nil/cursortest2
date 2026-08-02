package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class CB extends WW implements InterfaceC0382El {
    public long A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final InterfaceC0330Bv A05;
    public final InterfaceC0439Gt A06;
    public final Object A07;
    public final String A08;

    public CB(Uri uri, InterfaceC0439Gt interfaceC0439Gt, InterfaceC0330Bv interfaceC0330Bv, int i, String str, int i2, Object obj) {
        this.A04 = uri;
        this.A06 = interfaceC0439Gt;
        this.A05 = interfaceC0330Bv;
        this.A03 = i;
        this.A08 = str;
        this.A02 = i2;
        this.A00 = -9223372036854775807L;
        this.A07 = obj;
    }

    private void A00(long j, boolean z) {
        this.A00 = j;
        this.A01 = z;
        A01(new WN(this.A00, this.A01, false, this.A07), null);
    }

    @Override // com.meta.analytics.dsp.uinode.WW
    public final void A02() {
    }

    @Override // com.meta.analytics.dsp.uinode.WW
    public final void A03(Y6 y6, boolean z) {
        A00(this.A00, false);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0387Eq
    public final WP A4k(C0385Eo c0385Eo, InterfaceC0432Gm interfaceC0432Gm) {
        AbstractC0445Ha.A03(c0385Eo.A02 == 0);
        return new CD(this.A04, this.A06.A4X(), this.A05.A4b(), this.A03, A00(c0385Eo), this, interfaceC0432Gm, this.A08, this.A02);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0387Eq
    public final void AAO() throws IOException {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0382El
    public final void AD9(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (this.A00 == j && this.A01 == z) {
            return;
        }
        A00(j, z);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0387Eq
    public final void AEa(WP wp) {
        ((CD) wp).A0R();
    }
}
