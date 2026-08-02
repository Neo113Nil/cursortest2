package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaey {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzef zzf;
    private final zzef zzg;
    private int zzh;
    private int zzi;

    public zzaey(zzef zzefVar, zzef zzefVar2, boolean z) throws zzbu {
        this.zzg = zzefVar;
        this.zzf = zzefVar2;
        this.zze = z;
        zzefVar2.zzF(12);
        this.zza = zzefVar2.zzn();
        zzefVar.zzF(12);
        this.zzi = zzefVar.zzn();
        zzzm.zzb(zzefVar.zze() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzt() : this.zzf.zzs();
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzn();
            this.zzg.zzG(4);
            int i2 = this.zzi - 1;
            this.zzi = i2;
            this.zzh = i2 > 0 ? (-1) + this.zzg.zzn() : -1;
        }
        return true;
    }
}
