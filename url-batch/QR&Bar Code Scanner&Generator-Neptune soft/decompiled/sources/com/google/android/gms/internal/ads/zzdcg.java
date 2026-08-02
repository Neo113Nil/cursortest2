package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdcg {
    private final zzfih zza;
    private final zzcgv zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzgxc zzg;
    private final String zzh;
    private final zzevh zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;

    public zzdcg(zzfih zzfihVar, zzcgv zzcgvVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzgxc zzgxcVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzevh zzevhVar) {
        this.zza = zzfihVar;
        this.zzb = zzcgvVar;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzgxcVar;
        this.zzh = str2;
        this.zzi = zzevhVar;
        this.zzj = zzgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzcbc zza(zzfzp zzfzpVar) throws Exception {
        return new zzcbc((Bundle) zzfzpVar.get(), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, (String) ((zzfzp) this.zzg.zzb()).get(), this.zzh, null, null, ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgm)).booleanValue() ? this.zzj.zzP() : false);
    }

    public final zzfzp zzb() {
        zzfih zzfihVar = this.zza;
        return zzfhr.zzc(this.zzi.zza(new Bundle()), zzfib.SIGNALS, zzfihVar).zza();
    }

    public final zzfzp zzc() {
        final zzfzp zzb = zzb();
        return this.zza.zza(zzfib.REQUEST_PARCEL, zzb, (zzfzp) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdcf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdcg.this.zza(zzb);
            }
        }).zza();
    }
}
