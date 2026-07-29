package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzmw {
    public static final zzmw zza = new zzmw(new int[]{2}, 8);
    private static final zzmw zzb = new zzmw(new int[]{2, 5, 6}, 8);
    private final int[] zzc;
    private final int zzd;

    public zzmw(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.zzc = copyOf;
        Arrays.sort(copyOf);
        this.zzd = 8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmw)) {
            return false;
        }
        zzmw zzmwVar = (zzmw) obj;
        if (!Arrays.equals(this.zzc, zzmwVar.zzc)) {
            return false;
        }
        int i = zzmwVar.zzd;
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzc) * 31) + 8;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=8, supportedEncodings=" + Arrays.toString(this.zzc) + "]";
    }

    public final boolean zza(int i) {
        return Arrays.binarySearch(this.zzc, i) >= 0;
    }
}
