package kotlin.ranges;

/* compiled from: Ranges.kt */
/* loaded from: classes6.dex */
public interface ClosedFloatingPointRange extends ClosedRange {
    @Override // kotlin.ranges.ClosedRange
    boolean contains(Comparable comparable);

    @Override // kotlin.ranges.ClosedRange
    boolean isEmpty();

    boolean lessThanOrEquals(Comparable comparable, Comparable comparable2);
}
