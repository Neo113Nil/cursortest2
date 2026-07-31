package com.smaato.sdk.ng.utils.svgparser.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.lang.reflect.Method;

/* loaded from: classes10.dex */
public class CanvasLegacy {
    public static final int ALL_SAVE_FLAG;
    public static final int MATRIX_SAVE_FLAG;
    private static final Method a;
    private static final Method b;

    static {
        try {
            MATRIX_SAVE_FLAG = ((Integer) Canvas.class.getField("MATRIX_SAVE_FLAG").get(null)).intValue();
            ALL_SAVE_FLAG = ((Integer) Canvas.class.getField("ALL_SAVE_FLAG").get(null)).intValue();
            Class cls = Integer.TYPE;
            a = Canvas.class.getMethod("save", cls);
            b = Canvas.class.getMethod("saveLayer", RectF.class, Paint.class, cls);
        } catch (Throwable th) {
            throw a(th);
        }
    }

    private static RuntimeException a(Throwable th) {
        if (th != null) {
            return (RuntimeException) b(th);
        }
        throw new NullPointerException("t");
    }

    private static <T extends Throwable> T b(Throwable th) throws Throwable {
        throw th;
    }

    public static void save(Canvas canvas, int i) {
        try {
            a.invoke(canvas, Integer.valueOf(i));
        } catch (Throwable th) {
            throw a(th);
        }
    }

    public static void saveLayer(Canvas canvas, RectF rectF, Paint paint, int i) {
        try {
            b.invoke(canvas, rectF, paint, Integer.valueOf(i));
        } catch (Throwable th) {
            throw a(th);
        }
    }
}
