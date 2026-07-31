package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzddd implements zzinw {
    private final zzdcz zza;

    private zzddd(zzdcz zzdczVar) {
        this.zza = zzdczVar;
    }

    public static zzddd zzc(zzdcz zzdczVar) {
        return new zzddd(zzdczVar);
    }

    @Nullable
    public final zzdcs zza() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zze();
    }
}
