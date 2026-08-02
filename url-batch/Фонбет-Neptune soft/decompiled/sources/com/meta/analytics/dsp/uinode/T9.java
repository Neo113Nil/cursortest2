package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class T9 implements L8 {
    public final /* synthetic */ T8 A00;

    public T9(T8 t8) {
        this.A00 = t8;
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ABA() {
        InterfaceC0649Pd interfaceC0649Pd;
        InterfaceC0649Pd interfaceC0649Pd2;
        int i;
        interfaceC0649Pd = this.A00.A05;
        interfaceC0649Pd.AD7(false);
        interfaceC0649Pd2 = this.A00.A05;
        i = this.A00.A02;
        interfaceC0649Pd2.ABH(i);
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ACm(float f) {
        InterfaceC0649Pd interfaceC0649Pd;
        int i;
        interfaceC0649Pd = this.A00.A05;
        i = this.A00.A02;
        interfaceC0649Pd.ABY(i - f);
    }
}
