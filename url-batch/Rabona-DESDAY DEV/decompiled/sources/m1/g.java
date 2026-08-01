package m1;

import T.u;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final B.j f3226a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f3227b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f3228c;

    public g(j jVar, B.j jVar2) {
        this.f3228c = jVar;
        this.f3226a = jVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVar;
        String concat = "OkHttp ".concat(((i1.m) this.f3228c.f3232b.f213c).f());
        j jVar = this.f3228c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            jVar.d.h();
            boolean z2 = false;
            try {
                try {
                } catch (Throwable th) {
                    jVar.f3231a.f2481a.f(this);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f3226a.D(jVar, jVar.f());
                uVar = jVar.f3231a.f2481a;
            } catch (IOException e3) {
                e = e3;
                z2 = true;
                if (z2) {
                    q1.n nVar = q1.n.f3574a;
                    q1.n nVar2 = q1.n.f3574a;
                    String str = "Callback failure for " + j.a(jVar);
                    nVar2.getClass();
                    q1.n.i(str, 4, e);
                } else {
                    this.f3226a.B(jVar, e);
                }
                uVar = jVar.f3231a.f2481a;
                uVar.f(this);
            } catch (Throwable th3) {
                th = th3;
                z2 = true;
                jVar.d();
                if (!z2) {
                    IOException iOException = new IOException("canceled due to " + th);
                    q1.l.d(iOException, th);
                    this.f3226a.B(jVar, iOException);
                }
                throw th;
            }
            uVar.f(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
