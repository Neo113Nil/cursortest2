package q1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class T extends u1.b {

    /* renamed from: b, reason: collision with root package name */
    public final P f3879b;

    /* renamed from: c, reason: collision with root package name */
    public V f3880c;
    public final /* synthetic */ U d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ I f3881e;

    public T(P p2, U u2, I i) {
        this.d = u2;
        this.f3881e = i;
        this.f3879b = p2;
    }

    @Override // u1.b
    public final void b(Object obj, Object obj2) {
        u1.i iVar = (u1.i) obj;
        boolean z2 = obj2 == null;
        u1.i iVar2 = this.f3879b;
        u1.i iVar3 = z2 ? iVar2 : this.f3880c;
        if (iVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u1.i.f4190a;
            while (!atomicReferenceFieldUpdater.compareAndSet(iVar, this, iVar3)) {
                if (atomicReferenceFieldUpdater.get(iVar) != this) {
                    return;
                }
            }
            if (z2) {
                u1.i iVar4 = this.f3880c;
                i1.f.b(iVar4);
                iVar2.j(iVar4);
            }
        }
    }

    @Override // u1.b
    public final U.q c(Object obj) {
        if (this.d.u() == this.f3881e) {
            return null;
        }
        return u1.a.d;
    }
}
