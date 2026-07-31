package yads;

import android.graphics.RectF;

/* loaded from: classes14.dex */
public abstract class u13 {
    public static final float a(q13 q13Var, RectF rectF, RectF rectF2) {
        float height = rectF.height();
        float width = rectF.width();
        float height2 = rectF2.height();
        float width2 = rectF2.width();
        if (height == 0.0f || width == 0.0f || height2 == 0.0f || width2 == 0.0f) {
            return Float.MAX_VALUE;
        }
        float min = Math.min(1.0f, width2 / height2 > width / height ? height / height2 : width / width2);
        float f = q13Var.c * min;
        if (width < ((int) f) || height < ((int) (q13Var.d * min))) {
            return Float.MAX_VALUE;
        }
        return Math.abs(height - (q13Var.d * min)) + Math.abs(width - f);
    }
}
