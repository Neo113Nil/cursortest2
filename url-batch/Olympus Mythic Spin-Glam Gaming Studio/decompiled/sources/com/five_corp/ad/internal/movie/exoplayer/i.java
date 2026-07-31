package com.five_corp.ad.internal.movie.exoplayer;

import android.os.SystemClock;
import com.five_corp.ad.internal.view.D;
import com.five_corp.ad.internal.view.E;
import com.safedk.android.internal.partials.LINEVideoBridge;

/* loaded from: classes9.dex */
public final class i extends f {
    public i(l lVar, n nVar, a aVar) {
        super(lVar, nVar, aVar);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final k a(long j) {
        E e = this.b.c;
        e.d.post(new D(e));
        this.c.h(b());
        return new e(this.a, this.b, this.c);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final k e() {
        return this;
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final k h() {
        n nVar = this.b;
        LINEVideoBridge.exoPlayer3Play(nVar.a);
        nVar.a();
        if (nVar.e != null) {
            m mVar = new m(nVar.e.longValue() + SystemClock.uptimeMillis());
            nVar.f = mVar;
            nVar.b(mVar);
        }
        this.c.i(b());
        return new j(this.a, this.b, this.c);
    }
}
