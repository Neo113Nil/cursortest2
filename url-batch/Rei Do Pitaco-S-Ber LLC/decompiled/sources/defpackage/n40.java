package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class n40 extends oo {
    public final /* synthetic */ oo o;
    public final /* synthetic */ p40 p;

    public n40(p40 p40Var, oo ooVar) {
        this.p = p40Var;
        this.o = ooVar;
    }

    @Override // defpackage.oo
    public final void B(int i) {
        this.p.n = true;
        this.o.B(i);
    }

    @Override // defpackage.oo
    public final void C(Typeface typeface) {
        p40 p40Var = this.p;
        Typeface create = Typeface.create(typeface, p40Var.d);
        p40Var.p = create;
        p40Var.n = true;
        this.o.D(create, false);
    }
}
