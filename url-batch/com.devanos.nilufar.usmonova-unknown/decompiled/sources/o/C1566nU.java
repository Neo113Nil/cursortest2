package o;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: o.nU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1566nU extends DialogInterfaceOnCancelListenerC2107vi {
    public Dialog n0;
    public DialogInterface.OnCancelListener o0;
    public AlertDialog p0;

    @Override // o.DialogInterfaceOnCancelListenerC2107vi, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.o0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // o.DialogInterfaceOnCancelListenerC2107vi
    public final Dialog w() {
        Dialog dialog = this.n0;
        if (dialog != null) {
            return dialog;
        }
        this.e0 = false;
        if (this.p0 == null) {
            C0173Go c0173Go = this.A;
            J4 j4 = c0173Go == null ? null : c0173Go.s;
            AbstractC1473m3.n(j4);
            this.p0 = new AlertDialog.Builder(j4).create();
        }
        return this.p0;
    }
}
