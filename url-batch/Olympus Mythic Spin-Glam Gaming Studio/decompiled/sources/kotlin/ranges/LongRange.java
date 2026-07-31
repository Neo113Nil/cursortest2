package kotlin.ranges;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PrimitiveRanges.kt */
/* loaded from: classes10.dex */
public final class LongRange extends LongProgression implements ClosedRange {
    public static final Companion Companion = new Companion(null);
    private static final LongRange EMPTY = new LongRange(1, 0);

    public LongRange(long j, long j2) {
        super(j, j2, 1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).longValue());
    }

    @Override // kotlin.ranges.ClosedRange
    public Long getStart() {
        return Long.valueOf(getFirst());
    }

    @Override // kotlin.ranges.ClosedRange
    public Long getEndInclusive() {
        return Long.valueOf(getLast());
    }

    public boolean contains(long j) {
        return getFirst() <= j && j <= getLast();
    }

    @Override // kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    public boolean equals(Object obj) {
        if (obj instanceof LongRange) {
            if (!isEmpty() || !((LongRange) obj).isEmpty()) {
                LongRange longRange = (LongRange) obj;
                if (getFirst() != longRange.getFirst() || getLast() != longRange.getLast()) {
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
        return (int) ((31 * (getFirst() ^ (getFirst() >>> 32))) + (getLast() ^ (getLast() >>> 32)));
    }

    public String toString() {
        return getFirst() + ".." + getLast();
    }

    /* compiled from: PrimitiveRanges.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
