package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class q9 extends z50 {
    public static final String[] G = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final m9 H = new m9(PointF.class, "topLeft", 0);
    public static final m9 I = new m9(PointF.class, "bottomRight", 1);
    public static final m9 J = new m9(PointF.class, "bottomRight", 2);
    public static final m9 K = new m9(PointF.class, "topLeft", 3);
    public static final m9 L = new m9(PointF.class, "position", 4);

    public static void J(h60 h60Var) {
        View view = h60Var.b;
        HashMap hashMap = h60Var.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // defpackage.z50
    public final void d(h60 h60Var) {
        J(h60Var);
    }

    @Override // defpackage.z50
    public final void g(h60 h60Var) {
        J(h60Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.z50
    public final Animator k(ViewGroup viewGroup, h60 h60Var, h60 h60Var2) {
        int i;
        q9 q9Var;
        ObjectAnimator a;
        if (h60Var == null) {
            return null;
        }
        HashMap hashMap = h60Var.a;
        if (h60Var2 == null) {
            return null;
        }
        HashMap hashMap2 = h60Var2.a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = h60Var2.b;
        Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        f90.a(view, i2, i4, i6, i8);
        if (i14 != 2) {
            q9Var = this;
            if (i2 == i3 && i4 == i5) {
                q9Var.B.getClass();
                a = cv.a(view, J, iw.f(i6, i8, i7, i9));
            } else {
                q9Var.B.getClass();
                a = cv.a(view, K, iw.f(i2, i4, i3, i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            q9Var = this;
            q9Var.B.getClass();
            a = cv.a(view, L, iw.f(i2, i4, i3, i5));
        } else {
            q9Var = this;
            p9 p9Var = new p9(view);
            q9Var.B.getClass();
            ObjectAnimator a2 = cv.a(p9Var, H, iw.f(i2, i4, i3, i5));
            q9Var.B.getClass();
            ObjectAnimator a3 = cv.a(p9Var, I, iw.f(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(a2, a3);
            animatorSet.addListener(new n9(p9Var));
            a = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            k80.b(viewGroup4, true);
            q9Var.p().a(new o9(viewGroup4));
        }
        return a;
    }

    @Override // defpackage.z50
    public final String[] r() {
        return G;
    }
}
