package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ho0 implements ro0 {
    public static final j3 i = new j3(12, h6.p, j80.y);
    public final zd0 a;
    public float e;
    public final zd0 b = new zd0(0);
    public final r60 c = new r60();
    public final zd0 d = new zd0(Integer.MAX_VALUE);
    public final jl f = new jl(new f2(19, this));
    public final yl g = ud0.i(new go0(this, 1));
    public final yl h = ud0.i(new go0(this, 0));

    public ho0(int i2) {
        this.a = new zd0(i2);
    }

    @Override // defpackage.ro0
    public final boolean a() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.ro0
    public final Object b(int i2, u6 u6Var, lj ljVar) {
        Object b = this.f.b(i2, u6Var, ljVar);
        return b == ck.d ? b : ky0.a;
    }

    @Override // defpackage.ro0
    public final boolean c() {
        return this.f.c();
    }

    @Override // defpackage.ro0
    public final boolean d() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    @Override // defpackage.ro0
    public final float e(float f) {
        return this.f.e(f);
    }
}
