package X;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: X.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0043k implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0045m f921a;

    public DialogInterfaceOnDismissListenerC0043k(DialogInterfaceOnCancelListenerC0045m dialogInterfaceOnCancelListenerC0045m) {
        this.f921a = dialogInterfaceOnCancelListenerC0045m;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0045m dialogInterfaceOnCancelListenerC0045m = this.f921a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0045m.f933c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0045m.onDismiss(dialog);
        }
    }
}
