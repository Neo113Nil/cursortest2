package yads;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes5.dex */
public abstract class xo3 {
    public static Rect a(View view) {
        Rect rect = new Rect();
        try {
            view.getWindowVisibleDisplayFrame(rect);
        } catch (NullPointerException unused) {
        }
        int[] iArr = {r2, r3};
        view.getRootView().getLocationOnScreen(iArr);
        int i = -iArr[0];
        int i2 = -iArr[1];
        rect.offset(i, i2);
        return rect;
    }
}
