package yads;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes13.dex */
public abstract class dy2 implements dk0 {
    private final v30 a;
    private final g30 b;
    private final ArrayList c;
    private final er d;
    private final br e;
    private final lr f;
    private final Executor g;
    private final ArrayList h;
    private volatile boolean i;

    public dy2(wl1 wl1Var, g30 g30Var, er erVar, Executor executor) {
        wl1Var.c.getClass();
        Uri uri = wl1Var.c.a;
        Map emptyMap = Collections.emptyMap();
        oh.a(uri, "The uri must be set.");
        this.a = new v30(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
        this.b = g30Var;
        this.c = new ArrayList(wl1Var.c.b);
        this.d = erVar;
        this.g = executor;
        br brVar = erVar.a;
        brVar.getClass();
        this.e = brVar;
        this.f = erVar.b;
        this.h = new ArrayList();
    }

    private void b(ns2 ns2Var) {
        synchronized (this.h) {
            this.h.remove(ns2Var);
        }
    }

    protected abstract ArrayList a(fr frVar, e30 e30Var, boolean z);

    /* JADX WARN: Removed duplicated region for block: B:39:0x01a3 A[LOOP:1: B:37:0x019b->B:39:0x01a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01bc A[LOOP:2: B:42:0x01ba->B:43:0x01bc, LOOP_END] */
    @Override // yads.dk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(yj0 yj0Var) {
        dy2 dy2Var;
        int i;
        int size;
        fr a;
        byte[] bArr;
        ArrayDeque arrayDeque;
        dy2 dy2Var2 = this;
        ArrayDeque arrayDeque2 = new ArrayDeque();
        ArrayDeque arrayDeque3 = new ArrayDeque();
        try {
            er erVar = dy2Var2.d;
            p30 p30Var = erVar.c;
            fr a2 = erVar.a(p30Var != null ? p30Var.a() : null, 1);
            e30 e30Var = (e30) dy2Var2.a((ns2) new zx2(dy2Var2, a2, dy2Var2.a), false);
            if (!dy2Var2.c.isEmpty()) {
                e30Var = e30Var.a(dy2Var2.c);
            }
            ArrayList a3 = dy2Var2.a(a2, e30Var, false);
            Collections.sort(a3);
            a(a3, dy2Var2.f);
            int size2 = a3.size();
            int size3 = a3.size() - 1;
            int i2 = 0;
            long j = 0;
            long j2 = 0;
            while (size3 >= 0) {
                try {
                    v30 v30Var = ((by2) a3.get(size3)).c;
                    String a4 = dy2Var2.f.a(v30Var);
                    long j3 = v30Var.g;
                    if (j3 == -1) {
                        long a5 = lz.a(((lz2) dy2Var2.e).b(a4));
                        if (a5 != -1) {
                            j3 = a5 - v30Var.f;
                        }
                    }
                    ArrayDeque arrayDeque4 = arrayDeque3;
                    long a6 = ((lz2) dy2Var2.e).a(a4, v30Var.f, j3);
                    j2 += a6;
                    if (j3 != -1) {
                        if (j3 == a6) {
                            i2++;
                            a3.remove(size3);
                        }
                        if (j != -1) {
                            j += j3;
                        }
                    } else {
                        j = -1;
                    }
                    size3--;
                    arrayDeque3 = arrayDeque4;
                    dy2Var2 = this;
                } catch (Throwable th) {
                    th = th;
                    dy2Var = this;
                    while (i < dy2Var.h.size()) {
                    }
                    while (size >= 0) {
                    }
                    throw th;
                }
            }
            ArrayDeque arrayDeque5 = arrayDeque3;
            ay2 ay2Var = new ay2(yj0Var, j, size2, j2, i2);
            arrayDeque2.addAll(a3);
            dy2Var = this;
            while (!dy2Var.i && !arrayDeque2.isEmpty()) {
                try {
                    if (arrayDeque5.isEmpty()) {
                        er erVar2 = dy2Var.d;
                        p30 p30Var2 = erVar2.c;
                        a = erVar2.a(p30Var2 != null ? p30Var2.a() : null, 1);
                        bArr = new byte[131072];
                    } else {
                        cy2 cy2Var = (cy2) arrayDeque5.removeFirst();
                        a = cy2Var.i;
                        bArr = cy2Var.k;
                    }
                    cy2 cy2Var2 = new cy2((by2) arrayDeque2.removeFirst(), a, ay2Var, bArr);
                    dy2Var.a(cy2Var2);
                    dy2Var.g.execute(cy2Var2);
                    int size4 = dy2Var.h.size() - 1;
                    while (size4 >= 0) {
                        cy2 cy2Var3 = (cy2) dy2Var.h.get(size4);
                        if (arrayDeque2.isEmpty() || cy2Var3.isDone()) {
                            try {
                                cy2Var3.c.a();
                                cy2Var3.c();
                                dy2Var.a(size4);
                                arrayDeque = arrayDeque5;
                                arrayDeque.addLast(cy2Var3);
                            } catch (ExecutionException e) {
                                Throwable cause = e.getCause();
                                cause.getClass();
                                if (!(cause instanceof IOException)) {
                                    throw cause;
                                }
                                throw ((IOException) cause);
                            }
                        } else {
                            arrayDeque = arrayDeque5;
                        }
                        size4--;
                        arrayDeque5 = arrayDeque;
                    }
                    ArrayDeque arrayDeque6 = arrayDeque5;
                    cy2Var2.b.b();
                    arrayDeque5 = arrayDeque6;
                } catch (Throwable th2) {
                    th = th2;
                    for (i = 0; i < dy2Var.h.size(); i++) {
                        ((ns2) dy2Var.h.get(i)).cancel(true);
                    }
                    for (size = dy2Var.h.size() - 1; size >= 0; size--) {
                        ((ns2) dy2Var.h.get(size)).c.b();
                        dy2Var.a(size);
                    }
                    throw th;
                }
            }
            for (int i3 = 0; i3 < dy2Var.h.size(); i3++) {
                ((ns2) dy2Var.h.get(i3)).cancel(true);
            }
            for (int size5 = dy2Var.h.size() - 1; size5 >= 0; size5--) {
                ((ns2) dy2Var.h.get(size5)).c.b();
                dy2Var.a(size5);
            }
        } catch (Throwable th3) {
            th = th3;
            dy2Var = dy2Var2;
        }
    }

