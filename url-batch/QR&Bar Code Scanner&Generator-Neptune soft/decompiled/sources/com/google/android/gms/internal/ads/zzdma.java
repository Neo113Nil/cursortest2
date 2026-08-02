package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdma implements zzgxi {
    private final zzdlk zza;
    private final zzgxv zzb;

    public zzdma(zzdlk zzdlkVar, zzgxv zzgxvVar) {
        this.zza = zzdlkVar;
        this.zzb = zzgxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzd((Executor) this.zzb.zzb());
    }
}
