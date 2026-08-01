package G0;

import android.text.PrecomputedText;
import android.text.TextPaint;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* synthetic */ PrecomputedText.Params.Builder h(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ boolean r(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
