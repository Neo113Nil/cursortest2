package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgxs {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzgxs(int i, int i2, zzgxr zzgxrVar) {
        this.zza = zzgxf.zzc(i);
        this.zzb = zzgxf.zzc(i2);
    }

    public final zzgxs zza(zzgxv zzgxvVar) {
        this.zzb.add(zzgxvVar);
        return this;
    }

    public final zzgxs zzb(zzgxv zzgxvVar) {
        this.zza.add(zzgxvVar);
        return this;
    }

    public final zzgxt zzc() {
        return new zzgxt(this.zza, this.zzb, null);
    }
}
