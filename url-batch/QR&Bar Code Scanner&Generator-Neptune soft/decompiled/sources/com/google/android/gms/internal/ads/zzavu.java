package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzavu extends zzavw {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzavu(int i, long j) {
        super(i);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzavw
    public final String toString() {
        return zzg(this.zzaR) + " leaves: " + Arrays.toString(this.zzb.toArray()) + " containers: " + Arrays.toString(this.zzc.toArray());
    }

    public final zzavu zza(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzavu zzavuVar = (zzavu) this.zzc.get(i2);
            if (zzavuVar.zzaR == i) {
                return zzavuVar;
            }
        }
        return null;
    }

    public final zzavv zzb(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzavv zzavvVar = (zzavv) this.zzb.get(i2);
            if (zzavvVar.zzaR == i) {
                return zzavvVar;
            }
        }
        return null;
    }

    public final void zzc(zzavu zzavuVar) {
        this.zzc.add(zzavuVar);
    }

    public final void zzd(zzavv zzavvVar) {
        this.zzb.add(zzavvVar);
    }
}
