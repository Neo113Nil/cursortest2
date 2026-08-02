package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaev extends zzaex {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzaev(int i, long j) {
        super(i);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final String toString() {
        return zzf(this.zzd) + " leaves: " + Arrays.toString(this.zzb.toArray()) + " containers: " + Arrays.toString(this.zzc.toArray());
    }

    public final zzaev zza(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzaev zzaevVar = (zzaev) this.zzc.get(i2);
            if (zzaevVar.zzd == i) {
                return zzaevVar;
            }
        }
        return null;
    }

    public final zzaew zzb(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzaew zzaewVar = (zzaew) this.zzb.get(i2);
            if (zzaewVar.zzd == i) {
                return zzaewVar;
            }
        }
        return null;
    }

    public final void zzc(zzaev zzaevVar) {
        this.zzc.add(zzaevVar);
    }

    public final void zzd(zzaew zzaewVar) {
        this.zzb.add(zzaewVar);
    }
}
