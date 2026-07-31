package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@Deprecated
/* loaded from: classes13.dex */
public final class zzbjn {
    public static boolean zza(@Nullable zzbjv zzbjvVar, @Nullable zzbjs zzbjsVar, String... strArr) {
        if (zzbjsVar == null) {
            return false;
        }
        zzbjvVar.zzb(zzbjsVar, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), strArr);
        return true;
    }
}
