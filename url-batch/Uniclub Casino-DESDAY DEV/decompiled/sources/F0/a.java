package F0;

import Q.b;
import android.R;
import android.content.res.ColorStateList;
import i1.k;
import l.C0198E;

/* loaded from: classes.dex */
public final class a extends C0198E {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f169g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f170e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f171f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f170e == null) {
            int k2 = k.k(this, com.fortuneodd.shadegrid.R.attr.colorControlActivated);
            int k3 = k.k(this, com.fortuneodd.shadegrid.R.attr.colorOnSurface);
            int k4 = k.k(this, com.fortuneodd.shadegrid.R.attr.colorSurface);
            this.f170e = new ColorStateList(f169g, new int[]{k.p(k4, k2, 1.0f), k.p(k4, k3, 0.54f), k.p(k4, k3, 0.38f), k.p(k4, k3, 0.38f)});
        }
        return this.f170e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f171f && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f171f = z2;
        if (z2) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
