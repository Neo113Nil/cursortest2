package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class eb implements tc {
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(eb.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(eb.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(eb.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(eb.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(eb.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(eb.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(eb.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(eb.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(eb.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public eb(int i2) {
        this.d = i2;
        if (i2 < 0) {
            g8.g("Invalid channel capacity: ", i2, ", should be >=0");
            throw null;
        }
        ed edVar = gb.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = g.get(this);
        ed edVar2 = new ed(0L, null, this, 3);
        this.sendSegment$volatile = edVar2;
        this.receiveSegment$volatile = edVar2;
        if (w()) {
            edVar2 = gb.a;
            edVar2.getClass();
        }
        this.bufferEndSegment$volatile = edVar2;
        this._closeCause$volatile = gb.s;
    }

    public static boolean B(Object obj) {
        if (!(obj instanceof fc)) {
            g8.d(obj, "Unexpected waiter: ");
            return false;
        }
        fc fcVar = (fc) obj;
        ed edVar = gb.a;
        op d = fcVar.d(ky0.a, null);
        if (d == null) {
            return false;
        }
        fcVar.v(d);
        return true;
    }

    public static final ed b(eb ebVar, long j2, ed edVar) {
        Object D;
        eb ebVar2;
        ed edVar2 = gb.a;
        fb fbVar = fb.l;
        loop0: while (true) {
            D = mz.D(edVar, j2, fbVar);
            if (!ud0.n(D)) {
                kp0 l2 = ud0.l(D);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                    kp0 kp0Var = (kp0) atomicReferenceFieldUpdater.get(ebVar);
                    if (kp0Var.c >= l2.c) {
                        break loop0;
                    }
                    if (!l2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(ebVar, kp0Var, l2)) {
                        if (atomicReferenceFieldUpdater.get(ebVar) != kp0Var) {
                            if (l2.e()) {
                                l2.d();
                            }
                        }
                    }
                    if (kp0Var.e()) {
                        kp0Var.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean n = ud0.n(D);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        if (n) {
            ebVar.i();
            if (edVar.c * gb.b < atomicLongFieldUpdater.get(ebVar)) {
                edVar.a();
                return null;
            }
        } else {
            ed edVar3 = (ed) ud0.l(D);
            long j3 = edVar3.c;
            if (j3 <= j2) {
                return edVar3;
            }
            long j4 = gb.b * j3;
            while (true) {
                long j5 = e.get(ebVar);
                long j6 = 1152921504606846975L & j5;
                if (j6 >= j4) {
                    ebVar2 = ebVar;
                    break;
                }
                ebVar2 = ebVar;
                if (e.compareAndSet(ebVar2, j5, (((int) (j5 >> 60)) << 60) + j6)) {
                    break;
                }
                ebVar = ebVar2;
            }
            if (j3 * gb.b < atomicLongFieldUpdater.get(ebVar2)) {
                edVar3.a();
            }
        }
        return null;
    }

    public static final void d(eb ebVar, Object obj, hc hcVar) {
        hcVar.resumeWith(new uk0(ebVar.q()));
    }

    public static final int e(eb ebVar, ed edVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        edVar.m(i2, obj);
        if (z) {
            return ebVar.D(edVar, i2, obj, j2, obj2, z);
        }
        Object k2 = edVar.k(i2);
        if (k2 == null) {
            if (ebVar.f(j2)) {
                if (edVar.j(i2, null, gb.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (edVar.j(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (k2 instanceof u01) {
            edVar.m(i2, null);
            if (ebVar.A(k2, obj)) {
                edVar.n(i2, gb.i);
                return 0;
            }
            op opVar = gb.k;
            if (edVar.f.getAndSet((i2 * 2) + 1, opVar) == opVar) {
                return 5;
            }
            edVar.l(i2, true);
            return 5;
        }
        return ebVar.D(edVar, i2, obj, j2, obj2, z);
    }

    public static void t(eb ebVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = h;
        if ((atomicLongFieldUpdater.addAndGet(ebVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(ebVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A(Object obj, Object obj2) {
        if (!(obj instanceof db)) {
            if (!(obj instanceof fc)) {
                g8.d(obj, "Unexpected receiver type: ");
                return false;
            }
            fc fcVar = (fc) obj;
            ed edVar = gb.a;
            op d = fcVar.d(obj2, null);
            if (d == null) {
                return false;
            }
            fcVar.v(d);
            return true;
        }
        db dbVar = (db) obj;
        hc hcVar = dbVar.e;
        hcVar.getClass();
        dbVar.e = null;
        dbVar.d = obj2;
        Boolean bool = Boolean.TRUE;
        dbVar.f.getClass();
        ed edVar2 = gb.a;
        op d2 = hcVar.d(bool, null);
        if (d2 == null) {
            return false;
        }
        hcVar.v(d2);
        return true;
    }

    public final Object C(ed edVar, int i2, long j2, Object obj) {
        AtomicReferenceArray atomicReferenceArray = edVar.f;
        Object k2 = edVar.k(i2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (k2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return gb.n;
                }
                if (edVar.j(i2, k2, obj)) {
                    k();
                    return gb.m;
                }
            }
        } else if (k2 == gb.d && edVar.j(i2, k2, gb.i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            edVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object k3 = edVar.k(i2);
            if (k3 == null || k3 == gb.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (edVar.j(i2, k3, gb.h)) {
                        k();
                        return gb.o;
                    }
                } else {
                    if (obj == null) {
                        return gb.n;
                    }
                    if (edVar.j(i2, k3, obj)) {
                        k();
                        return gb.m;
                    }
                }
            } else if (k3 != gb.d) {
                op opVar = gb.j;
                if (k3 == opVar) {
                    return gb.o;
                }
                if (k3 == gb.h) {
                    return gb.o;
                }
                if (k3 == gb.l) {
                    k();
                    return gb.o;
                }
                if (k3 != gb.g && edVar.j(i2, k3, gb.f)) {
                    boolean z = k3 instanceof v01;
                    if (z) {
                        k3 = ((v01) k3).a;
                    }
                    if (B(k3)) {
                        edVar.n(i2, gb.i);
                        k();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        edVar.m(i2, null);
                        return obj3;
                    }
                    edVar.n(i2, opVar);
                    edVar.h();
                    if (z) {
                        k();
                    }
                    return gb.o;
                }
            } else if (edVar.j(i2, k3, gb.i)) {
                k();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                edVar.m(i2, null);
                return obj4;
            }
        }
    }

    public final int D(ed edVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object k2 = edVar.k(i2);
            if (k2 == null) {
                if (!f(j2) || z) {
                    if (z) {
                        if (edVar.j(i2, null, gb.j)) {
                            edVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (edVar.j(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (edVar.j(i2, null, gb.d)) {
                    break;
                }
            } else {
                if (k2 != gb.e) {
                    op opVar = gb.k;
                    if (k2 == opVar) {
                        edVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == gb.h) {
                        edVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == gb.l) {
                        edVar.m(i2, null);
                        i();
                        return 4;
                    }
                    edVar.m(i2, null);
                    if (k2 instanceof v01) {
                        k2 = ((v01) k2).a;
                    }
                    if (A(k2, obj)) {
                        edVar.n(i2, gb.i);
                        return 0;
                    }
                    if (edVar.f.getAndSet((i2 * 2) + 1, opVar) != opVar) {
                        edVar.l(i2, true);
                    }
                    return 5;
                }
                if (edVar.j(i2, k2, gb.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void E(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        eb ebVar = this;
        if (ebVar.w()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = g;
            if (atomicLongFieldUpdater.get(ebVar) > j2) {
                break;
            } else {
                ebVar = this;
            }
        }
        int i2 = gb.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = h;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(ebVar);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(ebVar)) && j3 == atomicLongFieldUpdater.get(ebVar)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(ebVar);
                    if (atomicLongFieldUpdater2.compareAndSet(ebVar, j4, (j4 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        ebVar = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(ebVar);
                    long j6 = atomicLongFieldUpdater2.get(ebVar);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(ebVar)) {
                        break;
                    }
                    if (z) {
                        ebVar = this;
                    } else {
                        ebVar = this;
                        atomicLongFieldUpdater2.compareAndSet(ebVar, j6, 4611686018427387904L + j7);
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(ebVar);
                    if (atomicLongFieldUpdater2.compareAndSet(ebVar, j8, j8 & 4611686018427387903L)) {
                        return;
                    } else {
                        ebVar = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.tc
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0144 A[RETURN] */
    @Override // defpackage.gq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(kj kjVar, Object obj) {
        ky0 ky0Var;
        Object p;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        ed edVar = (ed) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean u = u(andIncrement, false);
            int i2 = gb.b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = edVar.c;
            ck ckVar = ck.d;
            ky0Var = ky0.a;
            if (j5 != j4) {
                ed b = b(this, j4, edVar);
                if (b != null) {
                    edVar = b;
                } else if (u) {
                    Object y = y(kjVar, obj);
                    if (y == ckVar) {
                        return y;
                    }
                }
            }
            int e2 = e(this, edVar, i3, obj, j2, null, u);
            if (e2 == 0) {
                edVar.a();
                return ky0Var;
            }
            if (e2 == 1) {
                break;
            }
            if (e2 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
                if (e2 == 3) {
                    hc E = mz.E(d31.B(kjVar));
                    try {
                        int e3 = e(this, edVar, i3, obj, j2, E, false);
                        if (e3 == 0) {
                            edVar.a();
                        } else if (e3 != 1) {
                            if (e3 != 2) {
                                if (e3 != 4) {
                                    String str = "unexpected";
                                    if (e3 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    edVar.a();
                                    ed edVar2 = (ed) atomicReferenceFieldUpdater.get(this);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j6 = andIncrement2 & 1152921504606846975L;
                                        boolean u2 = u(andIncrement2, false);
                                        int i4 = gb.b;
                                        long j7 = i4;
                                        String str2 = str;
                                        long j8 = j6 / j7;
                                        int i5 = (int) (j6 % j7);
                                        if (edVar2.c != j8) {
                                            ed b2 = b(this, j8, edVar2);
                                            if (b2 != null) {
                                                edVar2 = b2;
                                            } else {
                                                if (u2) {
                                                    break;
                                                }
                                                str = str2;
                                            }
                                        }
                                        int e4 = e(this, edVar2, i5, obj, j6, E, u2);
                                        if (e4 == 0) {
                                            edVar2.a();
                                            break;
                                        }
                                        if (e4 == 1) {
                                            break;
                                        }
                                        if (e4 != 2) {
                                            if (e4 == 3) {
                                                throw new IllegalStateException(str2);
                                            }
                                            if (e4 != 4) {
                                                if (e4 == 5) {
                                                    edVar2.a();
                                                }
                                                str = str2;
                                            } else if (j6 < atomicLongFieldUpdater2.get(this)) {
                                                edVar2.a();
                                            }
                                        } else if (u2) {
                                            edVar2.h();
                                        } else {
                                            E.a(edVar2, i5 + i4);
                                        }
                                    }
                                } else if (j2 < atomicLongFieldUpdater2.get(this)) {
                                    edVar.a();
                                }
                                d(this, obj, E);
                            } else {
                                E.a(edVar, i3 + i2);
                            }
                            p = E.p();
                            if (p != ckVar) {
                                p = ky0Var;
                            }
                            if (p != ckVar) {
                                return p;
                            }
                        }
                        E.resumeWith(ky0Var);
                        p = E.p();
                        if (p != ckVar) {
                        }
                        if (p != ckVar) {
                            break;
                        }
                    } catch (Throwable th) {
                        E.y();
                        throw th;
                    }
                } else if (e2 == 4) {
                    if (j2 < atomicLongFieldUpdater2.get(this)) {
                        edVar.a();
                    }
                    Object y2 = y(kjVar, obj);
                    if (y2 == ckVar) {
                        return y2;
                    }
                } else if (e2 == 5) {
                    edVar.a();
                }
            } else if (u) {
                edVar.h();
                Object y3 = y(kjVar, obj);
                if (y3 == ckVar) {
                    return y3;
                }
            }
        }
        return ky0Var;
    }

    public final boolean f(long j2) {
        return j2 < g.get(this) || j2 < f.get(this) + ((long) this.d);
    }

    public final boolean g(Throwable th, boolean z) {
        eb ebVar;
        boolean z2;
        long j2;
        long j3;
        Object obj;
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (z) {
            while (true) {
                long j5 = atomicLongFieldUpdater.get(this);
                if (((int) (j5 >> 60)) != 0) {
                    break;
                }
                ed edVar = gb.a;
                ebVar = this;
                if (atomicLongFieldUpdater.compareAndSet(ebVar, j5, (j5 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = ebVar;
            }
        }
        ebVar = this;
        op opVar = gb.s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            if (atomicReferenceFieldUpdater.compareAndSet(ebVar, opVar, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(ebVar) != opVar) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j4 = atomicLongFieldUpdater.get(ebVar);
            } while (!atomicLongFieldUpdater.compareAndSet(ebVar, j4, 3458764513820540928L + (j4 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(ebVar);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j3 = (j2 & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = (j2 & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(ebVar, j2, j3));
        }
        ebVar.i();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m;
                obj = atomicReferenceFieldUpdater2.get(ebVar);
                op opVar2 = obj == null ? gb.q : gb.r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(ebVar, obj, opVar2)) {
                    if (atomicReferenceFieldUpdater2.get(ebVar) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                px0.k(1, obj);
                ((mu) obj).c(ebVar.n());
                return z2;
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (defpackage.ed) ((defpackage.ni) defpackage.ni.b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ed h(long j2) {
        Object obj;
        long j3;
        Object obj2 = k.get(this);
        ed edVar = (ed) i.get(this);
        if (edVar.c > ((ed) obj2).c) {
            obj2 = edVar;
        }
        ed edVar2 = (ed) j.get(this);
        if (edVar2.c > ((ed) obj2).c) {
            obj2 = edVar2;
        }
        ni niVar = (ni) obj2;
        loop0: while (true) {
            niVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ni.a;
            Object obj3 = atomicReferenceFieldUpdater.get(niVar);
            op opVar = mz.i;
            obj = null;
            if (obj3 == opVar) {
                break;
            }
            ni niVar2 = (ni) obj3;
            if (niVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(niVar, null, opVar)) {
                    if (atomicReferenceFieldUpdater.get(niVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            niVar = niVar2;
        }
        ed edVar3 = (ed) niVar;
        if (v()) {
            ed edVar4 = edVar3;
            loop2: do {
                int i2 = gb.b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (edVar4.c * gb.b) + i2;
                    if (j3 < f.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k2 = edVar4.k(i2);
                        if (k2 != null && k2 != gb.e) {
                            if (k2 == gb.d) {
                                break loop2;
                            }
                        } else {
                            if (edVar4.j(i2, k2, gb.l)) {
                                edVar4.h();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (edVar4 != null);
            j3 = -1;
            if (j3 != -1) {
                j(j3);
            }
        }
        loop5: for (ed edVar5 = edVar3; edVar5 != null; edVar5 = (ed) ((ni) ni.b.get(edVar5))) {
            for (int i3 = gb.b - 1; -1 < i3; i3--) {
                if ((edVar5.c * gb.b) + i3 < j2) {
                    break loop5;
                }
                while (true) {
                    Object k3 = edVar5.k(i3);
                    if (k3 != null && k3 != gb.e) {
                        if (!(k3 instanceof v01)) {
                            if (!(k3 instanceof u01)) {
                                break;
                            }
                            if (edVar5.j(i3, k3, gb.l)) {
                                obj = nk.I(obj, k3);
                                edVar5.l(i3, true);
                                break;
                            }
                        } else {
                            if (edVar5.j(i3, k3, gb.l)) {
                                obj = nk.I(obj, ((v01) k3).a);
                                edVar5.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (edVar5.j(i3, k3, gb.l)) {
                            edVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                z((u01) obj, true);
                return edVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                z((u01) arrayList.get(size), true);
            }
        }
        return edVar3;
    }

    public final void i() {
        u(e.get(this), false);
    }

    @Override // defpackage.tc
    public final db iterator() {
        return new db(this);
    }

    public final void j(long j2) {
        ed edVar = (ed) j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.d + j3, g.get(this))) {
                return;
            }
            eb ebVar = this;
            if (atomicLongFieldUpdater.compareAndSet(ebVar, j3, 1 + j3)) {
                long j4 = gb.b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (edVar.c != j5) {
                    ed m2 = ebVar.m(j5, edVar);
                    if (m2 != null) {
                        edVar = m2;
                    }
                }
                ed edVar2 = edVar;
                if (ebVar.C(edVar2, i2, j3, null) != gb.o) {
                    edVar2.a();
                } else if (j3 < ebVar.s()) {
                    edVar2.a();
                }
                this = ebVar;
                edVar = edVar2;
            }
            this = ebVar;
        }
    }

    public final void k() {
        Object D;
        if (w()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        ed edVar = (ed) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = g.getAndIncrement(this);
            long j2 = andIncrement / gb.b;
            if (s() <= andIncrement) {
                if (edVar.c < j2 && edVar.b() != null) {
                    x(j2, edVar);
                }
                t(this);
                return;
            }
            if (edVar.c != j2) {
                fb fbVar = fb.l;
                while (true) {
                    D = mz.D(edVar, j2, fbVar);
                    if (!ud0.n(D)) {
                        kp0 l2 = ud0.l(D);
                        while (true) {
                            kp0 kp0Var = (kp0) atomicReferenceFieldUpdater.get(this);
                            if (kp0Var.c >= l2.c) {
                                break;
                            }
                            if (!l2.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, kp0Var, l2)) {
                                if (atomicReferenceFieldUpdater.get(this) != kp0Var) {
                                    if (l2.e()) {
                                        l2.d();
                                    }
                                }
                            }
                            if (kp0Var.e()) {
                                kp0Var.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                ed edVar2 = null;
                if (ud0.n(D)) {
                    i();
                    x(j2, edVar);
                    t(this);
                } else {
                    ed edVar3 = (ed) ud0.l(D);
                    long j3 = edVar3.c;
                    if (j3 > j2) {
                        long j4 = j3 * gb.b;
                        if (g.compareAndSet(this, 1 + andIncrement, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
                            if ((atomicLongFieldUpdater.addAndGet(this, j4 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            t(this);
                        }
                    } else {
                        edVar2 = edVar3;
                    }
                }
                if (edVar2 == null) {
                    continue;
                } else {
                    edVar = edVar2;
                }
            }
            int i2 = (int) (andIncrement % gb.b);
            Object k2 = edVar.k(i2);
            boolean z = k2 instanceof u01;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !edVar.j(i2, k2, gb.g)) {
                while (true) {
                    Object k3 = edVar.k(i2);
                    if (!(k3 instanceof u01)) {
                        if (k3 != gb.j) {
                            if (k3 != null) {
                                if (k3 == gb.d || k3 == gb.h || k3 == gb.i || k3 == gb.k || k3 == gb.l) {
                                    break loop0;
                                } else if (k3 != gb.f) {
                                    g8.d(k3, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (edVar.j(i2, k3, gb.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (edVar.j(i2, k3, new v01((u01) k3))) {
                            break loop0;
                        }
                    } else if (edVar.j(i2, k3, gb.g)) {
                        if (B(k3)) {
                            edVar.n(i2, gb.d);
                            break;
                        } else {
                            edVar.n(i2, gb.j);
                            edVar.h();
                        }
                    }
                }
            } else if (B(k2)) {
                edVar.n(i2, gb.d);
                break;
            } else {
                edVar.n(i2, gb.j);
                edVar.h();
                t(this);
            }
        }
        t(this);
    }

    @Override // defpackage.tc
    public final Object l(fu0 fu0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        ed edVar = (ed) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            boolean z = true;
            if (u(atomicLongFieldUpdater.get(this), true)) {
                Throwable o = o();
                int i2 = vs0.a;
                throw o;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
            long j2 = gb.b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (edVar.c != j3) {
                ed m2 = m(j3, edVar);
                if (m2 == null) {
                    continue;
                } else {
                    edVar = m2;
                }
            }
            Object C = C(edVar, i3, andIncrement, null);
            Object obj = gb.m;
            if (C == obj) {
                g8.s("unexpected");
                return null;
            }
            Object obj2 = gb.o;
            if (C != obj2) {
                if (C != gb.n) {
                    edVar.a();
                    return C;
                }
                hc E = mz.E(d31.B(fu0Var));
                try {
                    Object C2 = C(edVar, i3, andIncrement, E);
                    if (C2 == obj) {
                        E.a(edVar, i3);
                    } else if (C2 == obj2) {
                        if (andIncrement < s()) {
                            edVar.a();
                        }
                        ed edVar2 = (ed) atomicReferenceFieldUpdater.get(this);
                        while (true) {
                            if (u(atomicLongFieldUpdater.get(this), z)) {
                                E.resumeWith(new uk0(o()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(this);
                            long j4 = gb.b;
                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                            long j5 = andIncrement2 / j4;
                            int i4 = (int) (andIncrement2 % j4);
                            if (edVar2.c != j5) {
                                ed m3 = m(j5, edVar2);
                                if (m3 == null) {
                                    continue;
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    z = true;
                                } else {
                                    edVar2 = m3;
                                }
                            }
                            Object C3 = C(edVar2, i4, andIncrement2, E);
                            if (C3 == gb.m) {
                                E.a(edVar2, i4);
                                break;
                            }
                            if (C3 == gb.o) {
                                if (andIncrement2 < s()) {
                                    edVar2.a();
                                }
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                z = true;
                            } else {
                                if (C3 == gb.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                edVar2.a();
                                E.z(C3, null);
                            }
                        }
                    } else {
                        edVar.a();
                        E.z(C2, null);
                    }
                    return E.p();
                } catch (Throwable th) {
                    E.y();
                    throw th;
                }
            }
            if (andIncrement < s()) {
                edVar.a();
            }
        }
    }

    public final ed m(long j2, ed edVar) {
        Object D;
        eb ebVar;
        ed edVar2 = gb.a;
        fb fbVar = fb.l;
        loop0: while (true) {
            D = mz.D(edVar, j2, fbVar);
            if (!ud0.n(D)) {
                kp0 l2 = ud0.l(D);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
                    kp0 kp0Var = (kp0) atomicReferenceFieldUpdater.get(this);
                    if (kp0Var.c >= l2.c) {
                        break loop0;
                    }
                    if (!l2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, kp0Var, l2)) {
                        if (atomicReferenceFieldUpdater.get(this) != kp0Var) {
                            if (l2.e()) {
                                l2.d();
                            }
                        }
                    }
                    if (kp0Var.e()) {
                        kp0Var.d();
                    }
                }
            } else {
                break;
            }
        }
        if (ud0.n(D)) {
            i();
            if (edVar.c * gb.b < s()) {
                edVar.a();
                return null;
            }
        } else {
            ed edVar3 = (ed) ud0.l(D);
            long j3 = edVar3.c;
            if (!w() && j2 <= g.get(this) / gb.b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k;
                    kp0 kp0Var2 = (kp0) atomicReferenceFieldUpdater2.get(this);
                    if (kp0Var2.c >= j3 || !edVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, kp0Var2, edVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != kp0Var2) {
                            if (edVar3.e()) {
                                edVar3.d();
                            }
                        }
                    }
                    if (kp0Var2.e()) {
                        kp0Var2.d();
                    }
                }
            }
            if (j3 <= j2) {
                return edVar3;
            }
            long j4 = j3 * gb.b;
            while (true) {
                long j5 = f.get(this);
                if (j5 >= j4) {
                    ebVar = this;
                    break;
                }
                ebVar = this;
                if (f.compareAndSet(ebVar, j5, j4)) {
                    break;
                }
                this = ebVar;
            }
            if (j3 * gb.b < ebVar.s()) {
                edVar3.a();
            }
        }
        return null;
    }

    public final Throwable n() {
        return (Throwable) l.get(this);
    }

    public final Throwable o() {
        Throwable n = n();
        return n == null ? new xd("Channel was closed") : n;
    }

    @Override // defpackage.tc
    public final Object p() {
        ed edVar;
        dd ddVar = d31.a;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        long j2 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
        long j3 = atomicLongFieldUpdater2.get(this);
        if (u(j3, true)) {
            return new cd(n());
        }
        if (j2 >= (j3 & 1152921504606846975L)) {
            return ddVar;
        }
        Object obj = gb.k;
        ed edVar2 = (ed) j.get(this);
        while (!this.u(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = gb.b;
            long j5 = andIncrement / j4;
            int i2 = (int) (andIncrement % j4);
            if (edVar2.c != j5) {
                ed m2 = this.m(j5, edVar2);
                if (m2 == null) {
                    continue;
                } else {
                    edVar = m2;
                }
            } else {
                edVar = edVar2;
            }
            eb ebVar = this;
            Object C = ebVar.C(edVar, i2, andIncrement, obj);
            edVar2 = edVar;
            if (C == gb.m) {
                u01 u01Var = obj instanceof u01 ? (u01) obj : null;
                if (u01Var != null) {
                    u01Var.a(edVar2, i2);
                }
                ebVar.E(andIncrement);
                edVar2.h();
                return ddVar;
            }
            if (C != gb.o) {
                if (C != gb.n) {
                    edVar2.a();
                    return C;
                }
                g8.s("unexpected");
                return null;
            }
            if (andIncrement < ebVar.s()) {
                edVar2.a();
            }
            this = ebVar;
        }
        return new cd(this.n());
    }

    public final Throwable q() {
        Throwable n = n();
        return n == null ? new yd("Channel was closed") : n;
    }

    @Override // defpackage.gq0
    public Object r(Object obj) {
        dd ddVar = d31.a;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        boolean z = false;
        long j2 = 1152921504606846975L;
        if (u(atomicLongFieldUpdater.get(this), false) ? false : !f(r1 & 1152921504606846975L)) {
            return ddVar;
        }
        np npVar = gb.j;
        ed edVar = (ed) i.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean u = u(andIncrement, z);
            int i2 = gb.b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (edVar.c != j5) {
                ed b = b(this, j5, edVar);
                if (b != null) {
                    edVar = b;
                } else {
                    if (u) {
                        return new cd(q());
                    }
                    z = false;
                    j2 = 1152921504606846975L;
                }
            }
            int e2 = e(this, edVar, i3, obj, j3, npVar, u);
            ky0 ky0Var = ky0.a;
            if (e2 == 0) {
                edVar.a();
                return ky0Var;
            }
            if (e2 == 1) {
                return ky0Var;
            }
            if (e2 == 2) {
                if (u) {
                    edVar.h();
                    return new cd(q());
                }
                u01 u01Var = npVar instanceof u01 ? (u01) npVar : null;
                if (u01Var != null) {
                    u01Var.a(edVar, i3 + i2);
                }
                edVar.h();
                return ddVar;
            }
            if (e2 == 3) {
                g8.s("unexpected");
                return null;
            }
            if (e2 == 4) {
                if (j3 < f.get(this)) {
                    edVar.a();
                }
                return new cd(q());
            }
            if (e2 == 5) {
                edVar.a();
            }
            z = false;
            j2 = 1152921504606846975L;
        }
    }

    public final long s() {
        return e.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0192, code lost:
    
        r16 = null;
        r3 = (defpackage.ed) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019b, code lost:
    
        if (r3 != null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (e.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.d + ',');
        sb.append("data=[");
        int i3 = 0;
        List I = px0.I(j.get(this), i.get(this), k.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : I) {
            if (((ed) obj) != gb.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            g8.k();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((ed) next).c;
            do {
                Object next2 = it.next();
                long j3 = ((ed) next2).c;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        ed edVar = (ed) next;
        long j4 = f.get(this);
        long s = s();
        loop2: while (true) {
            int i4 = gb.b;
            int i5 = i3;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                long j5 = (edVar.c * gb.b) + i5;
                if (j5 >= s && j5 >= j4) {
                    str = null;
                    break loop2;
                }
                Object k2 = edVar.k(i5);
                Object obj2 = edVar.f.get(i5 * 2);
                if (k2 instanceof fc) {
                    str2 = (j5 >= j4 || j5 < s) ? (j5 >= s || j5 < j4) ? "cont" : "send" : "receive";
                } else if (k2 instanceof v01) {
                    str2 = "EB(" + k2 + ')';
                } else if (nz.l(k2, gb.f) || nz.l(k2, gb.g)) {
                    str2 = "resuming_sender";
                } else {
                    if (k2 != null && !k2.equals(gb.e) && !k2.equals(gb.i) && !k2.equals(gb.h) && !k2.equals(gb.k) && !k2.equals(gb.j) && !k2.equals(gb.l)) {
                        str2 = k2.toString();
                    }
                    i5++;
                }
                if (obj2 != null) {
                    sb.append("(" + str2 + ',' + obj2 + "),");
                } else {
                    sb.append(str2 + ',');
                }
                i5++;
            }
            i3 = 0;
        }
        if (sb.length() == 0) {
            g8.e("Char sequence is empty.");
            return str;
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (defpackage.ed) ((defpackage.ni) defpackage.ni.b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            if (i2 == 2) {
                h(1152921504606846975L & j2);
                if (z) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
                        ed edVar = (ed) atomicReferenceFieldUpdater.get(this);
                        long j3 = atomicLongFieldUpdater.get(this);
                        if (s() <= j3) {
                            break;
                        }
                        long j4 = gb.b;
                        long j5 = j3 / j4;
                        if (edVar.c != j5 && (edVar = m(j5, edVar)) == null) {
                            if (((ed) atomicReferenceFieldUpdater.get(this)).c < j5) {
                                break;
                            }
                        } else {
                            edVar.a();
                            int i3 = (int) (j3 % j4);
                            while (true) {
                                Object k2 = edVar.k(i3);
                                if (k2 == null || k2 == gb.e) {
                                    if (edVar.j(i3, k2, gb.h)) {
                                        k();
                                        break;
                                    }
                                } else {
                                    if (k2 == gb.d) {
                                        break;
                                    }
                                    if (k2 != gb.j) {
                                        if (k2 != gb.l) {
                                            if (k2 != gb.i) {
                                                if (k2 != gb.h) {
                                                    if (k2 == gb.g) {
                                                        break;
                                                    }
                                                    if (k2 != gb.f && j3 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            f.compareAndSet(this, j3, j3 + 1);
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException(("unexpected close status: " + i2).toString());
                }
                ed h2 = h(1152921504606846975L & j2);
                Object obj = null;
                loop0: do {
                    int i4 = gb.b - 1;
                    while (true) {
                        if (-1 >= i4) {
                            break;
                        }
                        long j6 = (h2.c * gb.b) + i4;
                        while (true) {
                            Object k3 = h2.k(i4);
                            if (k3 == gb.i) {
                                break loop0;
                            }
                            if (k3 == gb.d) {
                                if (j6 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (h2.j(i4, k3, gb.l)) {
                                    h2.m(i4, null);
                                    h2.h();
                                    break;
                                }
                            } else if (k3 != gb.e && k3 != null) {
                                if (!(k3 instanceof u01) && !(k3 instanceof v01)) {
                                    op opVar = gb.g;
                                    if (k3 == opVar || k3 == gb.f) {
                                        break loop0;
                                    }
                                    if (k3 != opVar) {
                                        break;
                                    }
                                } else {
                                    if (j6 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    u01 u01Var = k3 instanceof v01 ? ((v01) k3).a : (u01) k3;
                                    if (h2.j(i4, k3, gb.l)) {
                                        obj = nk.I(obj, u01Var);
                                        h2.m(i4, null);
                                        h2.h();
                                        break;
                                    }
                                }
                            } else if (h2.j(i4, k3, gb.l)) {
                                h2.h();
                                break;
                            }
                        }
                        i4--;
                    }
                } while (h2 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            z((u01) arrayList.get(size), false);
                        }
                    } else {
                        z((u01) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean v() {
        return false;
    }

    public final boolean w() {
        long j2 = g.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(long j2, ed edVar) {
        ed edVar2;
        ed edVar3;
        while (edVar.c < j2 && (edVar3 = (ed) edVar.b()) != null) {
            edVar = edVar3;
        }
        while (true) {
            if (!edVar.c() || (edVar2 = (ed) edVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
                    kp0 kp0Var = (kp0) atomicReferenceFieldUpdater.get(this);
                    if (kp0Var.c >= edVar.c) {
                        return;
                    }
                    if (!edVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, kp0Var, edVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != kp0Var) {
                            if (edVar.e()) {
                                edVar.d();
                            }
                        }
                    }
                    if (kp0Var.e()) {
                        kp0Var.d();
                        return;
                    }
                    return;
                }
            }
            edVar = edVar2;
        }
    }

    public final Object y(kj kjVar, Object obj) {
        hc hcVar = new hc(1, d31.B(kjVar));
        hcVar.q();
        hcVar.resumeWith(new uk0(q()));
        Object p = hcVar.p();
        return p == ck.d ? p : ky0.a;
    }

    public final void z(u01 u01Var, boolean z) {
        if (u01Var instanceof fc) {
            ((kj) u01Var).resumeWith(new uk0(z ? o() : q()));
            return;
        }
        if (!(u01Var instanceof db)) {
            g8.d(u01Var, "Unexpected waiter: ");
            return;
        }
        db dbVar = (db) u01Var;
        hc hcVar = dbVar.e;
        hcVar.getClass();
        dbVar.e = null;
        dbVar.d = gb.l;
        Throwable n = dbVar.f.n();
        if (n == null) {
            hcVar.resumeWith(Boolean.FALSE);
        } else {
            hcVar.resumeWith(new uk0(n));
        }
    }
}