    @Override // yads.dk0
    public final void cancel() {
        synchronized (this.h) {
            try {
                this.i = true;
                for (int i = 0; i < this.h.size(); i++) {
                    ((ns2) this.h.get(i)).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // yads.dk0
    public final void remove() {
        fr a = this.d.a(null, 1);
        try {
            try {
                ArrayList a2 = a(a, (e30) a((ns2) new zx2(this, a, this.a), true), true);
                for (int i = 0; i < a2.size(); i++) {
                    ((lz2) this.e).c(this.f.a(((by2) a2.get(i)).c));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                ((lz2) this.e).c(this.f.a(this.a));
                return;
            } catch (Exception unused2) {
            }
            ((lz2) this.e).c(this.f.a(this.a));
        } catch (Throwable th) {
            ((lz2) this.e).c(this.f.a(this.a));
            throw th;
        }
    }

    protected final Object a(ns2 ns2Var, boolean z) {
        if (z) {
            ns2Var.run();
            try {
                ns2Var.c.a();
                return ns2Var.c();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                int i = sb3.a;
                throw e;
            }
        }
        if (!this.i) {
            a(ns2Var);
            this.g.execute(ns2Var);
            try {
                try {
                    ns2Var.c.a();
                    Object c = ns2Var.c();
                    ns2Var.c.b();
                    synchronized (this.h) {
                        this.h.remove(ns2Var);
                    }
                    return c;
                } catch (ExecutionException e2) {
                    Throwable cause2 = e2.getCause();
                    cause2.getClass();
                    if (cause2 instanceof IOException) {
                        throw ((IOException) cause2);
                    }
                    int i2 = sb3.a;
                    throw e2;
                }
            } catch (Throwable th) {
                ns2Var.c.b();
                b(ns2Var);
                throw th;
            }
        }
        throw new InterruptedException();
    }

    private void a(ns2 ns2Var) {
        synchronized (this.h) {
            try {
                if (!this.i) {
                    this.h.add(ns2Var);
                } else {
                    throw new InterruptedException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(int i) {
        synchronized (this.h) {
            this.h.remove(i);
        }
    }

    private static void a(ArrayList arrayList, lr lrVar) {
        HashMap hashMap = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            by2 by2Var = (by2) arrayList.get(i2);
            String a = lrVar.a(by2Var.c);
            Integer num = (Integer) hashMap.get(a);
            by2 by2Var2 = num == null ? null : (by2) arrayList.get(num.intValue());
            if (by2Var2 != null && by2Var.b <= by2Var2.b + 20000000) {
                v30 v30Var = by2Var2.c;
                v30 v30Var2 = by2Var.c;
                if (v30Var.a.equals(v30Var2.a)) {
                    long j = v30Var.g;
                    if (j != -1 && v30Var.f + j == v30Var2.f && sb3.a(v30Var.h, v30Var2.h) && v30Var.i == v30Var2.i && v30Var.c == v30Var2.c && v30Var.e.equals(v30Var2.e)) {
                        long j2 = by2Var.c.g;
                        v30 a2 = by2Var2.c.a(0L, j2 == -1 ? -1L : by2Var2.c.g + j2);
                        num.getClass();
                        arrayList.set(num.intValue(), new by2(by2Var2.b, a2));
                    }
                }
            }
            hashMap.put(a, Integer.valueOf(i));
            arrayList.set(i, by2Var);
            i++;
        }
        int size = arrayList.size();
        int i3 = sb3.a;
        if (i < 0 || size > arrayList.size() || i > size) {
            throw new IllegalArgumentException();
        }
        if (i != size) {
            arrayList.subList(i, size).clear();
        }
    }
}
