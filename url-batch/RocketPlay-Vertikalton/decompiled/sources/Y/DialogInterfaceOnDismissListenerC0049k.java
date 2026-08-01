package Y;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: Y.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0049k implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0051m f1455a;

    public DialogInterfaceOnDismissListenerC0049k(DialogInterfaceOnCancelListenerC0051m dialogInterfaceOnCancelListenerC0051m) {
        this.f1455a = dialogInterfaceOnCancelListenerC0051m;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0051m dialogInterfaceOnCancelListenerC0051m = this.f1455a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0051m.f1467c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0051m.onDismiss(dialog);
        }
    }
}
