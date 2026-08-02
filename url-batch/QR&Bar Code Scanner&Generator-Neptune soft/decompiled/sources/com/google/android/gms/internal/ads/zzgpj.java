package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgpj {
    static int zza(byte[] bArr, int i, zzgpi zzgpiVar) throws zzgrq {
        int zzj = zzj(bArr, i, zzgpiVar);
        int i2 = zzgpiVar.zza;
        if (i2 < 0) {
            throw zzgrq.zzf();
        }
        if (i2 > bArr.length - zzj) {
            throw zzgrq.zzj();
        }
        if (i2 == 0) {
            zzgpiVar.zzc = zzgpw.zzb;
            return zzj;
        }
        zzgpiVar.zzc = zzgpw.zzw(bArr, zzj, i2);
        return zzj + i2;
    }

    static int zzb(byte[] bArr, int i) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    static int zzc(zzgth zzgthVar, byte[] bArr, int i, int i2, int i3, zzgpi zzgpiVar) throws IOException {
        zzgsr zzgsrVar = (zzgsr) zzgthVar;
        Object zze = zzgsrVar.zze();
        int zzc = zzgsrVar.zzc(zze, bArr, i, i2, i3, zzgpiVar);
        zzgsrVar.zzf(zze);
        zzgpiVar.zzc = zze;
        return zzc;
    }

    static int zzd(zzgth zzgthVar, byte[] bArr, int i, int i2, zzgpi zzgpiVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzk(i4, bArr, i3, zzgpiVar);
            i4 = zzgpiVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzgrq.zzj();
        }
        Object zze = zzgthVar.zze();
        int i6 = i4 + i5;
        zzgthVar.zzi(zze, bArr, i5, i6, zzgpiVar);
        zzgthVar.zzf(zze);
        zzgpiVar.zzc = zze;
        return i6;
    }

    static int zze(zzgth zzgthVar, int i, byte[] bArr, int i2, int i3, zzgrn zzgrnVar, zzgpi zzgpiVar) throws IOException {
        int zzd = zzd(zzgthVar, bArr, i2, i3, zzgpiVar);
        zzgrnVar.add(zzgpiVar.zzc);
        while (zzd < i3) {
            int zzj = zzj(bArr, zzd, zzgpiVar);
            if (i != zzgpiVar.zza) {
                break;
            }
            zzd = zzd(zzgthVar, bArr, zzj, i3, zzgpiVar);
            zzgrnVar.add(zzgpiVar.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i, zzgrn zzgrnVar, zzgpi zzgpiVar) throws IOException {
        zzgrf zzgrfVar = (zzgrf) zzgrnVar;
        int zzj = zzj(bArr, i, zzgpiVar);
        int i2 = zzgpiVar.zza + zzj;
        while (zzj < i2) {
            zzj = zzj(bArr, zzj, zzgpiVar);
            zzgrfVar.zzh(zzgpiVar.zza);
        }
        if (zzj == i2) {
            return zzj;
        }
        throw zzgrq.zzj();
    }

    static int zzg(byte[] bArr, int i, zzgpi zzgpiVar) throws zzgrq {
        int zzj = zzj(bArr, i, zzgpiVar);
        int i2 = zzgpiVar.zza;
        if (i2 < 0) {
            throw zzgrq.zzf();
        }
        if (i2 == 0) {
            zzgpiVar.zzc = "";
            return zzj;
        }
        zzgpiVar.zzc = new String(bArr, zzj, i2, zzgro.zzb);
        return zzj + i2;
    }

    static int zzh(byte[] bArr, int i, zzgpi zzgpiVar) throws zzgrq {
        int zzj = zzj(bArr, i, zzgpiVar);
        int i2 = zzgpiVar.zza;
        if (i2 < 0) {
            throw zzgrq.zzf();
        }
        if (i2 == 0) {
            zzgpiVar.zzc = "";
            return zzj;
        }
        zzgpiVar.zzc = zzgun.zzh(bArr, zzj, i2);
        return zzj + i2;
    }

    static int zzi(int i, byte[] bArr, int i2, int i3, zzgtz zzgtzVar, zzgpi zzgpiVar) throws zzgrq {
        if ((i >>> 3) == 0) {
            throw zzgrq.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzm = zzm(bArr, i2, zzgpiVar);
            zzgtzVar.zzh(i, Long.valueOf(zzgpiVar.zzb));
            return zzm;
        }
        if (i4 == 1) {
            zzgtzVar.zzh(i, Long.valueOf(zzn(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zzj = zzj(bArr, i2, zzgpiVar);
            int i5 = zzgpiVar.zza;
            if (i5 < 0) {
                throw zzgrq.zzf();
            }
            if (i5 > bArr.length - zzj) {
                throw zzgrq.zzj();
            }
            if (i5 == 0) {
                zzgtzVar.zzh(i, zzgpw.zzb);
            } else {
                zzgtzVar.zzh(i, zzgpw.zzw(bArr, zzj, i5));
            }
            return zzj + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzgrq.zzc();
            }
            zzgtzVar.zzh(i, Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzgtz zze = zzgtz.zze();
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zzj2 = zzj(bArr, i2, zzgpiVar);
            int i8 = zzgpiVar.zza;
            if (i8 == i6) {
                i7 = i8;
                i2 = zzj2;
                break;
            }
            i7 = i8;
            i2 = zzi(i8, bArr, zzj2, i3, zze, zzgpiVar);
        }
        if (i2 > i3 || i7 != i6) {
            throw zzgrq.zzg();
        }
        zzgtzVar.zzh(i, zze);
        return i2;
    }

    static int zzj(byte[] bArr, int i, zzgpi zzgpiVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzk(b, bArr, i2, zzgpiVar);
        }
        zzgpiVar.zza = b;
        return i2;
    }

    static int zzk(int i, byte[] bArr, int i2, zzgpi zzgpiVar) {
        int i3 = i & WorkQueueKt.MASK;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzgpiVar.zza = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzgpiVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzgpiVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzgpiVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzgpiVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzl(int i, byte[] bArr, int i2, int i3, zzgrn zzgrnVar, zzgpi zzgpiVar) {
        zzgrf zzgrfVar = (zzgrf) zzgrnVar;
        int zzj = zzj(bArr, i2, zzgpiVar);
        zzgrfVar.zzh(zzgpiVar.zza);
        while (zzj < i3) {
            int zzj2 = zzj(bArr, zzj, zzgpiVar);
            if (i != zzgpiVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzgpiVar);
            zzgrfVar.zzh(zzgpiVar.zza);
        }
        return zzj;
    }

    static int zzm(byte[] bArr, int i, zzgpi zzgpiVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzgpiVar.zzb = j;
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
        zzgpiVar.zzb = j2;
        return i3;
    }

    static long zzn(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
