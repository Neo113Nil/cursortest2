package o;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class KL implements Runnable {
    public final A9 h;
    public volatile AtomicInteger i = new AtomicInteger(0);
    public final /* synthetic */ NL j;

    public KL(NL nl, A9 a9) {
        this.j = nl;
        this.h = a9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1334k c1334k;
        String concat = "OkHttp ".concat(this.j.i.a.g());
        NL nl = this.j;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            nl.k.h();
            boolean z = false;
            try {
                try {
                } catch (Throwable th) {
                    nl.h.h.r(this);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.h.onResponse(nl, nl.e());
                c1334k = nl.h.h;
            } catch (IOException e2) {
                e = e2;
                z = true;
                if (z) {
                    C0897dI c0897dI = C0897dI.a;
                    C0897dI c0897dI2 = C0897dI.a;
                    String str = "Callback failure for " + NL.a(nl);
                    c0897dI2.getClass();
                    C0897dI.i(str, 4, e);
                } else {
                    this.h.onFailure(nl, e);
                }
                c1334k = nl.h.h;
                c1334k.r(this);
            } catch (Throwable th3) {
                th = th3;
                z = true;
                nl.cancel();
                if (!z) {
                    IOException iOException = new IOException("canceled due to " + th);
                    AbstractC0946e20.e(iOException, th);
                    this.h.onFailure(nl, iOException);
                }
                throw th;
            }
            c1334k.r(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
