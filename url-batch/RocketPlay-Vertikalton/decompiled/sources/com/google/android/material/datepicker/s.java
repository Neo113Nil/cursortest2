package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.luckycounter.drinkwater.R;
import g0.AbstractC0131A;
import g0.C0140J;
import g0.Z;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class s extends AbstractC0131A {
    public final b d;

    /* renamed from: e, reason: collision with root package name */
    public final A1.d f2314e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2315f;

    public s(ContextThemeWrapper contextThemeWrapper, b bVar, A1.d dVar) {
        o oVar = bVar.f2241a;
        o oVar2 = bVar.d;
        if (oVar.f2300a.compareTo(oVar2.f2300a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (oVar2.f2300a.compareTo(bVar.f2242b.f2300a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f2315f = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * p.d) + (m.J(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.d = bVar;
        this.f2314e = dVar;
        if (this.f2764a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f2765b = true;
    }

    @Override // g0.AbstractC0131A
    public final int a() {
        return this.d.f2246g;
    }

    @Override // g0.AbstractC0131A
    public final long b(int i) {
        Calendar a2 = w.a(this.d.f2241a.f2300a);
        a2.add(2, i);
        a2.set(5, 1);
        Calendar a3 = w.a(a2);
        a3.get(2);
        a3.get(1);
        a3.getMaximum(7);
        a3.getActualMaximum(5);
        a3.getTimeInMillis();
        return a3.getTimeInMillis();
    }

    @Override // g0.AbstractC0131A
    public final void c(Z z2, int i) {
        r rVar = (r) z2;
        b bVar = this.d;
        Calendar a2 = w.a(bVar.f2241a.f2300a);
        a2.add(2, i);
        o oVar = new o(a2);
        rVar.f2312u.setText(oVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) rVar.f2313v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !oVar.equals(materialCalendarGridView.a().f2307a)) {
            new p(oVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // g0.AbstractC0131A
    public final Z d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!m.J(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new r(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C0140J(-1, this.f2315f));
        return new r(linearLayout, true);
    }
}
