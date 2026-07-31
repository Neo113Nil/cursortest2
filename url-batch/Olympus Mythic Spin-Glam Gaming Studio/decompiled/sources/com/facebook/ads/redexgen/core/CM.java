package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CM implements InterfaceC3212gc {
    public final EnumC3204gU A00;
    public final AbstractC19592d A01;

    public CM(AbstractC19592d abstractC19592d, EnumC3204gU enumC3204gU) {
        this.A01 = abstractC19592d;
        this.A00 = enumC3204gU;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3212gc
    public void A4D(Map<InterfaceC3194gK, EnumC3217gh> map, Map<SyncModifiableBundle, EnumC3204gU> map2) {
        map2.put(null, this.A00);
    }
}
