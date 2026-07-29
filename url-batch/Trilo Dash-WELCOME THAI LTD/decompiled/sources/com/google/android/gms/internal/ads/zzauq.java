package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzauq extends zzaus {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzauq(int i, long j) {
        super(i);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzaus
    public final String toString() {
        return zzg(this.zzaR) + " leaves: " + Arrays.toString(this.zzb.toArray()) + " containers: " + Arrays.toString(this.zzc.toArray());
    }

    public final zzauq zza(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzauq zzauqVar = (zzauq) this.zzc.get(i2);
            if (zzauqVar.zzaR == i) {
                return zzauqVar;
            }
        }
        return null;
    }

    public final zzaur zzb(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzaur zzaurVar = (zzaur) this.zzb.get(i2);
            if (zzaurVar.zzaR == i) {
                return zzaurVar;
            }
        }
        return null;
    }

    public final void zzc(zzauq zzauqVar) {
        this.zzc.add(zzauqVar);
    }

    public final void zzd(zzaur zzaurVar) {
        this.zzb.add(zzaurVar);
    }
}
