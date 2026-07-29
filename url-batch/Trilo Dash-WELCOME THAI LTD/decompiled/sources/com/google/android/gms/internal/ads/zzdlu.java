package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzdlu implements zzgpu {
    private final zzgqh zza;

    public zzdlu(zzgqh zzgqhVar) {
        this.zza = zzgqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = ((zzdlr) this.zza).zza().zze() != null ? Collections.singleton("banner") : Collections.emptySet();
        zzgqc.zzb(singleton);
        return singleton;
    }
}
