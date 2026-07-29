package o;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: o.Pa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0392Pa extends AbstractC1760qQ {
    public final J8 e;
    public final /* synthetic */ AtomicReferenceArray f;

    public C0392Pa(long j, C0392Pa c0392Pa, J8 j8, int i) {
        super(j, c0392Pa, i);
        this.e = j8;
        this.f = new AtomicReferenceArray(L8.b * 2);
    }

    @Override // o.AbstractC1760qQ
    public final int f() {
        return L8.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        o.AbstractC0048Bt.k(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // o.AbstractC1760qQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, InterfaceC0189He interfaceC0189He) {
        int i2 = L8.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.f.get(i * 2);
        while (true) {
            Object k = k(i);
            boolean z2 = k instanceof C00;
            J8 j8 = this.e;
            if (z2 || (k instanceof D00)) {
                if (j(k, i, z ? L8.j : L8.k)) {
                    m(i, null);
                    l(i, !z);
                    if (z) {
                        AbstractC0048Bt.k(j8);
                        return;
                    }
                    return;
                }
            } else {
                if (k == L8.j || k == L8.k) {
                    break;
                }
                if (k != L8.g && k != L8.f) {
                    if (k == L8.i || k == L8.d || k == L8.l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k).toString());
                }
            }
        }
    }

    public final boolean j(Object obj, int i, Object obj2) {
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
            J8 j8 = this.e;
            AbstractC0048Bt.k(j8);
            j8.E((this.c * L8.b) + i);
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
