package com.five_corp.ad.internal.movie.exoplayer;

import android.os.SystemClock;
import com.five_corp.ad.internal.view.A;
import com.five_corp.ad.internal.view.B;
import com.five_corp.ad.internal.view.C;
import com.five_corp.ad.internal.view.E;
import com.safedk.android.internal.partials.LINEVideoBridge;

/* loaded from: classes9.dex */
public final class g extends f {
    public g(l lVar, n nVar, a aVar) {
        super(lVar, nVar, aVar);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final k c() {
        n nVar = this.b;
        E e = nVar.c;
        e.d.post(new C(e));
        nVar.a();
        if (nVar.e != null) {
            m mVar = new m(nVar.e.longValue() + SystemClock.uptimeMillis());
            nVar.f = mVar;
            nVar.b(mVar);
        }
        this.c.j(b());
        return new j(this.a, this.b, this.c);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final k d() {
        int currentPosition = (int) this.b.a.getCurrentPosition();
        boolean z = this.b.a.getVolume() > 0.0f;
        E e = this.b.c;
        e.d.post(new B(e));
        this.c.f(currentPosition);
        n nVar = this.b;
        nVar.a();
        LINEVideoBridge.exoPlayer3Release(nVar.a);
        this.c.k();
        return new b(this.a, this.c, currentPosition, z);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final k e() {
        n nVar = this.b;
        nVar.a();
        LINEVideoBridge.exoPlayer3Pause(nVar.a);
        E e = nVar.c;
        e.d.post(new A(e));
        this.c.g(b());
        return new e(this.a, this.b, this.c);
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
