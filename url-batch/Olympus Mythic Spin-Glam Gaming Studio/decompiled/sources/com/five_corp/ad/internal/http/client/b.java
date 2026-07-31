package com.five_corp.ad.internal.http.client;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public abstract class b {
    public static final Pattern a = Pattern.compile("bytes (\\d+)-(\\d+)/.*$");
    public static final Pattern b = Pattern.compile("bytes .+/(\\d+)");

    public static int a(String str, Pattern pattern, int i) {
        if (str == null) {
            return -1;
        }
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1;
        }
        String group = matcher.group(i);
        if (group.equals(Marker.ANY_MARKER)) {
            return -1;
        }
        try {
            return Integer.parseInt(group);
        } catch (Exception unused) {
            return -1;
        }
    }
}
