package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzagv implements zzahc {
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

    public zzagv() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zza(zzef zzefVar) {
        zzdd.zzb(this.zze);
        while (zzefVar.zza() > 0) {
            int i = this.zzf;
            if (i == 0) {
                while (zzefVar.zza() > 0) {
                    if (this.zzh) {
                        int zzk = zzefVar.zzk();
                        this.zzh = zzk == 172;
                        if (zzk != 64) {
                            if (zzk == 65) {
                                zzk = 65;
                            }
                        }
                        this.zzf = 1;
                        zzef zzefVar2 = this.zzb;
                        zzefVar2.zzH()[0] = -84;
                        zzefVar2.zzH()[1] = zzk == 65 ? (byte) 65 : (byte) 64;
                        this.zzg = 2;
                    } else {
                        this.zzh = zzefVar.zzk() == 172;
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
                int min2 = Math.min(zzefVar.zza(), 16 - this.zzg);
                zzefVar.zzB(zzH, this.zzg, min2);
                int i4 = this.zzg + min2;
                this.zzg = i4;
                if (i4 == 16) {
                    this.zza.zzh(0);
                    zzyl zza = zzym.zza(this.zza);
                    zzaf zzafVar = this.zzj;
                    if (zzafVar == null || zzafVar.zzz != 2 || zza.zza != zzafVar.zzA || !"audio/ac4".equals(zzafVar.zzm)) {
                        zzad zzadVar = new zzad();
                        zzadVar.zzH(this.zzd);
                        zzadVar.zzS("audio/ac4");
                        zzadVar.zzw(2);
                        zzadVar.zzT(zza.zza);
                        zzadVar.zzK(this.zzc);
                        zzaf zzY = zzadVar.zzY();
                        this.zzj = zzY;
                        this.zze.zzk(zzY);
                    }
                    this.zzk = zza.zzb;
                    this.zzi = (zza.zzc * 1000000) / this.zzj.zzA;
                    this.zzb.zzF(0);
                    this.zze.zzq(this.zzb, 16);
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

    public zzagv(String str) {
        zzee zzeeVar = new zzee(new byte[16], 16);
        this.zza = zzeeVar;
        this.zzb = new zzef(zzeeVar.zza);
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
