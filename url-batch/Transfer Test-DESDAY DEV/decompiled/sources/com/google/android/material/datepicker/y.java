package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.football.transfertrivia.R;
import g0.AbstractC0109A;
import g0.Z;
import java.util.Locale;

/* loaded from: classes.dex */
public final class y extends AbstractC0109A {
    public final k d;

    public y(k kVar) {
        this.d = kVar;
    }

    @Override // g0.AbstractC0109A
    public final int a() {
        return this.d.f1896V.f1877f;
    }

    @Override // g0.AbstractC0109A
    public final void c(Z z2, int i) {
        k kVar = this.d;
        int i2 = kVar.f1896V.f1873a.f1935c + i;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((x) z2).f1951u;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(w.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        c cVar = kVar.f1899Y;
        if (w.b().get(1) == i2) {
            O0.e eVar = cVar.f1880b;
        } else {
            O0.e eVar2 = cVar.f1879a;
        }
        throw null;
    }

    @Override // g0.AbstractC0109A
    public final Z d(ViewGroup viewGroup) {
        return new x((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
