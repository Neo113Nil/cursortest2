package com.yandex.div.evaluable.types;

import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DateTime.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0018\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/yandex/div/evaluable/types/DateTime;", "", "timestampMillis", "", "timezone", "Ljava/util/TimeZone;", "(JLjava/util/TimeZone;)V", "calendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "getCalendar", "()Ljava/util/Calendar;", "calendar$delegate", "Lkotlin/Lazy;", "getTimestampMillis$div_evaluable", "()J", "timestampUtc", "getTimezone$div_evaluable", "()Ljava/util/TimeZone;", "timezoneMinutes", "", "getTimezoneMinutes$div_evaluable", "()I", "compareTo", "other", "equals", "", "", "hashCode", "toString", "", "Companion", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DateTime implements Comparable<DateTime> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SimpleTimeZone utcTimezone = new SimpleTimeZone(0, "UTC");

    /* renamed from: calendar$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy calendar;
    private final long timestampMillis;
    private final long timestampUtc;

    @NotNull
    private final TimeZone timezone;
    private final int timezoneMinutes;

    public DateTime(long j, @NotNull TimeZone timezone) {
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        this.timestampMillis = j;
        this.timezone = timezone;
        this.calendar = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.yandex.div.evaluable.types.DateTime$calendar$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Calendar mo4828invoke() {
                SimpleTimeZone simpleTimeZone;
                simpleTimeZone = DateTime.utcTimezone;
                Calendar calendar = Calendar.getInstance(simpleTimeZone);
                calendar.setTimeInMillis(DateTime.this.getTimestampMillis());
                return calendar;
            }
        });
        this.timezoneMinutes = timezone.getRawOffset() / 60;
        this.timestampUtc = j - (r5 * 60000);
    }

    /* renamed from: getTimestampMillis$div_evaluable, reason: from getter */
    public final long getTimestampMillis() {
        return this.timestampMillis;
    }

    @NotNull
    /* renamed from: getTimezone$div_evaluable, reason: from getter */
    public final TimeZone getTimezone() {
        return this.timezone;
    }

    private final Calendar getCalendar() {
        return (Calendar) this.calendar.getValue();
    }

    /* renamed from: getTimezoneMinutes$div_evaluable, reason: from getter */
    public final int getTimezoneMinutes() {
        return this.timezoneMinutes;
    }

    @NotNull
    public String toString() {
        Companion companion = INSTANCE;
        Calendar calendar = getCalendar();
        Intrinsics.checkNotNullExpressionValue(calendar, "calendar");
        return companion.formatDate$div_evaluable(calendar);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DateTime) && this.timestampUtc == ((DateTime) other).timestampUtc;
    }

    public int hashCode() {
        return Long.hashCode(this.timestampUtc);
    }

    /* compiled from: DateTime.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/yandex/div/evaluable/types/DateTime$Companion;", "", "()V", "utcTimezone", "Ljava/util/SimpleTimeZone;", "formatDate", "", "c", "Ljava/util/Calendar;", "formatDate$div_evaluable", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final String formatDate$div_evaluable(@NotNull Calendar c) {
            Intrinsics.checkNotNullParameter(c, "c");
            return String.valueOf(c.get(1)) + '-' + StringsKt.padStart(String.valueOf(c.get(2) + 1), 2, '0') + '-' + StringsKt.padStart(String.valueOf(c.get(5)), 2, '0') + ' ' + StringsKt.padStart(String.valueOf(c.get(11)), 2, '0') + ':' + StringsKt.padStart(String.valueOf(c.get(12)), 2, '0') + ':' + StringsKt.padStart(String.valueOf(c.get(13)), 2, '0');
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull DateTime other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.compare(this.timestampUtc, other.timestampUtc);
    }
}
