package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzaqz implements zzarh {
    private zzv zza;
    private zzfj zzb;
    private zzaht zzc;

    public zzaqz(String str, String str2) {
        zzt zztVar = new zzt();
        zztVar.zzn("video/mp2t");
        zztVar.zzo(str);
        this.zza = zztVar.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public final void zza(zzfj zzfjVar, zzagk zzagkVar, zzarv zzarvVar) {
        this.zzb = zzfjVar;
        zzarvVar.zza();
        zzaht zzs = zzagkVar.zzs(zzarvVar.zzb(), 5);
        this.zzc = zzs;
        zzs.zzA(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public final void zzb(zzeu zzeuVar) {
        this.zzb.getClass();
        String str = zzfm.zza;
        long zzb = this.zzb.zzb();
        long zzc = this.zzb.zzc();
        if (zzb == -9223372036854775807L || zzc == -9223372036854775807L) {
            return;
        }
        zzv zzvVar = this.zza;
        if (zzc != zzvVar.zzu) {
            zzt zza = zzvVar.zza();
            zza.zzt(zzc);
            zzv zzQ = zza.zzQ();
            this.zza = zzQ;
            this.zzc.zzA(zzQ);
        }
        int zzd = zzeuVar.zzd();
        this.zzc.zzc(zzeuVar, zzd);
        this.zzc.zze(zzb, 1, zzd, 0, null);
    }
}
