package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.e;
import com.ionia.reidopitaco.libya.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class as<S> extends fw {
    public int Z;
    public v8 a0;
    public qt b0;
    public int c0;
    public y5 d0;
    public RecyclerView e0;
    public RecyclerView f0;
    public View g0;
    public View h0;
    public View i0;
    public View j0;
    public MaterialButton k0;
    public AccessibilityManager l0;
    public aw m0;
    public boolean n0;

    public static boolean H(as asVar, boolean z) {
        qt qtVar;
        if (asVar.n0) {
            return false;
        }
        if (asVar.f0.getScrollState() != 0) {
            return true;
        }
        e eVar = (e) asVar.f0.getAdapter();
        if (eVar == null || (qtVar = asVar.b0) == null) {
            return false;
        }
        int f = eVar.f(qtVar) + (z ? 1 : -1);
        if (f < 0 || f >= eVar.d.l) {
            return false;
        }
        eVar.i = z ? 2 : 1;
        asVar.I(eVar.e(f));
        return true;
    }

    @Override // defpackage.fw
    public final void G(tg tgVar) {
        this.Y.add(tgVar);
    }

    public final void I(qt qtVar) {
        e eVar = (e) this.f0.getAdapter();
        int f = eVar.f(qtVar);
        AccessibilityManager accessibilityManager = this.l0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int f2 = f - eVar.f(this.b0);
            boolean z = Math.abs(f2) > 3;
            boolean z2 = f2 > 0;
            this.b0 = qtVar;
            int i = 2;
            if (z && z2) {
                this.f0.g0(f - 3);
                this.f0.post(new w8(f, i, this));
            } else {
                RecyclerView recyclerView = this.f0;
                if (z) {
                    recyclerView.g0(f + 3);
                    this.f0.post(new w8(f, i, this));
                } else {
                    recyclerView.post(new w8(f, i, this));
                }
            }
        } else {
            this.b0 = qtVar;
            this.f0.g0(f);
        }
        L();
        M(f);
    }

    public final void J(int i) {
        this.c0 = i;
        if (i == 2) {
            this.e0.getLayoutManager().q0(this.b0.h - ((kb0) this.e0.getAdapter()).d.a0.f.h);
            this.i0.setVisibility(0);
            this.j0.setVisibility(8);
            this.g0.setVisibility(8);
            this.h0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.i0.setVisibility(8);
            this.j0.setVisibility(0);
            this.g0.setVisibility(0);
            this.h0.setVisibility(0);
            I(this.b0);
        }
    }

    public final void K(View view) {
        if (view == null) {
            return;
        }
        int i = this.c0;
        if (i == 2) {
            f80.n(view, k(R.string.mtrl_picker_pane_title_year_view));
        } else if (i == 1) {
            f80.n(view, k(R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    public final void L() {
        qt qtVar;
        e eVar = (e) this.f0.getAdapter();
        if (eVar != null) {
            fy fyVar = eVar.a;
            if (this.n0 || (qtVar = this.b0) == null || qtVar.equals(eVar.h)) {
                return;
            }
            int f = eVar.f(eVar.h);
            eVar.h = qtVar;
            int f2 = eVar.f(qtVar);
            fyVar.c(f);
            fyVar.c(f2);
        }
    }

    public final void M(int i) {
        View view = this.h0;
        if (view != null) {
            view.setEnabled(i + 1 < this.f0.getAdapter().a());
        }
        View view2 = this.g0;
        if (view2 != null) {
            view2.setEnabled(i - 1 >= 0);
        }
    }

    @Override // defpackage.dk
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.k;
        }
        this.Z = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            l8.c();
            return;
        }
        this.a0 = (v8) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
            this.b0 = (qt) bundle.getParcelable("CURRENT_MONTH_KEY");
        } else {
            l8.c();
        }
    }

    @Override // defpackage.dk
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.Z);
        this.d0 = new y5(contextThemeWrapper, 4);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.l0 = (AccessibilityManager) C().getSystemService("accessibility");
        qt qtVar = this.a0.f;
        boolean J = gs.J(contextThemeWrapper, android.R.attr.windowFullscreen);
        this.n0 = J;
        int i3 = 0;
        int i4 = 1;
        if (J) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = C().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i5 = rt.d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        f80.m(gridView, new vr(i3));
        int i6 = this.a0.j;
        gridView.setAdapter((ListAdapter) (i6 > 0 ? new yd(i6) : new yd()));
        gridView.setNumColumns(qtVar.i);
        gridView.setEnabled(false);
        this.f0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.f0.setLayoutManager(new wr(this, i2, i2));
        this.f0.setTag("MONTHS_VIEW_GROUP_TAG");
        e eVar = new e(contextThemeWrapper, this.a0, new xr(this), new xr(this));
        this.f0.setAdapter(eVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.e0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.e0.setLayoutManager(new GridLayoutManager(integer));
            this.e0.setAdapter(new kb0(this));
            RecyclerView recyclerView2 = this.e0;
            yr yrVar = new yr();
            x60.c(null);
            x60.c(null);
            recyclerView2.i(yrVar);
        }
        if (!this.n0) {
            aw awVar = new aw();
            this.m0 = awVar;
            RecyclerView recyclerView3 = this.f0;
            RecyclerView recyclerView4 = awVar.a;
            if (recyclerView4 != recyclerView3) {
                j20 j20Var = awVar.b;
                if (recyclerView4 != null) {
                    ArrayList arrayList = recyclerView4.n0;
                    if (arrayList != null) {
                        arrayList.remove(j20Var);
                    }
                    awVar.a.setOnFlingListener(null);
                }
                awVar.a = recyclerView3;
                if (recyclerView3 != null) {
                    if (recyclerView3.getOnFlingListener() != null) {
                        l8.u("An instance of OnFlingListener already set.");
                        return null;
                    }
                    awVar.a.j(j20Var);
                    awVar.a.setOnFlingListener(awVar);
                    new Scroller(awVar.a.getContext(), new DecelerateInterpolator());
                    awVar.f();
                }
            }
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.k0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            f80.m(this.k0, new j7(3, this));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.g0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            s50.a(this.g0, k(R.string.mtrl_picker_prev_month_tooltip));
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.h0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            s50.a(this.h0, k(R.string.mtrl_picker_next_month_tooltip));
            this.i0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.j0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            J(1);
            this.k0.setText(this.b0.c());
            this.f0.j(new zr(this, eVar));
            this.k0.setOnClickListener(new v0(2, this));
            this.h0.setOnClickListener(new ur(this, eVar, i3));
            this.g0.setOnClickListener(new ur(this, eVar, i4));
            M(eVar.f(this.b0));
        }
        this.f0.g0(eVar.f(this.b0));
        f80.m(this.f0, new vr(i4));
        K(inflate);
        return inflate;
    }

    @Override // defpackage.dk
    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.Z);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.a0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.b0);
    }
}
