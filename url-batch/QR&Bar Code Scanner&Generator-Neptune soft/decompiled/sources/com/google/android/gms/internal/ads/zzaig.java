package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaig {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzel zza = new zzel(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzef zzb = new zzef();

    zzaig(int i) {
    }

    private final int zze(zzzj zzzjVar) {
        zzef zzefVar = this.zzb;
        byte[] bArr = zzen.zzf;
        int length = bArr.length;
        zzefVar.zzD(bArr, 0);
        this.zzc = true;
        zzzjVar.zzj();
        return 0;
    }

    public final int zza(zzzj zzzjVar, zzaai zzaaiVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzzjVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzzjVar.zzd();
            int min = (int) Math.min(112800L, zzd);
            long j2 = zzd - min;
            if (zzzjVar.zzf() != j2) {
                zzaaiVar.zza = j2;
                return 1;
            }
            this.zzb.zzC(min);
            zzzjVar.zzj();
            ((zzyy) zzzjVar).zzm(this.zzb.zzH(), 0, min, false);
            zzef zzefVar = this.zzb;
            int zzc = zzefVar.zzc();
            int zzd2 = zzefVar.zzd();
            int i2 = zzd2 - 188;
            while (true) {
                if (i2 < zzc) {
                    break;
                }
                byte[] zzH = zzefVar.zzH();
                int i3 = -4;
                int i4 = 0;
                while (true) {
                    if (i3 > 4) {
                        break;
                    }
                    int i5 = (i3 * 188) + i2;
                    if (i5 < zzc || i5 >= zzd2 || zzH[i5] != 71) {
                        i4 = 0;
                    } else {
                        i4++;
                        if (i4 == 5) {
                            long zzb = zzaiq.zzb(zzefVar, i2, i);
                            if (zzb != -9223372036854775807L) {
                                j = zzb;
                                break;
                            }
                        }
                    }
                    i3++;
                }
                i2--;
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zze(zzzjVar);
            return 0;
        }
        if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zze(zzzjVar);
                return 0;
            }
            long zzb2 = this.zza.zzb(this.zzg) - this.zza.zzb(j3);
            this.zzh = zzb2;
            if (zzb2 < 0) {
                zzdw.zze("TsDurationReader", "Invalid duration: " + zzb2 + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zze(zzzjVar);
            return 0;
        }
        int min2 = (int) Math.min(112800L, zzzjVar.zzd());
        if (zzzjVar.zzf() != 0) {
            zzaaiVar.zza = 0L;
            return 1;
        }
        this.zzb.zzC(min2);
        zzzjVar.zzj();
        ((zzyy) zzzjVar).zzm(this.zzb.zzH(), 0, min2, false);
        zzef zzefVar2 = this.zzb;
        int zzc2 = zzefVar2.zzc();
        int zzd3 = zzefVar2.zzd();
        while (true) {
            if (zzc2 >= zzd3) {
                break;
            }
            if (zzefVar2.zzH()[zzc2] == 71) {
                long zzb3 = zzaiq.zzb(zzefVar2, zzc2, i);
                if (zzb3 != -9223372036854775807L) {
                    j = zzb3;
                    break;
                }
            }
            zzc2++;
        }
        this.zzf = j;
        this.zzd = true;
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzel zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
