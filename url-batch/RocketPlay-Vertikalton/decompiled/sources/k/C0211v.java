package k;

import android.widget.PopupWindow;

/* renamed from: k.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211v implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0212w f3247a;

    public C0211v(C0212w c0212w) {
        this.f3247a = c0212w;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3247a.c();
    }
}
