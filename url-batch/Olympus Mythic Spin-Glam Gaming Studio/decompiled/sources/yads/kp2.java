package yads;

import com.yandex.mobile.ads.common.AdTheme;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class kp2 {
    public static ip2 a(AdTheme adTheme) {
        int i = jp2.a[adTheme.ordinal()];
        if (i == 1) {
            return ip2.d;
        }
        if (i == 2) {
            return ip2.c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
