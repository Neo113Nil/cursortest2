package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.luckycounter.drinkwater.R;
import s0.AbstractC0363a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final M0.e f2247a;

    /* renamed from: b, reason: collision with root package name */
    public final M0.e f2248b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(F1.d.f0(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, AbstractC0363a.f4102l);
        M0.e.e(context, obtainStyledAttributes.getResourceId(4, 0));
        M0.e.e(context, obtainStyledAttributes.getResourceId(2, 0));
        M0.e.e(context, obtainStyledAttributes.getResourceId(3, 0));
        M0.e.e(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList z2 = F1.l.z(context, obtainStyledAttributes, 7);
        this.f2247a = M0.e.e(context, obtainStyledAttributes.getResourceId(9, 0));
        M0.e.e(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f2248b = M0.e.e(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(z2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
