package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class i0 extends ClickableSpan {
    public final int d;
    public final c1 e;
    public final int f;

    public i0(int i, c1 c1Var, int i2) {
        this.d = i;
        this.e = c1Var;
        this.f = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.d);
        this.e.a.performAction(this.f, bundle);
    }
}
