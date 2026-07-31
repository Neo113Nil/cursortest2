package net.pubnative.lite.sdk.utils;

import java.util.Calendar;
import java.util.Date;

/* loaded from: classes4.dex */
public class HyBidTimeUtils {
    public static final Long SESSION_RENEWAL = 1800000L;

    private int calculateTimeInMinutes(long j) {
        return (int) ((j / 60000) % 60);
    }

    public Boolean IsStartingNewSession(long j) {
        return Boolean.valueOf(calculateTimeInMinutes(j) > 30);
    }

    public Long calculateSessionDuration(Long l, Long l2) {
        return Long.valueOf(l.longValue() - l2.longValue());
    }

    public String getSeconds(long j) {
        return String.valueOf(j / 1000);
    }

    public long updateExpirationTimeStamp(long j) {
        return j + SESSION_RENEWAL.longValue();
    }

    public String getDaysSince(long j) {
        if (j <= 0) {
            return "0";
        }
        Date date = new Date(j);
        return Calendar.getInstance().before(date) ? "0" : String.valueOf((new Date(System.currentTimeMillis()).getTime() - date.getTime()) / 86400000);
    }
}
