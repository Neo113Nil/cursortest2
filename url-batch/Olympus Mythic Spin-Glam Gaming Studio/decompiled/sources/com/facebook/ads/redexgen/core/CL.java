package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CL implements InterfaceC3212gc {
    public final C2196Cb A00;
    public final EnumC3217gh A01;

    public CL(C2196Cb c2196Cb, EnumC3217gh enumC3217gh) {
        this.A00 = c2196Cb;
        this.A01 = enumC3217gh;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3212gc
    public void A4D(Map<InterfaceC3194gK, EnumC3217gh> map, Map<SyncModifiableBundle, EnumC3204gU> map2) {
        map.put(this.A00, this.A01);
    }
}
