package Y;

import android.app.Dialog;
import android.view.View;

/* renamed from: Y.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050l extends F1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0053o f1456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0051m f1457b;

    public C0050l(DialogInterfaceOnCancelListenerC0051m dialogInterfaceOnCancelListenerC0051m, C0053o c0053o) {
        this.f1457b = dialogInterfaceOnCancelListenerC0051m;
        this.f1456a = c0053o;
    }

    @Override // F1.d
    public final View T(int i) {
        C0053o c0053o = this.f1456a;
        if (c0053o.W()) {
            return c0053o.T(i);
        }
        Dialog dialog = this.f1457b.f1467c0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // F1.d
    public final boolean W() {
        return this.f1456a.W() || this.f1457b.f1470f0;
    }
}
