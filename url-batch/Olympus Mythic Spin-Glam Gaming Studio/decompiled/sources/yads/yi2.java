package yads;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.util.Iterator;
import kotlin.collections.IntIterator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final class yi2 {
    public final Bitmap a(Bitmap bitmap, q31 q31Var) {
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0 || q31Var.a == 0 || q31Var.b == 0) {
            return bitmap;
        }
        if (bitmap.getWidth() * q31Var.b == bitmap.getHeight() * q31Var.a) {
            return bitmap;
        }
        j03 j03Var = new j03(bitmap.getWidth(), bitmap.getHeight());
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && q31Var.a != 0 && q31Var.b != 0) {
            Iterator it = new IntRange(bitmap.getWidth(), Math.max(bitmap.getWidth(), Math.min(100, (q31Var.a * 100) / q31Var.b))).iterator();
            double d = 1.0d;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int nextInt = ((IntIterator) it).nextInt();
                int i = q31Var.b * nextInt;
                int i2 = q31Var.a;
                if (i % i2 == 0) {
                    j03Var = new j03(nextInt, i / i2);
                    break;
                }
                double d2 = i / i2;
                int roundToInt = MathKt.roundToInt(d2);
                double abs = Math.abs(roundToInt - d2) / d2;
                if (abs < d) {
                    j03Var = new j03(nextInt, roundToInt);
                    d = abs;
                }
            }
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = j03Var.b;
        j03 j03Var2 = new j03(i3, (i3 * height) / width);
        int i4 = j03Var.c;
        j03 j03Var3 = (j03) ComparisonsKt.maxOf(j03Var2, new j03((width * i4) / height, i4));
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, j03Var3.b, j03Var3.c, false);
        int width2 = (createScaledBitmap.getWidth() - j03Var.b) / 2;
        int height2 = createScaledBitmap.getHeight();
        int i5 = j03Var.c;
        return Bitmap.createBitmap(createScaledBitmap, width2, (height2 - i5) / 2, j03Var.b, i5, (Matrix) null, false);
    }
}
