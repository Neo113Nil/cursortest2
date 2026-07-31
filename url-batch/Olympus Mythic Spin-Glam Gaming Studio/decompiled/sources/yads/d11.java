package yads;

import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes5.dex */
public abstract class d11 {
    public static final int a;
    public static final int b;

    static {
        Duration.Companion companion = Duration.Companion;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        long duration = DurationKt.toDuration(10, durationUnit);
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        a = Duration.m8167toIntimpl(duration, durationUnit2);
        b = Duration.m8167toIntimpl(DurationKt.toDuration(30, durationUnit), durationUnit2);
        Duration.m8167toIntimpl(DurationKt.toDuration(3, durationUnit), durationUnit2);
    }
}
