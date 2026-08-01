package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ed extends kp0 {
    public final eb e;
    public final /* synthetic */ AtomicReferenceArray f;

    public ed(long j, ed edVar, eb ebVar, int i) {
        super(j, edVar, i);
        this.e = ebVar;
        this.f = new AtomicReferenceArray(gb.b * 2);
    }

    @Override // defpackage.kp0
    public final int f() {
        return gb.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0047, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // defpackage.kp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, rj rjVar) {
        int i2 = gb.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.f.get(i * 2);
        while (true) {
            Object k = k(i);
            boolean z2 = k instanceof u01;
            eb ebVar = this.e;
            if (z2 || (k instanceof v01)) {
                if (j(i, k, z ? gb.j : gb.k)) {
                    m(i, null);
                    l(i, !z);
                    if (z) {
                        ebVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (k == gb.j || k == gb.k) {
                    break;
                }
                if (k != gb.g && k != gb.f) {
                    if (k == gb.i || k == gb.d || k == gb.l) {
                        return;
                    }
                    g8.d(k, "unexpected state: ");
                    return;
                }
            }
        }
    }

    public final boolean j(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object k(int i) {
        return this.f.get((i * 2) + 1);
    }

    public final void l(int i, boolean z) {
        if (z) {
            eb ebVar = this.e;
            ebVar.getClass();
            ebVar.E((this.c * gb.b) + i);
        }
        h();
    }

    public final void m(int i, Object obj) {
        this.f.set(i * 2, obj);
    }

    public final void n(int i, Object obj) {
        this.f.set((i * 2) + 1, obj);
    }
}
