package o;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class QL {
    public static QL e;
    public static A00 f;
    public long a;
    public final Object b;
    public Object c;
    public final Object d;

    public QL(RU ru) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        AbstractC0048Bt.n(ru, "taskRunner");
        AbstractC0048Bt.n(timeUnit, "timeUnit");
        this.a = timeUnit.toNanos(5L);
        this.b = ru.e();
        this.c = new C0409Pr(this, AbstractC1888sN.l(new StringBuilder(), HY.g, " ConnectionPool"));
        this.d = new ConcurrentLinkedQueue();
    }

    public static QL b(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (e == null) {
            e = new QL(flutterJNI);
        }
        if (f == null) {
            QL ql = e;
            Objects.requireNonNull(ql);
            A00 a00 = new A00(ql, displayManager);
            f = a00;
            displayManager.registerDisplayListener(a00, null);
        }
        if (e.a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            e.a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return e;
    }

    public boolean a(C0683a2 c0683a2, NL nl, ArrayList arrayList, boolean z) {
        Iterator it = ((ConcurrentLinkedQueue) this.d).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            PL pl = (PL) it.next();
            AbstractC0048Bt.m(pl, "connection");
            synchronized (pl) {
                if (z) {
                    try {
                        if (!(pl.g != null)) {
                            continue;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (pl.h(c0683a2, arrayList)) {
                    nl.b(pl);
                    return true;
                }
            }
        }
    }

    public int c(PL pl, long j) {
        byte[] bArr = HY.a;
        ArrayList arrayList = pl.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + pl.b.a.h + " was leaked. Did you forget to close a response body?";
                C0897dI c0897dI = C0897dI.a;
                C0897dI.a.k(((LL) reference).a, str);
                arrayList.remove(i);
                pl.j = true;
                if (arrayList.isEmpty()) {
                    pl.q = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public QL(FlutterJNI flutterJNI) {
        this.a = -1L;
        this.c = new B00(this, 0L);
        this.d = new C1818rJ(24, this);
        this.b = flutterJNI;
    }
}
