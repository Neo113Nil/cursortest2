package com.google.android.material.theme;

import A0.d;
import F1.l;
import G0.m;
import I0.a;
import P0.w;
import Q.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.luckycounter.drinkwater.R;
import g.C0115C;
import l.C0224D;
import l.C0244c0;
import l.C0269p;
import l.C0273r;
import l.C0275s;
import s0.AbstractC0363a;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0115C {
    @Override // g.C0115C
    public final C0269p a(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    @Override // g.C0115C
    public final C0273r b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.C0115C
    public final C0275s c(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    @Override // g.C0115C
    public final C0224D d(Context context, AttributeSet attributeSet) {
        a aVar = new a(R0.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray f2 = m.f(context2, attributeSet, AbstractC0363a.f4105o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f2.hasValue(0)) {
            b.c(aVar, l.z(context2, f2, 0));
        }
        aVar.f589f = f2.getBoolean(1, false);
        f2.recycle();
        return aVar;
    }

    @Override // g.C0115C
    public final C0244c0 e(Context context, AttributeSet attributeSet) {
        Q0.a aVar = new Q0.a(R0.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (F1.d.c0(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0363a.f4108r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int h = Q0.a.h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0363a.f4107q);
                    int h2 = Q0.a.h(aVar.getContext(), obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (h2 >= 0) {
                        aVar.setLineHeight(h2);
                    }
                }
            }
        }
        return aVar;
    }
}
