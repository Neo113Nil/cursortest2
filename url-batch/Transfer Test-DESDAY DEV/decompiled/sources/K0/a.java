package K0;

import A.c;
import android.R;
import android.content.res.ColorStateList;
import l.C0181C;

/* loaded from: classes.dex */
public final class a extends C0181C {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f466g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f467e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f468f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f467e == null) {
            int D2 = c.D(this, com.football.transfertrivia.R.attr.colorControlActivated);
            int D3 = c.D(this, com.football.transfertrivia.R.attr.colorOnSurface);
            int D4 = c.D(this, com.football.transfertrivia.R.attr.colorSurface);
            this.f467e = new ColorStateList(f466g, new int[]{c.e0(D4, D2, 1.0f), c.e0(D4, D3, 0.54f), c.e0(D4, D3, 0.38f), c.e0(D4, D3, 0.38f)});
        }
        return this.f467e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f468f && Q.c.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f468f = z2;
        if (z2) {
            Q.c.c(this, getMaterialThemeColorsTintList());
        } else {
            Q.c.c(this, null);
        }
    }
}
