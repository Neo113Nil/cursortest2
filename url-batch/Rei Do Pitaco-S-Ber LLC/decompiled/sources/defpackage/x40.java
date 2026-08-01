package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class x40 extends z50 {
    @Override // defpackage.z50
    public final void d(h60 h60Var) {
        View view = h60Var.b;
        if (view instanceof TextView) {
            h60Var.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // defpackage.z50
    public final void g(h60 h60Var) {
        View view = h60Var.b;
        if (view instanceof TextView) {
            h60Var.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // defpackage.z50
    public final Animator k(ViewGroup viewGroup, h60 h60Var, h60 h60Var2) {
        if (h60Var == null || h60Var2 == null || !(h60Var.b instanceof TextView)) {
            return null;
        }
        View view = h60Var2.b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap hashMap = h60Var.a;
        HashMap hashMap2 = h60Var2.a;
        float floatValue = hashMap.get("android:textscale:scale") != null ? ((Float) hashMap.get("android:textscale:scale")).floatValue() : 1.0f;
        float floatValue2 = hashMap2.get("android:textscale:scale") != null ? ((Float) hashMap2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new b8(3, textView));
        return ofFloat;
    }
}
