package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzdxq {
    private final zzdxv zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdxq(zzdxv zzdxvVar, Executor executor) {
        this.zza = zzdxvVar;
        this.zzc = zzdxvVar.zza();
        this.zzb = executor;
    }

    public final zzdxp zza() {
        zzdxp zzdxpVar = new zzdxp(this);
        zzdxp.zza(zzdxpVar);
        return zzdxpVar;
    }
}
