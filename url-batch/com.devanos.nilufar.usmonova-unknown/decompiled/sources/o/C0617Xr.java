package o;

import java.net.SocketTimeoutException;

/* renamed from: o.Xr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0617Xr extends X6 {
    public final /* synthetic */ C0643Yr m;

    public C0617Xr(C0643Yr c0643Yr) {
        this.m = c0643Yr;
    }

    @Override // o.X6
    public final void j() {
        this.m.e(9);
        C0461Rr c0461Rr = this.m.b;
        synchronized (c0461Rr) {
            long j = c0461Rr.u;
            long j2 = c0461Rr.t;
            if (j < j2) {
                return;
            }
            c0461Rr.t = j2 + 1;
            c0461Rr.v = System.nanoTime() + 1000000000;
            c0461Rr.f101o.c(new C0409Pr(0, c0461Rr, AbstractC1888sN.l(new StringBuilder(), c0461Rr.j, " ping")), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
