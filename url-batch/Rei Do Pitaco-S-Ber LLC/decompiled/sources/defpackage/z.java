package defpackage;

import android.graphics.Typeface;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class z {
    public static /* synthetic */ Typeface.CustomFallbackBuilder e(FontFamily fontFamily) {
        return new Typeface.CustomFallbackBuilder(fontFamily);
    }

    public static /* bridge */ /* synthetic */ ColorStateListDrawable f(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* synthetic */ FontFamily.Builder h(Font font) {
        return new FontFamily.Builder(font);
    }

    public static /* synthetic */ void l() {
    }

    public static /* bridge */ /* synthetic */ boolean s(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }

    public static /* synthetic */ FontFamily.Builder w(Font font) {
        return new FontFamily.Builder(font);
    }
}
