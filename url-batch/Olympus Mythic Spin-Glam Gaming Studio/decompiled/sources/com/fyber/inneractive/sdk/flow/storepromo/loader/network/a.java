package com.fyber.inneractive.sdk.flow.storepromo.loader.network;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.c1;
import com.fyber.inneractive.sdk.network.l;
import com.fyber.inneractive.sdk.network.o0;
import com.fyber.inneractive.sdk.network.t0;
import java.util.Map;

/* loaded from: classes6.dex */
public final class a extends c1 {
    public int q;

    public a(String str, com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks.b bVar) {
        super(bVar, str, null);
    }

    @Override // com.fyber.inneractive.sdk.network.c1, com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i) {
        int a;
        int a2 = IAConfigManager.N.t.b.a("sp_max_size", 307200, 0);
        this.q = a2;
        int i2 = a2 + 10;
        if (lVar != null && (a = t0.a(lVar.d)) >= 0) {
            i2 = a;
        }
        long j = i2;
        int i3 = this.q;
        if (j <= i3) {
            return super.a(lVar, map, i);
        }
        throw new com.fyber.inneractive.sdk.flow.storepromo.loader.network.exception.a("The image exceeds the maximal size: " + i3 + ", actual size: " + i2);
    }
}
