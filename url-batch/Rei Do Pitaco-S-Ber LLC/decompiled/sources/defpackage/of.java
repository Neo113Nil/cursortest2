package defpackage;

import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class of {
    public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static int b(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static int c(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static PrecomputedText.Params g(p5 p5Var) {
        return p5Var.getTextMetricsParams();
    }

    public static void h(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static boolean i(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
