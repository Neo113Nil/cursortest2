package com.google.android.gms.internal.ads;

import android.os.Build;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzrw {
    public static final boolean zza;

    static {
        boolean z = false;
        if ("Amazon".equals(Build.MANUFACTURER) && ("AFTM".equals(Build.MODEL) || "AFTB".equals(Build.MODEL))) {
            z = true;
        }
        zza = z;
    }
}
