package o;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: o.si, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC1909si implements DialogInterface.OnCancelListener {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC2107vi h;

    public DialogInterfaceOnCancelListenerC1909si(DialogInterfaceOnCancelListenerC2107vi dialogInterfaceOnCancelListenerC2107vi) {
        this.h = dialogInterfaceOnCancelListenerC2107vi;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC2107vi dialogInterfaceOnCancelListenerC2107vi = this.h;
        Dialog dialog = dialogInterfaceOnCancelListenerC2107vi.i0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC2107vi.onCancel(dialog);
        }
    }
}
