package o;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.aB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0693aB {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(C0693aB.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(C0693aB.class, "_state$volatile");
    public static final C0457Rn g = new C0457Rn("REMOVE_FROZEN", 5);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    public C0693aB(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
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
                if (f.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    C0693aB c0693aB = this;
                    while ((atomicLongFieldUpdater.get(c0693aB) & 1152921504606846976L) != 0) {
                        c0693aB = c0693aB.c();
                        AtomicReferenceArray atomicReferenceArray2 = c0693aB.d;
                        int i4 = c0693aB.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof ZA) && ((ZA) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            c0693aB = null;
                        }
                        if (c0693aB == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final C0693aB c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        C0693aB c0693aB;
        while (true) {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                c0693aB = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            c0693aB = this;
            if (atomicLongFieldUpdater.compareAndSet(c0693aB, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            C0693aB c0693aB2 = (C0693aB) atomicReferenceFieldUpdater.get(this);
            if (c0693aB2 != null) {
                return c0693aB2;
            }
            C0693aB c0693aB3 = new C0693aB(c0693aB.a * 2, c0693aB.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = c0693aB.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = c0693aB.d.get(i4);
                if (obj == null) {
                    obj = new ZA(i);
                }
                c0693aB3.d.set(c0693aB3.c & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(c0693aB3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0693aB3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        C0693aB c0693aB = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(c0693aB);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = c0693aB.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = c0693aB.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = c0693aB.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof ZA) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (f.compareAndSet(c0693aB, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                c0693aB = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(c0693aB);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            c0693aB = c0693aB.c();
                        } else {
                            C0693aB c0693aB2 = c0693aB;
                            if (f.compareAndSet(c0693aB2, j3, (j3 & (-1073741824)) | j2)) {
                                c0693aB2.d.set(i4 & c0693aB2.c, null);
                                c0693aB = null;
                            } else {
                                c0693aB = c0693aB2;
                            }
                        }
                        if (c0693aB == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
