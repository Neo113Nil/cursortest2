package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* loaded from: assets/audience_network/classes2.dex */
public final class N6 {
    public static N1 A00;

    public final N1 A00(final C3218gi c3218gi, AdPlacementType adPlacementType) {
        if (A00 != null) {
            return A00;
        }
        switch (N5.A00[adPlacementType.ordinal()]) {
            case 1:
                return new AnonymousClass81();
            case 2:
                if (C2668Up.A1O(c3218gi)) {
                    return new AnonymousClass80();
                }
                return new AnonymousClass81();
            case 3:
                return new C3405jz();
            case 4:
                return new C3400ju(c3218gi);
            case 5:
                return new C3400ju(c3218gi) { // from class: com.facebook.ads.redexgen.X.7z
                    @Override // com.facebook.ads.redexgen.core.C3400ju, com.facebook.ads.redexgen.core.N1
                    public final AdPlacementType A8k() {
                        return AdPlacementType.NATIVE_BANNER;
                    }
                };
            case 6:
                return new C21047w();
            default:
                return null;
        }
    }
}
