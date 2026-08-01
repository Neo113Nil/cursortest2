package androidx.lifecycle;

import b0.C0076a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public final C0076a f1349a = new C0076a();

    public final void a() {
        C0076a c0076a = this.f1349a;
        if (c0076a != null && !c0076a.d) {
            c0076a.d = true;
            synchronized (c0076a.f1503a) {
                try {
                    Iterator it = c0076a.f1504b.values().iterator();
                    while (it.hasNext()) {
                        C0076a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0076a.f1505c.iterator();
                    while (it2.hasNext()) {
                        C0076a.a((AutoCloseable) it2.next());
                    }
                    c0076a.f1505c.clear();
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
