package com.facebook.ads.redexgen.core;

import android.content.DialogInterface;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public class Q1 extends AbstractRunnableC2705Wc {
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ YR A01;

    public Q1(YR yr, DialogInterface dialogInterface) {
        this.A01 = yr;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        InterfaceC3169fv interfaceC3169fv;
        InterfaceC3169fv interfaceC3169fv2;
        C3214ge c3214ge;
        Map<? extends String, ? extends String> A02;
        interfaceC3169fv = this.A01.A01.A02;
        if (interfaceC3169fv != null) {
            interfaceC3169fv2 = this.A01.A01.A02;
            c3214ge = this.A01.A01.A00;
            String A03 = WI.A03(c3214ge);
            C3183g9 c3183g9 = new C3183g9();
            A02 = this.A01.A01.A02(this.A01.A00.getText().toString());
            interfaceC3169fv2.AGx(A03, c3183g9.A05(A02).A08());
        }
        this.A00.cancel();
    }
}
