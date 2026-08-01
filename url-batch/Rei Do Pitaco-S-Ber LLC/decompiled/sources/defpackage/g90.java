package defpackage;

import android.graphics.PorterDuff;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class g90 {
    public static void a(View view, d90 d90Var) {
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        e90 e90Var = new e90();
        e90Var.a = paddingStart;
        e90Var.b = paddingTop;
        e90Var.c = paddingEnd;
        e90Var.d = paddingBottom;
        o4 o4Var = new o4(d90Var, e90Var, 25);
        WeakHashMap weakHashMap = f80.a;
        x70.c(view, o4Var);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new b90());
        }
    }

    public static PorterDuff.Mode b(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public abstract void c(boolean z);

    public abstract void d(boolean z);
}
