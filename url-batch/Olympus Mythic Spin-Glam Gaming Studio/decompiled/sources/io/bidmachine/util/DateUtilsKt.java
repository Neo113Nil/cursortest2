package io.bidmachine.util;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DateUtils.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0004\u001a\u0012\u0010\u0007\u001a\u00020\b*\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\f\u001a\n\u0010\r\u001a\u00020\f*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"DAY_IN_MS", "", "daysBetween", "", "Ljava/util/Date;", "other", "getBeginOfDayMs", "isOlderThanDate", "", "whenDate", "setupCalendarStartOfDay", "", "Ljava/util/Calendar;", "toCalendar", "bidmachine-android-sdk_bd_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class DateUtilsKt {
    private static final long DAY_IN_MS = TimeUnit.DAYS.toMillis(1);

    public static final boolean isOlderThanDate(@NotNull Date date, @NotNull Date whenDate) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(whenDate, "whenDate");
        return date.before(whenDate);
    }

    public static final int daysBetween(@NotNull Date date, @NotNull Date other) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return (int) (Math.abs(getBeginOfDayMs(other) - getBeginOfDayMs(date)) / DAY_IN_MS);
    }

    public static final long getBeginOfDayMs(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Calendar calendar = toCalendar(date);
        setupCalendarStartOfDay(calendar);
        return calendar.getTimeInMillis();
    }

    @NotNull
    public static final Calendar toCalendar(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Calendar createCalendar = DateUtils.createCalendar();
        createCalendar.setTime(date);
        return createCalendar;
    }

    public static final void setupCalendarStartOfDay(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }
}
