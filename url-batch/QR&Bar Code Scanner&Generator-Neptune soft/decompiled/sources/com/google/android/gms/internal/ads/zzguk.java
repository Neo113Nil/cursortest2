package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
abstract class zzguk {
    zzguk() {
    }

    static final String zzd(ByteBuffer byteBuffer, int i, int i2) throws zzgrq {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (!zzguj.zzd(b)) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (zzguj.zzd(b2)) {
                int i7 = i5 + 1;
                cArr[i5] = (char) b2;
                i = i6;
                while (true) {
                    i5 = i7;
                    if (i < i3) {
                        byte b3 = byteBuffer.get(i);
                        if (!zzguj.zzd(b3)) {
                            break;
                        }
                        i++;
                        i7 = i5 + 1;
                        cArr[i5] = (char) b3;
                    }
                }
            } else if (zzguj.zzf(b2)) {
                if (i6 >= i3) {
                    throw zzgrq.zzd();
                }
                zzguj.zzc(b2, byteBuffer.get(i6), cArr, i5);
                i = i6 + 1;
                i5++;
            } else if (zzguj.zze(b2)) {
                if (i6 >= i3 - 1) {
                    throw zzgrq.zzd();
                }
                int i8 = i6 + 1;
                zzguj.zzb(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                i = i8 + 1;
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw zzgrq.zzd();
                }
                int i9 = i6 + 1;
                int i10 = i9 + 1;
                zzguj.zza(b2, byteBuffer.get(i6), byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                i5 += 2;
                i = i10 + 1;
            }
        }
        return new String(cArr, 0, i5);
    }

    abstract int zza(int i, byte[] bArr, int i2, int i3);

    abstract String zzb(byte[] bArr, int i, int i2) throws zzgrq;

    final boolean zzc(byte[] bArr, int i, int i2) {
        return zza(0, bArr, i, i2) == 0;
    }
}
