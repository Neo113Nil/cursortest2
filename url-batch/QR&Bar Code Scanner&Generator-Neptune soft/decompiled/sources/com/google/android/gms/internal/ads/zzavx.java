package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzavx {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzbak zzf;
    private final zzbak zzg;
    private int zzh;
    private int zzi;

    public zzavx(zzbak zzbakVar, zzbak zzbakVar2, boolean z) {
        this.zzg = zzbakVar;
        this.zzf = zzbakVar2;
        this.zze = z;
        zzbakVar2.zzv(12);
        this.zza = zzbakVar2.zzi();
        zzbakVar.zzv(12);
        this.zzi = zzbakVar.zzi();
        zzbac.zzf(zzbakVar.zze() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzn() : this.zzf.zzm();
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzi();
            this.zzg.zzw(4);
            int i2 = this.zzi - 1;
            this.zzi = i2;
            this.zzh = i2 > 0 ? (-1) + this.zzg.zzi() : -1;
        }
        return true;
    }
}
