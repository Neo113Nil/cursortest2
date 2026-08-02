package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzatj {
    public static final zzatj zza = new zzatj(new int[]{2}, 2);
    private final int[] zzb;
    private final int zzc;

    zzatj(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, 1);
        this.zzb = copyOf;
        Arrays.sort(copyOf);
        this.zzc = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzatj)) {
            return false;
        }
        zzatj zzatjVar = (zzatj) obj;
        if (!Arrays.equals(this.zzb, zzatjVar.zzb)) {
            return false;
        }
        int i = zzatjVar.zzc;
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzb) * 31) + 2;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=2, supportedEncodings=" + Arrays.toString(this.zzb) + "]";
    }
}
