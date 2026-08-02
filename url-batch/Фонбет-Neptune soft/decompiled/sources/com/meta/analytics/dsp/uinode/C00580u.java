package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.0u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00580u {
    public static InterfaceC00530p A00;

    public final InterfaceC00530p A00(C0889Yn c0889Yn, AdPlacementType adPlacementType) {
        InterfaceC00530p interfaceC00530p = A00;
        if (interfaceC00530p != null) {
            return interfaceC00530p;
        }
        switch (C00570t.A00[adPlacementType.ordinal()]) {
            case 1:
                return new C1010bN();
            case 2:
                return new C1009bM();
            case 3:
                return new C1007bK(c0889Yn);
            case 4:
                return new C0398Fb(c0889Yn);
            case 5:
                return new FY();
            default:
                return null;
        }
    }
}
