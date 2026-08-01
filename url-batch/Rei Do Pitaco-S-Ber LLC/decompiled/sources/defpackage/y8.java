package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class y8 extends oo {
    public final Typeface o;
    public final j0 p;
    public boolean q;

    public y8(j0 j0Var, Typeface typeface) {
        this.o = typeface;
        this.p = j0Var;
    }

    @Override // defpackage.oo
    public final void B(int i) {
        if (this.q) {
            return;
        }
        ta taVar = (ta) this.p.g;
        if (taVar.l(this.o)) {
            taVar.j(false);
        }
    }

    @Override // defpackage.oo
    public final void D(Typeface typeface, boolean z) {
        if (this.q) {
            return;
        }
        ta taVar = (ta) this.p.g;
        if (taVar.l(typeface)) {
            taVar.j(false);
        }
    }
}
