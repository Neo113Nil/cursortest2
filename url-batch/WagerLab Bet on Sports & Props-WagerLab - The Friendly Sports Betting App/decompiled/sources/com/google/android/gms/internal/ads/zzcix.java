package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzcix implements zzdue {
    final zzhqg zza;
    final zzhqg zzb;
    final zzhqg zzc;
    final zzhqg zzd;
    private final Context zze;
    private final zzbkl zzf;
    private final zzcih zzg;
    private final zzcix zzh = this;

    zzcix(zzcih zzcihVar, Context context, zzbkl zzbklVar) {
        this.zzg = zzcihVar;
        this.zze = context;
        this.zzf = zzbklVar;
        zzhpx zza = zzhpy.zza(this);
        this.zza = zza;
        zzhpx zza2 = zzhpy.zza(zzbklVar);
        this.zzb = zza2;
        zzdua zzc = zzdua.zzc(zza2);
        this.zzc = zzc;
        this.zzd = zzhpw.zza(zzduc.zza(zza, zzc));
    }

    final zzdtz zza() {
        return zzdua.zzd(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzdue
    public final zzdub zzb() {
        return (zzdub) this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdue
    public final zzdtw zzc() {
        return new zzciu(this.zzg, this.zzh, null);
    }

    final /* synthetic */ Context zzd() {
        return this.zze;
    }
}
