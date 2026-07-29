package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzahr implements zzahs {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzyv zzc;
    private final zzzz zzd;
    private final zzahv zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzdy zzh;
    private final int zzi;
    private final zzad zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzahr(zzyv zzyvVar, zzzz zzzzVar, zzahv zzahvVar) throws zzbp {
        this.zzc = zzyvVar;
        this.zzd = zzzzVar;
        this.zze = zzahvVar;
        int max = Math.max(1, zzahvVar.zzc / 10);
        this.zzi = max;
        zzdy zzdyVar = new zzdy(zzahvVar.zzf);
        zzdyVar.zzi();
        int zzi = zzdyVar.zzi();
        this.zzf = zzi;
        int i = zzahvVar.zzb;
        int i2 = (((zzahvVar.zzd - (i * 4)) * 8) / (zzahvVar.zze * i)) + 1;
        if (zzi != i2) {
            throw zzbp.zza("Expected frames per block: " + i2 + "; got: " + zzi, null);
        }
        int zze = zzeg.zze(max, zzi);
        this.zzg = new byte[zzahvVar.zzd * zze];
        this.zzh = new zzdy(zze * (zzi + zzi) * i);
        int i3 = ((zzahvVar.zzc * zzahvVar.zzd) * 8) / zzi;
        zzab zzabVar = new zzab();
        zzabVar.zzS("audio/raw");
        zzabVar.zzv(i3);
        zzabVar.zzO(i3);
        zzabVar.zzL((max + max) * i);
        zzabVar.zzw(zzahvVar.zzb);
        zzabVar.zzT(zzahvVar.zzc);
        zzabVar.zzN(2);
        this.zzj = zzabVar.zzY();
    }

    private final int zzd(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zze(int i) {
        return (i + i) * this.zze.zzb;
    }

    private final void zzf(int i) {
        long j = this.zzl;
        long zzw = zzeg.zzw(this.zzn, 1000000L, this.zze.zzc);
        int zze = zze(i);
        this.zzd.zzs(j + zzw, 1, zze, this.zzm - zze, null);
        this.zzn += i;
        this.zzm -= zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final void zza(int i, long j) {
        this.zzc.zzL(new zzahy(this.zze, this.zzf, i, j));
        this.zzd.zzk(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final void zzb(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003b -> B:3:0x001f). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzahs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzyt zzytVar, long j) throws IOException {
        boolean z;
        int i;
        int zzd;
        int zze = zzeg.zze(this.zzi - zzd(this.zzm), this.zzf) * this.zze.zzd;
        if (j != 0) {
            z = false;
            while (!z) {
                if (this.zzk >= zze) {
                    break;
                }
                int zza2 = zzytVar.zza(this.zzg, this.zzk, (int) Math.min(zze - r7, j));
                if (zza2 != -1) {
                    this.zzk += zza2;
                }
            }
            i = this.zzk / this.zze.zzd;
            if (i > 0) {
                byte[] bArr = this.zzg;
                zzdy zzdyVar = this.zzh;
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = 0;
                    while (true) {
                        zzahv zzahvVar = this.zze;
                        int i4 = zzahvVar.zzb;
                        if (i3 < i4) {
                            byte[] zzH = zzdyVar.zzH();
                            int i5 = zzahvVar.zzd;
                            int i6 = (i2 * i5) + (i3 * 4);
                            int i7 = (i4 * 4) + i6;
                            int i8 = (short) (((bArr[i6 + 1] & UByte.MAX_VALUE) << 8) | (bArr[i6] & UByte.MAX_VALUE));
                            int min = Math.min(bArr[i6 + 2] & UByte.MAX_VALUE, 88);
                            int i9 = zzb[min];
                            int i10 = (this.zzf * i2 * i4) + i3;
                            int i11 = i10 + i10;
                            zzH[i11] = (byte) (i8 & 255);
                            zzH[i11 + 1] = (byte) (i8 >> 8);
                            int i12 = 0;
                            for (int i13 = (i5 / i4) - 4; i12 < i13 + i13; i13 = i13) {
                                int i14 = bArr[((i12 / 8) * i4 * 4) + i7 + ((i12 / 2) % 4)] & UByte.MAX_VALUE;
                                int i15 = i12 % 2 == 0 ? i14 & 15 : i14 >> 4;
                                int i16 = i15 & 7;
                                int i17 = (i16 + i16 + 1) * i9;
                                byte[] bArr2 = bArr;
                                int i18 = i17 >> 3;
                                if ((i15 & 8) != 0) {
                                    i18 = -i18;
                                }
                                i8 = zzeg.zzf(i8 + i18, -32768, 32767);
                                i11 += i4 + i4;
                                zzH[i11] = (byte) (i8 & 255);
                                zzH[i11 + 1] = (byte) (i8 >> 8);
                                min = zzeg.zzf(min + zza[i15], 0, 88);
                                i12++;
                                bArr = bArr2;
                                i9 = zzb[min];
                            }
                            i3++;
                        }
                    }
                }
                int zze2 = zze(this.zzf * i);
                zzdyVar.zzF(0);
                zzdyVar.zzE(zze2);
                this.zzk -= i * this.zze.zzd;
                zzdy zzdyVar2 = this.zzh;
                int zzd2 = zzdyVar2.zzd();
                zzzx.zzb(this.zzd, zzdyVar2, zzd2);
                int i19 = this.zzm + zzd2;
                this.zzm = i19;
                int zzd3 = zzd(i19);
                int i20 = this.zzi;
                if (zzd3 >= i20) {
                    zzf(i20);
                }
            }
            if (z && (zzd = zzd(this.zzm)) > 0) {
                zzf(zzd);
            }
            return z;
        }
        z = true;
        while (!z) {
        }
        i = this.zzk / this.zze.zzd;
        if (i > 0) {
        }
        if (z) {
            zzf(zzd);
        }
        return z;
    }
}
