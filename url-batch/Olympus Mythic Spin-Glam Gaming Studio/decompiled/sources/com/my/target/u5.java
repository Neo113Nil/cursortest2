package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import androidx.core.graphics.PathParser;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public abstract class u5 {
    public static Bitmap a(int i, String str, int i2, Context context) {
        Bitmap bitmap;
        try {
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            mi.a("BaseResources: Cannot build icon - OOME");
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        Path createPathFromPathData = PathParser.createPathFromPathData(str);
        createPathFromPathData.setFillType(Path.FillType.EVEN_ODD);
        RectF rectF = new RectF();
        createPathFromPathData.computeBounds(rectF, true);
        Matrix matrix = new Matrix();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        matrix.postTranslate(-rectF.left, -rectF.top);
        float f = displayMetrics.density;
        matrix.postScale(f, f);
        float f2 = i;
        matrix.postTranslate((f2 - (rectF.width() * f)) / 2.0f, (f2 - (rectF.height() * f)) / 2.0f);
        createPathFromPathData.transform(matrix);
        Paint paint = new Paint();
        paint.setColor(i2);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        new Canvas(bitmap).drawPath(createPathFromPathData, paint);
        return bitmap;
    }

    public static Bitmap b(int i, String str, int i2, Context context) {
        Bitmap bitmap;
        try {
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            mi.a("BaseResources: Cannot build icon - OOME");
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        Paint paint = new Paint();
        Canvas canvas = new Canvas(bitmap);
        paint.setAntiAlias(true);
        paint.setColor(1711276032);
        float f = i;
        canvas.drawOval(new RectF(0.0f, 0.0f, f, f), paint);
        Path createPathFromPathData = PathParser.createPathFromPathData(str);
        RectF rectF = new RectF();
        createPathFromPathData.computeBounds(rectF, true);
        Matrix matrix = new Matrix();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        matrix.postTranslate(-rectF.left, -rectF.top);
        float f2 = displayMetrics.density;
        matrix.postScale(f2, f2);
        matrix.postTranslate((f - (rectF.width() * f2)) / 2.0f, (f - (rectF.height() * f2)) / 2.0f);
        createPathFromPathData.transform(matrix);
        Paint paint2 = new Paint();
        paint2.setColor(i2);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        canvas.drawPath(createPathFromPathData, paint2);
        return bitmap;
    }
}
