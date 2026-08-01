package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class l5 extends TextPaint {
    public y4 a;
    public gv0 b;
    public int c;
    public pq0 d;
    public ge e;
    public px0 f;
    public yl g;
    public fr0 h;
    public nz i;

    public final y4 a() {
        y4 y4Var = this.a;
        if (y4Var != null) {
            return y4Var;
        }
        y4 y4Var2 = new y4(this);
        this.a = y4Var2;
        return y4Var2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().d(i);
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if ((r1 == null ? false : defpackage.fr0.b(r1.a, r7)) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final px0 px0Var, final long j, float f) {
        if (px0Var == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (px0Var instanceof ks0) {
            d(ld0.n(((ks0) px0Var).k, f));
            return;
        }
        if (!(px0Var instanceof nq0)) {
            g8.c();
            return;
        }
        if (nz.l(this.f, px0Var)) {
            fr0 fr0Var = this.h;
        }
        if (j != 9205357640488583168L) {
            this.f = px0Var;
            this.h = new fr0(j);
            this.g = ud0.i(new bu() { // from class: k5
                @Override // defpackage.bu
                public final Object a() {
                    return ((nq0) px0.this).Y(j);
                }
            });
        }
        y4 a = a();
        yl ylVar = this.g;
        a.g(ylVar != null ? (Shader) ylVar.getValue() : null);
        this.e = null;
        d31.H(this, f);
    }

    public final void d(long j) {
        ge geVar = this.e;
        if (geVar == null ? false : ge.c(geVar.a, j)) {
            return;
        }
        if (j != 16) {
            this.e = new ge(j);
            setColor(d31.I(j));
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
        }
    }

    public final void e(nz nzVar) {
        if (nzVar == null || nz.l(this.i, nzVar)) {
            return;
        }
        this.i = nzVar;
        if (nzVar.equals(ar.o)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(nzVar instanceof ut0)) {
            g8.c();
            return;
        }
        a().j(1);
        y4 a = a();
        ut0 ut0Var = (ut0) nzVar;
        a.a.setStrokeWidth(ut0Var.o);
        y4 a2 = a();
        a2.a.setStrokeMiter(ut0Var.p);
        a().i(ut0Var.r);
        a().h(ut0Var.q);
        a().a.setPathEffect(null);
    }

    public final void f(pq0 pq0Var) {
        if (pq0Var == null || nz.l(this.d, pq0Var)) {
            return;
        }
        this.d = pq0Var;
        if (pq0Var.equals(pq0.d)) {
            clearShadowLayer();
            return;
        }
        pq0 pq0Var2 = this.d;
        float f = pq0Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (pq0Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), d31.I(this.d.a));
    }

    public final void g(gv0 gv0Var) {
        if (gv0Var == null || nz.l(this.b, gv0Var)) {
            return;
        }
        this.b = gv0Var;
        int i = gv0Var.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
