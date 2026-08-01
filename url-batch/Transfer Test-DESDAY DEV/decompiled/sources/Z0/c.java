package Z0;

import X0.i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o1.A;
import o1.C0288e;
import o1.Y;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public final i f1176b;

    /* renamed from: c, reason: collision with root package name */
    public transient X0.d f1177c;

    public c(X0.d dVar, i iVar) {
        super(dVar);
        this.f1176b = iVar;
    }

    @Override // X0.d
    public final i h() {
        i iVar = this.f1176b;
        g1.f.b(iVar);
        return iVar;
    }

    @Override // Z0.a
    public final void j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        X0.d dVar = this.f1177c;
        if (dVar != null && dVar != this) {
            i iVar = this.f1176b;
            g1.f.b(iVar);
            X0.g j2 = iVar.j(X0.e.f935a);
            g1.f.b(j2);
            s1.f fVar = (s1.f) dVar;
            do {
                atomicReferenceFieldUpdater = s1.f.h;
            } while (atomicReferenceFieldUpdater.get(fVar) == s1.a.f3689c);
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            C0288e c0288e = obj instanceof C0288e ? (C0288e) obj : null;
            if (c0288e != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0288e.h;
                A a2 = (A) atomicReferenceFieldUpdater2.get(c0288e);
                if (a2 != null) {
                    a2.e();
                    atomicReferenceFieldUpdater2.set(c0288e, Y.f3303a);
                }
            }
        }
        this.f1177c = b.f1175a;
    }
}
