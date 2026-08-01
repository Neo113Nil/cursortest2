package androidx.lifecycle;

import b0.C0075a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public final C0075a f1348a = new C0075a();

    public final void a() {
        C0075a c0075a = this.f1348a;
        if (c0075a != null && !c0075a.d) {
            c0075a.d = true;
            synchronized (c0075a.f1502a) {
                try {
                    Iterator it = c0075a.f1503b.values().iterator();
                    while (it.hasNext()) {
                        C0075a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0075a.f1504c.iterator();
                    while (it2.hasNext()) {
                        C0075a.a((AutoCloseable) it2.next());
                    }
                    c0075a.f1504c.clear();
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
