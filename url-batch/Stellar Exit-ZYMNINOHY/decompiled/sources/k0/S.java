package k0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p0.AbstractC0090a;

/* loaded from: classes.dex */
public final class S extends p0.b {

    /* renamed from: b, reason: collision with root package name */
    public final O f846b;

    /* renamed from: c, reason: collision with root package name */
    public U f847c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ T f848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H f849e;

    public S(O o2, T t2, H h2) {
        this.f848d = t2;
        this.f849e = h2;
        this.f846b = o2;
    }

    @Override // p0.b
    public final void b(Object obj, Object obj2) {
        p0.l lVar = (p0.l) obj;
        boolean z2 = obj2 == null;
        O o2 = this.f846b;
        Object obj3 = z2 ? o2 : this.f847c;
        if (obj3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p0.l.f1152b;
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, this, obj3)) {
                if (atomicReferenceFieldUpdater.get(lVar) != this) {
                    return;
                }
            }
            if (z2) {
                U u = this.f847c;
                e0.h.b(u);
                o2.j(u);
            }
        }
    }

    @Override // p0.b
    public final io.flutter.plugin.platform.c c(Object obj) {
        if (this.f848d.y() == this.f849e) {
            return null;
        }
        return AbstractC0090a.f1130e;
    }
}
