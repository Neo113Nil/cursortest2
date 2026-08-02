package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzahz {
    private final zzahc zza;
    private final zzel zzb;
    private final zzee zzc = new zzee(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzahz(zzahc zzahcVar, zzel zzelVar) {
        this.zza = zzahcVar;
        this.zzb = zzelVar;
    }

    public final void zza(zzef zzefVar) throws zzbu {
        long j;
        zzefVar.zzB(this.zzc.zza, 0, 3);
        this.zzc.zzh(0);
        this.zzc.zzj(8);
        this.zzd = this.zzc.zzl();
        this.zze = this.zzc.zzl();
        this.zzc.zzj(6);
        zzefVar.zzB(this.zzc.zza, 0, this.zzc.zzc(8));
        this.zzc.zzh(0);
        if (this.zzd) {
            this.zzc.zzj(4);
            int zzc = this.zzc.zzc(3);
            this.zzc.zzj(1);
            int zzc2 = this.zzc.zzc(15);
            this.zzc.zzj(1);
            long zzc3 = (zzc << 30) | (zzc2 << 15) | this.zzc.zzc(15);
            this.zzc.zzj(1);
            if (!this.zzf && this.zze) {
                this.zzc.zzj(4);
                int zzc4 = this.zzc.zzc(3);
                this.zzc.zzj(1);
                int zzc5 = this.zzc.zzc(15);
                this.zzc.zzj(1);
                int zzc6 = this.zzc.zzc(15);
                this.zzc.zzj(1);
                this.zzb.zzb((zzc5 << 15) | (zzc4 << 30) | zzc6);
                this.zzf = true;
            }
            j = this.zzb.zzb(zzc3);
        } else {
            j = 0;
        }
        this.zza.zzd(j, 4);
        this.zza.zza(zzefVar);
        this.zza.zzc();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}
