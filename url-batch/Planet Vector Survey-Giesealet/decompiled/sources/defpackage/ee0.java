package defpackage;

import android.graphics.Path;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ee0 extends wy0 {
    public px0 b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public px0 g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public ut0 q;
    public final e5 r;
    public e5 s;
    public final u10 t;

    public ee0() {
        int i = fz0.a;
        this.d = wp.d;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        e5 a = g5.a();
        this.r = a;
        this.s = a;
        this.t = x40.H(w10.d, gi.t);
    }

    @Override // defpackage.wy0
    public final void a(oo ooVar) {
        oo ooVar2;
        ut0 ut0Var;
        if (this.n) {
            ze0.t(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        px0 px0Var = this.b;
        if (px0Var != null) {
            ooVar2 = ooVar;
            y6.o(ooVar2, this.s, px0Var, this.c, null, 56);
        } else {
            ooVar2 = ooVar;
        }
        px0 px0Var2 = this.g;
        if (px0Var2 != null) {
            ut0 ut0Var2 = this.q;
            if (this.o || ut0Var2 == null) {
                ut0 ut0Var3 = new ut0(this.f, this.j, this.h, this.i, 16);
                this.q = ut0Var3;
                this.o = false;
                ut0Var = ut0Var3;
            } else {
                ut0Var = ut0Var2;
            }
            y6.o(ooVar2, this.s, px0Var2, this.e, ut0Var, 48);
        }
    }

    public final void e() {
        float f = this.k;
        e5 e5Var = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = e5Var;
            return;
        }
        if (nz.l(this.s, e5Var)) {
            this.s = g5.a();
        } else {
            Path.FillType fillType = this.s.a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.s.a.rewind();
            Path path = this.s.a;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        u10 u10Var = this.t;
        ((f5) u10Var.getValue()).a.setPath(e5Var != null ? e5Var.a : null, false);
        float length = ((f5) u10Var.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((f5) u10Var.getValue()).a(f4, f5, this.s);
        } else {
            ((f5) u10Var.getValue()).a(f4, length, this.s);
            ((f5) u10Var.getValue()).a(0.0f, f5, this.s);
        }
    }

    public final String toString() {
        return this.r.toString();
    }
}
