package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class xs extends FrameLayout implements sa {
    public final CollapsibleActionView f;

    /* JADX WARN: Multi-variable type inference failed */
    public xs(View view) {
        super(view.getContext());
        this.f = (CollapsibleActionView) view;
        addView(view);
    }
}
