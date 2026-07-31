package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;

/* loaded from: classes8.dex */
public class ColorUtils {
    private static final double ACCESSIBILITY_CONTRAST_RATIO = 4.5d;
    private static final float BRIGHTNESS_CUTOFF = 0.7f;
    private static final char COLOR_PREFIX = '#';
    private static final String SHORT_COLOR_REGEX = String.format("%s([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])", Character.valueOf(COLOR_PREFIX));
    private static final int SHORT_COLOR_WITH_PREFIX_LENGTH = 4;

    public static boolean isColorLight(String str) {
        return androidx.core.graphics.ColorUtils.calculateLuminance(Color.parseColor(str)) > 0.699999988079071d;
    }

    public static boolean isColorLight(int i) {
        return 1.05d / (androidx.core.graphics.ColorUtils.calculateLuminance(i) + 0.05d) < 4.5d;
    }

    public static boolean isComparedColorsLowerThanAccessibilityContrastRatio(int i, int i2) {
        return androidx.core.graphics.ColorUtils.calculateContrast(i, i2) < 4.5d;
    }

    public static int lightenColor(int i) {
        return Color.argb(Color.alpha(i), (Color.red(i) + 255) / 2, (Color.green(i) + 255) / 2, (Color.blue(i) + 255) / 2);
    }

    public static int lightenColor(int i, float f) {
        float[] fArr = {0.0f, 0.0f, r1};
        androidx.core.graphics.ColorUtils.colorToHSL(i, fArr);
        float f2 = fArr[2] + f;
        fArr[2] = Math.max(0.0f, Math.min(f2, 1.0f));
        return androidx.core.graphics.ColorUtils.HSLToColor(fArr);
    }

    public static int darkenColor(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.79f;
        return Color.HSVToColor(fArr);
    }

    public static int darkenColor(int i, float f) {
        float[] fArr = {0.0f, 0.0f, r1};
        androidx.core.graphics.ColorUtils.colorToHSL(i, fArr);
        float f2 = fArr[2] - f;
        fArr[2] = Math.max(0.0f, Math.min(f2, 1.0f));
        return androidx.core.graphics.ColorUtils.HSLToColor(fArr);
    }

    public static int desaturateColor(int i, float f) {
        float[] fArr = {0.0f, r1, 0.0f};
        androidx.core.graphics.ColorUtils.colorToHSL(i, fArr);
        float f2 = fArr[1] - f;
        fArr[1] = Math.max(0.0f, Math.min(f2, 1.0f));
        return androidx.core.graphics.ColorUtils.HSLToColor(fArr);
    }

    public static int buttonTextColorVariant(int i) {
        float[] fArr = new float[3];
        androidx.core.graphics.ColorUtils.colorToHSL(i, fArr);
        float f = fArr[2];
        float f2 = f - 0.3f;
        double d = f;
        if (d > 0.9d) {
            return darkenColor(i, f2);
        }
        return d < 0.35d ? i : darkenColor(i, f2);
    }

    public static int buttonBackgroundColorVariant(int i) {
        float[] fArr = new float[3];
        androidx.core.graphics.ColorUtils.colorToHSL(i, fArr);
        float f = fArr[2];
        float f2 = 0.95f - f;
        float f3 = f - 0.85f;
        double d = f;
        if (d > 0.9d) {
            return darkenColor(i, f3);
        }
        if (d < 0.35d) {
            return lightenColor(i, f2);
        }
        return lightenColor(i, f2);
    }

    public static ColorFilter newGreyscaleFilter() {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        return new ColorMatrixColorFilter(colorMatrix);
    }

    public static void setTextColorWhiteOrBlack(TextView textView, boolean z) {
        int whiteOrBlackColor = whiteOrBlackColor(textView.getContext(), z);
        textView.setTextColor(whiteOrBlackColor);
        textView.setLinkTextColor(whiteOrBlackColor);
    }

    public static void setTextColorWhiteOrDark(TextView textView, boolean z) {
        int whiteOrDarkColor = whiteOrDarkColor(textView.getContext(), z);
        textView.setTextColor(whiteOrDarkColor);
        textView.setLinkTextColor(whiteOrDarkColor);
    }

    public static void setTextColorPrimaryOrDark(TextView textView, AppConfig appConfig) {
        int primaryOrDarkColor = primaryOrDarkColor(textView.getContext(), appConfig);
        textView.setTextColor(primaryOrDarkColor);
        textView.setLinkTextColor(primaryOrDarkColor);
    }

    public static void setTextColorPrimaryOrBlack(TextView textView, AppConfig appConfig) {
        int primaryOrBlackColor = primaryOrBlackColor(textView.getContext(), appConfig);
        textView.setTextColor(primaryOrBlackColor);
        textView.setLinkTextColor(primaryOrBlackColor);
    }

    public static int primaryOrBlackAccessibility(Context context, AppConfig appConfig) {
        if (isColorLight(appConfig.getPrimaryColor())) {
            return ContextCompat.getColor(context, R.color.intercom_accessibility_black);
        }
        return appConfig.getPrimaryColor();
    }

    public static int whiteOrBlackAccessibility(Context context, AppConfig appConfig) {
        if (isColorLight(appConfig.getPrimaryColor())) {
            return ContextCompat.getColor(context, R.color.intercom_accessibility_black);
        }
        return ContextCompat.getColor(context, R.color.intercom_white);
    }

    public static int primaryOrDarkColor(Context context, AppConfig appConfig) {
        return appConfig.isPrimaryColorRenderDarkText() ? ContextCompat.getColor(context, darkColorRes()) : appConfig.getPrimaryColor();
    }

    private static int primaryOrBlackColor(Context context, AppConfig appConfig) {
        return appConfig.isPrimaryColorRenderDarkText() ? ContextCompat.getColor(context, R.color.intercom_black) : appConfig.getPrimaryColor();
    }

    public static int whiteOrDarkColor(Context context, boolean z) {
        if (z) {
            return ContextCompat.getColor(context, darkColorRes());
        }
        return ContextCompat.getColor(context, R.color.intercom_white);
    }

    public static int whiteOrBlackColor(Context context, boolean z) {
        int i;
        if (z) {
            i = R.color.intercom_accessibility_black;
        } else {
            i = R.color.intercom_white;
        }
        return ContextCompat.getColor(context, i);
    }

    public static void setImageColorWhiteOrBlack(ImageView imageView, boolean z) {
        imageView.setColorFilter(whiteOrBlackColor(imageView.getContext(), z));
    }

    public static int parseColor(String str) {
        if (str.length() == 4 && str.charAt(0) == '#') {
            str = str.replaceAll(SHORT_COLOR_REGEX, String.format("%s$1$1$2$2$3$3", Character.valueOf(COLOR_PREFIX)));
        }
        return Color.parseColor(str);
    }

    private static int darkColorRes() {
        return R.color.intercom_accessibility_black;
    }
}
