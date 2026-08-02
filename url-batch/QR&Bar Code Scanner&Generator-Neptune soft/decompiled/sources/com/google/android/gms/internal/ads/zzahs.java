package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzahs implements zzaib {
    private zzaf zza;
    private zzel zzb;
    private zzaap zzc;

    public zzahs(String str) {
        zzad zzadVar = new zzad();
        zzadVar.zzS(str);
        this.zza = zzadVar.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzaib
    public final void zza(zzef zzefVar) {
        zzdd.zzb(this.zzb);
        int i = zzen.zza;
        long zzd = this.zzb.zzd();
        long zze = this.zzb.zze();
        if (zzd == -9223372036854775807L || zze == -9223372036854775807L) {
            return;
        }
        zzaf zzafVar = this.zza;
        if (zze != zzafVar.zzq) {
            zzad zzb = zzafVar.zzb();
            zzb.zzW(zze);
            zzaf zzY = zzb.zzY();
            this.zza = zzY;
            this.zzc.zzk(zzY);
        }
        int zza = zzefVar.zza();
        this.zzc.zzq(zzefVar, zza);
        this.zzc.zzs(zzd, 1, zza, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaib
    public final void zzb(zzel zzelVar, zzzl zzzlVar, zzaio zzaioVar) {
        this.zzb = zzelVar;
        zzaioVar.zzc();
        zzaap zzv = zzzlVar.zzv(zzaioVar.zza(), 5);
        this.zzc = zzv;
        zzv.zzk(this.zza);
    }
}
