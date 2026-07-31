package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzcje implements zzfcd {
    final zzhqg zza;
    final zzhqg zzb;
    final zzhqg zzc;
    final zzhqg zzd;
    final zzhqg zze;
    final zzhqg zzf;
    final zzhqg zzg;
    final zzhqg zzh;
    private final zzcih zzi;

    zzcje(zzcih zzcihVar, Context context, String str) {
        this.zzi = zzcihVar;
        zzhpx zza = zzhpy.zza(context);
        this.zza = zza;
        zzhqg zzhqgVar = zzcihVar.zzbr;
        zzfae zzc = zzfae.zzc(zza, zzhqgVar, zzcihVar.zzbs);
        this.zzb = zzc;
        zzhqg zza2 = zzhpw.zza(zzfbo.zza(zzhqgVar));
        this.zzc = zza2;
        zzhqg zza3 = zzhpw.zza(zzfda.zza());
        this.zzd = zza3;
        zzhqg zza4 = zzhpw.zza(zzfbx.zza(zza, zzcihVar.zza, zzcihVar.zzU, zzc, zza2, zzfde.zza(), zza3));
        this.zze = zza4;
        this.zzf = zzhpw.zza(zzfch.zza(zza4, zza2, zza3));
        zzhpx zzc2 = zzhpy.zzc(str);
        this.zzg = zzc2;
        this.zzh = zzhpw.zza(zzfcb.zza(zzc2, zza4, zza, zza2, zza3, zzcihVar.zzi, zzcihVar.zzX, zzcihVar.zzl));
    }

    @Override // com.google.android.gms.internal.ads.zzfcd
    public final zzfcg zza() {
        return (zzfcg) this.zzf.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfcd
    public final zzfca zzb() {
        return (zzfca) this.zzh.zzb();
    }
}
