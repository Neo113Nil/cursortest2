package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* compiled from: longSaturatedMath.kt */
/* loaded from: classes6.dex */
public abstract class LongSaturatedMathKt {
    /* renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m8179saturatingAddNuflL3o(long j, DurationUnit unit, long j2) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long m8169toLongimpl = Duration.m8169toLongimpl(j2, unit);
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            return m8178checkInfiniteSumDefinedPjuGub4(j, j2, m8169toLongimpl);
        }
        if ((1 | (m8169toLongimpl - 1)) == Long.MAX_VALUE) {
            return m8180saturatingAddInHalvesNuflL3o(j, unit, j2);
        }
        long j3 = j + m8169toLongimpl;
        return ((j ^ j3) & (m8169toLongimpl ^ j3)) < 0 ? j < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j3;
    }

    /* renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m8178checkInfiniteSumDefinedPjuGub4(long j, long j2, long j3) {
        if (!Duration.m8160isInfiniteimpl(j2) || (j ^ j3) >= 0) {
            return j;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    /* renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m8180saturatingAddInHalvesNuflL3o(long j, DurationUnit durationUnit, long j2) {
        long m8140divUwyO8pc = Duration.m8140divUwyO8pc(j2, 2);
        long m8169toLongimpl = Duration.m8169toLongimpl(m8140divUwyO8pc, durationUnit);
        return (1 | (m8169toLongimpl - 1)) == Long.MAX_VALUE ? m8169toLongimpl : m8179saturatingAddNuflL3o(m8179saturatingAddNuflL3o(j, durationUnit, m8140divUwyO8pc), durationUnit, Duration.m8163minusLRDsOJo(j2, m8140divUwyO8pc));
    }

    private static final long infinityOfSign(long j) {
        return j < 0 ? Duration.Companion.m8175getNEG_INFINITEUwyO8pc$kotlin_stdlib() : Duration.Companion.m8174getINFINITEUwyO8pc();
    }

    public static final long saturatingDiff(long j, long j2, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if ((1 | (j2 - 1)) == Long.MAX_VALUE) {
            return Duration.m8171unaryMinusUwyO8pc(infinityOfSign(j2));
        }
        return saturatingFiniteDiff(j, j2, unit);
    }

    public static final long saturatingOriginsDiff(long j, long j2, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (j == j2) {
                return Duration.Companion.m8176getZEROUwyO8pc();
            }
            return Duration.m8171unaryMinusUwyO8pc(infinityOfSign(j2));
        }
        if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return infinityOfSign(j);
        }
        return saturatingFiniteDiff(j, j2, unit);
    }

    private static final long saturatingFiniteDiff(long j, long j2, DurationUnit durationUnit) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) < 0) {
            DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
            if (durationUnit.compareTo(durationUnit2) < 0) {
                long convertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, durationUnit2, durationUnit);
                long j4 = (j / convertDurationUnit) - (j2 / convertDurationUnit);
                long j5 = (j % convertDurationUnit) - (j2 % convertDurationUnit);
                Duration.Companion companion = Duration.Companion;
                return Duration.m8164plusLRDsOJo(DurationKt.toDuration(j4, durationUnit2), DurationKt.toDuration(j5, durationUnit));
            }
            return Duration.m8171unaryMinusUwyO8pc(infinityOfSign(j3));
        }
        return DurationKt.toDuration(j3, durationUnit);
    }
}
