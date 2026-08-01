package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.football.transfertrivia.R;
import g0.AbstractC0109A;
import g0.J;
import g0.Z;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class s extends AbstractC0109A {
    public final b d;

    /* renamed from: e, reason: collision with root package name */
    public final A0.h f1947e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1948f;

    public s(ContextThemeWrapper contextThemeWrapper, b bVar, A0.h hVar) {
        o oVar = bVar.f1873a;
        o oVar2 = bVar.d;
        if (oVar.f1933a.compareTo(oVar2.f1933a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (oVar2.f1933a.compareTo(bVar.f1874b.f1933a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f1948f = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * p.d) + (m.J(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.d = bVar;
        this.f1947e = hVar;
        if (this.f2326a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f2327b = true;
    }

    @Override // g0.AbstractC0109A
    public final int a() {
        return this.d.f1878g;
    }

    @Override // g0.AbstractC0109A
    public final long b(int i) {
        Calendar a2 = w.a(this.d.f1873a.f1933a);
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

    @Override // g0.AbstractC0109A
    public final void c(Z z2, int i) {
        r rVar = (r) z2;
        b bVar = this.d;
        Calendar a2 = w.a(bVar.f1873a.f1933a);
        a2.add(2, i);
        o oVar = new o(a2);
        rVar.f1945u.setText(oVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) rVar.f1946v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !oVar.equals(materialCalendarGridView.a().f1940a)) {
            new p(oVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // g0.AbstractC0109A
    public final Z d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!m.J(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new r(linearLayout, false);
        }
        linearLayout.setLayoutParams(new J(-1, this.f1948f));
        return new r(linearLayout, true);
    }
}
