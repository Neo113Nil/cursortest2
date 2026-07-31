package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzioh {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzioh(int i, int i2, zziog zziogVar) {
        this.zza = zzint.zza(i);
        this.zzb = zzint.zza(i2);
    }

    public final zzioh zza(zziof zziofVar) {
        this.zza.add(zziofVar);
        return this;
    }

    public final zzioh zzb(zziof zziofVar) {
        this.zzb.add(zziofVar);
        return this;
    }

    public final zzioi zzc() {
        return new zzioi(this.zza, this.zzb, null);
    }
}
