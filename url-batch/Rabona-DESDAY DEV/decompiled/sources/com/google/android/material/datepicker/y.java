package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.linetic.luckycross.R;
import f0.AbstractC0084A;
import f0.X;
import java.util.Locale;

/* loaded from: classes.dex */
public final class y extends AbstractC0084A {

    /* renamed from: c, reason: collision with root package name */
    public final k f1719c;

    public y(k kVar) {
        this.f1719c = kVar;
    }

    @Override // f0.AbstractC0084A
    public final int a() {
        return this.f1719c.f1664V.f1645f;
    }

    @Override // f0.AbstractC0084A
    public final void c(X x2, int i) {
        k kVar = this.f1719c;
        int i2 = kVar.f1664V.f1641a.f1702c + i;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((x) x2).f1718t;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(w.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        c cVar = kVar.f1667Y;
        if (w.b().get(1) == i2) {
            H0.e eVar = cVar.f1648b;
        } else {
            H0.e eVar2 = cVar.f1647a;
        }
        throw null;
    }

    @Override // f0.AbstractC0084A
    public final X d(ViewGroup viewGroup) {
        return new x((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
