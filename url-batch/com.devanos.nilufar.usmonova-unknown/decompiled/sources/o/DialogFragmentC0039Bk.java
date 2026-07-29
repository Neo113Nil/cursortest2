package o;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: o.Bk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogFragmentC0039Bk extends DialogFragment {
    public Dialog h;
    public DialogInterface.OnCancelListener i;
    public AlertDialog j;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.i;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.h;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.j == null) {
            Activity activity = getActivity();
            AbstractC1473m3.n(activity);
            this.j = new AlertDialog.Builder(activity).create();
        }
        return this.j;
    }
}
