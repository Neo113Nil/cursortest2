package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzdyh extends zzbqi {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfhg zzd;
    final /* synthetic */ zzcga zze;
    final /* synthetic */ zzdyi zzf;

    zzdyh(zzdyi zzdyiVar, Object obj, String str, long j, zzfhg zzfhgVar, zzcga zzcgaVar) {
        this.zzf = zzdyiVar;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfhgVar;
        this.zze = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqj
    public final void zze(String str) {
        zzdwp zzdwpVar;
        zzdij zzdijVar;
        zzfhs zzfhsVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - this.zzc));
            zzdwpVar = this.zzf.zzl;
            zzdwpVar.zzb(this.zzb, "error");
            zzdijVar = this.zzf.zzo;
            zzdijVar.zzb(this.zzb, "error");
            zzfhsVar = this.zzf.zzp;
            zzfhg zzfhgVar = this.zzd;
            zzfhgVar.zze(false);
            zzfhsVar.zzb(zzfhgVar.zzj());
            this.zze.zzd(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqj
    public final void zzf() {
        zzdwp zzdwpVar;
        zzdij zzdijVar;
        zzfhs zzfhsVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - this.zzc));
            zzdwpVar = this.zzf.zzl;
            zzdwpVar.zzd(this.zzb);
            zzdijVar = this.zzf.zzo;
            zzdijVar.zzd(this.zzb);
            zzfhsVar = this.zzf.zzp;
            zzfhg zzfhgVar = this.zzd;
            zzfhgVar.zze(true);
            zzfhsVar.zzb(zzfhgVar.zzj());
            this.zze.zzd(true);
        }
    }
}
