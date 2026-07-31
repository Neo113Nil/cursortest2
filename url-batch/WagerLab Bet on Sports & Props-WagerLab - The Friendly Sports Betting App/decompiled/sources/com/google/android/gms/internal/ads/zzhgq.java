package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
final class zzhgq {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i, zzhgp zzhgpVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzb(b, bArr, i2, zzhgpVar);
        }
        zzhgpVar.zza = b;
        return i2;
    }

    static int zzb(int i, byte[] bArr, int i2, zzhgp zzhgpVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zzhgpVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzhgpVar.zza = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzhgpVar.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzhgpVar.zza = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzhgpVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzc(byte[] bArr, int i, zzhgp zzhgpVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzhgpVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        zzhgpVar.zzb = j2;
        return i3;
    }

    static int zzd(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static long zze(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    static int zzf(byte[] bArr, int i, zzhgp zzhgpVar) throws zzhiw {
        int zza2 = zza(bArr, i, zzhgpVar);
        int i2 = zzhgpVar.zza;
        if (i2 < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            zzhgpVar.zzc = "";
            return zza2;
        }
        zzhgpVar.zzc = zzhlh.zzf(bArr, zza2, i2);
        return zza2 + i2;
    }

    static int zzg(byte[] bArr, int i, zzhgp zzhgpVar) throws zzhiw {
        int zza2 = zza(bArr, i, zzhgpVar);
        int i2 = zzhgpVar.zza;
        if (i2 < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - zza2) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            zzhgpVar.zzc = zzhhb.zzb;
            return zza2;
        }
        zzhgpVar.zzc = zzhhb.zzr(bArr, zza2, i2);
        return zza2 + i2;
    }

    static int zzh(zzhkk zzhkkVar, byte[] bArr, int i, int i2, zzhgp zzhgpVar) throws IOException {
        Object zza2 = zzhkkVar.zza();
        int zzj = zzj(zza2, zzhkkVar, bArr, i, i2, zzhgpVar);
        zzhkkVar.zzk(zza2);
        zzhgpVar.zzc = zza2;
        return zzj;
    }

    static int zzi(zzhkk zzhkkVar, byte[] bArr, int i, int i2, int i3, zzhgp zzhgpVar) throws IOException {
        Object zza2 = zzhkkVar.zza();
        int zzk = zzk(zza2, zzhkkVar, bArr, i, i2, i3, zzhgpVar);
        zzhkkVar.zzk(zza2);
        zzhgpVar.zzc = zza2;
        return zzk;
    }

    static int zzj(Object obj, zzhkk zzhkkVar, byte[] bArr, int i, int i2, zzhgp zzhgpVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzb(i4, bArr, i3, zzhgpVar);
            i4 = zzhgpVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = zzhgpVar.zze + 1;
        zzhgpVar.zze = i6;
        zzq(i6);
        int i7 = i5 + i4;
        zzhkkVar.zzj(obj, bArr, i5, i7, zzhgpVar);
        zzhgpVar.zze--;
        zzhgpVar.zzc = obj;
        return i7;
    }

    static int zzk(Object obj, zzhkk zzhkkVar, byte[] bArr, int i, int i2, int i3, zzhgp zzhgpVar) throws IOException {
        int i4 = zzhgpVar.zze + 1;
        zzhgpVar.zze = i4;
        zzq(i4);
        int zzi = ((zzhjv) zzhkkVar).zzi(obj, bArr, i, i2, i3, zzhgpVar);
        zzhgpVar.zze--;
        zzhgpVar.zzc = obj;
        return zzi;
    }

    static int zzl(int i, byte[] bArr, int i2, int i3, zzhit zzhitVar, zzhgp zzhgpVar) {
        zzhii zzhiiVar = (zzhii) zzhitVar;
        int zza2 = zza(bArr, i2, zzhgpVar);
        zzhiiVar.zzi(zzhgpVar.zza);
        while (zza2 < i3) {
            int zza3 = zza(bArr, zza2, zzhgpVar);
            if (i != zzhgpVar.zza) {
                break;
            }
            zza2 = zza(bArr, zza3, zzhgpVar);
            zzhiiVar.zzi(zzhgpVar.zza);
        }
        return zza2;
    }

    static int zzm(byte[] bArr, int i, zzhit zzhitVar, zzhgp zzhgpVar) throws IOException {
        zzhii zzhiiVar = (zzhii) zzhitVar;
        int zza2 = zza(bArr, i, zzhgpVar);
        int i2 = zzhgpVar.zza + zza2;
        while (zza2 < i2) {
            zza2 = zza(bArr, zza2, zzhgpVar);
            zzhiiVar.zzi(zzhgpVar.zza);
        }
        if (zza2 == i2) {
            return zza2;
        }
        throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzn(zzhkk zzhkkVar, int i, byte[] bArr, int i2, int i3, zzhit zzhitVar, zzhgp zzhgpVar) throws IOException {
        int zzh = zzh(zzhkkVar, bArr, i2, i3, zzhgpVar);
        zzhitVar.add(zzhgpVar.zzc);
        while (zzh < i3) {
            int zza2 = zza(bArr, zzh, zzhgpVar);
            if (i != zzhgpVar.zza) {
                break;
            }
            zzh = zzh(zzhkkVar, bArr, zza2, i3, zzhgpVar);
            zzhitVar.add(zzhgpVar.zzc);
        }
        return zzh;
    }

    static int zzo(int i, byte[] bArr, int i2, int i3, zzhkw zzhkwVar, zzhgp zzhgpVar) throws zzhiw {
        if ((i >>> 3) == 0) {
            throw new zzhiw("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzc = zzc(bArr, i2, zzhgpVar);
            zzhkwVar.zzk(i, Long.valueOf(zzhgpVar.zzb));
            return zzc;
        }
        if (i4 == 1) {
            zzhkwVar.zzk(i, Long.valueOf(zze(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zza2 = zza(bArr, i2, zzhgpVar);
            int i5 = zzhgpVar.zza;
            if (i5 < 0) {
                throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - zza2) {
                throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                zzhkwVar.zzk(i, zzhhb.zzb);
            } else {
                zzhkwVar.zzk(i, zzhhb.zzr(bArr, zza2, i5));
            }
            return zza2 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzhiw("Protocol message contained an invalid tag (zero).");
            }
            zzhkwVar.zzk(i, Integer.valueOf(zzd(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzhkw zzb2 = zzhkw.zzb();
        int i7 = zzhgpVar.zze + 1;
        zzhgpVar.zze = i7;
        zzq(i7);
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zza3 = zza(bArr, i2, zzhgpVar);
            int i9 = zzhgpVar.zza;
            if (i9 == i6) {
                i8 = i9;
                i2 = zza3;
                break;
            }
            i2 = zzo(i9, bArr, zza3, i3, zzb2, zzhgpVar);
            i8 = i9;
        }
        zzhgpVar.zze--;
        if (i2 > i3 || i8 != i6) {
            throw new zzhiw("Failed to parse the message.");
        }
        zzhkwVar.zzk(i, zzb2);
        return i2;
    }

    static int zzp(int i, byte[] bArr, int i2, int i3, zzhgp zzhgpVar) throws zzhiw {
        if ((i >>> 3) == 0) {
            throw new zzhiw("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzc(bArr, i2, zzhgpVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zza(bArr, i2, zzhgpVar) + zzhgpVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new zzhiw("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zza(bArr, i2, zzhgpVar);
            i6 = zzhgpVar.zza;
            if (i6 == i5) {
                break;
            }
            i2 = zzp(i6, bArr, i2, i3, zzhgpVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw new zzhiw("Failed to parse the message.");
        }
        return i2;
    }

    private static void zzq(int i) throws zzhiw {
        if (i >= zzb) {
            throw new zzhiw("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
