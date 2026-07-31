package yads;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import kotlin.math.MathKt;

/* loaded from: classes15.dex */
public final class jp0 {
    public final ip0 a(View view) {
        int i;
        RectF rectF = null;
        if (kl3.a(view)) {
            i = hl3.a(view);
            Rect rect = new Rect();
            if (view.getLocalVisibleRect(rect)) {
                rect.offset(view.getLeft(), view.getTop());
            } else {
                rect = null;
            }
            Context context = view.getContext();
            if (rect != null) {
                float a = yg0.a(context, rect.left);
                float roundToInt = MathKt.roundToInt(rect.top / context.getResources().getDisplayMetrics().density);
                float roundToInt2 = MathKt.roundToInt(rect.right / context.getResources().getDisplayMetrics().density);
                float roundToInt3 = MathKt.roundToInt(rect.bottom / context.getResources().getDisplayMetrics().density);
                float f = roundToInt3 - roundToInt;
                if (roundToInt2 - a > 0.0f && f > 0.0f) {
                    rectF = new RectF(a, roundToInt, roundToInt2, roundToInt3);
                }
            }
        } else {
            i = 0;
        }
        return new ip0(i, rectF);
    }
}
