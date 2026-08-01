package defpackage;

import android.widget.ImageButton;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class u90 extends ImageButton {
    public int f;

    public final void a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        a(i, true);
    }
}
