package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzazf {
    private int zza;
    private final zzayx[] zzb;

    public zzazf(zzayx[] zzayxVarArr, byte... bArr) {
        this.zzb = zzayxVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzb, ((zzazf) obj).zzb);
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.zzb) + 527;
        this.zza = hashCode;
        return hashCode;
    }

    public final zzayx zza(int i) {
        return this.zzb[i];
    }

    public final zzayx[] zzb() {
        return (zzayx[]) this.zzb.clone();
    }
}
