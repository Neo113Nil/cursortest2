package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class RU {
    public static final CU h = new CU();
    public static final RU i;
    public static final Logger j;
    public final C1818rJ a;
    public boolean c;
    public long d;
    public int b = 10000;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final R2 g = new R2(7, this);

    static {
        String str = HY.g + " TaskRunner";
        AbstractC0048Bt.n(str, "name");
        i = new RU(new C1818rJ(new GY(str, true)));
        Logger logger = Logger.getLogger(RU.class.getName());
        AbstractC0048Bt.m(logger, "getLogger(TaskRunner::class.java.name)");
        j = logger;
    }

    public RU(C1818rJ c1818rJ) {
        this.a = c1818rJ;
    }

    public static final void a(RU ru, LU lu) {
        byte[] bArr = HY.a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(lu.a);
        try {
            long a = lu.a();
            synchronized (ru) {
                ru.b(lu, a);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (ru) {
                ru.b(lu, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(LU lu, long j2) {
        byte[] bArr = HY.a;
        QU qu = lu.c;
        AbstractC0048Bt.k(qu);
        if (qu.d != lu) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z = qu.f;
        qu.f = false;
        qu.d = null;
        this.e.remove(qu);
        if (j2 != -1 && !z && !qu.c) {
            qu.d(lu, j2, true);
        }
        if (qu.e.isEmpty()) {
            return;
        }
        this.f.add(qu);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0093, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LU c() {
        boolean z;
        byte[] bArr = HY.a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                break;
            }
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j2 = Long.MAX_VALUE;
            LU lu = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                LU lu2 = (LU) ((QU) it.next()).e.get(0);
                long max = Math.max(0L, lu2.d - nanoTime);
                if (max > 0) {
                    j2 = Math.min(max, j2);
                } else {
                    if (lu != null) {
                        z = true;
                        break;
                    }
                    lu = lu2;
                }
            }
            ArrayList arrayList2 = this.e;
            if (lu != null) {
                byte[] bArr2 = HY.a;
                lu.d = -1L;
                QU qu = lu.c;
                AbstractC0048Bt.k(qu);
                qu.e.remove(lu);
                arrayList.remove(qu);
                qu.d = lu;
                arrayList2.add(qu);
                if (z || (!this.c && !arrayList.isEmpty())) {
                    R2 r2 = this.g;
                    AbstractC0048Bt.n(r2, "runnable");
                    ((ThreadPoolExecutor) this.a.i).execute(r2);
                }
                return lu;
            }
            if (!this.c) {
                this.c = true;
                this.d = nanoTime + j2;
                try {
                    try {
                        long j3 = j2 / 1000000;
                        long j4 = j2 - (1000000 * j3);
                        if (j3 > 0 || j2 > 0) {
                            wait(j3, (int) j4);
                        }
                    } catch (InterruptedException unused) {
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((QU) arrayList2.get(size)).b();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            QU qu2 = (QU) arrayList.get(size2);
                            qu2.b();
                            if (qu2.e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.c = false;
                }
            } else if (j2 < this.d - nanoTime) {
                notify();
            }
        }
    }

    public final void d(QU qu) {
        AbstractC0048Bt.n(qu, "taskQueue");
        byte[] bArr = HY.a;
        if (qu.d == null) {
            boolean isEmpty = qu.e.isEmpty();
            ArrayList arrayList = this.f;
            if (isEmpty) {
                arrayList.remove(qu);
            } else {
                AbstractC0048Bt.n(arrayList, "<this>");
                if (!arrayList.contains(qu)) {
                    arrayList.add(qu);
                }
            }
        }
        if (this.c) {
            notify();
            return;
        }
        R2 r2 = this.g;
        AbstractC0048Bt.n(r2, "runnable");
        ((ThreadPoolExecutor) this.a.i).execute(r2);
    }

    public final QU e() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new QU(this, AbstractC2188wx.g(i2, "Q"));
    }
}
