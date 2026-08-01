package k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import j.InterfaceC0176b;

/* renamed from: k.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0206q extends FrameLayout implements InterfaceC0176b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f3240a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0206q(View view) {
        super(view.getContext());
        this.f3240a = (CollapsibleActionView) view;
        addView(view);
    }
}
