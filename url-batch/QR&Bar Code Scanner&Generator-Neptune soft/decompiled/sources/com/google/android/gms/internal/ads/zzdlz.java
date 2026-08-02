package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdlz implements zzgxi {
    private final zzgxv zza;

    public zzdlz(zzgxv zzgxvVar) {
        this.zza = zzgxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdkg((zzdms) this.zza.zzb(), zzchc.zzf));
        zzgxq.zzb(singleton);
        return singleton;
    }
}
