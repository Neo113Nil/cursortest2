package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzchc implements zzhpx {
    private final zzhqg zza;

    private zzchc(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzchc zza(zzhqg zzhqgVar) {
        return new zzchc(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = ((zzchd) this.zza).zza().getApplicationInfo();
        zzhqf.zzb(applicationInfo);
        return applicationInfo;
    }
}
