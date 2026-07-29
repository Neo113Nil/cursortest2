package o;

import java.util.concurrent.TimeUnit;

/* renamed from: o.wj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC2174wj {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    SECONDS(TimeUnit.SECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    MINUTES(TimeUnit.MINUTES),
    /* JADX INFO: Fake field, exist only in values array */
    HOURS(TimeUnit.HOURS),
    /* JADX INFO: Fake field, exist only in values array */
    DAYS(TimeUnit.DAYS);

    public final TimeUnit h;

    EnumC2174wj(TimeUnit timeUnit) {
        this.h = timeUnit;
    }
}
