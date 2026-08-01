package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ionia.reidopitaco.libya.R;
import defpackage.dz;
import defpackage.ey;
import defpackage.gs;
import defpackage.l8;
import defpackage.oy;
import defpackage.qt;
import defpackage.rt;
import defpackage.v8;
import defpackage.x60;
import defpackage.xr;
import java.util.Calendar;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class e extends ey {
    public final v8 d;
    public final xr e;
    public final xr f;
    public final int g;
    public qt h;
    public int i = 0;

    public e(ContextThemeWrapper contextThemeWrapper, v8 v8Var, xr xrVar, xr xrVar2) {
        qt qtVar = v8Var.f;
        qt qtVar2 = v8Var.g;
        qt qtVar3 = v8Var.i;
        if (qtVar.f.compareTo(qtVar3.f) > 0) {
            l8.l("firstPage cannot be after currentPage");
            throw null;
        }
        if (qtVar3.f.compareTo(qtVar2.f) > 0) {
            l8.l("currentPage cannot be after lastPage");
            throw null;
        }
        this.g = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * rt.d) + (gs.J(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.d = v8Var;
        this.e = xrVar;
        this.f = xrVar2;
        this.h = qtVar3;
        if (this.a.a()) {
            l8.u("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            throw null;
        }
        this.b = true;
    }

    @Override // defpackage.ey
    public final int a() {
        return this.d.l;
    }

    @Override // defpackage.ey
    public final long b(int i) {
        Calendar a = x60.a(this.d.f.f);
        a.add(2, i);
        a.set(5, 1);
        Calendar a2 = x60.a(a);
        a2.get(2);
        a2.get(1);
        a2.getMaximum(7);
        a2.getActualMaximum(5);
        a2.getTimeInMillis();
        return a2.getTimeInMillis();
    }

    @Override // defpackage.ey
    public final void c(dz dzVar, int i) {
        d dVar = (d) dzVar;
        v8 v8Var = this.d;
        Calendar a = x60.a(v8Var.f.f);
        a.add(2, i);
        qt qtVar = new qt(a);
        dVar.u.setText(qtVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) dVar.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.b() == null || !qtVar.equals(materialCalendarGridView.b().a)) {
            new rt(qtVar, v8Var);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.b().getClass();
        throw null;
    }

    @Override // defpackage.ey
    public final dz d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!gs.J(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new d(linearLayout, false);
        }
        linearLayout.setLayoutParams(new oy(-1, this.g));
        return new d(linearLayout, true);
    }

    public final qt e(int i) {
        Calendar a = x60.a(this.d.f.f);
        a.add(2, i);
        return new qt(a);
    }

    public final int f(qt qtVar) {
        return this.d.f.d(qtVar);
    }
}
