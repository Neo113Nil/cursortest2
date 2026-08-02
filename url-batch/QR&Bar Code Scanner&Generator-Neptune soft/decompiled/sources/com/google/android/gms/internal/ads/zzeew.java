package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeew implements zzdjt {
    private final String zzc;
    private final zzfir zzd;
    private boolean zza = false;
    private boolean zzb = false;
    private final com.google.android.gms.ads.internal.util.zzg zze = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzeew(String str, zzfir zzfirVar) {
        this.zzc = str;
        this.zzd = zzfirVar;
    }

    private final zzfiq zzg(String str) {
        String str2 = this.zze.zzP() ? "" : this.zzc;
        zzfiq zzb = zzfiq.zzb(str);
        zzb.zza("tms", Long.toString(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime(), 10));
        zzb.zza("tid", str2);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdjt
    public final void zza(String str) {
        zzfir zzfirVar = this.zzd;
        zzfiq zzg = zzg("aaia");
        zzg.zza("aair", "MalformedJson");
        zzfirVar.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdjt
    public final void zzb(String str, String str2) {
        zzfir zzfirVar = this.zzd;
        zzfiq zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        zzg.zza("rqe", str2);
        zzfirVar.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdjt
    public final void zzc(String str) {
        zzfir zzfirVar = this.zzd;
        zzfiq zzg = zzg("adapter_init_started");
        zzg.zza("ancn", str);
        zzfirVar.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdjt
    public final void zzd(String str) {
        zzfir zzfirVar = this.zzd;
        zzfiq zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        zzfirVar.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdjt
    public final synchronized void zze() {
        if (this.zzb) {
            return;
        }
        this.zzd.zzb(zzg("init_finished"));
        this.zzb = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjt
    public final synchronized void zzf() {
        if (this.zza) {
            return;
        }
        this.zzd.zzb(zzg("init_started"));
        this.zza = true;
    }
}
