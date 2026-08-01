package com.google.android.material.datepicker;

import K.S;
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
import f0.C0120y;
import f0.a0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k<S> extends t {

    /* renamed from: U, reason: collision with root package name */
    public int f1669U;

    /* renamed from: V, reason: collision with root package name */
    public b f1670V;

    /* renamed from: W, reason: collision with root package name */
    public o f1671W;

    /* renamed from: X, reason: collision with root package name */
    public int f1672X;

    /* renamed from: Y, reason: collision with root package name */
    public c f1673Y;

    /* renamed from: Z, reason: collision with root package name */
    public RecyclerView f1674Z;

    /* renamed from: a0, reason: collision with root package name */
    public RecyclerView f1675a0;

    /* renamed from: b0, reason: collision with root package name */
    public View f1676b0;

    /* renamed from: c0, reason: collision with root package name */
    public View f1677c0;

    /* renamed from: d0, reason: collision with root package name */
    public View f1678d0;

    /* renamed from: e0, reason: collision with root package name */
    public View f1679e0;

    public final void G(o oVar) {
        s sVar = (s) this.f1675a0.getAdapter();
        int d = sVar.f1721c.f1647a.d(oVar);
        int d2 = d - sVar.f1721c.f1647a.d(this.f1671W);
        boolean z2 = Math.abs(d2) > 3;
        boolean z3 = d2 > 0;
        this.f1671W = oVar;
        if (z2 && z3) {
            this.f1675a0.Y(d - 3);
            this.f1675a0.post(new H.b(this, d, 2));
        } else if (!z2) {
            this.f1675a0.post(new H.b(this, d, 2));
        } else {
            this.f1675a0.Y(d + 3);
            this.f1675a0.post(new H.b(this, d, 2));
        }
    }

    public final void H(int i) {
        this.f1672X = i;
        if (i == 2) {
            this.f1674Z.getLayoutManager().n0(this.f1671W.f1709c - ((y) this.f1674Z.getAdapter()).f1726c.f1670V.f1647a.f1709c);
            this.f1678d0.setVisibility(0);
            this.f1679e0.setVisibility(8);
            this.f1676b0.setVisibility(8);
            this.f1677c0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f1678d0.setVisibility(8);
            this.f1679e0.setVisibility(0);
            this.f1676b0.setVisibility(0);
            this.f1677c0.setVisibility(0);
            G(this.f1671W);
        }
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f973f;
        }
        this.f1669U = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1670V = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1671W = (o) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        C0120y c0120y;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.f1669U);
        this.f1673Y = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        o oVar = this.f1670V.f1647a;
        if (m.J(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.fortuneodd.shadegrid.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.fortuneodd.shadegrid.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = C().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.fortuneodd.shadegrid.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.fortuneodd.shadegrid.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.fortuneodd.shadegrid.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.fortuneodd.shadegrid.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = p.d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.fortuneodd.shadegrid.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.fortuneodd.shadegrid.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.fortuneodd.shadegrid.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.fortuneodd.shadegrid.R.id.mtrl_calendar_days_of_week);
        S.l(gridView, new Q.h(1));
        int i4 = this.f1670V.f1650e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new e(i4) : new e()));
        gridView.setNumColumns(oVar.d);
        gridView.setEnabled(false);
        this.f1675a0 = (RecyclerView) inflate.findViewById(com.fortuneodd.shadegrid.R.id.mtrl_calendar_months);
        this.f1675a0.setLayoutManager(new g(this, i2, i2));
        this.f1675a0.setTag("MONTHS_VIEW_GROUP_TAG");
        s sVar = new s(contextThemeWrapper, this.f1670V, new C.g(21, this));
        this.f1675a0.setAdapter(sVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.fortuneodd.shadegrid.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(com.fortuneodd.shadegrid.R.id.mtrl_calendar_year_selector_frame);
        this.f1674Z = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f1674Z.setLayoutManager(new GridLayoutManager(integer));
            this.f1674Z.setAdapter(new y(this));
            this.f1674Z.g(new h(this));
        }
        if (inflate.findViewById(com.fortuneodd.shadegrid.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.fortuneodd.shadegrid.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            S.l(materialButton, new D0.a(2, this));
            View findViewById = inflate.findViewById(com.fortuneodd.shadegrid.R.id.month_navigation_previous);
            this.f1676b0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.fortuneodd.shadegrid.R.id.month_navigation_next);
            this.f1677c0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f1678d0 = inflate.findViewById(com.fortuneodd.shadegrid.R.id.mtrl_calendar_year_selector_frame);
            this.f1679e0 = inflate.findViewById(com.fortuneodd.shadegrid.R.id.mtrl_calendar_day_selector_frame);
            H(1);
            materialButton.setText(this.f1671W.c());
            this.f1675a0.h(new i(this, sVar, materialButton));
            materialButton.setOnClickListener(new j(0, this));
            this.f1677c0.setOnClickListener(new f(this, sVar, 1));
            this.f1676b0.setOnClickListener(new f(this, sVar, 0));
        }
        if (!m.J(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0120y = new C0120y()).f2188a) != (recyclerView = this.f1675a0)) {
            a0 a0Var = c0120y.f2189b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f1443e0;
                if (arrayList != null) {
                    arrayList.remove(a0Var);
                }
                c0120y.f2188a.setOnFlingListener(null);
            }
            c0120y.f2188a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0120y.f2188a.h(a0Var);
                c0120y.f2188a.setOnFlingListener(c0120y);
                new Scroller(c0120y.f2188a.getContext(), new DecelerateInterpolator());
                c0120y.f();
            }
        }
        this.f1675a0.Y(sVar.f1721c.f1647a.d(this.f1671W));
        S.l(this.f1675a0, new Q.h(2));
        return inflate;
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f1669U);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1670V);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f1671W);
    }
}
