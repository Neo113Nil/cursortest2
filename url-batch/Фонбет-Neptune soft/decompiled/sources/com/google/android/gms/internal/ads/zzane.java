package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzane {
    private final zzamf zza;
    private final zzer zzb;
    private final zzej zzc = new zzej(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzane(zzamf zzamfVar, zzer zzerVar) {
        this.zza = zzamfVar;
        this.zzb = zzerVar;
    }

    public final void zza(zzek zzekVar) throws zzbo {
        long j;
        long j2;
        zzekVar.zzG(this.zzc.zza, 0, 3);
        this.zzc.zzl(0);
        this.zzc.zzn(8);
        this.zzd = this.zzc.zzp();
        this.zze = this.zzc.zzp();
        this.zzc.zzn(6);
        zzej zzejVar = this.zzc;
        zzekVar.zzG(zzejVar.zza, 0, zzejVar.zzd(8));
        this.zzc.zzl(0);
        if (this.zzd) {
            this.zzc.zzn(4);
            long zzd = this.zzc.zzd(3);
            this.zzc.zzn(1);
            int zzd2 = this.zzc.zzd(15) << 15;
            this.zzc.zzn(1);
            long zzd3 = this.zzc.zzd(15);
            this.zzc.zzn(1);
            if (this.zzf || !this.zze) {
                j2 = zzd;
            } else {
                this.zzc.zzn(4);
                this.zzc.zzn(1);
                int zzd4 = this.zzc.zzd(15) << 15;
                this.zzc.zzn(1);
                j2 = zzd;
                long zzd5 = this.zzc.zzd(15);
                this.zzc.zzn(1);
                this.zzb.zzb(zzd4 | (this.zzc.zzd(3) << 30) | zzd5);
                this.zzf = true;
            }
            j = this.zzb.zzb((j2 << 30) | zzd2 | zzd3);
        } else {
            j = 0;
        }
        this.zza.zzd(j, 4);
        this.zza.zza(zzekVar);
        this.zza.zzc(false);
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}
