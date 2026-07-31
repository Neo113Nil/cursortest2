package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: Range.kt */
/* loaded from: classes15.dex */
public interface ClosedRange {
    boolean contains(Comparable comparable);

    Comparable getEndInclusive();

    Comparable getStart();

    boolean isEmpty();

    /* compiled from: Range.kt */
    public static final class DefaultImpls {
        public static boolean contains(ClosedRange closedRange, Comparable value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.compareTo(closedRange.getStart()) >= 0 && value.compareTo(closedRange.getEndInclusive()) <= 0;
        }

        public static boolean isEmpty(ClosedRange closedRange) {
            return closedRange.getStart().compareTo(closedRange.getEndInclusive()) > 0;
        }
    }
}
