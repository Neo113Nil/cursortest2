package yads;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

/* loaded from: classes13.dex */
public final class vl3 {
    public final Rect a(View view) {
        vw2 vw2Var;
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            Context context = view.getContext();
            vw2 vw2Var2 = vw2.l;
            if (vw2Var2 == null) {
                synchronized (vw2.k) {
                    vw2Var = vw2.l;
                    if (vw2Var == null) {
                        vw2Var = new vw2();
                        vw2.l = vw2Var;
                    }
                }
                vw2Var2 = vw2Var;
            }
            bu2 a = vw2Var2.a(context);
            if (a == null || !a.n) {
                return rect;
            }
            Rect a2 = xo3.a(view);
            Rect rect2 = new Rect(rect);
            if (rect2.intersect(a2)) {
                return rect2;
            }
        }
        return null;
    }
}
