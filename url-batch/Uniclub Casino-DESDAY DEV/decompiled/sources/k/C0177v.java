package k;

import android.widget.PopupWindow;

/* renamed from: k.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177v implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0178w f2751a;

    public C0177v(C0178w c0178w) {
        this.f2751a = c0178w;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2751a.c();
    }
}
