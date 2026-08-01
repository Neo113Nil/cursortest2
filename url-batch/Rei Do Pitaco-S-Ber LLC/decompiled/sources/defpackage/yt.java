package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class yt extends FrameLayout implements eu {
    public boolean f;
    public boolean g;
    public boolean h;

    public final void a() {
        setVisibility((!this.h || (!this.f && this.g)) ? 8 : 0);
    }

    @Override // defpackage.kt
    public final void c(vs vsVar) {
        a();
    }

    @Override // defpackage.kt
    public vs getItemData() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setDividersEnabled(boolean z) {
        this.h = z;
        a();
    }

    @Override // defpackage.eu
    public void setExpanded(boolean z) {
        this.f = z;
        a();
    }

    @Override // defpackage.eu
    public void setOnlyShowWhenExpanded(boolean z) {
        this.g = z;
        a();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
