package defpackage;

import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class m40 {
    public static final m40 h;
    public static final Logger i;
    public final uv a;
    public boolean c;
    public long d;
    public int b = 10000;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final u6 g = new u6(9, this);

    static {
        y60 y60Var = new y60(z60.g + " TaskRunner", true);
        uv uvVar = new uv();
        uvVar.f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), y60Var);
        h = new m40(uvVar);
        Logger logger = Logger.getLogger(m40.class.getName());
        logger.getClass();
        i = logger;
    }

    public m40(uv uvVar) {
        this.a = uvVar;
    }

    public static final void a(m40 m40Var, k40 k40Var) {
        byte[] bArr = z60.a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(k40Var.a);
        try {
            long a = k40Var.a();
            synchronized (m40Var) {
                m40Var.b(k40Var, a);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (m40Var) {
                m40Var.b(k40Var, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(k40 k40Var, long j) {
        byte[] bArr = z60.a;
        l40 l40Var = k40Var.c;
        l40Var.getClass();
        if (l40Var.d != k40Var) {
            l8.u("Check failed.");
            return;
        }
        boolean z = l40Var.f;
        l40Var.f = false;
        l40Var.d = null;
        this.e.remove(l40Var);
        if (j != -1 && !z && !l40Var.c) {
            l40Var.d(k40Var, j, true);
        }
        if (l40Var.e.isEmpty()) {
            return;
        }
        this.f.add(l40Var);
    }

    public final k40 c() {
        long j;
        k40 k40Var;
        boolean z;
        byte[] bArr = z60.a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j2 = Long.MAX_VALUE;
            int i2 = 0;
            k40 k40Var2 = null;
            while (true) {
                if (i2 >= size) {
                    j = nanoTime;
                    k40Var = null;
                    z = false;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                k40 k40Var3 = (k40) ((l40) obj).e.get(0);
                j = nanoTime;
                k40Var = null;
                long max = Math.max(0L, k40Var3.d - j);
                if (max > 0) {
                    j2 = Math.min(max, j2);
                } else {
                    if (k40Var2 != null) {
                        z = true;
                        break;
                    }
                    k40Var2 = k40Var3;
                }
                nanoTime = j;
            }
            ArrayList arrayList2 = this.e;
            if (k40Var2 != null) {
                byte[] bArr2 = z60.a;
                k40Var2.d = -1L;
                l40 l40Var = k40Var2.c;
                l40Var.getClass();
                l40Var.e.remove(k40Var2);
                arrayList.remove(l40Var);
                l40Var.d = k40Var2;
                arrayList2.add(l40Var);
                if (z || (!this.c && !arrayList.isEmpty())) {
                    u6 u6Var = this.g;
                    u6Var.getClass();
                    ((ThreadPoolExecutor) this.a.f).execute(u6Var);
                }
                return k40Var2;
            }
            if (this.c) {
                if (j2 >= this.d - j) {
                    return k40Var;
                }
                notify();
                return k40Var;
            }
            this.c = true;
            this.d = j + j2;
            try {
                try {
                    long j3 = j2 / 1000000;
                    long j4 = j2 - (1000000 * j3);
                    if (j3 > 0 || j2 > 0) {
                        wait(j3, (int) j4);
                    }
                } catch (InterruptedException unused) {
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((l40) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        l40 l40Var2 = (l40) arrayList.get(size3);
                        l40Var2.b();
                        if (l40Var2.e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.c = false;
            }
        }
    }

    public final void d(l40 l40Var) {
        l40Var.getClass();
        byte[] bArr = z60.a;
        if (l40Var.d == null) {
            boolean isEmpty = l40Var.e.isEmpty();
            ArrayList arrayList = this.f;
            if (isEmpty) {
                arrayList.remove(l40Var);
            } else {
                arrayList.getClass();
                if (!arrayList.contains(l40Var)) {
                    arrayList.add(l40Var);
                }
            }
        }
        if (this.c) {
            notify();
            return;
        }
        u6 u6Var = this.g;
        u6Var.getClass();
        ((ThreadPoolExecutor) this.a.f).execute(u6Var);
    }

    public final l40 e() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new l40(this, n20.e("Q", i2));
    }
}
