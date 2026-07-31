package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Ranges.kt */
/* loaded from: classes11.dex */
public abstract class RangesKt__RangesKt {
    public static ClosedRange rangeTo(Comparable comparable, Comparable that) {
        Intrinsics.checkNotNullParameter(comparable, "<this>");
        Intrinsics.checkNotNullParameter(that, "that");
        return new ComparableRange(comparable, that);
    }

    public static ClosedFloatingPointRange rangeTo(float f, float f2) {
        return new ClosedFloatRange(f, f2);
    }

    public static final void checkStepIsPositive(boolean z, Number step) {
        Intrinsics.checkNotNullParameter(step, "step");
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }
}
