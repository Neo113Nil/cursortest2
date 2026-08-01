package X;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: X.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0042j implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0045m f920a;

    public DialogInterfaceOnCancelListenerC0042j(DialogInterfaceOnCancelListenerC0045m dialogInterfaceOnCancelListenerC0045m) {
        this.f920a = dialogInterfaceOnCancelListenerC0045m;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0045m dialogInterfaceOnCancelListenerC0045m = this.f920a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0045m.f933c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0045m.onCancel(dialog);
        }
    }
}
