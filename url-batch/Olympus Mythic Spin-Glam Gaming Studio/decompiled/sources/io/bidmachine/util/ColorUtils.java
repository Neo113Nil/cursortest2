package io.bidmachine.util;

import android.graphics.Color;
import android.os.Build;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.Size;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ColorUtils.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007J0\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u0007H\u0007J\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\u0004H\u0007JL\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u00072\b\b\u0001\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u001c\u0010\u001b\u001a\u00020\u00072\b\b\u0001\u0010\u0014\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J.\u0010\u001d\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0002\u0010\"J\u0019\u0010#\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0002\u0010\"J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J&\u0010%\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u0007H\u0007J7\u0010&\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u00072\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010'¨\u0006("}, d2 = {"Lio/bidmachine/util/ColorUtils;", "", "()V", "alpha", "", "color", "alphaToRatio", "", POBConstants.KEY_ACCURACY, "argb", "red", "green", "blue", "avg", "pixels", "", "withAlpha", "", "step", "blerp", "c1", "c2", "c3", "c4", "f1", "f2", "blueToRatio", "dist", "greenToRatio", "lerp", InneractiveMediationDefs.GENDER_FEMALE, "parseColorARGBSafely", "colorHex", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "parseColorRGBASafely", "redToRatio", "rgb", "rgba", "(FFFLjava/lang/Float;)I", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ColorUtils {

    @NotNull
    public static final ColorUtils INSTANCE = new ColorUtils();

    private ColorUtils() {
    }

    @ColorInt
    public final int blerp(@ColorInt int c1, @ColorInt int c2, @ColorInt int c3, @ColorInt int c4, @FloatRange float f1, @FloatRange float f2, boolean withAlpha) {
        return lerp(lerp(c1, c2, f1, withAlpha), lerp(c3, c4, f1, withAlpha), f2, withAlpha);
    }

    @ColorInt
    public final int lerp(@ColorInt int c1, @ColorInt int c2, @FloatRange float f, boolean withAlpha) {
        return rgba(MathUtils.lerp(ColorUtilsKt.redToRatio(c1), ColorUtilsKt.redToRatio(c2), f), MathUtils.lerp(ColorUtilsKt.greenToRatio(c1), ColorUtilsKt.greenToRatio(c2), f), MathUtils.lerp(ColorUtilsKt.blueToRatio(c1), ColorUtilsKt.blueToRatio(c2), f), withAlpha ? Float.valueOf(MathUtils.lerp(ColorUtilsKt.alphaToRatio$default(c1, 0.0f, 1, null), ColorUtilsKt.alphaToRatio$default(c2, 0.0f, 1, null), f)) : null);
    }

    @FloatRange
    public final float dist(@ColorInt int c1, @ColorInt int c2) {
        float redToRatio = ColorUtilsKt.redToRatio(c1) - ColorUtilsKt.redToRatio(c2);
        float greenToRatio = ColorUtilsKt.greenToRatio(c1) - ColorUtilsKt.greenToRatio(c2);
        float blueToRatio = ColorUtilsKt.blueToRatio(c1) - ColorUtilsKt.blueToRatio(c2);
        return (float) Math.sqrt((redToRatio * redToRatio) + (greenToRatio * greenToRatio) + (blueToRatio * blueToRatio));
    }

    public static /* synthetic */ int avg$default(ColorUtils colorUtils, int[] iArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return colorUtils.avg(iArr, z, i);
    }

    @ColorInt
    public final int avg(@NotNull int[] pixels, boolean withAlpha, @Size int step) {
        Intrinsics.checkNotNullParameter(pixels, "pixels");
        int i = withAlpha ? 4 : 3;
        float[] fArr = new float[i];
        int length = pixels.length - 1;
        if (step <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
        }
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, length, step);
        long j = 0;
        if (progressionLastElement >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = pixels[i2];
                fArr[0] = fArr[0] + ColorUtilsKt.redToRatio(i3);
                fArr[1] = fArr[1] + ColorUtilsKt.greenToRatio(i3);
                fArr[2] = fArr[2] + ColorUtilsKt.blueToRatio(i3);
                if (i > 3) {
                    fArr[3] = fArr[3] + ColorUtilsKt.alphaToRatio$default(i3, 0.0f, 1, null);
                }
                j++;
                if (i2 == progressionLastElement) {
                    break;
                }
                i2 += step;
            }
        }
        float f = j;
        float f2 = fArr[0] / f;
        float f3 = fArr[1] / f;
        float f4 = fArr[2] / f;
        Float orNull = ArraysKt.getOrNull(fArr, 3);
        return rgba(f2, f3, f4, orNull != null ? Float.valueOf(orNull.floatValue() / f) : null);
    }

    public static /* synthetic */ int rgba$default(ColorUtils colorUtils, float f, float f2, float f3, Float f4, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = null;
        }
        return colorUtils.rgba(f, f2, f3, f4);
    }

    @ColorInt
    public final int rgba(@FloatRange float red, @FloatRange float green, @FloatRange float blue, @FloatRange @Nullable Float alpha) {
        if (alpha != null) {
            return argb(alpha.floatValue(), red, green, blue);
        }
        return rgb(red, green, blue);
    }

    @ColorInt
    public final int argb(@FloatRange float alpha, @FloatRange float red, @FloatRange float green, @FloatRange float blue) {
        int argb;
        if (Build.VERSION.SDK_INT >= 26) {
            argb = Color.argb(alpha, red, green, blue);
            return argb;
        }
        return (ColorUtilsKt.toColorInt(alpha) << 24) | (ColorUtilsKt.toColorInt(red) << 16) | (ColorUtilsKt.toColorInt(green) << 8) | ColorUtilsKt.toColorInt(blue);
    }

    @ColorInt
    public final int rgb(@FloatRange float red, @FloatRange float green, @FloatRange float blue) {
        int rgb;
        if (Build.VERSION.SDK_INT >= 26) {
            rgb = Color.rgb(red, green, blue);
            return rgb;
        }
        return (ColorUtilsKt.toColorInt(red) << 16) | (-16777216) | (ColorUtilsKt.toColorInt(green) << 8) | ColorUtilsKt.toColorInt(blue);
    }

    @Nullable
    public static final Integer parseColorARGBSafely(@Nullable String colorHex) {
        if (colorHex == null || colorHex.length() == 0) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(colorHex));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final Integer parseColorRGBASafely(@Nullable String colorHex) {
        if (colorHex == null || colorHex.length() == 0) {
            return null;
        }
        try {
            if (colorHex.charAt(0) == '#' && colorHex.length() == 9) {
                StringBuilder sb = new StringBuilder();
                sb.append('#');
                String substring = colorHex.substring(7, 9);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(substring);
                String substring2 = colorHex.substring(1, 7);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(substring2);
                colorHex = sb.toString();
            }
            return Integer.valueOf(Color.parseColor(colorHex));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final int alpha(int color) {
        return Color.alpha(color);
    }

    @FloatRange
    public static final float alphaToRatio(int color, float accuracy) {
        return UtilsKt.toRatio(Integer.valueOf(alpha(color)), 255.0f, accuracy);
    }

    public static /* synthetic */ float alphaToRatio$default(int i, float f, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return alphaToRatio(i, f);
    }

    public static final int red(int color) {
        return Color.red(color);
    }

    @FloatRange
    public static final float redToRatio(int color) {
        return UtilsKt.toRatio$default((Number) Integer.valueOf(red(color)), 255.0f, 0.0f, 2, (Object) null);
    }

    public static final int green(int color) {
        return Color.green(color);
    }

    @FloatRange
    public static final float greenToRatio(int color) {
        return UtilsKt.toRatio$default((Number) Integer.valueOf(green(color)), 255.0f, 0.0f, 2, (Object) null);
    }

    public static final int blue(int color) {
        return Color.blue(color);
    }

    @FloatRange
    public static final float blueToRatio(int color) {
        return UtilsKt.toRatio$default((Number) Integer.valueOf(blue(color)), 255.0f, 0.0f, 2, (Object) null);
    }
}
