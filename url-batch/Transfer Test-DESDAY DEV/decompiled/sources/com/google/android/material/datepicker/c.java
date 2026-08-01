package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.football.transfertrivia.R;
import u0.AbstractC0338a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final O0.e f1879a;

    /* renamed from: b, reason: collision with root package name */
    public final O0.e f1880b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(A.c.r0(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, AbstractC0338a.f3792l);
        O0.e.a(context, obtainStyledAttributes.getResourceId(4, 0));
        O0.e.a(context, obtainStyledAttributes.getResourceId(2, 0));
        O0.e.a(context, obtainStyledAttributes.getResourceId(3, 0));
        O0.e.a(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList G2 = A.c.G(context, obtainStyledAttributes, 7);
        this.f1879a = O0.e.a(context, obtainStyledAttributes.getResourceId(9, 0));
        O0.e.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f1880b = O0.e.a(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(G2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
