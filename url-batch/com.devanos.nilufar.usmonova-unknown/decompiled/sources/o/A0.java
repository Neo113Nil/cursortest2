package o;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class A0 extends ClickableSpan {
    public final int h;
    public final Q0 i;
    public final int j;

    public A0(int i, Q0 q0, int i2) {
        this.h = i;
        this.i = q0;
        this.j = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.h);
        this.i.a.performAction(this.j, bundle);
    }
}
