package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class sa0 implements u7, kz0 {
    public final int d;
    public int e;
    public final Object f;

    public sa0(int i, int i2, ro roVar) {
        this.d = i;
        this.e = i2;
        this.f = new k2((lr) new nr(i, i2, roVar));
    }

    @Override // defpackage.jz0
    public /* synthetic */ boolean a() {
        return false;
    }

    @Override // defpackage.u7
    public void b(int i, Object obj) {
        ((u7) this.f).b(i + (this.e == 0 ? this.d : 0), obj);
    }

    @Override // defpackage.u7
    public void c(Object obj) {
        this.e++;
        ((u7) this.f).c(obj);
    }

    @Override // defpackage.u7
    public void d() {
        ((u7) this.f).d();
    }

    @Override // defpackage.u7
    public void e(int i, Object obj) {
        ((u7) this.f).e(i + (this.e == 0 ? this.d : 0), obj);
    }

    @Override // defpackage.u7
    public void f(int i, int i2, int i3) {
        int i4 = this.e == 0 ? this.d : 0;
        ((u7) this.f).f(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.jz0
    public i7 g(long j, i7 i7Var, i7 i7Var2, i7 i7Var3) {
        return ((k2) this.f).g(j, i7Var, i7Var2, i7Var3);
    }

    @Override // defpackage.u7
    public void h(int i, int i2) {
        ((u7) this.f).h(i + (this.e == 0 ? this.d : 0), i2);
    }

    @Override // defpackage.u7
    public void i(qu quVar, Object obj) {
        ((u7) this.f).i(quVar, obj);
    }

    @Override // defpackage.jz0
    public i7 j(long j, i7 i7Var, i7 i7Var2, i7 i7Var3) {
        return ((k2) this.f).j(j, i7Var, i7Var2, i7Var3);
    }

    @Override // defpackage.jz0
    public i7 k(i7 i7Var, i7 i7Var2, i7 i7Var3) {
        return g(m(i7Var, i7Var2, i7Var3), i7Var, i7Var2, i7Var3);
    }

    @Override // defpackage.u7
    public void l() {
        if (this.e <= 0) {
            th.c("OffsetApplier up called with no corresponding down");
        }
        this.e--;
        ((u7) this.f).l();
    }

    @Override // defpackage.jz0
    public long m(i7 i7Var, i7 i7Var2, i7 i7Var3) {
        return (this.e + this.d) * 1000000;
    }

    public sa0(u7 u7Var, int i) {
        this.f = u7Var;
        this.d = i;
    }
}
