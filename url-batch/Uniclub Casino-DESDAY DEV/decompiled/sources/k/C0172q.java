package k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import j.InterfaceC0149b;

/* renamed from: k.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0172q extends FrameLayout implements InterfaceC0149b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f2744a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0172q(View view) {
        super(view.getContext());
        this.f2744a = (CollapsibleActionView) view;
        addView(view);
    }
}
