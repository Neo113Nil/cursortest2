package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzdzr extends zzbrt {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfjj zzd;
    final /* synthetic */ zzchh zze;
    final /* synthetic */ zzdzs zzf;

    zzdzr(zzdzs zzdzsVar, Object obj, String str, long j, zzfjj zzfjjVar, zzchh zzchhVar) {
        this.zzf = zzdzsVar;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfjjVar;
        this.zze = zzchhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbru
    public final void zze(String str) {
        zzdxz zzdxzVar;
        zzdjr zzdjrVar;
        zzfjw zzfjwVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
            zzdxzVar = this.zzf.zzl;
            zzdxzVar.zzb(this.zzb, "error");
            zzdjrVar = this.zzf.zzo;
            zzdjrVar.zzb(this.zzb, "error");
            zzfjwVar = this.zzf.zzp;
            zzfjj zzfjjVar = this.zzd;
            zzfjjVar.zze(false);
            zzfjwVar.zzb(zzfjjVar.zzj());
            this.zze.zzd(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbru
    public final void zzf() {
        zzdxz zzdxzVar;
        zzdjr zzdjrVar;
        zzfjw zzfjwVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
            zzdxzVar = this.zzf.zzl;
            zzdxzVar.zzd(this.zzb);
            zzdjrVar = this.zzf.zzo;
            zzdjrVar.zzd(this.zzb);
            zzfjwVar = this.zzf.zzp;
            zzfjj zzfjjVar = this.zzd;
            zzfjjVar.zze(true);
            zzfjwVar.zzb(zzfjjVar.zzj());
            this.zze.zzd(true);
        }
    }
}
