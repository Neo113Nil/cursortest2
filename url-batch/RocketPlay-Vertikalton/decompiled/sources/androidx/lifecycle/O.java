package androidx.lifecycle;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public final c0.a f1882a = new c0.a();

    public final void a() {
        c0.a aVar = this.f1882a;
        if (aVar != null && !aVar.d) {
            aVar.d = true;
            synchronized (aVar.f2112a) {
                try {
                    Iterator it = aVar.f2113b.values().iterator();
                    while (it.hasNext()) {
                        c0.a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = aVar.f2114c.iterator();
                    while (it2.hasNext()) {
                        c0.a.a((AutoCloseable) it2.next());
                    }
                    aVar.f2114c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
