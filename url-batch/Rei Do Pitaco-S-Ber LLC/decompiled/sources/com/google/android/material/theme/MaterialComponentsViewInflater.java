package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import defpackage.c3;
import defpackage.d3;
import defpackage.ds;
import defpackage.f3;
import defpackage.hs;
import defpackage.jr;
import defpackage.jx;
import defpackage.m60;
import defpackage.ns;
import defpackage.oo;
import defpackage.p4;
import defpackage.p5;
import defpackage.x5;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends x5 {
    @Override // defpackage.x5
    public final c3 a(Context context, AttributeSet attributeSet) {
        return new jr(context, attributeSet);
    }

    @Override // defpackage.x5
    public final d3 b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.x5
    public final f3 c(Context context, AttributeSet attributeSet) {
        return new ds(context, attributeSet);
    }

    @Override // defpackage.x5
    public final p4 d(Context context, AttributeSet attributeSet) {
        return new hs(context, attributeSet);
    }

    @Override // defpackage.x5
    public final p5 e(Context context, AttributeSet attributeSet) {
        ns nsVar = new ns(oo.R(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = nsVar.getContext();
        if (m60.S(context2.getTheme(), com.ionia.reidopitaco.libya.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = jx.z;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int g = ns.g(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (g == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, jx.y);
                    int g2 = ns.g(nsVar.getContext(), obtainStyledAttributes3, 2, 4);
                    obtainStyledAttributes3.recycle();
                    if (g2 >= 0) {
                        nsVar.setLineHeight(g2);
                    }
                }
            }
        }
        return nsVar;
    }
}
