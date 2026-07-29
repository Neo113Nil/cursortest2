package o;

import android.graphics.BlendMode;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class X10 {
    public static final X10 a = new X10();

    public final void a(Paint paint, int i) {
        paint.setBlendMode(i == 0 ? BlendMode.CLEAR : i == 1 ? BlendMode.SRC : i == 2 ? BlendMode.DST : i == 3 ? BlendMode.SRC_OVER : i == 4 ? BlendMode.DST_OVER : i == 5 ? BlendMode.SRC_IN : i == 6 ? BlendMode.DST_IN : i == 7 ? BlendMode.SRC_OUT : i == 8 ? BlendMode.DST_OUT : i == 9 ? BlendMode.SRC_ATOP : i == 10 ? BlendMode.DST_ATOP : i == 11 ? BlendMode.XOR : i == 12 ? BlendMode.PLUS : i == 13 ? BlendMode.MODULATE : i == 14 ? BlendMode.SCREEN : i == 15 ? BlendMode.OVERLAY : i == 16 ? BlendMode.DARKEN : i == 17 ? BlendMode.LIGHTEN : i == 18 ? BlendMode.COLOR_DODGE : i == 19 ? BlendMode.COLOR_BURN : i == 20 ? BlendMode.HARD_LIGHT : i == 21 ? BlendMode.SOFT_LIGHT : i == 22 ? BlendMode.DIFFERENCE : i == 23 ? BlendMode.EXCLUSION : i == 24 ? BlendMode.MULTIPLY : i == 25 ? BlendMode.HUE : i == 26 ? BlendMode.SATURATION : i == 27 ? BlendMode.COLOR : i == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER);
    }
}
