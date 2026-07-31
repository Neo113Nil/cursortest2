package com.five_corp.ad.internal.movie.exoplayer;

import android.os.SystemClock;
import com.five_corp.ad.internal.view.E;
import com.five_corp.ad.internal.view.x;
import com.safedk.android.internal.partials.LINEVideoBridge;

/* loaded from: classes9.dex */
public abstract class f extends k {
    public final l a;
    public final n b;
    public final a c;

    public f(l lVar, n nVar, a aVar) {
        this.a = lVar;
        this.b = nVar;
        this.c = aVar;
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public k a() {
        n nVar = this.b;
        nVar.a.seekTo(0);
        E e = nVar.c;
        e.d.post(new x(e));
        nVar.a();
        if (nVar.e != null) {
            m mVar = new m(nVar.e.longValue() + SystemClock.uptimeMillis());
            nVar.f = mVar;
            nVar.b(mVar);
        }
        return new h(this.a, this.b, this.c);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final int b() {
        return (int) this.b.a.getCurrentPosition();
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final k f() {
        return this;
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public k g() {
        int currentPosition = (int) this.b.a.getCurrentPosition();
        boolean z = this.b.a.getVolume() > 0.0f;
        n nVar = this.b;
        nVar.a();
        LINEVideoBridge.exoPlayer3Release(nVar.a);
        this.c.k();
        return new d(this.a, this.c, currentPosition, z);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final c a(com.five_corp.ad.internal.l lVar) {
        lVar.a();
        int b = b();
        n nVar = this.b;
        nVar.a();
        LINEVideoBridge.exoPlayer3Release(nVar.a);
        this.c.b(b, lVar);
        this.c.k();
        return new c(b);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final void a(boolean z) {
        this.b.a.setVolume(z ? 1.0f : 0.0f);
    }
}
