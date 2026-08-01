package m1;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f3253a;

    /* renamed from: b, reason: collision with root package name */
    public final l1.c f3254b;

    /* renamed from: c, reason: collision with root package name */
    public final l1.b f3255c;
    public final ConcurrentLinkedQueue d;

    public n(l1.d dVar, TimeUnit timeUnit) {
        X0.e.e(dVar, "taskRunner");
        this.f3253a = timeUnit.toNanos(5L);
        this.f3254b = dVar.e();
        this.f3255c = new l1.b(this, j1.b.f2604f + " ConnectionPool");
        this.d = new ConcurrentLinkedQueue();
    }

    public final boolean a(i1.a aVar, j jVar, ArrayList arrayList, boolean z2) {
        X0.e.e(jVar, "call");
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            m mVar = (m) it.next();
            X0.e.d(mVar, "connection");
            synchronized (mVar) {
                if (z2) {
                    if (!(mVar.f3244g != null)) {
                        continue;
                    }
                }
                if (mVar.h(aVar, arrayList)) {
                    jVar.b(mVar);
                    return true;
                }
            }
        }
    }

    public final int b(m mVar, long j2) {
        byte[] bArr = j1.b.f2600a;
        ArrayList arrayList = mVar.f3251p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + mVar.f3240b.f2532a.h + " was leaked. Did you forget to close a response body?";
                q1.n nVar = q1.n.f3568a;
                q1.n.f3568a.j(((h) reference).f3223a, str);
                arrayList.remove(i);
                mVar.f3245j = true;
                if (arrayList.isEmpty()) {
                    mVar.f3252q = j2 - this.f3253a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
