package o;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: o.Pr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409Pr extends LU {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0409Pr(int i, Object obj, String str) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    @Override // o.LU
    public final long a() {
        switch (this.e) {
            case 0:
                C0461Rr c0461Rr = (C0461Rr) this.f;
                c0461Rr.getClass();
                try {
                    c0461Rr.D.q(2, 0, false);
                    return -1L;
                } catch (IOException e) {
                    c0461Rr.b(2, 2, e);
                    return -1L;
                }
            case 1:
                QL ql = (QL) this.f;
                long nanoTime = System.nanoTime();
                Iterator it = ((ConcurrentLinkedQueue) ql.d).iterator();
                int i = 0;
                long j = Long.MIN_VALUE;
                PL pl = null;
                int i2 = 0;
                while (it.hasNext()) {
                    PL pl2 = (PL) it.next();
                    AbstractC0048Bt.m(pl2, "connection");
                    synchronized (pl2) {
                        if (ql.c(pl2, nanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = nanoTime - pl2.q;
                            if (j2 > j) {
                                pl = pl2;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = ql.a;
                if (j < j3 && i <= 5) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                AbstractC0048Bt.k(pl);
                synchronized (pl) {
                    if (!pl.p.isEmpty()) {
                        return 0L;
                    }
                    if (pl.q + j != nanoTime) {
                        return 0L;
                    }
                    pl.j = true;
                    ((ConcurrentLinkedQueue) ql.d).remove(pl);
                    Socket socket = pl.d;
                    AbstractC0048Bt.k(socket);
                    HY.d(socket);
                    if (!((ConcurrentLinkedQueue) ql.d).isEmpty()) {
                        return 0L;
                    }
                    ((QU) ql.b).a();
                    return 0L;
                }
            default:
                ((InterfaceC1455lp) this.f).invoke();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0409Pr(QL ql, String str) {
        super(str, true);
        this.e = 1;
        this.f = ql;
    }
}
