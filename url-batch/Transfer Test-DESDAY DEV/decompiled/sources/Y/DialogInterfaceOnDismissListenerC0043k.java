package Y;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: Y.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0043k implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0045m f1074a;

    public DialogInterfaceOnDismissListenerC0043k(DialogInterfaceOnCancelListenerC0045m dialogInterfaceOnCancelListenerC0045m) {
        this.f1074a = dialogInterfaceOnCancelListenerC0045m;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0045m dialogInterfaceOnCancelListenerC0045m = this.f1074a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0045m.f1086c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0045m.onDismiss(dialog);
        }
    }
}
