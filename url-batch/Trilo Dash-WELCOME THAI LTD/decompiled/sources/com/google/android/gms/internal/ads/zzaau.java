package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzaau extends zzaat {
    private final zzdy zzb;
    private final zzdy zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzaau(zzzz zzzzVar) {
        super(zzzzVar);
        this.zzb = new zzdy(zzzp.zza);
        this.zzc = new zzdy(4);
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    protected final boolean zza(zzdy zzdyVar) throws zzaas {
        int zzk = zzdyVar.zzk();
        int i = zzk >> 4;
        int i2 = zzk & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        throw new zzaas("Video format not supported: " + i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    protected final boolean zzb(zzdy zzdyVar, long j) throws zzbp {
        int zzk = zzdyVar.zzk();
        long zzf = j + (zzdyVar.zzf() * 1000);
        if (zzk == 0) {
            if (!this.zze) {
                zzdy zzdyVar2 = new zzdy(new byte[zzdyVar.zza()]);
                zzdyVar.zzB(zzdyVar2.zzH(), 0, zzdyVar.zza());
                zzyb zza = zzyb.zza(zzdyVar2);
                this.zzd = zza.zzb;
                zzab zzabVar = new zzab();
                zzabVar.zzS("video/avc");
                zzabVar.zzx(zza.zzf);
                zzabVar.zzX(zza.zzc);
                zzabVar.zzF(zza.zzd);
                zzabVar.zzP(zza.zze);
                zzabVar.zzI(zza.zza);
                this.zza.zzk(zzabVar.zzY());
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
            while (zzdyVar.zza() > 0) {
                zzdyVar.zzB(this.zzc.zzH(), i2, this.zzd);
                this.zzc.zzF(0);
                int zzn = this.zzc.zzn();
                this.zzb.zzF(0);
                this.zza.zzq(this.zzb, 4);
                this.zza.zzq(zzdyVar, zzn);
                i3 = i3 + 4 + zzn;
            }
            this.zza.zzs(zzf, i, i3, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
