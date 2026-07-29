package o;

/* renamed from: o.Zo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0666Zo implements XZ {
    public final /* synthetic */ int a;

    public /* synthetic */ C0666Zo(int i) {
        this.a = i;
    }

    @Override // o.XZ
    public final UZ a(Class cls) {
        switch (this.a) {
            case 0:
                return new C0733ap(true);
            case 1:
                if (cls.isAssignableFrom(C1456lq.class)) {
                    return new C1456lq((C2356zT) UQ.i.getValue(), (C4) UQ.g.getValue(), (C0274Kl) UQ.j.getValue());
                }
                throw new IllegalArgumentException("Unknown ViewModel: ".concat(cls.getName()));
            default:
                return new BA();
        }
    }
}
