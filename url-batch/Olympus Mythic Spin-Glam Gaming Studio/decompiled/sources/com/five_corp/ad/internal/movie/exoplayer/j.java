package com.five_corp.ad.internal.movie.exoplayer;

import com.five_corp.ad.internal.view.A;
import com.five_corp.ad.internal.view.E;
import com.five_corp.ad.internal.view.z;
import com.safedk.android.internal.partials.LINEVideoBridge;

/* loaded from: classes9.dex */
public final class j extends f {
    public j(l lVar, n nVar, a aVar) {
        super(lVar, nVar, aVar);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final k a(long j) {
        n nVar = this.b;
        nVar.a();
        LINEVideoBridge.exoPlayer3Play(nVar.a);
        E e = nVar.c;
        e.d.post(new z(e));
        this.c.h(b());
        return new g(this.a, this.b, this.c);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final k e() {
        n nVar = this.b;
        nVar.a();
        LINEVideoBridge.exoPlayer3Pause(nVar.a);
        E e = nVar.c;
        e.d.post(new A(e));
        this.c.g(b());
        return new i(this.a, this.b, this.c);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.f, com.five_corp.ad.internal.movie.exoplayer.k
    public final k g() {
        this.c.g(b());
        return super.g();
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final k h() {
        return this;
    }
}
