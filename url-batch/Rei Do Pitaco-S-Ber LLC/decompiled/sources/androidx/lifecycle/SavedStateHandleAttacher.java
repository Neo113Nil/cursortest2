package androidx.lifecycle;

import android.os.Bundle;
import defpackage.fp;
import defpackage.jp;
import defpackage.l8;
import defpackage.lp;
import defpackage.s00;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements jp {
    public final s00 a;

    public SavedStateHandleAttacher(s00 s00Var) {
        this.a = s00Var;
    }

    @Override // defpackage.jp
    public final void b(lp lpVar, fp fpVar) {
        if (fpVar != fp.ON_CREATE) {
            l8.t(fpVar, "Next event must be ON_CREATE, it was ");
            return;
        }
        lpVar.e().f(this);
        s00 s00Var = this.a;
        if (s00Var.b) {
            return;
        }
        Bundle c = s00Var.a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = s00Var.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (c != null) {
            bundle.putAll(c);
        }
        s00Var.c = bundle;
        s00Var.b = true;
    }
}
