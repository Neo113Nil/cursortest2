package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes12.dex */
public final class Xj implements InterfaceC5486lb {
    public final /* synthetic */ Map a;

    public Xj(Map map) {
        this.a = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5486lb
    public final void a(InterfaceC5512mb interfaceC5512mb) {
        interfaceC5512mb.reportAnr(this.a);
    }
}
