package yads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.ImageView;

/* loaded from: classes6.dex */
public final class w13 {
    public final Matrix a = new Matrix();
    public final Paint b;
    public final Rect c;

    public w13() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#2E7D32"));
        paint.setStrokeWidth(10.0f);
        this.b = paint;
        this.c = new Rect();
    }

    public final void a(ImageView imageView, Bitmap bitmap, q13 q13Var) {
        float f;
        float width = imageView.getWidth();
        float height = imageView.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        float f2 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        if (height == 0.0f || height2 == 0.0f) {
            return;
        }
        boolean z = width / height > width2 / height2;
        float f3 = z ? width / width2 : height / height2;
        float f4 = width2 * f3;
        float f5 = height2 * f3;
        if (z) {
            f = 0.0f;
        } else {
            f = (width / 2) - (((q13Var.c / 2) + q13Var.a) * f3);
            Float valueOf2 = f > 0.0f ? valueOf : f + f4 < width ? Float.valueOf(width - f4) : null;
            if (valueOf2 != null) {
                f = valueOf2.floatValue();
            }
        }
        if (z) {
            float f6 = (height / 2) - (((q13Var.d / 2) + q13Var.b) * f3);
            if (f6 <= 0.0f) {
                valueOf = f6 + f5 < height ? Float.valueOf(height - f5) : null;
            }
            f2 = valueOf != null ? valueOf.floatValue() : f6;
        }
        this.a.setScale(f3, f3);
        this.a.postTranslate(f, f2);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageMatrix(this.a);
        if (((qg1) sg1.a(imageView.getContext(), "YadPreferenceFile")).a("preference_smart_centers_debug_enabled", false)) {
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(copy);
            Rect rect = this.c;
            int i = q13Var.a;
            int i2 = q13Var.b;
            rect.set(i, i2, q13Var.c + i, q13Var.d + i2);
            canvas.drawRect(rect, this.b);
            imageView.setImageBitmap(copy);
        }
    }
}
