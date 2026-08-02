package com.google.android.gms.internal.ads;

import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzahq implements zzahc {
    private final zzef zza;
    private final zzaab zzb;
    private final String zzc;
    private zzaap zzd;
    private String zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private long zzl;

    public zzahq() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zza(zzef zzefVar) {
        zzdd.zzb(this.zzd);
        while (zzefVar.zza() > 0) {
            int i = this.zzf;
            if (i == 0) {
                byte[] zzH = zzefVar.zzH();
                int zzc = zzefVar.zzc();
                int zzd = zzefVar.zzd();
                while (true) {
                    if (zzc >= zzd) {
                        zzefVar.zzF(zzd);
                        break;
                    }
                    byte b = zzH[zzc];
                    boolean z = (b & UByte.MAX_VALUE) == 255;
                    boolean z2 = this.zzi && (b & 224) == 224;
                    this.zzi = z;
                    if (z2) {
                        zzefVar.zzF(zzc + 1);
                        this.zzi = false;
                        this.zza.zzH()[1] = zzH[zzc];
                        this.zzg = 2;
                        this.zzf = 1;
                        break;
                    }
                    zzc++;
                }
            } else if (i != 1) {
                int min = Math.min(zzefVar.zza(), this.zzk - this.zzg);
                this.zzd.zzq(zzefVar, min);
                int i2 = this.zzg + min;
                this.zzg = i2;
                int i3 = this.zzk;
                if (i2 >= i3) {
                    long j = this.zzl;
                    if (j != -9223372036854775807L) {
                        this.zzd.zzs(j, 1, i3, 0, null);
                        this.zzl += this.zzj;
                    }
                    this.zzg = 0;
                    this.zzf = 0;
                }
            } else {
                int min2 = Math.min(zzefVar.zza(), 4 - this.zzg);
                zzefVar.zzB(this.zza.zzH(), this.zzg, min2);
                int i4 = this.zzg + min2;
                this.zzg = i4;
                if (i4 >= 4) {
                    this.zza.zzF(0);
                    if (this.zzb.zza(this.zza.zze())) {
                        this.zzk = this.zzb.zzc;
                        if (!this.zzh) {
                            this.zzj = (r0.zzg * 1000000) / r0.zzd;
                            zzad zzadVar = new zzad();
                            zzadVar.zzH(this.zze);
                            zzadVar.zzS(this.zzb.zzb);
                            zzadVar.zzL(4096);
                            zzadVar.zzw(this.zzb.zze);
                            zzadVar.zzT(this.zzb.zzd);
                            zzadVar.zzK(this.zzc);
                            this.zzd.zzk(zzadVar.zzY());
                            this.zzh = true;
                        }
                        this.zza.zzF(0);
                        this.zzd.zzq(this.zza, 4);
                        this.zzf = 2;
                    } else {
                        this.zzg = 0;
                        this.zzf = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzb(zzzl zzzlVar, zzaio zzaioVar) {
        zzaioVar.zzc();
        this.zze = zzaioVar.zzb();
        this.zzd = zzzlVar.zzv(zzaioVar.zza(), 1);
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
        this.zzi = false;
        this.zzl = -9223372036854775807L;
    }

    public zzahq(String str) {
        this.zzf = 0;
        zzef zzefVar = new zzef(4);
        this.zza = zzefVar;
        zzefVar.zzH()[0] = -1;
        this.zzb = new zzaab();
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
