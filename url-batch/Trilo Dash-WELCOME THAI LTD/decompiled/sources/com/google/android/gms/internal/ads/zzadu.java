package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzadu extends zzadw {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzadu(int i, long j) {
        super(i);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzadw
    public final String toString() {
        return zzf(this.zzd) + " leaves: " + Arrays.toString(this.zzb.toArray()) + " containers: " + Arrays.toString(this.zzc.toArray());
    }

    public final zzadu zza(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzadu zzaduVar = (zzadu) this.zzc.get(i2);
            if (zzaduVar.zzd == i) {
                return zzaduVar;
            }
        }
        return null;
    }

    public final zzadv zzb(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzadv zzadvVar = (zzadv) this.zzb.get(i2);
            if (zzadvVar.zzd == i) {
                return zzadvVar;
            }
        }
        return null;
    }

    public final void zzc(zzadu zzaduVar) {
        this.zzc.add(zzaduVar);
    }

    public final void zzd(zzadv zzadvVar) {
        this.zzb.add(zzadvVar);
    }
}
