package androidx.lifecycle;

import c0.C0087a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public final C0087a f1503a = new C0087a();

    public final void a() {
        C0087a c0087a = this.f1503a;
        if (c0087a != null && !c0087a.d) {
            c0087a.d = true;
            synchronized (c0087a.f1732a) {
                try {
                    Iterator it = c0087a.f1733b.values().iterator();
                    while (it.hasNext()) {
                        C0087a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0087a.f1734c.iterator();
                    while (it2.hasNext()) {
                        C0087a.a((AutoCloseable) it2.next());
                    }
                    c0087a.f1734c.clear();
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
