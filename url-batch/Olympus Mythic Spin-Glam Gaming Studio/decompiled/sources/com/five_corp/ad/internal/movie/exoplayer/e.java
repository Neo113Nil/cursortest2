package com.five_corp.ad.internal.movie.exoplayer;

import com.five_corp.ad.internal.view.E;
import com.five_corp.ad.internal.view.z;
import com.safedk.android.internal.partials.LINEVideoBridge;

/* loaded from: classes9.dex */
public final class e extends f {
    public e(l lVar, n nVar, a aVar) {
        super(lVar, nVar, aVar);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final k e() {
        return this;
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final k h() {
        n nVar = this.b;
        nVar.a();
        LINEVideoBridge.exoPlayer3Play(nVar.a);
        E e = nVar.c;
        e.d.post(new z(e));
        this.c.i(b());
        return new g(this.a, this.b, this.c);
    }
}
