package defpackage;

import android.content.Context;
import android.view.View;
import com.ionia.reidopitaco.libya.R;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class e1 extends ct {
    public final /* synthetic */ int m = 1;
    public final /* synthetic */ k1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(k1 k1Var, Context context, v30 v30Var, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, v30Var, context, view, false);
        this.n = k1Var;
        if ((v30Var.A.x & 32) != 32) {
            View view2 = k1Var.o;
            this.f = view2 == null ? (View) k1Var.m : view2;
        }
        j0 j0Var = k1Var.C;
        this.i = j0Var;
        at atVar = this.j;
        if (atVar != null) {
            atVar.f(j0Var);
        }
    }

    @Override // defpackage.ct
    public final void c() {
        int i = this.m;
        k1 k1Var = this.n;
        switch (i) {
            case 0:
                k1Var.z = null;
                k1Var.D = 0;
                super.c();
                break;
            default:
                ss ssVar = k1Var.h;
                if (ssVar != null) {
                    ssVar.c(true);
                }
                k1Var.y = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(k1 k1Var, Context context, ss ssVar, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, ssVar, context, view, true);
        this.n = k1Var;
        this.g = 8388613;
        j0 j0Var = k1Var.C;
        this.i = j0Var;
        at atVar = this.j;
        if (atVar != null) {
            atVar.f(j0Var);
        }
    }
}
