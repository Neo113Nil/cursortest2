package o;

import java.io.IOException;

/* loaded from: classes.dex */
public final class Lr extends LU {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Lr(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // o.LU
    public final long a() {
        long a;
        int i;
        C0643Yr[] c0643YrArr;
        C0643Yr[] c0643YrArr2;
        switch (this.e) {
            case 0:
                C0461Rr c0461Rr = (C0461Rr) this.f;
                c0461Rr.h.a(c0461Rr, (XQ) ((C1360kM) this.g).h);
                return -1L;
            case 1:
                try {
                    ((C0461Rr) this.f).h.b((C0643Yr) this.g);
                } catch (IOException e) {
                    C0897dI c0897dI = C0897dI.a;
                    C0897dI c0897dI2 = C0897dI.a;
                    String str = "Http2Connection.Listener failure for " + ((C0461Rr) this.f).j;
                    c0897dI2.getClass();
                    C0897dI.i(str, 4, e);
                    try {
                        ((C0643Yr) this.g).c(2, e);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                C1401l0 c1401l0 = (C1401l0) this.f;
                XQ xq = (XQ) this.g;
                C1360kM c1360kM = new C1360kM();
                C0461Rr c0461Rr2 = (C0461Rr) c1401l0.j;
                synchronized (c0461Rr2.D) {
                    synchronized (c0461Rr2) {
                        try {
                            XQ xq2 = c0461Rr2.x;
                            XQ xq3 = new XQ();
                            xq3.b(xq2);
                            xq3.b(xq);
                            c1360kM.h = xq3;
                            a = xq3.a() - xq2.a();
                            i = 0;
                            if (a != 0 && !c0461Rr2.i.isEmpty()) {
                                c0643YrArr = (C0643Yr[]) c0461Rr2.i.values().toArray(new C0643Yr[0]);
                                c0643YrArr2 = c0643YrArr;
                                XQ xq4 = (XQ) c1360kM.h;
                                AbstractC0048Bt.n(xq4, "<set-?>");
                                c0461Rr2.x = xq4;
                                c0461Rr2.q.c(new Lr(c0461Rr2.j + " onSettings", c0461Rr2, c1360kM, i), 0L);
                            }
                            c0643YrArr = null;
                            c0643YrArr2 = c0643YrArr;
                            XQ xq42 = (XQ) c1360kM.h;
                            AbstractC0048Bt.n(xq42, "<set-?>");
                            c0461Rr2.x = xq42;
                            c0461Rr2.q.c(new Lr(c0461Rr2.j + " onSettings", c0461Rr2, c1360kM, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        c0461Rr2.D.b((XQ) c1360kM.h);
                    } catch (IOException e2) {
                        c0461Rr2.b(2, 2, e2);
                    }
                }
                if (c0643YrArr2 != null) {
                    int length = c0643YrArr2.length;
                    while (i < length) {
                        C0643Yr c0643Yr = c0643YrArr2[i];
                        synchronized (c0643Yr) {
                            c0643Yr.f += a;
                            if (a > 0) {
                                c0643Yr.notifyAll();
                            }
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }
}
