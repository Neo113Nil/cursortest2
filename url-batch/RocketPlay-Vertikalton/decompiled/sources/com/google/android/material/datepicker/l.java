package com.google.android.material.datepicker;

import K.z0;
import android.view.View;

/* loaded from: classes.dex */
public final class l implements K.r {

    /* renamed from: a, reason: collision with root package name */
    public final View f2274a;

    /* renamed from: b, reason: collision with root package name */
    public int f2275b;

    /* renamed from: c, reason: collision with root package name */
    public int f2276c;

    public l(View view) {
        this.f2274a = view;
    }

    @Override // K.r
    public z0 c(View view, z0 z0Var) {
        int i = z0Var.f729a.f(7).f233b;
        View view2 = this.f2274a;
        int i2 = this.f2275b;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f2276c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return z0Var;
    }

    public l(View view, int i, int i2) {
        this.f2275b = i;
        this.f2274a = view;
        this.f2276c = i2;
    }
}
