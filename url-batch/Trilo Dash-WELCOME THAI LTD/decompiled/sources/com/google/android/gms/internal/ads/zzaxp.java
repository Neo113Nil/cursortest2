package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaxp {
    public static final zzaxp zza = new zzaxp(new zzaxo[0]);
    public final int zzb;
    private final zzaxo[] zzc;
    private int zzd;

    public zzaxp(zzaxo... zzaxoVarArr) {
        this.zzc = zzaxoVarArr;
        this.zzb = zzaxoVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaxp zzaxpVar = (zzaxp) obj;
            if (this.zzb == zzaxpVar.zzb && Arrays.equals(this.zzc, zzaxpVar.zzc)) {
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

    public final int zza(zzaxo zzaxoVar) {
        for (int i = 0; i < this.zzb; i++) {
            if (this.zzc[i] == zzaxoVar) {
                return i;
            }
        }
        return -1;
    }

    public final zzaxo zzb(int i) {
        return this.zzc[i];
    }
}
