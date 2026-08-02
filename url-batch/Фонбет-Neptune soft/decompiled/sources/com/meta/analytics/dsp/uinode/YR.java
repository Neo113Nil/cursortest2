package com.meta.analytics.dsp.uinode;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class YR implements InterfaceC02197i {
    public final C02177f A00;

    public YR(C02177f c02177f) {
        this.A00 = c02177f;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02197i
    public final Map<String, String> A4n() {
        return C02368d.A01(this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02197i
    public final Map<String, String> A61() {
        return C8J.A02();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02197i
    public final String A7F() {
        return C8J.A00();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02197i
    public final String A7H() {
        return C6E.A00().A03();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02197i
    public final boolean A94() {
        return C0531Kp.A00().A03();
    }
}
