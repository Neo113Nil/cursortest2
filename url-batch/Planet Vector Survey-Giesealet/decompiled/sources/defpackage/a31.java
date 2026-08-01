package defpackage;

import com.vectorharbor.planetvectorsurvey.R;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class a31 implements uh, m20 {
    public final f3 d;
    public final bi e;
    public boolean f;
    public g20 g;
    public qu h = mg.a;

    public a31(f3 f3Var, bi biVar) {
        this.d = f3Var;
        this.e = biVar;
    }

    @Override // defpackage.m20
    public final void g(o20 o20Var, e20 e20Var) {
        if (e20Var == e20.ON_DESTROY) {
            h();
        } else {
            if (e20Var != e20.ON_CREATE || this.f) {
                return;
            }
            i(this.h);
        }
    }

    public final void h() {
        if (!this.f) {
            this.f = true;
            this.d.getView().setTag(R.id.wrapped_composition_tag, null);
            g20 g20Var = this.g;
            if (g20Var != null) {
                g20Var.b(this);
            }
        }
        bi biVar = this.e;
        synchronized (biVar.g) {
            try {
                if (biVar.w.E) {
                    gh0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (biVar.x != 3) {
                    biVar.x = 3;
                    eg egVar = jg.b;
                    rc rcVar = biVar.w.K;
                    if (rcVar != null) {
                        biVar.e(rcVar);
                    }
                    boolean z = biVar.i.e > 0;
                    if (z || !biVar.h.d.g()) {
                        ca0 ca0Var = biVar.v;
                        try {
                            ca0Var.i(biVar.h, biVar.w.y());
                            if (z) {
                                mr0 d = biVar.i.d();
                                try {
                                    th.f(d, biVar.v);
                                    d.e(true);
                                    biVar.e.j();
                                    biVar.e.v();
                                    ca0Var.f();
                                } catch (Throwable th) {
                                    d.e(false);
                                    throw th;
                                }
                            }
                            ca0Var.e();
                            ca0Var.b();
                        } catch (Throwable th2) {
                            ca0Var.b();
                            throw th2;
                        }
                    }
                    biVar.w.n();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        biVar.d.q(biVar);
    }

    public final void i(qu quVar) {
        this.d.setOnViewTreeOwnersAvailable(new y3(25, this, quVar));
    }
}
