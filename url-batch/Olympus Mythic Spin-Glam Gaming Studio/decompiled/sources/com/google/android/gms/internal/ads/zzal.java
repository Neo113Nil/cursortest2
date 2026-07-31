package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzal {
    private static final HashSet zza = new HashSet();
    private static String zzb = "media3.common";

    public static synchronized String zza() {
        String str;
        synchronized (zzal.class) {
            str = zzb;
        }
        return str;
    }

    public static synchronized void zzb(String str) {
        synchronized (zzal.class) {
            if (zza.add(str)) {
                String str2 = zzb;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
                sb.append(str2);
                sb.append(", ");
                sb.append(str);
                zzb = sb.toString();
            }
        }
    }
}
