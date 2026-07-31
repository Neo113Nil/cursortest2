package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ComparableTimeMark;

/* compiled from: TimeSource.kt */
/* loaded from: classes11.dex */
public final class TimeSource$Monotonic implements TimeSource$WithComparableMarks {
    public static final TimeSource$Monotonic INSTANCE = new TimeSource$Monotonic();

    private TimeSource$Monotonic() {
    }

    @Override // kotlin.time.TimeSource$WithComparableMarks
    public /* bridge */ /* synthetic */ ComparableTimeMark markNow() {
        return ValueTimeMark.m8187boximpl(m8186markNowz9LOYto());
    }

    /* renamed from: markNow-z9LOYto, reason: not valid java name */
    public long m8186markNowz9LOYto() {
        return MonotonicTimeSource.INSTANCE.m8184markNowz9LOYto();
    }

    public String toString() {
        return MonotonicTimeSource.INSTANCE.toString();
    }

    /* compiled from: TimeSource.kt */
    public static final class ValueTimeMark implements ComparableTimeMark {
        private final long reading;

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ValueTimeMark m8187boximpl(long j) {
            return new ValueTimeMark(j);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m8188constructorimpl(long j) {
            return j;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m8190equalsimpl(long j, Object obj) {
            return (obj instanceof ValueTimeMark) && j == ((ValueTimeMark) obj).m8197unboximpl();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m8192hashCodeimpl(long j) {
            return Long.hashCode(j);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m8196toStringimpl(long j) {
            return "ValueTimeMark(reading=" + j + ')';
        }

        public boolean equals(Object obj) {
            return m8190equalsimpl(this.reading, obj);
        }

        public int hashCode() {
            return m8192hashCodeimpl(this.reading);
        }

        public String toString() {
            return m8196toStringimpl(this.reading);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m8197unboximpl() {
            return this.reading;
        }

        @Override // java.lang.Comparable
        public int compareTo(ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        private /* synthetic */ ValueTimeMark(long j) {
            this.reading = j;
        }

        /* renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
        public static long m8189elapsedNowUwyO8pc(long j) {
            return MonotonicTimeSource.INSTANCE.m8183elapsedFrom6eNON_k(j);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: elapsedNow-UwyO8pc */
        public long mo8185elapsedNowUwyO8pc() {
            return m8189elapsedNowUwyO8pc(this.reading);
        }

        /* renamed from: plus-LRDsOJo, reason: not valid java name */
        public static long m8195plusLRDsOJo(long j, long j2) {
            return MonotonicTimeSource.INSTANCE.m8181adjustReading6QKq23U(j, j2);
        }

        /* renamed from: hasPassedNow-impl, reason: not valid java name */
        public static boolean m8191hasPassedNowimpl(long j) {
            return !Duration.m8161isNegativeimpl(m8189elapsedNowUwyO8pc(j));
        }

        @Override // kotlin.time.ComparableTimeMark
        /* renamed from: minus-UwyO8pc */
        public long mo8134minusUwyO8pc(ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return m8194minusUwyO8pc(this.reading, other);
        }

        /* renamed from: minus-UwyO8pc, reason: not valid java name */
        public static long m8194minusUwyO8pc(long j, ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (!(other instanceof ValueTimeMark)) {
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) m8196toStringimpl(j)) + " and " + other);
            }
            return m8193minus6eNON_k(j, ((ValueTimeMark) other).m8197unboximpl());
        }

        /* renamed from: minus-6eNON_k, reason: not valid java name */
        public static final long m8193minus6eNON_k(long j, long j2) {
            return MonotonicTimeSource.INSTANCE.m8182differenceBetweenfRLX17w(j, j2);
        }
    }
}
