package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.ratebook.luckyconvert.R;
import n0.AbstractC0279a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final H0.e f1644a;

    /* renamed from: b, reason: collision with root package name */
    public final H0.e f1645b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(q1.l.S(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, AbstractC0279a.f3271l);
        H0.e.e(context, obtainStyledAttributes.getResourceId(4, 0));
        H0.e.e(context, obtainStyledAttributes.getResourceId(2, 0));
        H0.e.e(context, obtainStyledAttributes.getResourceId(3, 0));
        H0.e.e(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList A2 = q1.d.A(context, obtainStyledAttributes, 7);
        this.f1644a = H0.e.e(context, obtainStyledAttributes.getResourceId(9, 0));
        H0.e.e(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f1645b = H0.e.e(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(A2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
