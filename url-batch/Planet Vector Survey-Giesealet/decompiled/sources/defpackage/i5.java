package defpackage;

import android.view.ViewGroup;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class i5 implements ck0, ll0, sx {
    public final boolean d;
    public final w4 e;
    public final boolean f;
    public final float g;
    public final f70 h;
    public final f70 i;
    public final ViewGroup j;
    public kl0 k;
    public final ce0 l = ud0.o(null);
    public final ce0 m = ud0.o(Boolean.TRUE);
    public long n = 0;
    public int o = -1;
    public final b p = new b(1, this);

    public i5(boolean z, float f, f70 f70Var, f70 f70Var2, ViewGroup viewGroup) {
        this.d = z;
        this.e = new w4(z, new b(17, f70Var2));
        this.f = z;
        this.g = f;
        this.h = f70Var;
        this.i = f70Var2;
        this.j = viewGroup;
    }

    @Override // defpackage.ll0
    public final void N() {
        this.l.setValue(null);
    }

    @Override // defpackage.ck0
    public final void d() {
        kl0 kl0Var = this.k;
        if (kl0Var != null) {
            N();
            j3 j3Var = kl0Var.g;
            ml0 ml0Var = (ml0) ((LinkedHashMap) j3Var.e).get(this);
            if (ml0Var != null) {
                ml0Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) j3Var.e;
                ml0 ml0Var2 = (ml0) linkedHashMap.get(this);
                if (ml0Var2 != null) {
                }
                linkedHashMap.remove(this);
                kl0Var.f.add(ml0Var);
            }
        }
    }

    @Override // defpackage.sx
    public final void e(r10 r10Var) {
        nc ncVar = r10Var.d;
        this.n = ncVar.e.r();
        float f = this.g;
        this.o = Float.isNaN(f) ? a50.H(yc0.f(r10Var, this.f, ncVar.e.r())) : r10Var.y(f);
        long j = ((ge) this.h.getValue()).a;
        float f2 = ((el0) this.i.getValue()).d;
        r10Var.b();
        this.e.c(r10Var, Float.isNaN(f) ? yc0.f(r10Var, this.d, r10Var.c()) : r10Var.o(f), j);
        kc p = ncVar.e.p();
        ((Boolean) this.m.getValue()).booleanValue();
        ml0 ml0Var = (ml0) this.l.getValue();
        if (ml0Var != null) {
            ml0Var.e(f2, ncVar.e.r(), j);
            ml0Var.draw(p2.a(p));
        }
    }

    @Override // defpackage.ck0
    public final void j() {
        kl0 kl0Var = this.k;
        if (kl0Var != null) {
            N();
            j3 j3Var = kl0Var.g;
            ml0 ml0Var = (ml0) ((LinkedHashMap) j3Var.e).get(this);
            if (ml0Var != null) {
                ml0Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) j3Var.e;
                ml0 ml0Var2 = (ml0) linkedHashMap.get(this);
                if (ml0Var2 != null) {
                }
                linkedHashMap.remove(this);
                kl0Var.f.add(ml0Var);
            }
        }
    }

    @Override // defpackage.ck0
    public final void c() {
    }
}
