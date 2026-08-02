package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgpc {
    private final byte[] zza;

    private zzgpc(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    public static zzgpc zza(byte[] bArr) {
        Objects.requireNonNull(bArr, "data must be non-null");
        return new zzgpc(bArr, 0, bArr.length);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgpc) {
            return Arrays.equals(((zzgpc) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return "Bytes(" + zzgoq.zza(this.zza) + ")";
    }

    public final byte[] zzb() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
