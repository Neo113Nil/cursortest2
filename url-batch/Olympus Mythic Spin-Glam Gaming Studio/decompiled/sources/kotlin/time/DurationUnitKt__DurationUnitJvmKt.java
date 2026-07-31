package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DurationUnitJvm.kt */
/* loaded from: classes13.dex */
public abstract class DurationUnitKt__DurationUnitJvmKt {
    public static TimeUnit toTimeUnit(DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "<this>");
        return durationUnit.getTimeUnit();
    }

    public static final double convertDurationUnit(double d, DurationUnit sourceUnit, DurationUnit targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        long convert = targetUnit.getTimeUnit().convert(1L, sourceUnit.getTimeUnit());
        return convert > 0 ? d * convert : d / sourceUnit.getTimeUnit().convert(1L, targetUnit.getTimeUnit());
    }

    public static final long convertDurationUnitOverflow(long j, DurationUnit sourceUnit, DurationUnit targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit().convert(j, sourceUnit.getTimeUnit());
    }

    public static final long convertDurationUnit(long j, DurationUnit sourceUnit, DurationUnit targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit().convert(j, sourceUnit.getTimeUnit());
    }
}
