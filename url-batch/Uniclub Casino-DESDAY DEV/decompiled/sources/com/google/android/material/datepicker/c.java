package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.fortuneodd.shadegrid.R;
import p0.AbstractC0279a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final J0.e f1653a;

    /* renamed from: b, reason: collision with root package name */
    public final J0.e f1654b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(q1.l.o0(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, AbstractC0279a.f3387l);
        J0.e.e(context, obtainStyledAttributes.getResourceId(4, 0));
        J0.e.e(context, obtainStyledAttributes.getResourceId(2, 0));
        J0.e.e(context, obtainStyledAttributes.getResourceId(3, 0));
        J0.e.e(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList r2 = q1.d.r(context, obtainStyledAttributes, 7);
        this.f1653a = J0.e.e(context, obtainStyledAttributes.getResourceId(9, 0));
        J0.e.e(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f1654b = J0.e.e(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(r2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
