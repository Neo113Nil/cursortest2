package p1;

import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class v extends v1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f3469m;

    public v(w wVar) {
        this.f3469m = wVar;
    }

    @Override // v1.e
    public final void j() {
        this.f3469m.e(9);
        o oVar = this.f3469m.f3471b;
        synchronized (oVar) {
            long j2 = oVar.f3435n;
            long j3 = oVar.f3434m;
            if (j2 < j3) {
                return;
            }
            oVar.f3434m = j3 + 1;
            oVar.f3436o = System.nanoTime() + 1000000000;
            oVar.h.c(new l1.b(oVar.f3427c + " ping", oVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
