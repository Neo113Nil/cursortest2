package com.luckycounter.drinkwater.data;

import V0.d;
import i1.f;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class UserPreferencesKt {
    public static final d dayBounds(LocalDate localDate, ZoneId zoneId) {
        f.e(localDate, "date");
        f.e(zoneId, "zone");
        return new d(Long.valueOf(localDate.atStartOfDay(zoneId).toInstant().toEpochMilli()), Long.valueOf(localDate.plusDays(1L).atStartOfDay(zoneId).toInstant().toEpochMilli()));
    }

    public static /* synthetic */ d dayBounds$default(LocalDate localDate, ZoneId zoneId, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return dayBounds(localDate, zoneId);
    }

    public static final String formatTime(long j2, ZoneId zoneId) {
        f.e(zoneId, "zone");
        LocalTime localTime = Instant.ofEpochMilli(j2).atZone(zoneId).toLocalTime();
        return String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(localTime.getHour()), Integer.valueOf(localTime.getMinute())}, 2));
    }

    public static /* synthetic */ String formatTime$default(long j2, ZoneId zoneId, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return formatTime(j2, zoneId);
    }
}
