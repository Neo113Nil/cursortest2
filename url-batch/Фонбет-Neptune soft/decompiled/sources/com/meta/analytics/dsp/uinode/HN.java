package com.meta.analytics.dsp.uinode;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class HN implements S1 {
    public final C0467Hw A00;
    public final S6 A01;

    public HN(C0467Hw c0467Hw, S6 s6) {
        this.A00 = c0467Hw;
        this.A01 = s6;
    }

    @Override // com.meta.analytics.dsp.uinode.S1
    public void A3Z(Map<InterfaceC0707Rj, S6> map, Map<SyncModifiableBundle, EnumC0717Rt> map2) {
        map.put(this.A00, this.A01);
    }
}
