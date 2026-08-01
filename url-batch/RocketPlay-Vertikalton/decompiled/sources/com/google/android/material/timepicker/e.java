package com.google.android.material.timepicker;

import G0.o;
import K.T;
import M0.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luckycounter.drinkwater.R;
import java.util.WeakHashMap;
import s0.AbstractC0363a;

/* loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final o f2459s;

    /* renamed from: t, reason: collision with root package name */
    public int f2460t;

    /* renamed from: u, reason: collision with root package name */
    public final M0.g f2461u;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        M0.g gVar = new M0.g();
        this.f2461u = gVar;
        M0.h hVar = new M0.h(0.5f);
        j e2 = gVar.f828a.f814a.e();
        e2.f851e = hVar;
        e2.f852f = hVar;
        e2.f853g = hVar;
        e2.h = hVar;
        gVar.setShapeAppearanceModel(e2.a());
        this.f2461u.j(ColorStateList.valueOf(-1));
        M0.g gVar2 = this.f2461u;
        WeakHashMap weakHashMap = T.f633a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0363a.f4110t, R.attr.materialClockStyle, 0);
        this.f2460t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2459s = new o(11, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = T.f633a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            o oVar = this.f2459s;
            handler.removeCallbacks(oVar);
            handler.post(oVar);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            o oVar = this.f2459s;
            handler.removeCallbacks(oVar);
            handler.post(oVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f2461u.j(ColorStateList.valueOf(i));
    }
}
