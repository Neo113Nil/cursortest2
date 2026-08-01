package defpackage;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class l40 {
    public final m40 a;
    public final String b;
    public boolean c;
    public k40 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public l40(m40 m40Var, String str) {
        this.a = m40Var;
        this.b = str;
    }

    public final void a() {
        byte[] bArr = z60.a;
        synchronized (this.a) {
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final boolean b() {
        k40 k40Var = this.d;
        if (k40Var != null && k40Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((k40) arrayList.get(size)).b) {
                k40 k40Var2 = (k40) arrayList.get(size);
                m40 m40Var = m40.h;
                if (m40.i.isLoggable(Level.FINE)) {
                    g8.b(k40Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(k40 k40Var, long j) {
        k40Var.getClass();
        synchronized (this.a) {
            if (!this.c) {
                if (d(k40Var, j, false)) {
                    this.a.d(this);
                }
            } else if (k40Var.b) {
                m40 m40Var = m40.h;
                if (m40.i.isLoggable(Level.FINE)) {
                    g8.b(k40Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                m40 m40Var2 = m40.h;
                if (m40.i.isLoggable(Level.FINE)) {
                    g8.b(k40Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(k40 k40Var, long j, boolean z) {
        k40Var.getClass();
        l40 l40Var = k40Var.c;
        if (l40Var != this) {
            if (l40Var != null) {
                l8.u("task is in multiple queues");
                return false;
            }
            k40Var.c = this;
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.e;
        int indexOf = arrayList.indexOf(k40Var);
        if (indexOf != -1) {
            if (k40Var.d <= j2) {
                m40 m40Var = m40.h;
                if (m40.i.isLoggable(Level.FINE)) {
                    g8.b(k40Var, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        k40Var.d = j2;
        m40 m40Var2 = m40.h;
        if (m40.i.isLoggable(Level.FINE)) {
            g8.b(k40Var, this, z ? "run again after ".concat(g8.y(j2 - nanoTime)) : "scheduled after ".concat(g8.y(j2 - nanoTime)));
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (((k40) obj).d - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, k40Var);
        return i == 0;
    }

    public final void e() {
        byte[] bArr = z60.a;
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
