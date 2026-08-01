package A1;

import E1.AbstractC0001b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class f {
    public static final f h;
    public static final Logger i;

    /* renamed from: a, reason: collision with root package name */
    public final d f41a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f43c;
    public long d;

    /* renamed from: b, reason: collision with root package name */
    public int f42b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f44e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f45f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final e f46g = new e(0, this);

    static {
        String str = y1.b.f4653g + " TaskRunner";
        i1.f.e(str, "name");
        h = new f(new d(new y1.a(str, true)));
        Logger logger = Logger.getLogger(f.class.getName());
        i1.f.d(logger, "getLogger(TaskRunner::class.java.name)");
        i = logger;
    }

    public f(d dVar) {
        this.f41a = dVar;
    }

    public static final void a(f fVar, a aVar) {
        fVar.getClass();
        byte[] bArr = y1.b.f4648a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f26a);
        try {
            long a2 = aVar.a();
            synchronized (fVar) {
                fVar.b(aVar, a2);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (fVar) {
                fVar.b(aVar, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j2) {
        byte[] bArr = y1.b.f4648a;
        c cVar = aVar.f28c;
        i1.f.b(cVar);
        if (cVar.d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = cVar.f35f;
        cVar.f35f = false;
        cVar.d = null;
        this.f44e.remove(cVar);
        if (j2 != -1 && !z2 && !cVar.f33c) {
            cVar.d(aVar, j2, true);
        }
        if (cVar.f34e.isEmpty()) {
            return;
        }
        this.f45f.add(cVar);
    }

    public final a c() {
        boolean z2;
        f fVar = this;
        byte[] bArr = y1.b.f4648a;
        while (true) {
            ArrayList arrayList = fVar.f45f;
            if (arrayList.isEmpty()) {
                return null;
            }
            d dVar = fVar.f41a;
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j2 = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    fVar = this;
                    z2 = false;
                    break;
                }
                a aVar2 = (a) ((c) it.next()).f34e.get(0);
                long max = Math.max(0L, aVar2.d - nanoTime);
                if (max > 0) {
                    j2 = Math.min(max, j2);
                } else {
                    if (aVar != null) {
                        fVar = this;
                        z2 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            ArrayList arrayList2 = fVar.f44e;
            if (aVar != null) {
                byte[] bArr2 = y1.b.f4648a;
                aVar.d = -1L;
                c cVar = aVar.f28c;
                i1.f.b(cVar);
                cVar.f34e.remove(aVar);
                arrayList.remove(cVar);
                cVar.d = aVar;
                arrayList2.add(cVar);
                if (z2 || (!fVar.f43c && !arrayList.isEmpty())) {
                    e eVar = fVar.f46g;
                    i1.f.e(eVar, "runnable");
                    ((ThreadPoolExecutor) dVar.f38b).execute(eVar);
                }
                return aVar;
            }
            if (fVar.f43c) {
                if (j2 < fVar.d - nanoTime) {
                    notify();
                }
                return null;
            }
            fVar.f43c = true;
            fVar.d = nanoTime + j2;
            try {
                try {
                    long j3 = j2 / 1000000;
                    long j4 = j2 - (1000000 * j3);
                    if (j3 > 0 || j2 > 0) {
                        fVar.wait(j3, (int) j4);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((c) arrayList2.get(size)).b();
                    }
                    int i2 = -1;
                    for (int size2 = arrayList.size() - 1; i2 < size2; size2--) {
                        c cVar2 = (c) arrayList.get(size2);
                        cVar2.b();
                        if (cVar2.f34e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                        i2 = -1;
                    }
                }
            } finally {
                fVar.f43c = false;
            }
        }
    }

    public final void d(c cVar) {
        i1.f.e(cVar, "taskQueue");
        byte[] bArr = y1.b.f4648a;
        if (cVar.d == null) {
            boolean isEmpty = cVar.f34e.isEmpty();
            ArrayList arrayList = this.f45f;
            if (isEmpty) {
                arrayList.remove(cVar);
            } else {
                i1.f.e(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        boolean z2 = this.f43c;
        d dVar = this.f41a;
        if (z2) {
            notify();
            return;
        }
        e eVar = this.f46g;
        i1.f.e(eVar, "runnable");
        ((ThreadPoolExecutor) dVar.f38b).execute(eVar);
    }

    public final c e() {
        int i2;
        synchronized (this) {
            i2 = this.f42b;
            this.f42b = i2 + 1;
        }
        return new c(this, AbstractC0001b.f("Q", i2));
    }
}
