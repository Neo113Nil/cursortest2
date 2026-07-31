package yads;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes6.dex */
public final class ug0 implements fz {
    public Dialog a;

    public final void a(Dialog dialog) {
        this.a = dialog;
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: yads.ug0$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ug0.a(ug0.this, dialogInterface);
            }
        });
    }

    @Override // yads.fz
    public final void e() {
        Dialog dialog = this.a;
        if (dialog != null) {
            vg0.a(dialog);
        }
    }

    public static final void a(ug0 ug0Var, DialogInterface dialogInterface) {
        Dialog dialog = ug0Var.a;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
        }
        ug0Var.a = null;
    }
}
