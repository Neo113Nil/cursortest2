package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class qa implements ma {
    public final /* synthetic */ nl d;

    public qa(nl nlVar) {
        this.d = nlVar;
    }

    @Override // defpackage.ma
    public final Object T(ea0 ea0Var, bu buVar, fu0 fu0Var) {
        nl nlVar = this.d;
        if (!((t50) nlVar).d.q) {
            cy.b("Cannot get View because the Modifier node is not currently attached.");
        }
        View view = (View) mz.Q(nz.a0(nlVar));
        long F0 = ea0Var.F0(0L);
        zi0 zi0Var = (zi0) buVar.a();
        zi0 e = zi0Var != null ? zi0Var.e(F0) : null;
        if (e != null) {
            view.requestRectangleOnScreen(new Rect((int) e.a, (int) e.b, (int) e.c, (int) e.d), false);
        }
        return ky0.a;
    }
}
