package com.google.android.material.theme;

import D0.n;
import F0.a;
import M0.x;
import Q.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.fortuneodd.shadegrid.R;
import com.google.android.material.button.MaterialButton;
import g.C0125D;
import l.C0198E;
import l.C0219d0;
import l.C0242p;
import l.C0246r;
import l.C0248s;
import p0.AbstractC0279a;
import q1.d;
import q1.l;
import x0.C0342c;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0125D {
    @Override // g.C0125D
    public final C0242p a(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    @Override // g.C0125D
    public final C0246r b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.C0125D
    public final C0248s c(Context context, AttributeSet attributeSet) {
        return new C0342c(context, attributeSet);
    }

    @Override // g.C0125D
    public final C0198E d(Context context, AttributeSet attributeSet) {
        a aVar = new a(O0.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray f2 = n.f(context2, attributeSet, AbstractC0279a.f3390o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f2.hasValue(0)) {
            b.c(aVar, d.r(context2, f2, 0));
        }
        aVar.f171f = f2.getBoolean(1, false);
        f2.recycle();
        return aVar;
    }

    @Override // g.C0125D
    public final C0219d0 e(Context context, AttributeSet attributeSet) {
        N0.a aVar = new N0.a(O0.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (l.l0(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0279a.f3393r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int h = N0.a.h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0279a.f3392q);
                    int h2 = N0.a.h(aVar.getContext(), obtainStyledAttributes3, 1, 2);
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
