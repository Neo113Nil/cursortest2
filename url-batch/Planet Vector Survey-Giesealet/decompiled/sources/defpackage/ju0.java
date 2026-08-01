package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ju0 implements sl, kj {
    public final /* synthetic */ ku0 d;
    public final hc e;
    public hc f;
    public sg0 g = sg0.e;
    public final up h = up.d;
    public final /* synthetic */ ku0 i;

    public ju0(ku0 ku0Var, hc hcVar) {
        this.i = ku0Var;
        this.d = ku0Var;
        this.e = hcVar;
    }

    @Override // defpackage.sl
    public final long G(long j) {
        ku0 ku0Var = this.d;
        ku0Var.getClass();
        return y6.g(j, ku0Var);
    }

    @Override // defpackage.sl
    public final float I(long j) {
        ku0 ku0Var = this.d;
        ku0Var.getClass();
        return y6.f(j, ku0Var);
    }

    @Override // defpackage.sl
    public final long P(float f) {
        return this.d.P(f);
    }

    @Override // defpackage.sl
    public final float a() {
        return this.d.a();
    }

    public final Object b(sg0 sg0Var, h9 h9Var) {
        hc hcVar = new hc(1, d31.B(h9Var));
        hcVar.q();
        this.g = sg0Var;
        this.f = hcVar;
        return hcVar.p();
    }

    @Override // defpackage.kj
    public final rj getContext() {
        return this.h;
    }

    @Override // defpackage.sl
    public final float h() {
        return this.d.h();
    }

    @Override // defpackage.sl
    public final float o(float f) {
        return this.d.a() * f;
    }

    @Override // defpackage.kj
    public final void resumeWith(Object obj) {
        ku0 ku0Var = this.i;
        synchronized (ku0Var.y) {
            ku0Var.x.i(this);
        }
        this.e.resumeWith(obj);
    }

    @Override // defpackage.sl
    public final float t(long j) {
        ku0 ku0Var = this.d;
        ku0Var.getClass();
        return y6.e(j, ku0Var);
    }

    @Override // defpackage.sl
    public final int y(float f) {
        ku0 ku0Var = this.d;
        ku0Var.getClass();
        return y6.c(f, ku0Var);
    }
}
