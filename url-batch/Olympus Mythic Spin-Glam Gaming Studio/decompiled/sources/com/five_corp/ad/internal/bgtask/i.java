package com.five_corp.ad.internal.bgtask;

import com.five_corp.ad.internal.t;
import com.ironsource.C4701ic;

/* loaded from: classes5.dex */
public final class i extends n {
    public final com.five_corp.ad.internal.beacon.a c;
    public final t d;
    public final com.five_corp.ad.internal.http.d e;

    public i(com.five_corp.ad.internal.beacon.a aVar, t tVar, com.five_corp.ad.internal.http.d dVar) {
        super(1);
        this.c = aVar;
        this.d = tVar;
        this.e = dVar;
    }

    @Override // com.five_corp.ad.internal.bgtask.n
    public final boolean c() {
        com.five_corp.ad.internal.util.b a = this.e.a(this.d.a(this.c), C4701ic.a, null, null, null);
        return a.a && ((com.five_corp.ad.internal.http.c) a.c).a == 200;
    }
}
