package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public class zzaxt {
    protected final zzaxo zza;
    protected final int[] zzb;
    private final zzars[] zzc;
    private int zzd;

    public zzaxt(zzaxo zzaxoVar, int... iArr) {
        Objects.requireNonNull(zzaxoVar);
        this.zza = zzaxoVar;
        this.zzc = new zzars[1];
        for (int i = 0; i <= 0; i++) {
            this.zzc[i] = zzaxoVar.zzb(iArr[i]);
        }
        Arrays.sort(this.zzc, new zzaxs(null));
        this.zzb = new int[1];
        for (int i2 = 0; i2 <= 0; i2++) {
            this.zzb[i2] = zzaxoVar.zza(this.zzc[i2]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaxt zzaxtVar = (zzaxt) obj;
            if (this.zza == zzaxtVar.zza && Arrays.equals(this.zzb, zzaxtVar.zzb)) {
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
        int identityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzb);
        this.zzd = identityHashCode;
        return identityHashCode;
    }

    public final int zza(int i) {
        return this.zzb[0];
    }

    public final int zzb() {
        int length = this.zzb.length;
        return 1;
    }

    public final zzars zzc(int i) {
        return this.zzc[i];
    }

    public final zzaxo zzd() {
        return this.zza;
    }
}
