package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.fortuneodd.shadegrid.R;
import f0.AbstractC0096A;
import f0.J;
import f0.X;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class s extends AbstractC0096A {

    /* renamed from: c, reason: collision with root package name */
    public final b f1721c;
    public final C.g d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1722e;

    public s(ContextThemeWrapper contextThemeWrapper, b bVar, C.g gVar) {
        o oVar = bVar.f1647a;
        o oVar2 = bVar.d;
        if (oVar.f1707a.compareTo(oVar2.f1707a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (oVar2.f1707a.compareTo(bVar.f1648b.f1707a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f1722e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * p.d) + (m.J(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f1721c = bVar;
        this.d = gVar;
        if (this.f1951a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f1952b = true;
    }

    @Override // f0.AbstractC0096A
    public final int a() {
        return this.f1721c.f1652g;
    }

    @Override // f0.AbstractC0096A
    public final long b(int i) {
        Calendar a2 = w.a(this.f1721c.f1647a.f1707a);
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

    @Override // f0.AbstractC0096A
    public final void c(X x2, int i) {
        r rVar = (r) x2;
        b bVar = this.f1721c;
        Calendar a2 = w.a(bVar.f1647a.f1707a);
        a2.add(2, i);
        o oVar = new o(a2);
        rVar.f1719t.setText(oVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) rVar.f1720u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !oVar.equals(materialCalendarGridView.a().f1714a)) {
            new p(oVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // f0.AbstractC0096A
    public final X d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!m.J(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new r(linearLayout, false);
        }
        linearLayout.setLayoutParams(new J(-1, this.f1722e));
        return new r(linearLayout, true);
    }
}
