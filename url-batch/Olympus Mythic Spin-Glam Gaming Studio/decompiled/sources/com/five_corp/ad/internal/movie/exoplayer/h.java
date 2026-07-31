package com.five_corp.ad.internal.movie.exoplayer;

import com.five_corp.ad.internal.view.E;
import com.five_corp.ad.internal.view.y;

/* loaded from: classes9.dex */
public final class h extends f {
    public h(l lVar, n nVar, a aVar) {
        super(lVar, nVar, aVar);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.f, com.five_corp.ad.internal.movie.exoplayer.k
    public final k a() {
        return this;
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final k a(long j) {
        n nVar = this.b;
        nVar.a();
        E e = nVar.c;
        e.d.post(new y(e));
        this.c.d(j);
        return new e(this.a, this.b, this.c);
    }
}
