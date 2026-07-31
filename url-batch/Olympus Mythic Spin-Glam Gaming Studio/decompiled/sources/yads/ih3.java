package yads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes13.dex */
public abstract class ih3 {
    public static final Integer b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            boolean z = ob1.a;
            return null;
        }
    }

    public static final Long a(String str) {
        if (str == null) {
            return null;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
            Date parse = simpleDateFormat.parse(str);
            Date parse2 = simpleDateFormat.parse("00:00:00");
            if (parse == null || parse2 == null) {
                return null;
            }
            return Long.valueOf(parse.getTime() - parse2.getTime());
        } catch (ParseException unused) {
            boolean z = ob1.a;
            return null;
        }
    }
}
