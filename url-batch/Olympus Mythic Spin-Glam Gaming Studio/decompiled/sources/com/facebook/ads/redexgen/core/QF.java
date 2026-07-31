package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QF implements InterfaceC2743Xr {
    public final C2742Xq A00;
    public final InterfaceC2743Xr A01;

    public QF(InterfaceC2743Xr interfaceC2743Xr, int i, int i2) {
        this.A01 = interfaceC2743Xr;
        this.A00 = new C2742Xq(i, i2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2743Xr
    public final void AH8(String str) {
        boolean A08;
        this.A00.A04(str);
        if (this.A00.A02() == null) {
            return;
        }
        A08 = AbstractC2745Xt.A08(this.A00);
        if (A08) {
            this.A01.AH8(this.A00.A02());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2743Xr
    public final void flush() {
        boolean A08;
        this.A00.A03();
        while (this.A00.A02() != null) {
            A08 = AbstractC2745Xt.A08(this.A00);
            if (A08) {
                this.A01.AH8(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
