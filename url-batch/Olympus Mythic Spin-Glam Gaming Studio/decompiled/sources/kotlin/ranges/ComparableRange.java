package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;

/* compiled from: Ranges.kt */
/* loaded from: classes3.dex */
class ComparableRange implements ClosedRange {
    private final Comparable endInclusive;
    private final Comparable start;

    public ComparableRange(Comparable start, Comparable endInclusive) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(endInclusive, "endInclusive");
        this.start = start;
        this.endInclusive = endInclusive;
    }

    @Override // kotlin.ranges.ClosedRange
    public boolean contains(Comparable comparable) {
        return ClosedRange.DefaultImpls.contains(this, comparable);
    }

    @Override // kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return ClosedRange.DefaultImpls.isEmpty(this);
    }

    @Override // kotlin.ranges.ClosedRange
    public Comparable getStart() {
        return this.start;
    }

    @Override // kotlin.ranges.ClosedRange
    public Comparable getEndInclusive() {
        return this.endInclusive;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ComparableRange) {
            if (!isEmpty() || !((ComparableRange) obj).isEmpty()) {
                ComparableRange comparableRange = (ComparableRange) obj;
                if (!Intrinsics.areEqual(getStart(), comparableRange.getStart()) || !Intrinsics.areEqual(getEndInclusive(), comparableRange.getEndInclusive())) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + getEndInclusive().hashCode();
    }

    public String toString() {
        return getStart() + ".." + getEndInclusive();
    }
}
