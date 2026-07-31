package com.google.android.gms.internal.ads;

import com.revenuecat.purchases.common.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzalo {
    public static long zza(String str) {
        String str2 = zzeo.zza;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str3 : split[0].split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() != 3) {
                String.valueOf(trim);
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(String.valueOf(trim)));
            }
            j2 += Long.parseLong(trim);
        }
        return j2 * 1000;
    }

    public static float zzb(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
}
