package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzkq {
    private final zzaa zza;
    private final SparseArray zzb;

    public zzkq(zzaa zzaaVar, SparseArray sparseArray) {
        this.zza = zzaaVar;
        SparseArray sparseArray2 = new SparseArray(zzaaVar.zzb());
        for (int i = 0; i < zzaaVar.zzb(); i++) {
            int zza = zzaaVar.zza(i);
            zzkp zzkpVar = (zzkp) sparseArray.get(zza);
            Objects.requireNonNull(zzkpVar);
            sparseArray2.append(zza, zzkpVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i) {
        return this.zza.zza(i);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzkp zzc(int i) {
        zzkp zzkpVar = (zzkp) this.zzb.get(i);
        Objects.requireNonNull(zzkpVar);
        return zzkpVar;
    }

    public final boolean zzd(int i) {
        return this.zza.zzc(i);
    }
}
