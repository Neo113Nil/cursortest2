package com.five_corp.ad.internal.movie.exoplayer;

import android.os.SystemClock;
import com.five_corp.ad.internal.view.E;
import com.five_corp.ad.internal.view.x;

/* loaded from: classes9.dex */
public final class b extends k {
    public final l a;
    public final a b;
    public final int c;
    public boolean d;

    public b(l lVar, a aVar, int i, boolean z) {
        this.a = lVar;
        this.b = aVar;
        this.c = i;
        this.d = z;
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final k a() {
        n a = this.a.a();
        a.a.seekTo(0);
        E e = a.c;
        e.d.post(new x(e));
        a.a();
        if (a.e != null) {
            m mVar = new m(a.e.longValue() + SystemClock.uptimeMillis());
            a.f = mVar;
            a.b(mVar);
        }
        a.a.setVolume(this.d ? 1.0f : 0.0f);
        a.a.prepare();
        return new h(this.a, a, this.b);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final int b() {
        return this.c;
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final k e() {
        return this;
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final k f() {
        return this;
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final k g() {
        return this;
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final k h() {
        return this;
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final c a(com.five_corp.ad.internal.l lVar) {
        lVar.a();
        this.b.b(this.c, lVar);
        this.b.k();
        return new c(this.c);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.k
    public final void a(boolean z) {
        this.d = z;
    }
}
