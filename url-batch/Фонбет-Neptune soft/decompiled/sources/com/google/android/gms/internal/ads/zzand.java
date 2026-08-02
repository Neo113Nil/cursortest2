package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzand {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzer zza = new zzer(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzek zzb = new zzek();

    zzand() {
    }

    public static long zzc(zzek zzekVar) {
        int zzd = zzekVar.zzd();
        if (zzekVar.zzb() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzekVar.zzG(bArr, 0, 9);
        zzekVar.zzK(zzd);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        long j3 = (248 & j2) >> 3;
        long j4 = (j2 & 3) << 13;
        return j4 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
    }

    private final int zzf(zzacl zzaclVar) {
        byte[] bArr = zzet.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
        this.zzc = true;
        zzaclVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final int zza(zzacl zzaclVar, zzadf zzadfVar) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzaclVar.zzd();
            int min = (int) Math.min(20000L, zzd);
            long j2 = zzd - min;
            if (zzaclVar.zzf() != j2) {
                zzadfVar.zza = j2;
                return 1;
            }
            this.zzb.zzH(min);
            zzaclVar.zzj();
            ((zzaby) zzaclVar).zzm(this.zzb.zzM(), 0, min, false);
            zzek zzekVar = this.zzb;
            int zzd2 = zzekVar.zzd();
            int zze = zzekVar.zze() - 4;
            while (true) {
                if (zze < zzd2) {
                    break;
                }
                if (zzg(zzekVar.zzM(), zze) == 442) {
                    zzekVar.zzK(zze + 4);
                    long zzc = zzc(zzekVar);
                    if (zzc != -9223372036854775807L) {
                        j = zzc;
                        break;
                    }
                }
                zze--;
            }
            this.zzg = j;
            this.zze = true;
        } else {
            if (this.zzg == -9223372036854775807L) {
                zzf(zzaclVar);
                return 0;
            }
            if (this.zzd) {
                long j3 = this.zzf;
                if (j3 == -9223372036854775807L) {
                    zzf(zzaclVar);
                    return 0;
                }
                zzer zzerVar = this.zza;
                this.zzh = zzerVar.zzc(this.zzg) - zzerVar.zzb(j3);
                zzf(zzaclVar);
                return 0;
            }
            int min2 = (int) Math.min(20000L, zzaclVar.zzd());
            if (zzaclVar.zzf() != 0) {
                zzadfVar.zza = 0L;
                return 1;
            }
            this.zzb.zzH(min2);
            zzaclVar.zzj();
            ((zzaby) zzaclVar).zzm(this.zzb.zzM(), 0, min2, false);
            zzek zzekVar2 = this.zzb;
            int zzd3 = zzekVar2.zzd();
            int zze2 = zzekVar2.zze();
            while (true) {
                if (zzd3 >= zze2 - 3) {
                    break;
                }
                if (zzg(zzekVar2.zzM(), zzd3) == 442) {
                    zzekVar2.zzK(zzd3 + 4);
                    long zzc2 = zzc(zzekVar2);
                    if (zzc2 != -9223372036854775807L) {
                        j = zzc2;
                        break;
                    }
                }
                zzd3++;
            }
            this.zzf = j;
            this.zzd = true;
        }
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzer zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
