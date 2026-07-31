package yads;

import java.io.IOException;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public final class g23 implements zf1 {
    public final com.monetization.ads.exo.source.dash.a b;

    public g23(com.monetization.ads.exo.source.dash.a aVar) {
        this.b = aVar;
    }

    @Override // yads.zf1
    public final void a(cg1 cg1Var, long j, long j2) {
        boolean z;
        synchronized (i23.b) {
            z = i23.c;
        }
        if (z) {
            this.b.a();
            return;
        }
        com.monetization.ads.exo.source.dash.a aVar = this.b;
        aVar.a.a(new IOException(new ConcurrentModificationException()));
    }

    @Override // yads.zf1
    public final void a(cg1 cg1Var, long j, long j2, boolean z) {
    }

    @Override // yads.zf1
    public final ag1 a(cg1 cg1Var, long j, long j2, IOException iOException, int i) {
        this.b.a.a(iOException);
        return gg1.d;
    }
}
