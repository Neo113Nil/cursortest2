package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class QU {
    public final RU a;
    public final String b;
    public boolean c;
    public LU d;
    public final ArrayList e;
    public boolean f;

    public QU(RU ru, String str) {
        AbstractC0048Bt.n(str, "name");
        this.a = ru;
        this.b = str;
        this.e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = HY.a;
        synchronized (this.a) {
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final boolean b() {
        LU lu = this.d;
        if (lu != null && lu.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((LU) arrayList.get(size)).b) {
                LU lu2 = (LU) arrayList.get(size);
                CU cu = RU.h;
                if (RU.j.isLoggable(Level.FINE)) {
                    ZM.a(lu2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(LU lu, long j) {
        AbstractC0048Bt.n(lu, "task");
        synchronized (this.a) {
            if (!this.c) {
                if (d(lu, j, false)) {
                    this.a.d(this);
                }
            } else if (lu.b) {
                CU cu = RU.h;
                if (RU.j.isLoggable(Level.FINE)) {
                    ZM.a(lu, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                CU cu2 = RU.h;
                if (RU.j.isLoggable(Level.FINE)) {
                    ZM.a(lu, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(LU lu, long j, boolean z) {
        AbstractC0048Bt.n(lu, "task");
        QU qu = lu.c;
        if (qu != this) {
            if (qu != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            lu.c = this;
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.e;
        int indexOf = arrayList.indexOf(lu);
        if (indexOf != -1) {
            if (lu.d <= j2) {
                CU cu = RU.h;
                if (RU.j.isLoggable(Level.FINE)) {
                    ZM.a(lu, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        lu.d = j2;
        CU cu2 = RU.h;
        if (RU.j.isLoggable(Level.FINE)) {
            ZM.a(lu, this, z ? "run again after ".concat(ZM.f(j2 - nanoTime)) : "scheduled after ".concat(ZM.f(j2 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((LU) it.next()).d - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, lu);
        return i == 0;
    }

    public final void e() {
        byte[] bArr = HY.a;
        synchronized (this.a) {
            this.c = true;
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
