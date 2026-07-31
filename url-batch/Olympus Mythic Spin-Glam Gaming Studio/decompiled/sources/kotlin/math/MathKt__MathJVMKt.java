package kotlin.math;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MathJVM.kt */
/* loaded from: classes4.dex */
public abstract class MathKt__MathJVMKt extends MathKt__MathHKt {
    public static int roundToInt(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    public static long roundToLong(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }

    public static int roundToInt(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    public static long roundToLong(float f) {
        return MathKt.roundToLong(f);
    }

    public static int getSign(int i) {
        return Integer.signum(i);
    }

    public static int getSign(long j) {
        return Long.signum(j);
    }
}
