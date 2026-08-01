package com.google.android.material.datepicker;

import K.T;
import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import g0.C0171y;
import g0.c0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k<S> extends t {

    /* renamed from: U, reason: collision with root package name */
    public int f2263U;

    /* renamed from: V, reason: collision with root package name */
    public b f2264V;

    /* renamed from: W, reason: collision with root package name */
    public o f2265W;

    /* renamed from: X, reason: collision with root package name */
    public int f2266X;

    /* renamed from: Y, reason: collision with root package name */
    public c f2267Y;

    /* renamed from: Z, reason: collision with root package name */
    public RecyclerView f2268Z;

    /* renamed from: a0, reason: collision with root package name */
    public RecyclerView f2269a0;

    /* renamed from: b0, reason: collision with root package name */
    public View f2270b0;

    /* renamed from: c0, reason: collision with root package name */
    public View f2271c0;

    /* renamed from: d0, reason: collision with root package name */
    public View f2272d0;

    /* renamed from: e0, reason: collision with root package name */
    public View f2273e0;

    public final void G(o oVar) {
        s sVar = (s) this.f2269a0.getAdapter();
        int d = sVar.d.f2241a.d(oVar);
        int d2 = d - sVar.d.f2241a.d(this.f2265W);
        boolean z2 = Math.abs(d2) > 3;
        boolean z3 = d2 > 0;
        this.f2265W = oVar;
        if (z2 && z3) {
            this.f2269a0.e0(d - 3);
            this.f2269a0.post(new H.b(this, d, 2));
        } else if (!z2) {
            this.f2269a0.post(new H.b(this, d, 2));
        } else {
            this.f2269a0.e0(d + 3);
            this.f2269a0.post(new H.b(this, d, 2));
        }
    }

    public final void H(int i) {
        this.f2266X = i;
        if (i == 2) {
            this.f2268Z.getLayoutManager().p0(this.f2265W.f2302c - ((y) this.f2268Z.getAdapter()).d.f2264V.f2241a.f2302c);
            this.f2272d0.setVisibility(0);
            this.f2273e0.setVisibility(8);
            this.f2270b0.setVisibility(8);
            this.f2271c0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f2272d0.setVisibility(8);
            this.f2273e0.setVisibility(0);
            this.f2270b0.setVisibility(0);
            this.f2271c0.setVisibility(0);
            G(this.f2265W);
        }
    }

    @Override // Y.AbstractComponentCallbacksC0055q
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f1503f;
        }
        this.f2263U = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2264V = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2265W = (o) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // Y.AbstractComponentCallbacksC0055q
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        C0171y c0171y;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.f2263U);
        this.f2267Y = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        o oVar = this.f2264V.f2241a;
        if (m.J(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.luckycounter.drinkwater.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.luckycounter.drinkwater.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = C().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.luckycounter.drinkwater.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.luckycounter.drinkwater.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.luckycounter.drinkwater.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.luckycounter.drinkwater.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = p.d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.luckycounter.drinkwater.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.luckycounter.drinkwater.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.luckycounter.drinkwater.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.luckycounter.drinkwater.R.id.mtrl_calendar_days_of_week);
        T.l(gridView, new Q.h(1));
        int i4 = this.f2264V.f2244e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new e(i4) : new e()));
        gridView.setNumColumns(oVar.d);
        gridView.setEnabled(false);
        this.f2269a0 = (RecyclerView) inflate.findViewById(com.luckycounter.drinkwater.R.id.mtrl_calendar_months);
        this.f2269a0.setLayoutManager(new g(this, i2, i2));
        this.f2269a0.setTag("MONTHS_VIEW_GROUP_TAG");
        s sVar = new s(contextThemeWrapper, this.f2264V, new A1.d(23, this));
        this.f2269a0.setAdapter(sVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.luckycounter.drinkwater.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(com.luckycounter.drinkwater.R.id.mtrl_calendar_year_selector_frame);
        this.f2268Z = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f2268Z.setLayoutManager(new GridLayoutManager(integer));
            this.f2268Z.setAdapter(new y(this));
            this.f2268Z.i(new h(this));
        }
        if (inflate.findViewById(com.luckycounter.drinkwater.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.luckycounter.drinkwater.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            T.l(materialButton, new G0.a(2, this));
            View findViewById = inflate.findViewById(com.luckycounter.drinkwater.R.id.month_navigation_previous);
            this.f2270b0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.luckycounter.drinkwater.R.id.month_navigation_next);
            this.f2271c0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f2272d0 = inflate.findViewById(com.luckycounter.drinkwater.R.id.mtrl_calendar_year_selector_frame);
            this.f2273e0 = inflate.findViewById(com.luckycounter.drinkwater.R.id.mtrl_calendar_day_selector_frame);
            H(1);
            materialButton.setText(this.f2265W.c());
            this.f2269a0.j(new i(this, sVar, materialButton));
            materialButton.setOnClickListener(new j(0, this));
            this.f2271c0.setOnClickListener(new f(this, sVar, 1));
            this.f2270b0.setOnClickListener(new f(this, sVar, 0));
        }
        if (!m.J(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0171y = new C0171y()).f3006a) != (recyclerView = this.f2269a0)) {
            c0 c0Var = c0171y.f3007b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f1991g0;
                if (arrayList != null) {
                    arrayList.remove(c0Var);
                }
                c0171y.f3006a.setOnFlingListener(null);
            }
            c0171y.f3006a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0171y.f3006a.j(c0Var);
                c0171y.f3006a.setOnFlingListener(c0171y);
                new Scroller(c0171y.f3006a.getContext(), new DecelerateInterpolator());
                c0171y.f();
            }
        }
        this.f2269a0.e0(sVar.d.f2241a.d(this.f2265W));
        T.l(this.f2269a0, new Q.h(2));
        return inflate;
    }

    @Override // Y.AbstractComponentCallbacksC0055q
    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2263U);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2264V);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f2265W);
    }
}
