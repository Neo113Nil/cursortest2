package io.bidmachine.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MathUtils.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0007J \u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007J#\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\u000eJ#\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u000fJ#\u0010\u000b\u001a\u0004\u0018\u00010\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J#\u0010\u000b\u001a\u0004\u0018\u00010\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0013J#\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\u000eJ#\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u000fJ#\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J#\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0007J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0007J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lio/bidmachine/util/MathUtils;", "", "()V", "SIN_PI_4", "", "SIN_PI_6", "lerp", "", "start", "end", "fraction", "max", "first", "second", "(Ljava/lang/Double;Ljava/lang/Double;)Ljava/lang/Double;", "(Ljava/lang/Float;Ljava/lang/Float;)Ljava/lang/Float;", "", "(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;", "", "(Ljava/lang/Long;Ljava/lang/Long;)Ljava/lang/Long;", "min", "nonNegative", "value", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class MathUtils {

    @NotNull
    public static final MathUtils INSTANCE = new MathUtils();
    public static final float SIN_PI_4 = 0.70710677f;
    public static final float SIN_PI_6 = 0.5f;

    public static final double lerp(double start, double end, double fraction) {
        return start + (fraction * (end - start));
    }

    public static final float lerp(float start, float end, float fraction) {
        return start + (fraction * (end - start));
    }

    private MathUtils() {
    }

    @Nullable
    public static final Integer min(@Nullable Integer first, @Nullable Integer second) {
        return first != null ? second != null ? Integer.valueOf(Math.min(first.intValue(), second.intValue())) : first : second;
    }

    @Nullable
    public static final Long min(@Nullable Long first, @Nullable Long second) {
        return first != null ? second != null ? Long.valueOf(Math.min(first.longValue(), second.longValue())) : first : second;
    }

    @Nullable
    public static final Float min(@Nullable Float first, @Nullable Float second) {
        return first != null ? second != null ? Float.valueOf(Math.min(first.floatValue(), second.floatValue())) : first : second;
    }

    @Nullable
    public static final Double min(@Nullable Double first, @Nullable Double second) {
        return first != null ? second != null ? Double.valueOf(Math.min(first.doubleValue(), second.doubleValue())) : first : second;
    }

    @Nullable
    public static final Integer max(@Nullable Integer first, @Nullable Integer second) {
        return first != null ? second != null ? Integer.valueOf(Math.max(first.intValue(), second.intValue())) : first : second;
    }

    @Nullable
    public static final Long max(@Nullable Long first, @Nullable Long second) {
        return first != null ? second != null ? Long.valueOf(Math.max(first.longValue(), second.longValue())) : first : second;
    }

    @Nullable
    public static final Float max(@Nullable Float first, @Nullable Float second) {
        return first != null ? second != null ? Float.valueOf(Math.max(first.floatValue(), second.floatValue())) : first : second;
    }

    @Nullable
    public static final Double max(@Nullable Double first, @Nullable Double second) {
        return first != null ? second != null ? Double.valueOf(Math.max(first.doubleValue(), second.doubleValue())) : first : second;
    }

    public static final int nonNegative(int value) {
        return MathUtilsKt.nonNegative(value);
    }

    public static final long nonNegative(long value) {
        return MathUtilsKt.nonNegative(value);
    }

    public static final float nonNegative(float value) {
        return MathUtilsKt.nonNegative(value);
    }

    public static final double nonNegative(double value) {
        return MathUtilsKt.nonNegative(value);
    }
}
