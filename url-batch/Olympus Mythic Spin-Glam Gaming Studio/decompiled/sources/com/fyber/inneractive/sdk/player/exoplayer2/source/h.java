package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* loaded from: classes6.dex */
public final class h implements w {
    public final w[] a;

    public h(w[] wVarArr) {
        this.a = wVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final boolean b(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long f = f();
            if (f == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (w wVar : this.a) {
                if (wVar.f() == f) {
                    z |= wVar.b(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        long j = Long.MAX_VALUE;
        for (w wVar : this.a) {
            long f = wVar.f();
            if (f != Long.MIN_VALUE) {
                j = Math.min(j, f);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }
}
