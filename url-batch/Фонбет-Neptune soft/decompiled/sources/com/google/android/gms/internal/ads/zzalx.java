package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzalx implements zzamf {
    private final zzej zza;
    private final zzek zzb;
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzadp zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private zzaf zzk;
    private int zzl;
    private long zzm;

    public zzalx() {
        throw null;
    }

    public zzalx(String str, int i) {
        zzej zzejVar = new zzej(new byte[128], 128);
        this.zza = zzejVar;
        this.zzb = new zzek(zzejVar.zza);
        this.zzg = 0;
        this.zzm = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(zzek zzekVar) {
        zzdi.zzb(this.zzf);
        while (zzekVar.zzb() > 0) {
            int i = this.zzg;
            if (i == 0) {
                while (true) {
                    if (zzekVar.zzb() <= 0) {
                        break;
                    }
                    if (this.zzi) {
                        int zzm = zzekVar.zzm();
                        if (zzm == 119) {
                            this.zzi = false;
                            this.zzg = 1;
                            zzek zzekVar2 = this.zzb;
                            zzekVar2.zzM()[0] = Ascii.VT;
                            zzekVar2.zzM()[1] = 119;
                            this.zzh = 2;
                            break;
                        }
                        this.zzi = zzm == 11;
                    } else {
                        this.zzi = zzekVar.zzm() == 11;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(zzekVar.zzb(), this.zzl - this.zzh);
                this.zzf.zzq(zzekVar, min);
                int i2 = this.zzh + min;
                this.zzh = i2;
                if (i2 == this.zzl) {
                    zzdi.zzf(this.zzm != -9223372036854775807L);
                    this.zzf.zzs(this.zzm, 1, this.zzl, 0, null);
                    this.zzm += this.zzj;
                    this.zzg = 0;
                }
            } else {
                byte[] zzM = this.zzb.zzM();
                int min2 = Math.min(zzekVar.zzb(), 128 - this.zzh);
                zzekVar.zzG(zzM, this.zzh, min2);
                int i3 = this.zzh + min2;
                this.zzh = i3;
                if (i3 == 128) {
                    this.zza.zzl(0);
                    zzabi zze = zzabj.zze(this.zza);
                    zzaf zzafVar = this.zzk;
                    if (zzafVar == null || zze.zzc != zzafVar.zzz || zze.zzb != zzafVar.zzA || !zzet.zzG(zze.zza, zzafVar.zzm)) {
                        zzad zzadVar = new zzad();
                        zzadVar.zzK(this.zze);
                        zzadVar.zzX(zze.zza);
                        zzadVar.zzy(zze.zzc);
                        zzadVar.zzY(zze.zzb);
                        zzadVar.zzO(this.zzc);
                        zzadVar.zzV(this.zzd);
                        zzadVar.zzS(zze.zzf);
                        if ("audio/ac3".equals(zze.zza)) {
                            zzadVar.zzx(zze.zzf);
                        }
                        zzaf zzad = zzadVar.zzad();
                        this.zzk = zzad;
                        this.zzf.zzl(zzad);
                    }
                    this.zzl = zze.zzd;
                    this.zzj = (zze.zze * 1000000) / this.zzk.zzA;
                    this.zzb.zzK(0);
                    this.zzf.zzq(this.zzb, 128);
                    this.zzg = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        zzansVar.zzc();
        this.zze = zzansVar.zzb();
        this.zzf = zzacnVar.zzw(zzansVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = -9223372036854775807L;
    }
}
