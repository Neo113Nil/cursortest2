package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.vectorharbor.planetvectorsurvey.R;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class h11 extends k11 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final yq f = new yq();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(l11 l11Var, View view) {
        c11 j = j(view);
        if (j != null) {
            j.b(l11Var);
            if (j.e == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(l11Var, viewGroup.getChildAt(i));
            }
        }
    }

    public static void g(View view, l11 l11Var, d21 d21Var, boolean z) {
        c11 j = j(view);
        if (j != null) {
            j.d = d21Var;
            if (!z) {
                j.c(l11Var);
                z = j.e == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), l11Var, d21Var, z);
            }
        }
    }

    public static void h(View view, d21 d21Var, List list) {
        c11 j = j(view);
        if (j != null) {
            d21Var = j.d(d21Var, list);
            if (j.e == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), d21Var, list);
            }
        }
    }

    public static void i(View view, l11 l11Var, j3 j3Var) {
        c11 j = j(view);
        if (j != null) {
            j.e(l11Var, j3Var);
            if (j.e == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), l11Var, j3Var);
            }
        }
    }

    public static c11 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof g11) {
            return ((g11) tag).a;
        }
        return null;
    }
}
