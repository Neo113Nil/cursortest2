package Y;

import android.app.Dialog;
import android.view.View;

/* renamed from: Y.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044l extends T.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0047o f1075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0045m f1076b;

    public C0044l(DialogInterfaceOnCancelListenerC0045m dialogInterfaceOnCancelListenerC0045m, C0047o c0047o) {
        this.f1076b = dialogInterfaceOnCancelListenerC0045m;
        this.f1075a = c0047o;
    }

    @Override // T.e
    public final View H(int i) {
        C0047o c0047o = this.f1075a;
        if (c0047o.I()) {
            return c0047o.H(i);
        }
        Dialog dialog = this.f1076b.f1086c0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // T.e
    public final boolean I() {
        return this.f1075a.I() || this.f1076b.f1089f0;
    }
}
