package o;

import android.widget.PopupWindow;

/* renamed from: o.pC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1680pC implements PopupWindow.OnDismissListener {
    public final /* synthetic */ C1746qC h;

    public C1680pC(C1746qC c1746qC) {
        this.h = c1746qC;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.h.c();
    }
}
