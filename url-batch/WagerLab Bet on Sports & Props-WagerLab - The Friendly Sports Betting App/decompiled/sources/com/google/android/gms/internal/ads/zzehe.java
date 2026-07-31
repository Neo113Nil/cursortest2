package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzehe extends zzegz {
    private final zzcgv zza;
    private final zzcva zzb;
    private final zzejp zzc;
    private final zzdbs zzd;
    private final zzehk zze;
    private final zzeee zzf;

    public zzehe(zzcgv zzcgvVar, zzcva zzcvaVar, zzejp zzejpVar, zzdbs zzdbsVar, zzehk zzehkVar, zzeee zzeeeVar) {
        this.zza = zzcgvVar;
        this.zzb = zzcvaVar;
        this.zzc = zzejpVar;
        this.zzd = zzdbsVar;
        this.zze = zzehkVar;
        this.zzf = zzeeeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegz
    protected final ListenableFuture zzc(zzfdc zzfdcVar, Bundle bundle, zzfcj zzfcjVar, zzfcu zzfcuVar) {
        zzcva zzcvaVar = this.zzb;
        zzcvaVar.zzb(zzfdcVar);
        zzcvaVar.zzc(bundle);
        zzcvaVar.zzd(new zzcut(zzfcuVar, zzfcjVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdZ)).booleanValue()) {
            zzcvaVar.zzg(this.zzf);
        }
        zzdgg zzk = this.zza.zzk();
        zzk.zze(zzcvaVar.zze());
        zzk.zzf(this.zzd);
        zzk.zzd(this.zzc);
        zzcrw zzb = zzk.zzh().zzb();
        return zzb.zzc(zzb.zzb());
    }
}
