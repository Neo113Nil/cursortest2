package o;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class UZ {
    public final VZ a = new VZ();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        VZ vz = this.a;
        if (vz != null) {
            if (vz.d) {
                VZ.a(autoCloseable);
                return;
            }
            synchronized (vz.a) {
                autoCloseable2 = (AutoCloseable) vz.b.put(str, autoCloseable);
            }
            VZ.a(autoCloseable2);
        }
    }

    public final void b() {
        VZ vz = this.a;
        if (vz != null && !vz.d) {
            vz.d = true;
            synchronized (vz.a) {
                try {
                    Iterator it = vz.b.values().iterator();
                    while (it.hasNext()) {
                        VZ.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = vz.c.iterator();
                    while (it2.hasNext()) {
                        VZ.a((AutoCloseable) it2.next());
                    }
                    vz.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        VZ vz = this.a;
        if (vz == null) {
            return null;
        }
        synchronized (vz.a) {
            autoCloseable = (AutoCloseable) vz.b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
