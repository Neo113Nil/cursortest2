package m1;

import T.u;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final B.j f3229a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f3230b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f3231c;

    public g(j jVar, B.j jVar2) {
        this.f3231c = jVar;
        this.f3229a = jVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVar;
        String concat = "OkHttp ".concat(((i1.n) this.f3231c.f3235b.f206c).f());
        j jVar = this.f3231c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            jVar.d.h();
            boolean z2 = false;
            try {
                try {
                } catch (Throwable th) {
                    jVar.f3234a.f2488a.f(this);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f3229a.D(jVar, jVar.f());
                uVar = jVar.f3234a.f2488a;
            } catch (IOException e3) {
                e = e3;
                z2 = true;
                if (z2) {
                    q1.n nVar = q1.n.f3579a;
                    q1.n nVar2 = q1.n.f3579a;
                    String str = "Callback failure for " + j.a(jVar);
                    nVar2.getClass();
                    q1.n.i(str, 4, e);
                } else {
                    this.f3229a.B(jVar, e);
                }
                uVar = jVar.f3234a.f2488a;
                uVar.f(this);
            } catch (Throwable th3) {
                th = th3;
                z2 = true;
                jVar.d();
                if (!z2) {
                    IOException iOException = new IOException("canceled due to " + th);
                    q1.d.a(iOException, th);
                    this.f3229a.B(jVar, iOException);
                }
                throw th;
            }
            uVar.f(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
