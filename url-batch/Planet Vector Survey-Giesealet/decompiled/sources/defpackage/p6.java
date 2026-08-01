package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class p6 implements yw0 {
    public final cx0 a;
    public o9 b;
    public final ce0 c = ud0.o(new iz(0));
    public final a70 d;

    public p6(cx0 cx0Var, o9 o9Var) {
        this.a = cx0Var;
        this.b = o9Var;
        long[] jArr = vn0.a;
        this.d = new a70();
    }

    @Override // defpackage.yw0
    public final boolean a(cq cqVar, cq cqVar2) {
        return cqVar.equals(b()) && cqVar2.equals(c());
    }

    @Override // defpackage.yw0
    public final Object b() {
        return this.a.f().b();
    }

    @Override // defpackage.yw0
    public final Object c() {
        return this.a.f().c();
    }
}
