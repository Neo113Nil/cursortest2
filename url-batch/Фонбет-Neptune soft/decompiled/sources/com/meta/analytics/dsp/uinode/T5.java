package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class T5 implements L8 {
    public final /* synthetic */ T4 A00;

    public T5(T4 t4) {
        this.A00 = t4;
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ABA() {
        InterfaceC0649Pd interfaceC0649Pd;
        int i;
        InterfaceC0649Pd interfaceC0649Pd2;
        interfaceC0649Pd = this.A00.A0F;
        i = this.A00.A0A;
        interfaceC0649Pd.ABH(i);
        interfaceC0649Pd2 = this.A00.A0F;
        interfaceC0649Pd2.AAu();
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ACm(float f) {
        int i;
        boolean z;
        SA sa;
        int duration;
        boolean z2;
        int i2;
        InterfaceC0649Pd interfaceC0649Pd;
        i = this.A00.A0A;
        float f2 = i - f;
        z = this.A00.A0V;
        if (z) {
            duration = 0;
        } else {
            sa = this.A00.A0I;
            duration = sa.getDuration();
        }
        float totalForce = f2 + duration;
        z2 = this.A00.A0V;
        if (z2) {
            i2 = this.A00.A0A;
        } else {
            i2 = this.A00.A09;
        }
        float seenTime = i2;
        float totalForce2 = totalForce / seenTime;
        interfaceC0649Pd = this.A00.A0F;
        interfaceC0649Pd.AGr(totalForce2);
    }
}
