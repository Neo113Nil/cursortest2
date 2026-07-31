package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzehc extends zzegz {
    private final zzcgv zza;
    private final zzcva zzb;
    private final zzejp zzc;
    private final zzdbs zzd;
    private final zzdgy zze;
    private final zzcyt zzf;
    private final ViewGroup zzg;
    private final zzday zzh;
    private final zzehk zzi;
    private final zzeee zzj;

    public zzehc(zzcgv zzcgvVar, zzcva zzcvaVar, zzejp zzejpVar, zzdbs zzdbsVar, zzdgy zzdgyVar, zzcyt zzcytVar, ViewGroup viewGroup, zzday zzdayVar, zzehk zzehkVar, zzeee zzeeeVar) {
        this.zza = zzcgvVar;
        this.zzb = zzcvaVar;
        this.zzc = zzejpVar;
        this.zzd = zzdbsVar;
        this.zze = zzdgyVar;
        this.zzf = zzcytVar;
        this.zzg = viewGroup;
        this.zzh = zzdayVar;
        this.zzi = zzehkVar;
        this.zzj = zzeeeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegz
    protected final ListenableFuture zzc(zzfdc zzfdcVar, Bundle bundle, zzfcj zzfcjVar, zzfcu zzfcuVar) {
        zzcva zzcvaVar = this.zzb;
        zzcvaVar.zzb(zzfdcVar);
        zzcvaVar.zzc(bundle);
        zzcvaVar.zzd(new zzcut(zzfcuVar, zzfcjVar, this.zzi));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdZ)).booleanValue()) {
            zzcvaVar.zzg(this.zzj);
        }
        zzcpo zzg = this.zza.zzg();
        zzg.zzl(zzcvaVar.zze());
        zzg.zzm(this.zzd);
        zzg.zzk(this.zzc);
        zzg.zzd(this.zze);
        zzg.zzg(new zzcqk(this.zzf, this.zzh));
        zzg.zze(new zzcoh(this.zzg));
        zzcrw zzc = zzg.zzh().zzc();
        return zzc.zzc(zzc.zzb());
    }
}
