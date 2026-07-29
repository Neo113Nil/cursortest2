package o;

import android.app.Dialog;
import android.view.View;

/* renamed from: o.ui, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2041ui extends AbstractC1305jX {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ AbstractComponentCallbacksC0069Co s;

    public C2041ui(DialogInterfaceOnCancelListenerC2107vi dialogInterfaceOnCancelListenerC2107vi, C2041ui c2041ui) {
        this.s = dialogInterfaceOnCancelListenerC2107vi;
    }

    @Override // o.AbstractC1305jX
    public final View C(int i) {
        switch (this.r) {
            case 0:
                Dialog dialog = ((DialogInterfaceOnCancelListenerC2107vi) this.s).i0;
                if (dialog != null) {
                    return dialog.findViewById(i);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + this.s + " does not have a view");
        }
    }

    @Override // o.AbstractC1305jX
    public final boolean D() {
        switch (this.r) {
            case 0:
                return ((DialogInterfaceOnCancelListenerC2107vi) this.s).m0;
            default:
                return false;
        }
    }

    public C2041ui(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        this.s = abstractComponentCallbacksC0069Co;
    }
}
