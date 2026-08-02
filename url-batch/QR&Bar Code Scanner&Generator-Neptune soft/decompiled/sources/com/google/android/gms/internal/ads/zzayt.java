package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzayt {
    public static final zzayt zza = new zzayt(new zzays[0]);
    public final int zzb;
    private final zzays[] zzc;
    private int zzd;

    public zzayt(zzays... zzaysVarArr) {
        this.zzc = zzaysVarArr;
        this.zzb = zzaysVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzayt zzaytVar = (zzayt) obj;
            if (this.zzb == zzaytVar.zzb && Arrays.equals(this.zzc, zzaytVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.zzc);
        this.zzd = hashCode;
        return hashCode;
    }

    public final int zza(zzays zzaysVar) {
        for (int i = 0; i < this.zzb; i++) {
            if (this.zzc[i] == zzaysVar) {
                return i;
            }
        }
        return -1;
    }

    public final zzays zzb(int i) {
        return this.zzc[i];
    }
}
