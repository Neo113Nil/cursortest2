package E1;

import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class x extends K1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f382m;

    public x(y yVar) {
        this.f382m = yVar;
    }

    @Override // K1.e
    public final void j() {
        this.f382m.e(9);
        q qVar = this.f382m.f384b;
        synchronized (qVar) {
            long j2 = qVar.f348n;
            long j3 = qVar.f347m;
            if (j2 < j3) {
                return;
            }
            qVar.f347m = j3 + 1;
            qVar.f349o = System.nanoTime() + 1000000000;
            qVar.h.c(new A1.b(qVar.f340c + " ping", qVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
