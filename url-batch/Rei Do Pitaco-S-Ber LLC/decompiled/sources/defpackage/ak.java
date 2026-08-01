package defpackage;

import android.view.View;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ak extends m60 {
    public final /* synthetic */ dk u;

    public ak(dk dkVar) {
        this.u = dkVar;
    }

    @Override // defpackage.m60
    public final View L(int i) {
        dk dkVar = this.u;
        View view = dkVar.J;
        if (view != null) {
            return view.findViewById(i);
        }
        l8.h(dkVar, " does not have a view", "Fragment ");
        return null;
    }

    @Override // defpackage.m60
    public final boolean M() {
        return this.u.J != null;
    }
}
