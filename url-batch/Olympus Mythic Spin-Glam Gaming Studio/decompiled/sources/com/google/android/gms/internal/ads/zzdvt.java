package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdvt implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final Context zzb;
    private final zzeaj zzc;
    private final zzele zzd;
    private final Executor zze;
    private final zzbbd zzf;
    private final VersionInfoParcel zzg;
    private final zzfte zzh;
    private final zzelp zzi;
    private final zzfma zzj;
    private final zzdcg zzk;

    public zzdvt(Context context, Executor executor, zzbbd zzbbdVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzcmc zzcmcVar, zzele zzeleVar, zzfte zzfteVar, zzeaj zzeajVar, zzelp zzelpVar, zzfma zzfmaVar, zzdcg zzdcgVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzbbdVar;
        this.zzg = versionInfoParcel;
        this.zza = zzaVar;
        this.zzd = zzeleVar;
        this.zzh = zzfteVar;
        this.zzc = zzeajVar;
        this.zzi = zzelpVar;
        this.zzj = zzfmaVar;
        this.zzk = zzdcgVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdvv zzdvvVar = new zzdvv(this);
        zzdvvVar.zza();
        return zzdvvVar;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.zza zza() {
        return this.zza;
    }

    final /* synthetic */ Context zzb() {
        return this.zzb;
    }

    final /* synthetic */ zzeaj zzc() {
        return this.zzc;
    }

    final /* synthetic */ zzele zzd() {
        return this.zzd;
    }

    final /* synthetic */ Executor zze() {
        return this.zze;
    }

    final /* synthetic */ zzbbd zzf() {
        return this.zzf;
    }

    final /* synthetic */ VersionInfoParcel zzg() {
        return this.zzg;
    }

    final /* synthetic */ zzfte zzh() {
        return this.zzh;
    }

    final /* synthetic */ zzelp zzi() {
        return this.zzi;
    }

    final /* synthetic */ zzfma zzj() {
        return this.zzj;
    }

    final /* synthetic */ zzdcg zzk() {
        return this.zzk;
    }
}
