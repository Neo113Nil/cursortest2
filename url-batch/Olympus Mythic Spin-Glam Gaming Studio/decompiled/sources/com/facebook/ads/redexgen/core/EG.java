package com.facebook.ads.redexgen.core;

import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public class EG extends AbstractC2505Od {
    public final /* synthetic */ EF A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EG(EF ef, double d, double d2, double d3, boolean z) {
        super(d, d2, d3, z);
        this.A00 = ef;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2505Od
    public final void A00(boolean z, boolean z2, C2507Of c2507Of) {
        C3218gi c3218gi;
        String str;
        Map A0J;
        boolean z3;
        c3218gi = this.A00.A0D;
        if (C2668Up.A0z(c3218gi)) {
            z3 = this.A00.A0A;
            if (z3) {
                return;
            }
        }
        if (z2) {
            this.A00.A0A = true;
            EF ef = this.A00;
            str = this.A00.A0J;
            A0J = this.A00.A0J(EnumC3096ek.A0B);
            ef.A0R(str, A0J);
        }
    }
}
