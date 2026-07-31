package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzcjc implements zzfaq {
    final zzhqg zza;
    final zzhqg zzb;
    final zzhqg zzc;
    final zzhqg zzd;
    final zzhqg zze;
    final zzhqg zzf;
    final zzhqg zzg;
    private final zzcih zzh;

    zzcjc(zzcih zzcihVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzh = zzcihVar;
        zzhpx zza = zzhpy.zza(context);
        this.zza = zza;
        zzhpx zza2 = zzhpy.zza(zzrVar);
        this.zzb = zza2;
        zzhpx zza3 = zzhpy.zza(str);
        this.zzc = zza3;
        zzhqg zzhqgVar = zzcihVar.zzl;
        zzhqg zza4 = zzhpw.zza(zzelj.zza(zzhqgVar));
        this.zzd = zza4;
        zzhqg zza5 = zzhpw.zza(zzfbo.zza(zzcihVar.zzbr));
        this.zze = zza5;
        zzhqg zza6 = zzhpw.zza(zzfao.zza(zza, zzcihVar.zza, zzcihVar.zzU, zza4, zza5, zzfde.zza()));
        this.zzf = zza6;
        this.zzg = zzhpw.zza(zzelr.zza(zza, zza2, zza3, zza6, zza4, zza5, zzcihVar.zzi, zzcihVar.zzX, zzhqgVar));
    }

    @Override // com.google.android.gms.internal.ads.zzfaq
    public final zzelq zza() {
        return (zzelq) this.zzg.zzb();
    }
}
