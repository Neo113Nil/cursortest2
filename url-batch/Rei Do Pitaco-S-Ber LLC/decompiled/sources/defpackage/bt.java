package defpackage;

import android.widget.PopupWindow;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class bt implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ct f;

    public bt(ct ctVar) {
        this.f = ctVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f.c();
    }
}
