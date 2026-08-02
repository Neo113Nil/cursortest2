package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhfp {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzhfp(int i, int i2, zzhfo zzhfoVar) {
        this.zza = zzhez.zzc(i);
        this.zzb = zzhez.zzc(i2);
    }

    public final zzhfp zza(zzhfl zzhflVar) {
        this.zzb.add(zzhflVar);
        return this;
    }

    public final zzhfp zzb(zzhfl zzhflVar) {
        this.zza.add(zzhflVar);
        return this;
    }

    public final zzhfq zzc() {
        return new zzhfq(this.zza, this.zzb, null);
    }
}
