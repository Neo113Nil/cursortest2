package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class v extends ClickableSpan {
    public final int f;
    public final k0 g;
    public final int h;

    public v(int i, k0 k0Var, int i2) {
        this.f = i;
        this.g = k0Var;
        this.h = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f);
        this.g.a.performAction(this.h, bundle);
    }
}
