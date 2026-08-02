package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcrg implements zzdyr {
    private final Long zza;
    private final String zzb;
    private final zzcpw zzc;
    private final zzcrk zzd;
    private final zzcrg zze = this;

    /* synthetic */ zzcrg(zzcpw zzcpwVar, zzcrk zzcrkVar, Long l, String str, zzcrf zzcrfVar) {
        this.zzc = zzcpwVar;
        this.zzd = zzcrkVar;
        this.zza = l;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdyr
    public final zzdzb zza() {
        Context context;
        zzdyu zzc;
        long longValue = this.zza.longValue();
        zzcrk zzcrkVar = this.zzd;
        context = zzcrkVar.zza;
        zzc = zzdyv.zzc(zzcrkVar.zzb);
        return zzdzc.zza(longValue, context, zzc, this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdyr
    public final zzdzf zzb() {
        Context context;
        zzdyu zzc;
        long longValue = this.zza.longValue();
        zzcrk zzcrkVar = this.zzd;
        context = zzcrkVar.zza;
        zzc = zzdyv.zzc(zzcrkVar.zzb);
        return zzdzg.zza(longValue, context, zzc, this.zzc, this.zzb);
    }
}
