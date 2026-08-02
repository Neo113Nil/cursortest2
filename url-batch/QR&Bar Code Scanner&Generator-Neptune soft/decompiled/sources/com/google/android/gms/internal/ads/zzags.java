package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzags implements zzahc {
    private final zzee zza;
    private final zzef zzb;
    private final String zzc;
    private String zzd;
    private zzaap zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private zzaf zzj;
    private int zzk;
    private long zzl;

    public zzags() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zza(zzef zzefVar) {
        zzdd.zzb(this.zze);
        while (zzefVar.zza() > 0) {
            int i = this.zzf;
            if (i == 0) {
                while (true) {
                    if (zzefVar.zza() <= 0) {
                        break;
                    }
                    if (this.zzh) {
                        int zzk = zzefVar.zzk();
                        if (zzk == 119) {
                            this.zzh = false;
                            this.zzf = 1;
                            zzef zzefVar2 = this.zzb;
                            zzefVar2.zzH()[0] = 11;
                            zzefVar2.zzH()[1] = 119;
                            this.zzg = 2;
                            break;
                        }
                        this.zzh = zzk == 11;
                    } else {
                        this.zzh = zzefVar.zzk() == 11;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(zzefVar.zza(), this.zzk - this.zzg);
                this.zze.zzq(zzefVar, min);
                int i2 = this.zzg + min;
                this.zzg = i2;
                int i3 = this.zzk;
                if (i2 == i3) {
                    long j = this.zzl;
                    if (j != -9223372036854775807L) {
                        this.zze.zzs(j, 1, i3, 0, null);
                        this.zzl += this.zzi;
                    }
                    this.zzf = 0;
                }
            } else {
                byte[] zzH = this.zzb.zzH();
                int min2 = Math.min(zzefVar.zza(), 128 - this.zzg);
                zzefVar.zzB(zzH, this.zzg, min2);
                int i4 = this.zzg + min2;
                this.zzg = i4;
                if (i4 == 128) {
                    this.zza.zzh(0);
                    zzyi zze = zzyj.zze(this.zza);
                    zzaf zzafVar = this.zzj;
                    if (zzafVar == null || zze.zzc != zzafVar.zzz || zze.zzb != zzafVar.zzA || !zzen.zzT(zze.zza, zzafVar.zzm)) {
                        zzad zzadVar = new zzad();
                        zzadVar.zzH(this.zzd);
                        zzadVar.zzS(zze.zza);
                        zzadVar.zzw(zze.zzc);
                        zzadVar.zzT(zze.zzb);
                        zzadVar.zzK(this.zzc);
                        zzaf zzY = zzadVar.zzY();
                        this.zzj = zzY;
                        this.zze.zzk(zzY);
                    }
                    this.zzk = zze.zzd;
                    this.zzi = (zze.zze * 1000000) / this.zzj.zzA;
                    this.zzb.zzF(0);
                    this.zze.zzq(this.zzb, 128);
                    this.zzf = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzb(zzzl zzzlVar, zzaio zzaioVar) {
        zzaioVar.zzc();
        this.zzd = zzaioVar.zzb();
        this.zze = zzzlVar.zzv(zzaioVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zze() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
    }

    public zzags(String str) {
        zzee zzeeVar = new zzee(new byte[128], 128);
        this.zza = zzeeVar;
        this.zzb = new zzef(zzeeVar.zza);
        this.zzf = 0;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
