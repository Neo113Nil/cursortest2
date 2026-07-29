package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzcs {
    public static final zzl zza = new zzl() { // from class: com.google.android.gms.internal.ads.zzcr
    };
    public final int zzb;
    private final zzck zzc;
    private final int[] zzd;
    private final boolean[] zze;

    public zzcs(zzck zzckVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = zzckVar.zzb;
        this.zzb = 1;
        this.zzc = zzckVar;
        this.zzd = (int[]) iArr.clone();
        this.zze = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzcs zzcsVar = (zzcs) obj;
            if (this.zzc.equals(zzcsVar.zzc) && Arrays.equals(this.zzd, zzcsVar.zzd) && Arrays.equals(this.zze, zzcsVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.zzc.hashCode() * 961) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze);
    }

    public final int zza() {
        return this.zzc.zzd;
    }

    public final zzad zzb(int i) {
        return this.zzc.zzb(i);
    }

    public final boolean zzc() {
        for (boolean z : this.zze) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i) {
        return this.zze[i];
    }
}
