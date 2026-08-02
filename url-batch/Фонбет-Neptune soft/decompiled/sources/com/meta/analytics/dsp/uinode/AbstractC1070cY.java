package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.cY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1070cY {
    public InterfaceC1071cZ A00;

    public final void A00() {
        InterfaceC1071cZ interfaceC1071cZ = this.A00;
        if (interfaceC1071cZ != null) {
            interfaceC1071cZ.onStart();
        }
    }

    public final void A01() {
        InterfaceC1071cZ interfaceC1071cZ = this.A00;
        if (interfaceC1071cZ != null) {
            interfaceC1071cZ.onStop();
        }
    }

    public final void A02(InterfaceC1071cZ interfaceC1071cZ) {
        this.A00 = interfaceC1071cZ;
    }
}
