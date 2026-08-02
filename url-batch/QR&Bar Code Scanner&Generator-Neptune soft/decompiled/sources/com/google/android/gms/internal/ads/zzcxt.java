package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcxt implements zzgxi {
    private final zzcxj zza;
    private final zzgxv zzb;

    public zzcxt(zzcxj zzcxjVar, zzgxv zzgxvVar) {
        this.zza = zzcxjVar;
        this.zzb = zzgxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdkg((zzcyt) this.zzb.zzb(), zzchc.zzf));
        zzgxq.zzb(singleton);
        return singleton;
    }
}
