package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzhac {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzhac(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            boolean z = true;
            zzguk.zzc(c < 128, "Non-ASCII character: %s", c);
            if (bArr[c] != -1) {
                z = false;
            }
            zzguk.zzc(z, "Duplicate character: %s", c);
            bArr[c] = (byte) i;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhac) {
            zzhac zzhacVar = (zzhac) obj;
            if (this.zzi == zzhacVar.zzi && Arrays.equals(this.zzf, zzhacVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzi ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    final char zza(int i) {
        return this.zzf[i];
    }

    final boolean zzb(int i) {
        return this.zzh[i % this.zzc];
    }

    final int zzc(char c) throws zzhaf {
        if (c > 127) {
            throw new zzhaf("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        byte b = this.zzg[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new zzhaf("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 24);
        sb.append("Unrecognized character: ");
        sb.append(c);
        throw new zzhaf(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    final zzhac zzd() {
        boolean z;
        int i = 0;
        while (true) {
            char[] cArr = this.zzf;
            int length = cArr.length;
            if (i >= length) {
                return this;
            }
            if (zzgts.zzd(cArr[i])) {
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    if (zzgts.zzc(cArr[i2])) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                zzguk.zzj(!z, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[cArr.length];
                for (int i3 = 0; i3 < cArr.length; i3++) {
                    char c = cArr[i3];
                    if (zzgts.zzd(c)) {
                        c ^= 32;
                    }
                    cArr2[i3] = (char) c;
                }
                zzhac zzhacVar = new zzhac(this.zze.concat(".lowerCase()"), cArr2);
                if (!this.zzi || zzhacVar.zzi) {
                    return zzhacVar;
                }
                byte[] bArr = zzhacVar.zzg;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i4 = 65; i4 <= 90; i4++) {
                    int i5 = i4 | 32;
                    byte b = bArr[i4];
                    byte b2 = bArr[i5];
                    if (b == -1) {
                        copyOf[i4] = b2;
                    } else {
                        char c2 = (char) i4;
                        char c3 = (char) i5;
                        if (b2 != -1) {
                            throw new IllegalStateException(zzgvb.zzd("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c2), Character.valueOf(c3)));
                        }
                        copyOf[i5] = b;
                    }
                }
                return new zzhac(zzhacVar.zze.concat(".ignoreCase()"), zzhacVar.zzf, copyOf, true);
            }
            i++;
        }
    }

    public final boolean zze(char c) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    final /* synthetic */ char[] zzf() {
        return this.zzf;
    }

    private zzhac(String str, char[] cArr, byte[] bArr, boolean z) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zza = zzhaz.zza(length, RoundingMode.UNNECESSARY);
            this.zzb = zza;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(zza);
            int i = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i;
            this.zzd = zza >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.zzd; i2++) {
                zArr[zzhaz.zzb(i2 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = z;
        } catch (ArithmeticException e) {
            int length2 = cArr.length;
            StringBuilder sb = new StringBuilder(String.valueOf(length2).length() + 24);
            sb.append("Illegal alphabet length ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }
}
