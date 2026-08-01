package X;

import android.app.Dialog;
import android.view.View;

/* renamed from: X.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044l extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0047o f922e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0045m f923f;

    public C0044l(DialogInterfaceOnCancelListenerC0045m dialogInterfaceOnCancelListenerC0045m, C0047o c0047o) {
        this.f923f = dialogInterfaceOnCancelListenerC0045m;
        this.f922e = c0047o;
    }

    @Override // q1.d
    public final View c0(int i) {
        C0047o c0047o = this.f922e;
        if (c0047o.d0()) {
            return c0047o.c0(i);
        }
        Dialog dialog = this.f923f.f933c0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // q1.d
    public final boolean d0() {
        return this.f922e.d0() || this.f923f.f936f0;
    }
}
