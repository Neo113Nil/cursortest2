package kotlin.time;

import kotlin.time.TimeSource$Monotonic;

/* compiled from: MonoTimeSource.kt */
/* loaded from: classes6.dex */
public final class MonotonicTimeSource implements TimeSource$WithComparableMarks {
    public static final MonotonicTimeSource INSTANCE = new MonotonicTimeSource();
    private static final long zero = System.nanoTime();

    private MonotonicTimeSource() {
    }

    @Override // kotlin.time.TimeSource$WithComparableMarks
    public /* bridge */ /* synthetic */ ComparableTimeMark markNow() {
        return TimeSource$Monotonic.ValueTimeMark.m8187boximpl(m8184markNowz9LOYto());
    }

    private final long read() {
        return System.nanoTime() - zero;
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    /* renamed from: markNow-z9LOYto, reason: not valid java name */
    public long m8184markNowz9LOYto() {
        return TimeSource$Monotonic.ValueTimeMark.m8188constructorimpl(read());
    }

    /* renamed from: elapsedFrom-6eNON_k, reason: not valid java name */
    public final long m8183elapsedFrom6eNON_k(long j) {
        return LongSaturatedMathKt.saturatingDiff(read(), j, DurationUnit.NANOSECONDS);
    }

    /* renamed from: differenceBetween-fRLX17w, reason: not valid java name */
    public final long m8182differenceBetweenfRLX17w(long j, long j2) {
        return LongSaturatedMathKt.saturatingOriginsDiff(j, j2, DurationUnit.NANOSECONDS);
    }

    /* renamed from: adjustReading-6QKq23U, reason: not valid java name */
    public final long m8181adjustReading6QKq23U(long j, long j2) {
        return TimeSource$Monotonic.ValueTimeMark.m8188constructorimpl(LongSaturatedMathKt.m8179saturatingAddNuflL3o(j, DurationUnit.NANOSECONDS, j2));
    }
}
