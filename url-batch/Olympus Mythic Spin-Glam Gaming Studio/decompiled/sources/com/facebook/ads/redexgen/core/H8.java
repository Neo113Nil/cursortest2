package com.facebook.ads.redexgen.core;

import android.text.TextUtils;

/* loaded from: assets/audience_network/classes2.dex */
public class H8 extends AbstractC3162fo {
    public final /* synthetic */ AbstractC2305Gj A00;

    public H8(AbstractC2305Gj abstractC2305Gj) {
        this.A00 = abstractC2305Gj;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3162fo
    public final void A03() {
        if (!this.A00.A08.A07()) {
            this.A00.A08.A05();
            if (!TextUtils.isEmpty(this.A00.A03.A2E())) {
                this.A00.A06.ABJ(this.A00.A03.A2E(), new C2875b9().A03(this.A00.A0C).A02(this.A00.A08).A04(this.A00.A03.A0z()).A05());
                if (this.A00.A03.A1u()) {
                    this.A00.A05.A0F().AEW();
                }
                C2714Wl.A00(this.A00.A05).A0E(this.A00.A0B.A8l(), this.A00.A03.A2E());
                C2482Ng.A07(this.A00.A03.A2A(), this.A00.A05);
                this.A00.A05.A0F().A3L();
                AbstractC2502Oa.A02(this.A00.A03.A0y(), AbstractC2738Xm.A00(this.A00.A03.A10()));
                this.A00.A0A.A4j(this.A00.A0B.A8G());
            }
        }
    }
}
