package p1;

import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class v extends v1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f3490m;

    public v(w wVar) {
        this.f3490m = wVar;
    }

    @Override // v1.e
    public final void j() {
        this.f3490m.e(9);
        o oVar = this.f3490m.f3492b;
        synchronized (oVar) {
            long j2 = oVar.f3456n;
            long j3 = oVar.f3455m;
            if (j2 < j3) {
                return;
            }
            oVar.f3455m = j3 + 1;
            oVar.f3457o = System.nanoTime() + 1000000000;
            oVar.h.c(new l1.b(oVar.f3448c + " ping", oVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
