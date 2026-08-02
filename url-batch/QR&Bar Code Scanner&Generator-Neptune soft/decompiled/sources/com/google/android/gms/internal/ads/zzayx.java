package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public class zzayx {
    protected final zzays zza;
    protected final int[] zzb;
    private final zzasw[] zzc;
    private int zzd;

    public zzayx(zzays zzaysVar, int... iArr) {
        Objects.requireNonNull(zzaysVar);
        this.zza = zzaysVar;
        this.zzc = new zzasw[1];
        for (int i = 0; i <= 0; i++) {
            this.zzc[i] = zzaysVar.zzb(iArr[i]);
        }
        Arrays.sort(this.zzc, new zzayw(null));
        this.zzb = new int[1];
        for (int i2 = 0; i2 <= 0; i2++) {
            this.zzb[i2] = zzaysVar.zza(this.zzc[i2]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzayx zzayxVar = (zzayx) obj;
            if (this.zza == zzayxVar.zza && Arrays.equals(this.zzb, zzayxVar.zzb)) {
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

    public final zzasw zzc(int i) {
        return this.zzc[i];
    }

    public final zzays zzd() {
        return this.zza;
    }
}
