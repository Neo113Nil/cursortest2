package q1;

/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0335a extends U implements Z0.d, InterfaceC0351q {

    /* renamed from: c, reason: collision with root package name */
    public final Z0.i f3885c;

    public AbstractC0335a(Z0.i iVar, boolean z2) {
        super(z2);
        x((M) iVar.f(C0350p.f3913b));
        this.f3885c = iVar.h(this);
    }

    @Override // q1.U
    public final void C(Object obj) {
        if (obj instanceof C0344j) {
            C0344j c0344j = (C0344j) obj;
            Throwable th = c0344j.f3903a;
            c0344j.getClass();
            C0344j.f3902b.get(c0344j);
        }
    }

    @Override // q1.InterfaceC0351q
    public final Z0.i b() {
        return this.f3885c;
    }

    @Override // Z0.d
    public final Z0.i getContext() {
        return this.f3885c;
    }

    @Override // q1.U
    public final String l() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // Z0.d
    public final void resumeWith(Object obj) {
        Throwable a2 = V0.f.a(obj);
        if (a2 != null) {
            obj = new C0344j(a2, false);
        }
        Object z2 = z(obj);
        if (z2 == AbstractC0352s.f3916c) {
            return;
        }
        e(z2);
    }

    @Override // q1.U
    public final void w(V0.c cVar) {
        AbstractC0352s.d(this.f3885c, cVar);
    }
}
