package defpackage;

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class hf extends m60 {
    public final /* synthetic */ ak u;
    public final /* synthetic */ jf v;

    public hf(jf jfVar, ak akVar) {
        this.v = jfVar;
        this.u = akVar;
    }

    @Override // defpackage.m60
    public final View L(int i) {
        ak akVar = this.u;
        if (akVar.M()) {
            return akVar.L(i);
        }
        Dialog dialog = this.v.h0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.m60
    public final boolean M() {
        return this.u.M() || this.v.k0;
    }
}
