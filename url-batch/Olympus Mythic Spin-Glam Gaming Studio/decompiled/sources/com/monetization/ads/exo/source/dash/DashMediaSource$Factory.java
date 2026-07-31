package com.monetization.ads.exo.source.dash;

import java.util.List;
import yads.ad0;
import yads.ao;
import yads.bu0;
import yads.ee0;
import yads.g30;
import yads.ld0;
import yads.om1;
import yads.p30;
import yads.wl1;
import yads.xc0;

/* loaded from: classes6.dex */
public final class DashMediaSource$Factory implements om1 {
    private final ad0 a;
    private final p30 b;
    private ld0 c = new ld0();
    private final ee0 e = new ee0();
    private final long f = 30000;
    private final xc0 d = new xc0();

    public DashMediaSource$Factory(p30 p30Var) {
        this.a = new ad0(p30Var);
        this.b = p30Var;
    }

    @Override // yads.om1
    public final om1 a(ld0 ld0Var) {
        if (ld0Var == null) {
            throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        this.c = ld0Var;
        return this;
    }

    @Override // yads.om1
    public final ao a(wl1 wl1Var) {
        wl1Var.c.getClass();
        g30 g30Var = new g30();
        List list = wl1Var.c.b;
        return new i(wl1Var, this.b, !list.isEmpty() ? new bu0(g30Var, list) : g30Var, this.a, this.d, this.c.a(wl1Var), this.e, this.f);
    }
}
