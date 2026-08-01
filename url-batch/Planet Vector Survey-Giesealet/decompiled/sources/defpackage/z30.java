package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class z30 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(z30.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(z30.class, "_state$volatile");
    public static final op g = new op("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    public z30(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            g8.s("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        g8.s("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                z30 z30Var = this;
                if (f.compareAndSet(z30Var, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    z30 z30Var2 = z30Var;
                    while ((atomicLongFieldUpdater.get(z30Var2) & 1152921504606846976L) != 0) {
                        z30Var2 = z30Var2.c();
                        AtomicReferenceArray atomicReferenceArray2 = z30Var2.d;
                        int i4 = z30Var2.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof y30) && ((y30) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            z30Var2 = null;
                        }
                        if (z30Var2 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = z30Var;
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            z30 z30Var = this;
            if (atomicLongFieldUpdater.compareAndSet(z30Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = z30Var;
        }
    }

    public final z30 c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        z30 z30Var;
        while (true) {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                z30Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            z30Var = this;
            if (atomicLongFieldUpdater.compareAndSet(z30Var, j, j2)) {
                j = j2;
                break;
            }
            this = z30Var;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            z30 z30Var2 = (z30) atomicReferenceFieldUpdater.get(z30Var);
            if (z30Var2 != null) {
                return z30Var2;
            }
            z30 z30Var3 = new z30(z30Var.a * 2, z30Var.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = z30Var.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = z30Var.d.get(i4);
                if (obj == null) {
                    obj = new y30(i);
                }
                z30Var3.d.set(z30Var3.c & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(z30Var3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(z30Var, null, z30Var3) && atomicReferenceFieldUpdater.get(z30Var) == null) {
            }
        }
    }

    public final Object d() {
        z30 z30Var = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(z30Var);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = z30Var.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = z30Var.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = z30Var.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof y30) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (f.compareAndSet(z30Var, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                z30Var = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(z30Var);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            z30Var = z30Var.c();
                        } else {
                            z30 z30Var2 = z30Var;
                            if (f.compareAndSet(z30Var2, j3, (j3 & (-1073741824)) | j2)) {
                                z30Var2.d.set(i4 & z30Var2.c, null);
                                z30Var = null;
                            } else {
                                z30Var = z30Var2;
                            }
                        }
                        if (z30Var == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
