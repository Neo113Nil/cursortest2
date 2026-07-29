package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzahe {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzee zza = new zzee(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzdy zzb = new zzdy();

    zzahe(int i) {
    }

    private final int zze(zzyt zzytVar) {
        zzdy zzdyVar = this.zzb;
        byte[] bArr = zzeg.zzf;
        int length = bArr.length;
        zzdyVar.zzD(bArr, 0);
        this.zzc = true;
        zzytVar.zzj();
        return 0;
    }

    public final int zza(zzyt zzytVar, zzzs zzzsVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzytVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzytVar.zzd();
            int min = (int) Math.min(112800L, zzd);
            long j2 = zzd - min;
            if (zzytVar.zzf() != j2) {
                zzzsVar.zza = j2;
                return 1;
            }
            this.zzb.zzC(min);
            zzytVar.zzj();
            ((zzym) zzytVar).zzm(this.zzb.zzH(), 0, min, false);
            zzdy zzdyVar = this.zzb;
            int zzc = zzdyVar.zzc();
            int zzd2 = zzdyVar.zzd();
            int i2 = zzd2 - 188;
            while (true) {
                if (i2 < zzc) {
                    break;
                }
                byte[] zzH = zzdyVar.zzH();
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
                            long zzb = zzaho.zzb(zzdyVar, i2, i);
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
            zze(zzytVar);
            return 0;
        }
        if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zze(zzytVar);
                return 0;
            }
            long zzb2 = this.zza.zzb(this.zzg) - this.zza.zzb(j3);
            this.zzh = zzb2;
            if (zzb2 < 0) {
                Log.w("TsDurationReader", "Invalid duration: " + zzb2 + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zze(zzytVar);
            return 0;
        }
        int min2 = (int) Math.min(112800L, zzytVar.zzd());
        if (zzytVar.zzf() != 0) {
            zzzsVar.zza = 0L;
            return 1;
        }
        this.zzb.zzC(min2);
        zzytVar.zzj();
        ((zzym) zzytVar).zzm(this.zzb.zzH(), 0, min2, false);
        zzdy zzdyVar2 = this.zzb;
        int zzc2 = zzdyVar2.zzc();
        int zzd3 = zzdyVar2.zzd();
        while (true) {
            if (zzc2 >= zzd3) {
                break;
            }
            if (zzdyVar2.zzH()[zzc2] == 71) {
                long zzb3 = zzaho.zzb(zzdyVar2, zzc2, i);
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

    public final zzee zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
