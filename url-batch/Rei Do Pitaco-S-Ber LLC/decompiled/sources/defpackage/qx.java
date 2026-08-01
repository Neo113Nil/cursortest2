package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class qx implements Runnable {
    public final o4 f;
    public volatile AtomicInteger g = new AtomicInteger(0);
    public final /* synthetic */ tx h;

    public qx(tx txVar, o4 o4Var) {
        this.h = txVar;
        this.f = o4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fv fvVar;
        String concat = "OkHttp ".concat(((xn) this.h.g.b).f());
        tx txVar = this.h;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            txVar.i.h();
            boolean z = false;
            try {
                try {
                } catch (Throwable th) {
                    txVar.f.f.j(this);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f.G(txVar, txVar.f());
                fvVar = txVar.f;
            } catch (IOException e2) {
                e = e2;
                z = true;
                if (z) {
                    jw jwVar = jw.a;
                    jw jwVar2 = jw.a;
                    String concat2 = "Callback failure for ".concat(tx.a(txVar));
                    jwVar2.getClass();
                    jw.i(concat2, 4, e);
                } else {
                    this.f.E(txVar, e);
                }
                fvVar = txVar.f;
                fvVar.f.j(this);
            } catch (Throwable th3) {
                th = th3;
                z = true;
                txVar.d();
                if (!z) {
                    IOException iOException = new IOException("canceled due to " + th);
                    vv.b(iOException, th);
                    this.f.E(txVar, iOException);
                }
                throw th;
            }
            fvVar.f.j(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
