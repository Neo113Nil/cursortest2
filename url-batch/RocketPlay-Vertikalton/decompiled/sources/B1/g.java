package B1;

import U.v;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final B.j f184a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f185b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f186c;

    public g(j jVar, B.j jVar2) {
        this.f186c = jVar;
        this.f184a = jVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v vVar;
        String concat = "OkHttp ".concat(((x1.l) this.f186c.f190b.f547c).f());
        j jVar = this.f186c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            jVar.d.h();
            boolean z2 = false;
            try {
                try {
                } catch (Throwable th) {
                    jVar.f189a.f4562a.f(this);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f184a.G(jVar, jVar.f());
                vVar = jVar.f189a.f4562a;
            } catch (IOException e3) {
                e = e3;
                z2 = true;
                if (z2) {
                    F1.n nVar = F1.n.f424a;
                    F1.n nVar2 = F1.n.f424a;
                    String str = "Callback failure for " + j.a(jVar);
                    nVar2.getClass();
                    F1.n.i(str, 4, e);
                } else {
                    this.f184a.E(jVar, e);
                }
                vVar = jVar.f189a.f4562a;
                vVar.f(this);
            } catch (Throwable th3) {
                th = th3;
                z2 = true;
                jVar.d();
                if (!z2) {
                    IOException iOException = new IOException("canceled due to " + th);
                    F1.d.k(iOException, th);
                    this.f184a.E(jVar, iOException);
                }
                throw th;
            }
            vVar.f(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
