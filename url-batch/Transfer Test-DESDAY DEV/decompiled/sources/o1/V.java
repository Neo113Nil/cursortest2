package o1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class V extends s1.b {

    /* renamed from: b, reason: collision with root package name */
    public final S f3298b;

    /* renamed from: c, reason: collision with root package name */
    public X f3299c;
    public final /* synthetic */ W d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f3300e;

    public V(S s2, W w2, L l2) {
        this.d = w2;
        this.f3300e = l2;
        this.f3298b = s2;
    }

    @Override // s1.b
    public final void b(Object obj, Object obj2) {
        s1.i iVar = (s1.i) obj;
        boolean z2 = obj2 == null;
        S s2 = this.f3298b;
        L l2 = z2 ? s2 : this.f3299c;
        if (l2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s1.i.f3703a;
            while (!atomicReferenceFieldUpdater.compareAndSet(iVar, this, l2)) {
                if (atomicReferenceFieldUpdater.get(iVar) != this) {
                    return;
                }
            }
            if (z2) {
                X x2 = this.f3299c;
                g1.f.b(x2);
                s2.j(x2);
            }
        }
    }

    @Override // s1.b
    public final U.q c(Object obj) {
        if (this.d.w() == this.f3300e) {
            return null;
        }
        return s1.a.d;
    }
}
