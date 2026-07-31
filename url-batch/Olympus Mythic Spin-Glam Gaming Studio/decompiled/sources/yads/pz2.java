package yads;

import java.util.ArrayDeque;

/* loaded from: classes6.dex */
public abstract class pz2 implements bb0 {
    public final oz2 a;
    public final Object b = new Object();
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();
    public final fb0[] e;
    public final h53[] f;
    public int g;
    public int h;
    public fb0 i;
    public e53 j;
    public boolean k;
    public boolean l;

    public pz2(fb0[] fb0VarArr, h53[] h53VarArr) {
        this.e = fb0VarArr;
        this.g = fb0VarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = new g53();
        }
        this.f = h53VarArr;
        this.h = h53VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = new tz2((uz2) this);
        }
        oz2 oz2Var = new oz2((uz2) this);
        this.a = oz2Var;
        oz2Var.start();
    }

    public abstract e53 a(fb0 fb0Var, h53 h53Var, boolean z);

    @Override // yads.bb0
    public final void a(g53 g53Var) {
        synchronized (this.b) {
            try {
                e53 e53Var = this.j;
                if (e53Var != null) {
                    throw e53Var;
                }
                if (g53Var != this.i) {
                    throw new IllegalArgumentException();
                }
                this.c.addLast(g53Var);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // yads.bb0
    public final Object b() {
        fb0 fb0Var;
        synchronized (this.b) {
            try {
                e53 e53Var = this.j;
                if (e53Var != null) {
                    throw e53Var;
                }
                if (this.i != null) {
                    throw new IllegalStateException();
                }
                int i = this.g;
                if (i == 0) {
                    fb0Var = null;
                } else {
                    fb0[] fb0VarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    fb0Var = fb0VarArr[i2];
                }
                this.i = fb0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fb0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        e53 e53Var;
        e53 e53Var2;
        synchronized (this.b) {
            while (!this.l && (this.c.isEmpty() || this.h <= 0)) {
                try {
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            fb0 fb0Var = (fb0) this.c.removeFirst();
            h53[] h53VarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            h53 h53Var = h53VarArr[i];
            boolean z = this.k;
            this.k = false;
            if (fb0Var.b(4)) {
                h53Var.b = 4 | h53Var.b;
            } else {
                if (fb0Var.b(Integer.MIN_VALUE)) {
                    h53Var.b |= Integer.MIN_VALUE;
                }
                if (fb0Var.b(134217728)) {
                    h53Var.b = 134217728 | h53Var.b;
                }
                try {
                    e53Var2 = a(fb0Var, h53Var, z);
                } catch (OutOfMemoryError e) {
                    e53Var = new e53("Unexpected decode error", e);
                    e53Var2 = e53Var;
                    if (e53Var2 != null) {
                    }
                    synchronized (this.b) {
                    }
                } catch (RuntimeException e2) {
                    e53Var = new e53("Unexpected decode error", e2);
                    e53Var2 = e53Var;
                    if (e53Var2 != null) {
                    }
                    synchronized (this.b) {
                    }
                }
                if (e53Var2 != null) {
                    synchronized (this.b) {
                        this.j = e53Var2;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        h53Var.b();
                    } else if (h53Var.b(Integer.MIN_VALUE)) {
                        h53Var.b();
                    } else {
                        this.d.addLast(h53Var);
                    }
                    fb0Var.b();
                    fb0[] fb0VarArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    fb0VarArr[i2] = fb0Var;
                } finally {
                }
            }
            return true;
        }
    }

    public final void d() {
        if (this.c.isEmpty() || this.h <= 0) {
            return;
        }
        this.b.notify();
    }

    @Override // yads.bb0
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                fb0 fb0Var = this.i;
                if (fb0Var != null) {
                    fb0Var.b();
                    fb0[] fb0VarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    fb0VarArr[i] = fb0Var;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    fb0 fb0Var2 = (fb0) this.c.removeFirst();
                    fb0Var2.b();
                    fb0[] fb0VarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    fb0VarArr2[i2] = fb0Var2;
                }
                while (!this.d.isEmpty()) {
                    ((h53) this.d.removeFirst()).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // yads.bb0
    public final void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // yads.bb0
    public final h53 a() {
        synchronized (this.b) {
            try {
                e53 e53Var = this.j;
                if (e53Var == null) {
                    if (this.d.isEmpty()) {
                        return null;
                    }
                    return (h53) this.d.removeFirst();
                }
                throw e53Var;
            } finally {
            }
        }
    }
}
