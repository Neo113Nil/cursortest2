package k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import j.InterfaceC0139b;

/* renamed from: k.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162q extends FrameLayout implements InterfaceC0139b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f2741a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0162q(View view) {
        super(view.getContext());
        this.f2741a = (CollapsibleActionView) view;
        addView(view);
    }
}
