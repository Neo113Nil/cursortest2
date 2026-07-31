package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzbhk implements zzbga {
    final /* synthetic */ zzbhn zza;

    zzbhk(zzbhn zzbhnVar) {
        Objects.requireNonNull(zzbhnVar);
        this.zza = zzbhnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zza(boolean z) {
        if (z) {
            this.zza.zzf();
        } else {
            this.zza.zzg();
        }
    }
}
