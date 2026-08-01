package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jl implements ro0 {
    public final f2 a;
    public final il b = new il(this);
    public final r70 c = new r70();
    public final ce0 d;
    public final ce0 e;
    public final ce0 f;

    public jl(f2 f2Var) {
        this.a = f2Var;
        Boolean bool = Boolean.FALSE;
        this.d = ud0.o(bool);
        this.e = ud0.o(bool);
        this.f = ud0.o(bool);
    }

    @Override // defpackage.ro0
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // defpackage.ro0
    public final Object b(int i, u6 u6Var, lj ljVar) {
        Object v = x40.v(new hl(this, i, u6Var, null), ljVar);
        return v == ck.d ? v : ky0.a;
    }

    @Override // defpackage.ro0
    public final boolean c() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.ro0
    public final /* synthetic */ boolean d() {
        return true;
    }

    @Override // defpackage.ro0
    public final float e(float f) {
        return ((Number) this.a.c(Float.valueOf(f))).floatValue();
    }
}
