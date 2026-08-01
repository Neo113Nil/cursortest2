package B1;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f217a;

    /* renamed from: b, reason: collision with root package name */
    public final A1.c f218b;

    /* renamed from: c, reason: collision with root package name */
    public final A1.b f219c;
    public final ConcurrentLinkedQueue d;

    public n(A1.f fVar, TimeUnit timeUnit) {
        i1.f.e(fVar, "taskRunner");
        this.f217a = timeUnit.toNanos(5L);
        this.f218b = fVar.e();
        this.f219c = new A1.b(this, y1.b.f4653g + " ConnectionPool");
        this.d = new ConcurrentLinkedQueue();
    }

    public final boolean a(x1.a aVar, j jVar, ArrayList arrayList, boolean z2) {
        i1.f.e(jVar, "call");
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            m mVar = (m) it.next();
            i1.f.d(mVar, "connection");
            synchronized (mVar) {
                if (z2) {
                    if (!(mVar.f208g != null)) {
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
        byte[] bArr = y1.b.f4648a;
        ArrayList arrayList = mVar.f215p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + mVar.f204b.f4610a.h + " was leaked. Did you forget to close a response body?";
                F1.n nVar = F1.n.f424a;
                F1.n.f424a.j(((h) reference).f187a, str);
                arrayList.remove(i);
                mVar.f209j = true;
                if (arrayList.isEmpty()) {
                    mVar.f216q = j2 - this.f217a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
