package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ionia.reidopitaco.libya.R;
import defpackage.g8;
import defpackage.iw;
import defpackage.kd;
import defpackage.l8;
import defpackage.li;
import defpackage.o4;
import defpackage.tt;
import defpackage.ut;
import defpackage.w9;
import defpackage.y2;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c;
    public final RectF d;
    public final RectF e;
    public final int[] f;
    public float g;
    public float h;

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    public static Pair t(float f, float f2, boolean z, o4 o4Var) {
        ut d;
        ut d2;
        if (f == 0.0f || f2 == 0.0f) {
            d = ((tt) o4Var.g).d("translationXLinear");
            d2 = ((tt) o4Var.g).d("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            d = ((tt) o4Var.g).d("translationXCurveDownwards");
            d2 = ((tt) o4Var.g).d("translationYCurveDownwards");
        } else {
            d = ((tt) o4Var.g).d("translationXCurveUpwards");
            d2 = ((tt) o4Var.g).d("translationYCurveUpwards");
        }
        return new Pair(d, d2);
    }

    public static float w(o4 o4Var, ut utVar, float f) {
        long j = utVar.a;
        long j2 = utVar.b;
        ut d = ((tt) o4Var.g).d("expansion");
        return y2.a(f, 0.0f, utVar.b().getInterpolation((((d.a + d.b) + 17) - j) / j2));
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, defpackage.hd
    public final boolean b(View view, View view2) {
        int expandedComponentIdHint;
        if (view.getVisibility() != 8) {
            return (view2 instanceof FloatingActionButton) && ((expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint()) == 0 || expandedComponentIdHint == view.getId());
        }
        l8.u("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        return false;
    }

    @Override // defpackage.hd
    public final void c(kd kdVar) {
        if (kdVar.h == 0) {
            kdVar.h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet s(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator ofFloat;
        int i;
        float f;
        ObjectAnimator ofFloat2;
        ObjectAnimator ofFloat3;
        ObjectAnimator ofFloat4;
        o4 y = y(view2.getContext(), z);
        if (z) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float elevation = view2.getElevation() - view.getElevation();
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        ((tt) y.g).d("elevation").a(ofFloat);
        arrayList.add(ofFloat);
        float u = u(view, view2, (iw) y.h);
        float v = v(view, view2, (iw) y.h);
        Pair t = t(u, v, z, y);
        ut utVar = (ut) t.first;
        ut utVar2 = (ut) t.second;
        RectF rectF = this.d;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-u);
                view2.setTranslationY(-v);
            }
            i = 0;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            f = 0.0f;
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float w = w(y, utVar, -u);
            float w2 = w(y, utVar2, -v);
            Rect rect = this.c;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.e;
            x(view2, rectF2);
            rectF2.offset(w, w2);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
        } else {
            i = 0;
            f = 0.0f;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -u);
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -v);
        }
        utVar.a(ofFloat2);
        utVar2.a(ofFloat3);
        arrayList.add(ofFloat2);
        arrayList.add(ofFloat3);
        rectF.width();
        rectF.height();
        float u2 = u(view, view2, (iw) y.h);
        float v2 = v(view, view2, (iw) y.h);
        Pair t2 = t(u2, v2, z, y);
        ut utVar3 = (ut) t2.first;
        ut utVar4 = (ut) t2.second;
        Property property = View.TRANSLATION_X;
        if (!z) {
            u2 = this.g;
        }
        float[] fArr = new float[1];
        fArr[i] = u2;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        if (!z) {
            v2 = this.h;
        }
        float[] fArr2 = new float[1];
        fArr2[i] = v2;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        utVar3.a(ofFloat5);
        utVar4.a(ofFloat6);
        arrayList.add(ofFloat5);
        arrayList.add(ofFloat6);
        if (view2 instanceof ViewGroup) {
            View findViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = findViewById != null ? findViewById instanceof ViewGroup ? (ViewGroup) findViewById : null : (ViewGroup) view2;
            if (viewGroup != null) {
                if (z) {
                    if (!z2) {
                        w9.a.set(viewGroup, Float.valueOf(f));
                    }
                    w9 w9Var = w9.a;
                    float[] fArr3 = new float[1];
                    fArr3[i] = 1.0f;
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, w9Var, fArr3);
                } else {
                    w9 w9Var2 = w9.a;
                    float[] fArr4 = new float[1];
                    fArr4[i] = f;
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, w9Var2, fArr4);
                }
                ((tt) y.g).d("contentFade").a(ofFloat4);
                arrayList.add(ofFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        g8.Z(animatorSet, arrayList);
        animatorSet.addListener(new li(z, view2, view));
        int size = arrayList2.size();
        for (int i2 = i; i2 < size; i2++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i2));
        }
        return animatorSet;
    }

    public final float u(View view, View view2, iw iwVar) {
        RectF rectF = this.d;
        x(view, rectF);
        rectF.offset(this.g, this.h);
        RectF rectF2 = this.e;
        x(view2, rectF2);
        iwVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float v(View view, View view2, iw iwVar) {
        RectF rectF = this.d;
        x(view, rectF);
        rectF.offset(this.g, this.h);
        RectF rectF2 = this.e;
        x(view2, rectF2);
        iwVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void x(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f);
        rectF.offsetTo(r3[0], r3[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract o4 y(Context context, boolean z);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }
}
