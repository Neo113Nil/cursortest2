package Y;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: Y.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0042j implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0045m f1073a;

    public DialogInterfaceOnCancelListenerC0042j(DialogInterfaceOnCancelListenerC0045m dialogInterfaceOnCancelListenerC0045m) {
        this.f1073a = dialogInterfaceOnCancelListenerC0045m;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0045m dialogInterfaceOnCancelListenerC0045m = this.f1073a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0045m.f1086c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0045m.onCancel(dialog);
        }
    }
}
