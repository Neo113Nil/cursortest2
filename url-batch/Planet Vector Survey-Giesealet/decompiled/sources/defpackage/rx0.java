package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class rx0 {
    public static final ze0 a;
    public static Paint b;

    static {
        ch0.d("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new xx0();
        } else if (i >= 29) {
            a = new wx0();
        } else if (i >= 28) {
            a = new vx0();
        } else if (i >= 26) {
            a = new ux0();
        } else {
            if (i >= 24) {
                Method method = tx0.c;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    a = new tx0();
                }
            }
            a = new sx0();
        }
        new p01(10);
        b = null;
        Trace.endSection();
    }

    public static Font a(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (b == null) {
            b = new Paint();
        }
        b.setTextSize(10.0f);
        b.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, b);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
