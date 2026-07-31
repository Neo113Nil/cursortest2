package kotlin.time;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimeSource.kt */
/* loaded from: classes14.dex */
public interface ComparableTimeMark extends TimeMark, Comparable {
    /* renamed from: minus-UwyO8pc, reason: not valid java name */
    long mo8134minusUwyO8pc(ComparableTimeMark comparableTimeMark);

    /* compiled from: TimeSource.kt */
    public static final class DefaultImpls {
        public static int compareTo(ComparableTimeMark comparableTimeMark, ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return Duration.m8138compareToLRDsOJo(comparableTimeMark.mo8134minusUwyO8pc(other), Duration.Companion.m8176getZEROUwyO8pc());
        }
    }
}
