package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdne implements zzgxi {
    private final zzgxv zza;

    public zzdne(zzgxv zzgxvVar) {
        this.zza = zzgxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = ((zzdnb) this.zza).zza().zze() != null ? Collections.singleton("banner") : Collections.emptySet();
        zzgxq.zzb(singleton);
        return singleton;
    }
}
