package com.ogury.ad.internal;

import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class qh {
    public final TimeZone a;

    public qh() {
        TimeZone utcTimezone = TimeZone.getTimeZone("UTC");
        Intrinsics.checkNotNullExpressionValue(utcTimezone, "getTimeZone(...)");
        Intrinsics.checkNotNullParameter(utcTimezone, "utcTimezone");
        this.a = utcTimezone;
    }

    public static String a() {
        try {
            String format = new SimpleDateFormat("Z", Locale.US).format(new Date());
            Intrinsics.checkNotNull(format);
            String substring = format.substring(0, 3);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            String substring2 = format.substring(3, format.length());
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            return substring + ":" + substring2;
        } catch (Exception e) {
            Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, e);
            return "";
        }
    }
}
