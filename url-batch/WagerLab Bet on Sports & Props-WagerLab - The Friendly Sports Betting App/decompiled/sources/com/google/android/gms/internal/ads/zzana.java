package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzana {
    private final zzamd zza;
    private final zzel zzb;
    private final zzee zzc = new zzee(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzana(zzamd zzamdVar, zzel zzelVar) {
        this.zza = zzamdVar;
        this.zzb = zzelVar;
    }

    public final void zza() {
        this.zzf = false;
        this.zza.zza();
    }

    public final void zzb(zzef zzefVar) throws zzas {
        long j;
        char c;
        zzee zzeeVar = this.zzc;
        zzefVar.zzm(zzeeVar.zza, 0, 3);
        zzeeVar.zzf(0);
        zzeeVar.zzh(8);
        this.zzd = zzeeVar.zzi();
        this.zze = zzeeVar.zzi();
        zzeeVar.zzh(6);
        zzefVar.zzm(zzeeVar.zza, 0, zzeeVar.zzj(8));
        zzeeVar.zzf(0);
        if (this.zzd) {
            zzeeVar.zzh(4);
            long zzj = zzeeVar.zzj(3);
            zzeeVar.zzh(1);
            int zzj2 = zzeeVar.zzj(15) << 15;
            zzeeVar.zzh(1);
            long zzj3 = zzeeVar.zzj(15);
            zzeeVar.zzh(1);
            if (this.zzf || !this.zze) {
                c = 30;
            } else {
                zzeeVar.zzh(4);
                zzeeVar.zzh(1);
                int zzj4 = zzeeVar.zzj(15) << 15;
                zzeeVar.zzh(1);
                c = 30;
                long zzj5 = zzeeVar.zzj(15);
                zzeeVar.zzh(1);
                this.zzb.zze((zzeeVar.zzj(3) << 30) | zzj4 | zzj5);
                this.zzf = true;
            }
            j = this.zzb.zze((zzj << c) | zzj2 | zzj3);
        } else {
            j = 0;
        }
        zzamd zzamdVar = this.zza;
        zzamdVar.zzc(j, 4);
        zzamdVar.zzd(zzefVar);
        zzamdVar.zze(false);
    }
}
