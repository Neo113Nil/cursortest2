package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class Y0 implements InterfaceC0306Ax {
    public final C0870Xu A00;
    public final C0869Xt A01;
    public final InterfaceC0284Ab[] A02;

    public Y0(InterfaceC0284Ab... interfaceC0284AbArr) {
        InterfaceC0284Ab[] interfaceC0284AbArr2 = (InterfaceC0284Ab[]) Arrays.copyOf(interfaceC0284AbArr, interfaceC0284AbArr.length + 2);
        this.A02 = interfaceC0284AbArr2;
        C0870Xu c0870Xu = new C0870Xu();
        this.A00 = c0870Xu;
        C0869Xt c0869Xt = new C0869Xt();
        this.A01 = c0869Xt;
        interfaceC0284AbArr2[interfaceC0284AbArr.length] = c0870Xu;
        interfaceC0284AbArr2[interfaceC0284AbArr.length + 1] = c0869Xt;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0306Ax
    public final C02809x A3b(C02809x c02809x) {
        this.A00.A0B(c02809x.A02);
        return new C02809x(this.A01.A01(c02809x.A01), this.A01.A00(c02809x.A00), c02809x.A02);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0306Ax
    public final InterfaceC0284Ab[] A64() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0306Ax
    public final long A7O(long j) {
        return this.A01.A02(j);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0306Ax
    public final long A80() {
        return this.A00.A0A();
    }
}
