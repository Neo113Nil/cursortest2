package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.linetic.luckycross.R;
import n0.AbstractC0279a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final H0.e f1647a;

    /* renamed from: b, reason: collision with root package name */
    public final H0.e f1648b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(q1.l.S(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, AbstractC0279a.f3293l);
        H0.e.e(context, obtainStyledAttributes.getResourceId(4, 0));
        H0.e.e(context, obtainStyledAttributes.getResourceId(2, 0));
        H0.e.e(context, obtainStyledAttributes.getResourceId(3, 0));
        H0.e.e(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList B2 = q1.d.B(context, obtainStyledAttributes, 7);
        this.f1647a = H0.e.e(context, obtainStyledAttributes.getResourceId(9, 0));
        H0.e.e(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f1648b = H0.e.e(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(B2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
