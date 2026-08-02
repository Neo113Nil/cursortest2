package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzabv extends zzabu {
    private final zzef zzb;
    private final zzef zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzabv(zzaap zzaapVar) {
        super(zzaapVar);
        this.zzb = new zzef(zzaaf.zza);
        this.zzc = new zzef(4);
    }

    @Override // com.google.android.gms.internal.ads.zzabu
    protected final boolean zza(zzef zzefVar) throws zzabt {
        int zzk = zzefVar.zzk();
        int i = zzk >> 4;
        int i2 = zzk & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        throw new zzabt("Video format not supported: " + i2);
    }

    @Override // com.google.android.gms.internal.ads.zzabu
    protected final boolean zzb(zzef zzefVar, long j) throws zzbu {
        int zzk = zzefVar.zzk();
        long zzf = j + (zzefVar.zzf() * 1000);
        if (zzk == 0) {
            if (!this.zze) {
                zzef zzefVar2 = new zzef(new byte[zzefVar.zza()]);
                zzefVar.zzB(zzefVar2.zzH(), 0, zzefVar.zza());
                zzyn zza = zzyn.zza(zzefVar2);
                this.zzd = zza.zzb;
                zzad zzadVar = new zzad();
                zzadVar.zzS("video/avc");
                zzadVar.zzx(zza.zzf);
                zzadVar.zzX(zza.zzc);
                zzadVar.zzF(zza.zzd);
                zzadVar.zzP(zza.zze);
                zzadVar.zzI(zza.zza);
                this.zza.zzk(zzadVar.zzY());
                this.zze = true;
                return false;
            }
        } else if (zzk == 1 && this.zze) {
            int i = this.zzg == 1 ? 1 : 0;
            if (!this.zzf && i == 0) {
                return false;
            }
            byte[] zzH = this.zzc.zzH();
            zzH[0] = 0;
            zzH[1] = 0;
            zzH[2] = 0;
            int i2 = 4 - this.zzd;
            int i3 = 0;
            while (zzefVar.zza() > 0) {
                zzefVar.zzB(this.zzc.zzH(), i2, this.zzd);
                this.zzc.zzF(0);
                int zzn = this.zzc.zzn();
                this.zzb.zzF(0);
                this.zza.zzq(this.zzb, 4);
                this.zza.zzq(zzefVar, zzn);
                i3 = i3 + 4 + zzn;
            }
            this.zza.zzs(zzf, i, i3, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
