package yads;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes4.dex */
public final class tl3 {
    public final pb2 a;
    public final vl3 b;

    public tl3() {
        pb2 pb2Var = new pb2();
        vl3 vl3Var = new vl3();
        this.a = pb2Var;
        this.b = vl3Var;
    }

    public static String b(View view) {
        int visibility = view.getVisibility();
        return "view is not shown: visibility=" + (visibility != 0 ? visibility != 4 ? visibility != 8 ? "UNKNOWN" : "GONE" : "INVISIBLE" : "VISIBLE") + ", attached=" + view.isAttachedToWindow();
    }

    public static String c(View view) {
        return "view rect is null: " + (!view.isAttachedToWindow() ? "not attached" : (view.getWidth() <= 0 || view.getHeight() <= 0) ? "zero size" : "scrolled off");
    }

    public final ul3 a(View view) {
        if (!view.isShown()) {
            return new ul3(0, b(view));
        }
        if (view.getAlpha() == 0.0f) {
            return new ul3(0, "view is transparent");
        }
        Rect a = this.b.a(view);
        if (a == null) {
            return new ul3(0, c(view));
        }
        int height = (a.height() * a.width()) - this.a.a(view, a);
        return new ul3(height, height <= 0 ? "no visible area" : null);
    }
}
