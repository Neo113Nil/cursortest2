package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ff implements DialogInterface.OnCancelListener {
    public final /* synthetic */ jf f;

    public ff(jf jfVar) {
        this.f = jfVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        jf jfVar = this.f;
        Dialog dialog = jfVar.h0;
        if (dialog != null) {
            jfVar.onCancel(dialog);
        }
    }
}
