package p1;

import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class v extends v1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f3485m;

    public v(w wVar) {
        this.f3485m = wVar;
    }

    @Override // v1.e
    public final void j() {
        this.f3485m.e(9);
        o oVar = this.f3485m.f3487b;
        synchronized (oVar) {
            long j2 = oVar.f3451n;
            long j3 = oVar.f3450m;
            if (j2 < j3) {
                return;
            }
            oVar.f3450m = j3 + 1;
            oVar.f3452o = System.nanoTime() + 1000000000;
            oVar.h.c(new l1.b(oVar.f3443c + " ping", oVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
