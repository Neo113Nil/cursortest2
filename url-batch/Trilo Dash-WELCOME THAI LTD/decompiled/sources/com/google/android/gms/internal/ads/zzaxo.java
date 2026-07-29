package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaxo {
    public final int zza = 1;
    private final zzars[] zzb;
    private int zzc;

    public zzaxo(zzars... zzarsVarArr) {
        this.zzb = zzarsVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.zzb, ((zzaxo) obj).zzb);
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.zzb) + 527;
        this.zzc = hashCode;
        return hashCode;
    }

    public final int zza(zzars zzarsVar) {
        for (int i = 0; i <= 0; i++) {
            if (zzarsVar == this.zzb[i]) {
                return i;
            }
        }
        return -1;
    }

    public final zzars zzb(int i) {
        return this.zzb[i];
    }
}
