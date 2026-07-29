package o;

import android.text.PrecomputedText;
import android.text.TextPaint;
import android.view.DisplayCutout;

/* loaded from: classes.dex */
public abstract /* synthetic */ class OI {
    public static /* synthetic */ PrecomputedText.Params.Builder b(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout d(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean j(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ boolean k(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
