package io.bidmachine.util;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import kotlin.Metadata;

/* compiled from: ColorUtils.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a\u0016\u0010\u0002\u001a\u00020\u0003*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0001H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0003*\u00020\u0001H\u0007\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a\f\u0010\t\u001a\u00020\u0003*\u00020\u0001H\u0007\u001a\f\u0010\n\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a\f\u0010\u000b\u001a\u00020\u0003*\u00020\u0001H\u0007\u001a\n\u0010\f\u001a\u00020\u0001*\u00020\u0003¨\u0006\r"}, d2 = {"alpha", "", "alphaToRatio", "", POBConstants.KEY_ACCURACY, "blue", "blueToRatio", "brightness", "green", "greenToRatio", "red", "redToRatio", "toColorInt", "bidmachine-android-sdk_bd_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class ColorUtilsKt {
    public static final int toColorInt(@FloatRange float f) {
        return (int) ((f * 255.0f) + 0.5f);
    }

    @FloatRange
    public static final float brightness(@ColorInt int i) {
        return Math.max(redToRatio(i), Math.max(greenToRatio(i), blueToRatio(i)));
    }

    @ColorInt
    public static final int alpha(@ColorInt int i) {
        return ColorUtils.alpha(i);
    }

    @FloatRange
    public static final float alphaToRatio(@ColorInt int i, float f) {
        return ColorUtils.alphaToRatio(i, f);
    }

    public static /* synthetic */ float alphaToRatio$default(int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        return alphaToRatio(i, f);
    }

    @ColorInt
    public static final int red(@ColorInt int i) {
        return ColorUtils.red(i);
    }

    @FloatRange
    public static final float redToRatio(@ColorInt int i) {
        return ColorUtils.redToRatio(i);
    }

    @ColorInt
    public static final int green(@ColorInt int i) {
        return ColorUtils.green(i);
    }

    @FloatRange
    public static final float greenToRatio(@ColorInt int i) {
        return ColorUtils.greenToRatio(i);
    }

    @ColorInt
    public static final int blue(@ColorInt int i) {
        return ColorUtils.blue(i);
    }

    @FloatRange
    public static final float blueToRatio(@ColorInt int i) {
        return ColorUtils.blueToRatio(i);
    }
}
