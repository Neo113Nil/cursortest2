package Y;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: Y.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0048j implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0051m f1454a;

    public DialogInterfaceOnCancelListenerC0048j(DialogInterfaceOnCancelListenerC0051m dialogInterfaceOnCancelListenerC0051m) {
        this.f1454a = dialogInterfaceOnCancelListenerC0051m;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0051m dialogInterfaceOnCancelListenerC0051m = this.f1454a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0051m.f1467c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0051m.onCancel(dialog);
        }
    }
}
