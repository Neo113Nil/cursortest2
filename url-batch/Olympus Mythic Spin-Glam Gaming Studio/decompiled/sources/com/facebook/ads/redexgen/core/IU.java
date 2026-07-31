package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class IU implements XN {
    public final /* synthetic */ C5S A00;

    public IU(C5S c5s) {
        this.A00 = c5s;
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() {
        InterfaceC3038dm interfaceC3038dm;
        int i;
        InterfaceC3038dm interfaceC3038dm2;
        interfaceC3038dm = this.A00.A0P;
        i = this.A00.A0F;
        interfaceC3038dm.ADc(i);
        interfaceC3038dm2 = this.A00.A0P;
        interfaceC3038dm2.ADA();
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f) {
        int i;
        boolean z;
        C2255Ek c2255Ek;
        int duration;
        boolean z2;
        int i2;
        InterfaceC3038dm interfaceC3038dm;
        i = this.A00.A0F;
        float f2 = i - f;
        z = this.A00.A0d;
        if (z) {
            duration = 0;
        } else {
            c2255Ek = this.A00.A0S;
            duration = c2255Ek.getDuration();
        }
        float totalForce = f2 + duration;
        z2 = this.A00.A0d;
        if (z2) {
            i2 = this.A00.A0F;
        } else {
            i2 = this.A00.A0E;
        }
        float seenTime = i2;
        float totalForce2 = totalForce / seenTime;
        interfaceC3038dm = this.A00.A0P;
        interfaceC3038dm.AKd(totalForce2);
    }
}
