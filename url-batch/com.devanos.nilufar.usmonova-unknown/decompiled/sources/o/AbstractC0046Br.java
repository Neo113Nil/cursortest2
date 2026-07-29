package o;

import java.io.IOException;

/* renamed from: o.Br, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0046Br implements HS {
    public final C2179wo h;
    public boolean i;
    public final /* synthetic */ C0202Hr j;

    public AbstractC0046Br(C0202Hr c0202Hr) {
        this.j = c0202Hr;
        this.h = new C2179wo(((N8) c0202Hr.e).timeout());
    }

    public final void b() {
        C0202Hr c0202Hr = this.j;
        int i = c0202Hr.b;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + c0202Hr.b);
        }
        C2179wo c2179wo = this.h;
        NV nv = c2179wo.e;
        c2179wo.e = NV.d;
        nv.a();
        nv.b();
        c0202Hr.b = 6;
    }

    @Override // o.HS
    public long read(G8 g8, long j) {
        C0202Hr c0202Hr = this.j;
        AbstractC0048Bt.n(g8, "sink");
        try {
            return ((N8) c0202Hr.e).read(g8, j);
        } catch (IOException e) {
            ((PL) c0202Hr.d).k();
            b();
            throw e;
        }
    }

    @Override // o.HS
    public final NV timeout() {
        return this.h;
    }
}
