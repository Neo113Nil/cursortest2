package o;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: o.ti, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC1975ti implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC2107vi h;

    public DialogInterfaceOnDismissListenerC1975ti(DialogInterfaceOnCancelListenerC2107vi dialogInterfaceOnCancelListenerC2107vi) {
        this.h = dialogInterfaceOnCancelListenerC2107vi;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC2107vi dialogInterfaceOnCancelListenerC2107vi = this.h;
        Dialog dialog = dialogInterfaceOnCancelListenerC2107vi.i0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC2107vi.onDismiss(dialog);
        }
    }
}
