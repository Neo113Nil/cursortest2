package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzhbf implements Serializable {
    private static final zzhbf zza = new zzhbf(new int[0], 0, 0);
    private final int[] zzb;
    private final int zzc;

    private zzhbf(int[] iArr, int i, int i2) {
        this.zzb = iArr;
        this.zzc = i2;
    }

    /* synthetic */ zzhbf(int[] iArr, int i, int i2, byte[] bArr) {
        this(iArr, 0, i2);
    }

    public static zzhbf zza() {
        return zza;
    }

    public static zzhbf zzb(int i, int i2, int i3) {
        return new zzhbf(new int[]{0, 2, 1}, 0, 3);
    }

    public static zzhbf zzc(int i, int i2, int i3, int i4, int i5) {
        return new zzhbf(new int[]{0, 2, 1, 3, 4}, 0, 5);
    }

    public static zzhbf zzd(int i, int i2, int i3, int i4, int i5, int i6) {
        return new zzhbf(new int[]{0, 2, 1, 5, 3, 4}, 0, 6);
    }

    public static zzhbf zze(int i, int... iArr) {
        int length = iArr.length;
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        iArr2[0] = 0;
        System.arraycopy(iArr, 0, iArr2, 1, length);
        return new zzhbf(iArr2, 0, i2);
    }

    public static zzhbf zzf(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzhbf(copyOf, 0, copyOf.length);
    }

    public static zzhbe zzg(int i) {
        zzguk.zzd(i >= 0, "Invalid initialCapacity: %s", i);
        return new zzhbe(i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhbf)) {
            return false;
        }
        zzhbf zzhbfVar = (zzhbf) obj;
        int i = this.zzc;
        if (i != zzhbfVar.zzc) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (zzi(i2) != zzhbfVar.zzi(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + Integer.hashCode(this.zzb[i2]);
        }
        return i;
    }

    public final String toString() {
        int i = this.zzc;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.zzb;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public final int zzh() {
        return this.zzc;
    }

    public final int zzi(int i) {
        zzguk.zzm(i, this.zzc, "index");
        return this.zzb[i];
    }
}
