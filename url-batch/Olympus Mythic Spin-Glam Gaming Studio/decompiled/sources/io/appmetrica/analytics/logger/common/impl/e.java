package io.appmetrica.analytics.logger.common.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes14.dex */
public final class e {
    public final Pattern a = Pattern.compile("[\\p{Space},;]");

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r3 == (-1)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r3 == (-1)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(Matcher matcher, int i, int i2) {
        int start;
        int a;
        if (i2 < i) {
            return -1;
        }
        int i3 = ((i2 - i) / 2) + i;
        matcher.region(i3, i2);
        if (matcher.find()) {
            start = matcher.start();
            a = a(matcher, start + 1, i2);
        } else {
            matcher.region(i, i3);
            if (!matcher.find()) {
                return -1;
            }
            start = matcher.start();
            a = a(matcher, start + 1, i3);
        }
    }
}
