package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzasf {
    public static final zzasf zza = new zzasf(new int[]{2}, 2);
    private final int[] zzb;
    private final int zzc;

    zzasf(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, 1);
        this.zzb = copyOf;
        Arrays.sort(copyOf);
        this.zzc = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzasf)) {
            return false;
        }
        zzasf zzasfVar = (zzasf) obj;
        if (!Arrays.equals(this.zzb, zzasfVar.zzb)) {
            return false;
        }
        int i = zzasfVar.zzc;
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzb) * 31) + 2;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=2, supportedEncodings=" + Arrays.toString(this.zzb) + "]";
    }
}
