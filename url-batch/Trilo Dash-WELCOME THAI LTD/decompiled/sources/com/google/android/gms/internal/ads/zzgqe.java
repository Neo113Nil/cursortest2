package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgqe {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzgqe(int i, int i2, zzgqd zzgqdVar) {
        this.zza = zzgpr.zzc(i);
        this.zzb = zzgpr.zzc(i2);
    }

    public final zzgqe zza(zzgqh zzgqhVar) {
        this.zzb.add(zzgqhVar);
        return this;
    }

    public final zzgqe zzb(zzgqh zzgqhVar) {
        this.zza.add(zzgqhVar);
        return this;
    }

    public final zzgqf zzc() {
        return new zzgqf(this.zza, this.zzb, null);
    }
}
