package defpackage;

import android.view.ActionProvider;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ws implements ActionProvider.VisibilityListener {
    public j0 a;
    public final ActionProvider b;

    public ws(zs zsVar, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        j0 j0Var = this.a;
        if (j0Var != null) {
            ss ssVar = ((vs) j0Var.g).n;
            ssVar.h = true;
            ssVar.p(true);
        }
    }
}
