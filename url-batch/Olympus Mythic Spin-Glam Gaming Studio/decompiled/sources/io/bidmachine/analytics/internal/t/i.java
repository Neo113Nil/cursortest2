package io.bidmachine.analytics.internal.t;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class i {
    private final SimpleDateFormat a = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss.SSS", Locale.getDefault());

    public final Long a(String str) {
        int i = Calendar.getInstance().get(1);
        Date parse = this.a.parse(i + '-' + str);
        if (parse != null) {
            return Long.valueOf(parse.getTime());
        }
        return null;
    }
}
