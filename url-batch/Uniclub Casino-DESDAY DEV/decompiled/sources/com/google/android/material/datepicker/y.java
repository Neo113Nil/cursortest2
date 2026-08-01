package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fortuneodd.shadegrid.R;
import f0.AbstractC0096A;
import f0.X;
import java.util.Locale;

/* loaded from: classes.dex */
public final class y extends AbstractC0096A {

    /* renamed from: c, reason: collision with root package name */
    public final k f1726c;

    public y(k kVar) {
        this.f1726c = kVar;
    }

    @Override // f0.AbstractC0096A
    public final int a() {
        return this.f1726c.f1670V.f1651f;
    }

    @Override // f0.AbstractC0096A
    public final void c(X x2, int i) {
        k kVar = this.f1726c;
        int i2 = kVar.f1670V.f1647a.f1709c + i;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((x) x2).f1725t;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(w.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        c cVar = kVar.f1673Y;
        if (w.b().get(1) == i2) {
            J0.e eVar = cVar.f1654b;
        } else {
            J0.e eVar2 = cVar.f1653a;
        }
        throw null;
    }

    @Override // f0.AbstractC0096A
    public final X d(ViewGroup viewGroup) {
        return new x((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
