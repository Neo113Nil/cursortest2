package com.smaato.sdk.ng.views.shape.path.parser;

import android.graphics.Matrix;
import android.util.Log;

/* loaded from: classes6.dex */
class g {
    private static final String a = SvgToPath.class.getSimpleName();

    static Matrix a(String str) {
        int i;
        Matrix matrix = new Matrix();
        while (true) {
            a(str, matrix);
            int indexOf = str.indexOf(")");
            if (indexOf <= 0 || str.length() <= (i = indexOf + 1)) {
                break;
            }
            str = str.substring(i).replaceFirst("[\\s,]*", "");
        }
        return matrix;
    }

    private static void a(String str, Matrix matrix) {
        float f;
        if (str.startsWith("matrix(")) {
            c a2 = c.a(str.substring(7));
            if (a2.a.size() == 6) {
                Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[]{a2.a.get(0).floatValue(), a2.a.get(2).floatValue(), a2.a.get(4).floatValue(), a2.a.get(1).floatValue(), a2.a.get(3).floatValue(), a2.a.get(5).floatValue(), 0.0f, 0.0f, 1.0f});
                matrix.preConcat(matrix2);
                return;
            }
            return;
        }
        if (str.startsWith("translate(")) {
            c a3 = c.a(str.substring(10));
            if (a3.a.size() > 0) {
                matrix.preTranslate(a3.a.get(0).floatValue(), a3.a.size() > 1 ? a3.a.get(1).floatValue() : 0.0f);
                return;
            }
            return;
        }
        if (str.startsWith("scale(")) {
            c a4 = c.a(str.substring(6));
            if (a4.a.size() > 0) {
                float floatValue = a4.a.get(0).floatValue();
                matrix.preScale(floatValue, a4.a.size() > 1 ? a4.a.get(1).floatValue() : floatValue);
                return;
            }
            return;
        }
        if (str.startsWith("skewX(")) {
            if (c.a(str.substring(6)).a.size() > 0) {
                matrix.preSkew((float) Math.tan(r0.a.get(0).floatValue()), 0.0f);
                return;
            }
            return;
        }
        if (str.startsWith("skewY(")) {
            if (c.a(str.substring(6)).a.size() > 0) {
                matrix.preSkew(0.0f, (float) Math.tan(r0.a.get(0).floatValue()));
                return;
            }
            return;
        }
        float f2 = 0.0f;
        if (str.startsWith("rotate(")) {
            c a5 = c.a(str.substring(7));
            if (a5.a.size() > 0) {
                float floatValue2 = a5.a.get(0).floatValue();
                if (a5.a.size() > 2) {
                    f2 = a5.a.get(1).floatValue();
                    f = a5.a.get(2).floatValue();
                } else {
                    f = 0.0f;
                }
                matrix.preTranslate(f2, f);
                matrix.preRotate(floatValue2);
                matrix.preTranslate(-f2, -f);
                return;
            }
            return;
        }
        Log.w(a, "Invalid transform (" + str + ")");
    }
}
