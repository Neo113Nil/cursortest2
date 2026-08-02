package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzegv implements zzdgx {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ListenableFuture zzc;
    private final zzfel zzd;
    private final zzcej zze;
    private final zzffg zzf;
    private final zzbja zzg;
    private final boolean zzh;
    private final zzeds zzi;

    zzegv(Context context, VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfel zzfelVar, zzcej zzcejVar, zzffg zzffgVar, boolean z, zzbja zzbjaVar, zzeds zzedsVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = listenableFuture;
        this.zzd = zzfelVar;
        this.zze = zzcejVar;
        this.zzf = zzffgVar;
        this.zzg = zzbjaVar;
        this.zzh = z;
        this.zzi = zzedsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgx
    public final void zza(boolean z, Context context, zzcxd zzcxdVar) {
        zzdfp zzdfpVar = (zzdfp) zzgcj.zzq(this.zzc);
        this.zze.zzaq(true);
        boolean zze = this.zzh ? this.zzg.zze(false) : false;
        com.google.android.gms.ads.internal.zzu.zzp();
        Context context2 = this.zza;
        boolean z2 = this.zzh;
        com.google.android.gms.ads.internal.zzk zzkVar = new com.google.android.gms.ads.internal.zzk(zze, com.google.android.gms.ads.internal.util.zzt.zzI(context2), z2 ? this.zzg.zzd() : false, this.zzh ? this.zzg.zza() : 0.0f, -1, z, this.zzd.zzO, false);
        if (zzcxdVar != null) {
            zzcxdVar.zzf();
        }
        com.google.android.gms.ads.internal.zzu.zzi();
        zzdgm zzh = zzdfpVar.zzh();
        zzcej zzcejVar = this.zze;
        zzfel zzfelVar = this.zzd;
        VersionInfoParcel versionInfoParcel = this.zzb;
        int i = zzfelVar.zzQ;
        String str = zzfelVar.zzB;
        zzfeq zzfeqVar = zzfelVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzh, (com.google.android.gms.ads.internal.overlay.zzaa) null, zzcejVar, i, versionInfoParcel, str, zzkVar, zzfeqVar.zzb, zzfeqVar.zza, this.zzf.zzf, zzcxdVar, zzfelVar.zzai ? this.zzi : null), true);
    }
}
