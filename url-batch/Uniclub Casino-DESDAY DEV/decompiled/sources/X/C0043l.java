package X;

import android.app.Dialog;
import android.view.View;

/* renamed from: X.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043l extends q1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0046o f926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0044m f927b;

    public C0043l(DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m, C0046o c0046o) {
        this.f927b = dialogInterfaceOnCancelListenerC0044m;
        this.f926a = c0046o;
    }

    @Override // q1.l
    public final View c0(int i) {
        C0046o c0046o = this.f926a;
        if (c0046o.f0()) {
            return c0046o.c0(i);
        }
        Dialog dialog = this.f927b.f937c0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // q1.l
    public final boolean f0() {
        return this.f926a.f0() || this.f927b.f940f0;
    }
}
