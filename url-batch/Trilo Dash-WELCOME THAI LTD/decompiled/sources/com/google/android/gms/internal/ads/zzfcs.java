package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfcs {
    public static void zza(Context context, boolean z) {
        if (z) {
            com.google.android.gms.ads.internal.util.zze.zzi("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        com.google.android.gms.ads.internal.util.zze.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzcfb.zzw(context) + "\")) to get test ads on this device.");
    }

    public static void zzb(int i, Throwable th, String str) {
        com.google.android.gms.ads.internal.util.zze.zzi("Ad failed to load : " + i);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th);
        if (i == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzs(th, str);
    }
}
