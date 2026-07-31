package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Marker;
import yads.cc2;
import yads.dc2;
import yads.s30;
import yads.zt;

/* loaded from: classes4.dex */
public final class d implements dc2 {
    public static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // yads.dc2
    public final Object a(Uri uri, s30 s30Var) {
        String readLine = new BufferedReader(new InputStreamReader(s30Var, zt.c)).readLine();
        try {
            Matcher matcher = a.matcher(readLine);
            if (!matcher.matches()) {
                throw new cc2("Couldn't parse timestamp: " + readLine, null, true, 4);
            }
            String group = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(group).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j = Marker.ANY_NON_NULL_MARKER.equals(matcher.group(4)) ? 1L : -1L;
                long parseLong = Long.parseLong(matcher.group(5));
                String group2 = matcher.group(7);
                time -= (((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60000) * j;
            }
            return Long.valueOf(time);
        } catch (ParseException e) {
            throw new cc2(null, e, true, 4);
        }
    }
}
