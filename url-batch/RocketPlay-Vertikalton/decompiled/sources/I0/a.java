package I0;

import F1.d;
import Q.b;
import android.R;
import android.content.res.ColorStateList;
import l.C0224D;

/* loaded from: classes.dex */
public final class a extends C0224D {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f587g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f588e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f589f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f588e == null) {
            int C2 = d.C(this, com.luckycounter.drinkwater.R.attr.colorControlActivated);
            int C3 = d.C(this, com.luckycounter.drinkwater.R.attr.colorOnSurface);
            int C4 = d.C(this, com.luckycounter.drinkwater.R.attr.colorSurface);
            this.f588e = new ColorStateList(f587g, new int[]{d.P(C4, C2, 1.0f), d.P(C4, C3, 0.54f), d.P(C4, C3, 0.38f), d.P(C4, C3, 0.38f)});
        }
        return this.f588e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f589f && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f589f = z2;
        if (z2) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
