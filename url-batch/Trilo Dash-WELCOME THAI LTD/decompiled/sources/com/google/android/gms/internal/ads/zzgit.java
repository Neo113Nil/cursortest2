package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgit {
    static int zza(byte[] bArr, int i, zzgis zzgisVar) throws zzgla {
        int zzj = zzj(bArr, i, zzgisVar);
        int i2 = zzgisVar.zza;
        if (i2 < 0) {
            throw zzgla.zzf();
        }
        if (i2 > bArr.length - zzj) {
            throw zzgla.zzj();
        }
        if (i2 == 0) {
            zzgisVar.zzc = zzgjg.zzb;
            return zzj;
        }
        zzgisVar.zzc = zzgjg.zzw(bArr, zzj, i2);
        return zzj + i2;
    }

    static int zzb(byte[] bArr, int i) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    static int zzc(zzgmr zzgmrVar, byte[] bArr, int i, int i2, int i3, zzgis zzgisVar) throws IOException {
        zzgmb zzgmbVar = (zzgmb) zzgmrVar;
        Object zze = zzgmbVar.zze();
        int zzc = zzgmbVar.zzc(zze, bArr, i, i2, i3, zzgisVar);
        zzgmbVar.zzf(zze);
        zzgisVar.zzc = zze;
        return zzc;
    }

    static int zzd(zzgmr zzgmrVar, byte[] bArr, int i, int i2, zzgis zzgisVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzk(i4, bArr, i3, zzgisVar);
            i4 = zzgisVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzgla.zzj();
        }
        Object zze = zzgmrVar.zze();
        int i6 = i4 + i5;
        zzgmrVar.zzi(zze, bArr, i5, i6, zzgisVar);
        zzgmrVar.zzf(zze);
        zzgisVar.zzc = zze;
        return i6;
    }

    static int zze(zzgmr zzgmrVar, int i, byte[] bArr, int i2, int i3, zzgkx zzgkxVar, zzgis zzgisVar) throws IOException {
        int zzd = zzd(zzgmrVar, bArr, i2, i3, zzgisVar);
        zzgkxVar.add(zzgisVar.zzc);
        while (zzd < i3) {
            int zzj = zzj(bArr, zzd, zzgisVar);
            if (i != zzgisVar.zza) {
                break;
            }
            zzd = zzd(zzgmrVar, bArr, zzj, i3, zzgisVar);
            zzgkxVar.add(zzgisVar.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i, zzgkx zzgkxVar, zzgis zzgisVar) throws IOException {
        zzgkp zzgkpVar = (zzgkp) zzgkxVar;
        int zzj = zzj(bArr, i, zzgisVar);
        int i2 = zzgisVar.zza + zzj;
        while (zzj < i2) {
            zzj = zzj(bArr, zzj, zzgisVar);
            zzgkpVar.zzh(zzgisVar.zza);
        }
        if (zzj == i2) {
            return zzj;
        }
        throw zzgla.zzj();
    }

    static int zzg(byte[] bArr, int i, zzgis zzgisVar) throws zzgla {
        int zzj = zzj(bArr, i, zzgisVar);
        int i2 = zzgisVar.zza;
        if (i2 < 0) {
            throw zzgla.zzf();
        }
        if (i2 == 0) {
            zzgisVar.zzc = "";
            return zzj;
        }
        zzgisVar.zzc = new String(bArr, zzj, i2, zzgky.zzb);
        return zzj + i2;
    }

    static int zzh(byte[] bArr, int i, zzgis zzgisVar) throws zzgla {
        int zzj = zzj(bArr, i, zzgisVar);
        int i2 = zzgisVar.zza;
        if (i2 < 0) {
            throw zzgla.zzf();
        }
        if (i2 == 0) {
            zzgisVar.zzc = "";
            return zzj;
        }
        zzgisVar.zzc = zzgnx.zzh(bArr, zzj, i2);
        return zzj + i2;
    }

    static int zzi(int i, byte[] bArr, int i2, int i3, zzgnj zzgnjVar, zzgis zzgisVar) throws zzgla {
        if ((i >>> 3) == 0) {
            throw zzgla.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzm = zzm(bArr, i2, zzgisVar);
            zzgnjVar.zzh(i, Long.valueOf(zzgisVar.zzb));
            return zzm;
        }
        if (i4 == 1) {
            zzgnjVar.zzh(i, Long.valueOf(zzn(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zzj = zzj(bArr, i2, zzgisVar);
            int i5 = zzgisVar.zza;
            if (i5 < 0) {
                throw zzgla.zzf();
            }
            if (i5 > bArr.length - zzj) {
                throw zzgla.zzj();
            }
            if (i5 == 0) {
                zzgnjVar.zzh(i, zzgjg.zzb);
            } else {
                zzgnjVar.zzh(i, zzgjg.zzw(bArr, zzj, i5));
            }
            return zzj + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzgla.zzc();
            }
            zzgnjVar.zzh(i, Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzgnj zze = zzgnj.zze();
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zzj2 = zzj(bArr, i2, zzgisVar);
            int i8 = zzgisVar.zza;
            if (i8 == i6) {
                i7 = i8;
                i2 = zzj2;
                break;
            }
            i7 = i8;
            i2 = zzi(i8, bArr, zzj2, i3, zze, zzgisVar);
        }
        if (i2 > i3 || i7 != i6) {
            throw zzgla.zzg();
        }
        zzgnjVar.zzh(i, zze);
        return i2;
    }

    static int zzj(byte[] bArr, int i, zzgis zzgisVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzk(b, bArr, i2, zzgisVar);
        }
        zzgisVar.zza = b;
        return i2;
    }

    static int zzk(int i, byte[] bArr, int i2, zzgis zzgisVar) {
        int i3 = i & WorkQueueKt.MASK;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzgisVar.zza = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzgisVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzgisVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzgisVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzgisVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzl(int i, byte[] bArr, int i2, int i3, zzgkx zzgkxVar, zzgis zzgisVar) {
        zzgkp zzgkpVar = (zzgkp) zzgkxVar;
        int zzj = zzj(bArr, i2, zzgisVar);
        zzgkpVar.zzh(zzgisVar.zza);
        while (zzj < i3) {
            int zzj2 = zzj(bArr, zzj, zzgisVar);
            if (i != zzgisVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzgisVar);
            zzgkpVar.zzh(zzgisVar.zza);
        }
        return zzj;
    }

    static int zzm(byte[] bArr, int i, zzgis zzgisVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzgisVar.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & ByteCompanionObject.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        zzgisVar.zzb = j2;
        return i3;
    }

    static long zzn(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
