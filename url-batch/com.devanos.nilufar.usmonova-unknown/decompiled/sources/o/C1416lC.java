package o;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: o.lC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1416lC extends FrameLayout implements InterfaceC0653Zb {
    public final CollapsibleActionView h;

    /* JADX WARN: Multi-variable type inference failed */
    public C1416lC(View view) {
        super(view.getContext());
        this.h = (CollapsibleActionView) view;
        addView(view);
    }
}
