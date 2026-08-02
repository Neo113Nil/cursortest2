package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfmx;
import com.google.android.gms.internal.ads.zzfoa;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes.dex */
final class zzh implements zzfoa {
    final /* synthetic */ zzi zza;

    zzh(zzi zziVar) {
        this.zza = zziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfoa
    public final void zza(int i, long j) {
        zzfmx zzfmxVar;
        zzfmxVar = this.zza.zzi;
        zzfmxVar.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfoa
    public final void zzb(int i, long j, String str) {
        zzfmx zzfmxVar;
        zzfmxVar = this.zza.zzi;
        zzfmxVar.zze(i, System.currentTimeMillis() - j, str);
    }
}
