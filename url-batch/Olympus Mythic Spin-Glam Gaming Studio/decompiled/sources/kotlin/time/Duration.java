package kotlin.time;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: Duration.kt */
/* loaded from: classes15.dex */
public final class Duration implements Comparable {
    private static final long INFINITE;
    private static final long NEG_INFINITE;
    private final long rawValue;
    public static final Companion Companion = new Companion(null);
    private static final long ZERO = m8139constructorimpl(0);

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m8137boximpl(long j) {
        return new Duration(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8141equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).m8173unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8142equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    private static final long m8155getValueimpl(long j) {
        return j >> 1;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8156hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m8158isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    /* renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m8159isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    /* renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m8161isNegativeimpl(long j) {
        return j < 0;
    }

    /* renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m8162isPositiveimpl(long j) {
        return j > 0;
    }

    public boolean equals(Object obj) {
        return m8141equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m8156hashCodeimpl(this.rawValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m8173unboximpl() {
        return this.rawValue;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m8172compareToLRDsOJo(((Duration) obj).m8173unboximpl());
    }

    private /* synthetic */ Duration(long j) {
        this.rawValue = j;
    }

    /* renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m8154getStorageUnitimpl(long j) {
        return m8159isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8139constructorimpl(long j) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m8159isInNanosimpl(j)) {
                long m8155getValueimpl = m8155getValueimpl(j);
                if (-4611686018426999999L > m8155getValueimpl || m8155getValueimpl >= 4611686018427000000L) {
                    throw new AssertionError(m8155getValueimpl(j) + " ns is out of nanoseconds range");
                }
            } else {
                long m8155getValueimpl2 = m8155getValueimpl(j);
                if (-4611686018427387903L > m8155getValueimpl2 || m8155getValueimpl2 >= 4611686018427387904L) {
                    throw new AssertionError(m8155getValueimpl(j) + " ms is out of milliseconds range");
                }
                long m8155getValueimpl3 = m8155getValueimpl(j);
                if (-4611686018426L <= m8155getValueimpl3 && m8155getValueimpl3 < 4611686018427L) {
                    throw new AssertionError(m8155getValueimpl(j) + " ms is denormalized");
                }
            }
        }
        return j;
    }

    /* compiled from: Duration.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m8176getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        /* renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m8174getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m8175getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        /* renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m8177parseIsoStringUwyO8pc(String value) {
            long parseDuration;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                parseDuration = DurationKt.parseDuration(value, true);
                return parseDuration;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e);
            }
        }
    }

    static {
        long durationOfMillis;
        long durationOfMillis2;
        durationOfMillis = DurationKt.durationOfMillis(4611686018427387903L);
        INFINITE = durationOfMillis;
        durationOfMillis2 = DurationKt.durationOfMillis(-4611686018427387903L);
        NEG_INFINITE = durationOfMillis2;
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m8171unaryMinusUwyO8pc(long j) {
        long durationOf;
        durationOf = DurationKt.durationOf(-m8155getValueimpl(j), ((int) j) & 1);
        return durationOf;
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m8164plusLRDsOJo(long j, long j2) {
        long durationOfMillisNormalized;
        long durationOfNanosNormalized;
        if (m8160isInfiniteimpl(j)) {
            if (m8157isFiniteimpl(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m8160isInfiniteimpl(j2)) {
            return j2;
        }
        if ((((int) j) & 1) == (((int) j2) & 1)) {
            long m8155getValueimpl = m8155getValueimpl(j) + m8155getValueimpl(j2);
            if (m8159isInNanosimpl(j)) {
                durationOfNanosNormalized = DurationKt.durationOfNanosNormalized(m8155getValueimpl);
                return durationOfNanosNormalized;
            }
            durationOfMillisNormalized = DurationKt.durationOfMillisNormalized(m8155getValueimpl);
            return durationOfMillisNormalized;
        }
        if (m8158isInMillisimpl(j)) {
            return m8135addValuesMixedRangesUwyO8pc(j, m8155getValueimpl(j), m8155getValueimpl(j2));
        }
        return m8135addValuesMixedRangesUwyO8pc(j, m8155getValueimpl(j2), m8155getValueimpl(j));
    }

    /* renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m8135addValuesMixedRangesUwyO8pc(long j, long j2, long j3) {
        long nanosToMillis;
        long durationOfMillis;
        long millisToNanos;
        long millisToNanos2;
        long durationOfNanos;
        nanosToMillis = DurationKt.nanosToMillis(j3);
        long j4 = j2 + nanosToMillis;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            durationOfMillis = DurationKt.durationOfMillis(RangesKt.coerceIn(j4, -4611686018427387903L, 4611686018427387903L));
            return durationOfMillis;
        }
        millisToNanos = DurationKt.millisToNanos(nanosToMillis);
        long j5 = j3 - millisToNanos;
        millisToNanos2 = DurationKt.millisToNanos(j4);
        durationOfNanos = DurationKt.durationOfNanos(millisToNanos2 + j5);
        return durationOfNanos;
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m8163minusLRDsOJo(long j, long j2) {
        return m8164plusLRDsOJo(j, m8171unaryMinusUwyO8pc(j2));
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m8165timesUwyO8pc(long j, int i) {
        long durationOfMillis;
        long nanosToMillis;
        long millisToNanos;
        long nanosToMillis2;
        long durationOfMillis2;
        long durationOfNanosNormalized;
        long durationOfNanos;
        if (m8160isInfiniteimpl(j)) {
            if (i != 0) {
                return i > 0 ? j : m8171unaryMinusUwyO8pc(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i == 0) {
            return ZERO;
        }
        long m8155getValueimpl = m8155getValueimpl(j);
        long j2 = i;
        long j3 = m8155getValueimpl * j2;
        if (!m8159isInNanosimpl(j)) {
            if (j3 / j2 != m8155getValueimpl) {
                return MathKt.getSign(m8155getValueimpl) * MathKt.getSign(i) > 0 ? INFINITE : NEG_INFINITE;
            }
            durationOfMillis = DurationKt.durationOfMillis(RangesKt.coerceIn(j3, new LongRange(-4611686018427387903L, 4611686018427387903L)));
            return durationOfMillis;
        }
        if (-2147483647L <= m8155getValueimpl && m8155getValueimpl < 2147483648L) {
            durationOfNanos = DurationKt.durationOfNanos(j3);
            return durationOfNanos;
        }
        if (j3 / j2 == m8155getValueimpl) {
            durationOfNanosNormalized = DurationKt.durationOfNanosNormalized(j3);
            return durationOfNanosNormalized;
        }
        nanosToMillis = DurationKt.nanosToMillis(m8155getValueimpl);
        millisToNanos = DurationKt.millisToNanos(nanosToMillis);
        long j4 = nanosToMillis * j2;
        nanosToMillis2 = DurationKt.nanosToMillis((m8155getValueimpl - millisToNanos) * j2);
        long j5 = nanosToMillis2 + j4;
        if (j4 / j2 != nanosToMillis || (j5 ^ j4) < 0) {
            return MathKt.getSign(m8155getValueimpl) * MathKt.getSign(i) > 0 ? INFINITE : NEG_INFINITE;
        }
        durationOfMillis2 = DurationKt.durationOfMillis(RangesKt.coerceIn(j5, new LongRange(-4611686018427387903L, 4611686018427387903L)));
        return durationOfMillis2;
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m8140divUwyO8pc(long j, int i) {
        long durationOfMillis;
        long millisToNanos;
        long millisToNanos2;
        long durationOfNanos;
        long durationOfNanos2;
        if (i == 0) {
            if (m8162isPositiveimpl(j)) {
                return INFINITE;
            }
            if (m8161isNegativeimpl(j)) {
                return NEG_INFINITE;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m8159isInNanosimpl(j)) {
            durationOfNanos2 = DurationKt.durationOfNanos(m8155getValueimpl(j) / i);
            return durationOfNanos2;
        }
        if (m8160isInfiniteimpl(j)) {
            return m8165timesUwyO8pc(j, MathKt.getSign(i));
        }
        long j2 = i;
        long m8155getValueimpl = m8155getValueimpl(j) / j2;
        if (-4611686018426L > m8155getValueimpl || m8155getValueimpl >= 4611686018427L) {
            durationOfMillis = DurationKt.durationOfMillis(m8155getValueimpl);
            return durationOfMillis;
        }
        millisToNanos = DurationKt.millisToNanos(m8155getValueimpl(j) - (m8155getValueimpl * j2));
        millisToNanos2 = DurationKt.millisToNanos(m8155getValueimpl);
        durationOfNanos = DurationKt.durationOfNanos(millisToNanos2 + (millisToNanos / j2));
        return durationOfNanos;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m8160isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m8157isFiniteimpl(long j) {
        return !m8160isInfiniteimpl(j);
    }

    /* renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m8143getAbsoluteValueUwyO8pc(long j) {
        return m8161isNegativeimpl(j) ? m8171unaryMinusUwyO8pc(j) : j;
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m8172compareToLRDsOJo(long j) {
        return m8138compareToLRDsOJo(this.rawValue, j);
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m8138compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m8161isNegativeimpl(j) ? -i : i;
    }

    /* renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m8144getHoursComponentimpl(long j) {
        if (m8160isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m8146getInWholeHoursimpl(j) % 24);
    }

    /* renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m8151getMinutesComponentimpl(long j) {
        if (m8160isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m8148getInWholeMinutesimpl(j) % 60);
    }

    /* renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m8153getSecondsComponentimpl(long j) {
        if (m8160isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m8150getInWholeSecondsimpl(j) % 60);
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m8152getNanosecondsComponentimpl(long j) {
        long m8155getValueimpl;
        if (m8160isInfiniteimpl(j)) {
            return 0;
        }
        if (m8158isInMillisimpl(j)) {
            m8155getValueimpl = DurationKt.millisToNanos(m8155getValueimpl(j) % 1000);
        } else {
            m8155getValueimpl = m8155getValueimpl(j) % 1000000000;
        }
        return (int) m8155getValueimpl;
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m8166toDoubleimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m8155getValueimpl(j), m8154getStorageUnitimpl(j), unit);
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m8169toLongimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m8155getValueimpl(j), m8154getStorageUnitimpl(j), unit);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m8167toIntimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) RangesKt.coerceIn(m8169toLongimpl(j, unit), -2147483648L, 2147483647L);
    }

    /* renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m8145getInWholeDaysimpl(long j) {
        return m8169toLongimpl(j, DurationUnit.DAYS);
    }

    /* renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m8146getInWholeHoursimpl(long j) {
        return m8169toLongimpl(j, DurationUnit.HOURS);
    }

    /* renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m8148getInWholeMinutesimpl(long j) {
        return m8169toLongimpl(j, DurationUnit.MINUTES);
    }

    /* renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m8150getInWholeSecondsimpl(long j) {
        return m8169toLongimpl(j, DurationUnit.SECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m8147getInWholeMillisecondsimpl(long j) {
        return (m8158isInMillisimpl(j) && m8157isFiniteimpl(j)) ? m8155getValueimpl(j) : m8169toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    /* renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m8149getInWholeNanosecondsimpl(long j) {
        long millisToNanos;
        long m8155getValueimpl = m8155getValueimpl(j);
        if (m8159isInNanosimpl(j)) {
            return m8155getValueimpl;
        }
        if (m8155getValueimpl > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (m8155getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        millisToNanos = DurationKt.millisToNanos(m8155getValueimpl);
        return millisToNanos;
    }

    public String toString() {
        return m8170toStringimpl(this.rawValue);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8170toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean m8161isNegativeimpl = m8161isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (m8161isNegativeimpl) {
            sb.append('-');
        }
        long m8143getAbsoluteValueUwyO8pc = m8143getAbsoluteValueUwyO8pc(j);
        long m8145getInWholeDaysimpl = m8145getInWholeDaysimpl(m8143getAbsoluteValueUwyO8pc);
        int m8144getHoursComponentimpl = m8144getHoursComponentimpl(m8143getAbsoluteValueUwyO8pc);
        int m8151getMinutesComponentimpl = m8151getMinutesComponentimpl(m8143getAbsoluteValueUwyO8pc);
        int m8153getSecondsComponentimpl = m8153getSecondsComponentimpl(m8143getAbsoluteValueUwyO8pc);
        int m8152getNanosecondsComponentimpl = m8152getNanosecondsComponentimpl(m8143getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = m8145getInWholeDaysimpl != 0;
        boolean z2 = m8144getHoursComponentimpl != 0;
        boolean z3 = m8151getMinutesComponentimpl != 0;
        boolean z4 = (m8153getSecondsComponentimpl == 0 && m8152getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(m8145getInWholeDaysimpl);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m8144getHoursComponentimpl);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m8151getMinutesComponentimpl);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (m8153getSecondsComponentimpl != 0 || z || z2 || z3) {
                m8136appendFractionalimpl(j, sb, m8153getSecondsComponentimpl, m8152getNanosecondsComponentimpl, 9, "s", false);
            } else if (m8152getNanosecondsComponentimpl >= 1000000) {
                m8136appendFractionalimpl(j, sb, m8152getNanosecondsComponentimpl / 1000000, m8152getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (m8152getNanosecondsComponentimpl >= 1000) {
                m8136appendFractionalimpl(j, sb, m8152getNanosecondsComponentimpl / 1000, m8152getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(m8152getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i = i4;
        }
        if (m8161isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m8136appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String padStart = StringsKt.padStart(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = padStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (padStart.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (!z && i6 < 3) {
                sb.append((CharSequence) padStart, 0, i6);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) padStart, 0, ((i4 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    /* renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m8168toIsoStringimpl(long j) {
        StringBuilder sb = new StringBuilder();
        if (m8161isNegativeimpl(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long m8143getAbsoluteValueUwyO8pc = m8143getAbsoluteValueUwyO8pc(j);
        long m8146getInWholeHoursimpl = m8146getInWholeHoursimpl(m8143getAbsoluteValueUwyO8pc);
        int m8151getMinutesComponentimpl = m8151getMinutesComponentimpl(m8143getAbsoluteValueUwyO8pc);
        int m8153getSecondsComponentimpl = m8153getSecondsComponentimpl(m8143getAbsoluteValueUwyO8pc);
        int m8152getNanosecondsComponentimpl = m8152getNanosecondsComponentimpl(m8143getAbsoluteValueUwyO8pc);
        if (m8160isInfiniteimpl(j)) {
            m8146getInWholeHoursimpl = 9999999999999L;
        }
        boolean z = false;
        boolean z2 = m8146getInWholeHoursimpl != 0;
        boolean z3 = (m8153getSecondsComponentimpl == 0 && m8152getNanosecondsComponentimpl == 0) ? false : true;
        if (m8151getMinutesComponentimpl != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(m8146getInWholeHoursimpl);
            sb.append('H');
        }
        if (z) {
            sb.append(m8151getMinutesComponentimpl);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            m8136appendFractionalimpl(j, sb, m8153getSecondsComponentimpl, m8152getNanosecondsComponentimpl, 9, "S", true);
        }
        return sb.toString();
    }
}
