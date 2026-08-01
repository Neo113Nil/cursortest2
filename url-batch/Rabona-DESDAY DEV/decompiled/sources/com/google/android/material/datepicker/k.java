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
import f0.C0108y;
import f0.a0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k<S> extends t {

    /* renamed from: U, reason: collision with root package name */
    public int f1663U;

    /* renamed from: V, reason: collision with root package name */
    public b f1664V;

    /* renamed from: W, reason: collision with root package name */
    public o f1665W;

    /* renamed from: X, reason: collision with root package name */
    public int f1666X;

    /* renamed from: Y, reason: collision with root package name */
    public c f1667Y;

    /* renamed from: Z, reason: collision with root package name */
    public RecyclerView f1668Z;

    /* renamed from: a0, reason: collision with root package name */
    public RecyclerView f1669a0;

    /* renamed from: b0, reason: collision with root package name */
    public View f1670b0;

    /* renamed from: c0, reason: collision with root package name */
    public View f1671c0;

    /* renamed from: d0, reason: collision with root package name */
    public View f1672d0;

    /* renamed from: e0, reason: collision with root package name */
    public View f1673e0;

    public final void G(o oVar) {
        s sVar = (s) this.f1669a0.getAdapter();
        int d = sVar.f1714c.f1641a.d(oVar);
        int d2 = d - sVar.f1714c.f1641a.d(this.f1665W);
        boolean z2 = Math.abs(d2) > 3;
        boolean z3 = d2 > 0;
        this.f1665W = oVar;
        if (z2 && z3) {
            this.f1669a0.Y(d - 3);
            this.f1669a0.post(new H.b(this, d, 2));
        } else if (!z2) {
            this.f1669a0.post(new H.b(this, d, 2));
        } else {
            this.f1669a0.Y(d + 3);
            this.f1669a0.post(new H.b(this, d, 2));
        }
    }

    public final void H(int i) {
        this.f1666X = i;
        if (i == 2) {
            this.f1668Z.getLayoutManager().n0(this.f1665W.f1702c - ((y) this.f1668Z.getAdapter()).f1719c.f1664V.f1641a.f1702c);
            this.f1672d0.setVisibility(0);
            this.f1673e0.setVisibility(8);
            this.f1670b0.setVisibility(8);
            this.f1671c0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f1672d0.setVisibility(8);
            this.f1673e0.setVisibility(0);
            this.f1670b0.setVisibility(0);
            this.f1671c0.setVisibility(0);
            G(this.f1665W);
        }
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f975f;
        }
        this.f1663U = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1664V = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1665W = (o) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        C0108y c0108y;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.f1663U);
        this.f1667Y = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        o oVar = this.f1664V.f1641a;
        if (m.J(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.linetic.luckycross.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.linetic.luckycross.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = C().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.linetic.luckycross.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.linetic.luckycross.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.linetic.luckycross.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.linetic.luckycross.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = p.d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.linetic.luckycross.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.linetic.luckycross.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.linetic.luckycross.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.linetic.luckycross.R.id.mtrl_calendar_days_of_week);
        T.l(gridView, new Q.h(1));
        int i4 = this.f1664V.f1644e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new e(i4) : new e()));
        gridView.setNumColumns(oVar.d);
        gridView.setEnabled(false);
        this.f1669a0 = (RecyclerView) inflate.findViewById(com.linetic.luckycross.R.id.mtrl_calendar_months);
        this.f1669a0.setLayoutManager(new g(this, i2, i2));
        this.f1669a0.setTag("MONTHS_VIEW_GROUP_TAG");
        s sVar = new s(contextThemeWrapper, this.f1664V, new B0.d(21, this));
        this.f1669a0.setAdapter(sVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.linetic.luckycross.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(com.linetic.luckycross.R.id.mtrl_calendar_year_selector_frame);
        this.f1668Z = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f1668Z.setLayoutManager(new GridLayoutManager(integer));
            this.f1668Z.setAdapter(new y(this));
            this.f1668Z.g(new h(this));
        }
        if (inflate.findViewById(com.linetic.luckycross.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.linetic.luckycross.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            T.l(materialButton, new B0.a(2, this));
            View findViewById = inflate.findViewById(com.linetic.luckycross.R.id.month_navigation_previous);
            this.f1670b0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.linetic.luckycross.R.id.month_navigation_next);
            this.f1671c0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f1672d0 = inflate.findViewById(com.linetic.luckycross.R.id.mtrl_calendar_year_selector_frame);
            this.f1673e0 = inflate.findViewById(com.linetic.luckycross.R.id.mtrl_calendar_day_selector_frame);
            H(1);
            materialButton.setText(this.f1665W.c());
            this.f1669a0.h(new i(this, sVar, materialButton));
            materialButton.setOnClickListener(new j(0, this));
            this.f1671c0.setOnClickListener(new f(this, sVar, 1));
            this.f1670b0.setOnClickListener(new f(this, sVar, 0));
        }
        if (!m.J(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0108y = new C0108y()).f2186a) != (recyclerView = this.f1669a0)) {
            a0 a0Var = c0108y.f2187b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f1444e0;
                if (arrayList != null) {
                    arrayList.remove(a0Var);
                }
                c0108y.f2186a.setOnFlingListener(null);
            }
            c0108y.f2186a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0108y.f2186a.h(a0Var);
                c0108y.f2186a.setOnFlingListener(c0108y);
                new Scroller(c0108y.f2186a.getContext(), new DecelerateInterpolator());
                c0108y.f();
            }
        }
        this.f1669a0.Y(sVar.f1714c.f1641a.d(this.f1665W));
        T.l(this.f1669a0, new Q.h(2));
        return inflate;
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f1663U);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1664V);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f1665W);
    }
}
