package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzftt implements zzbga {
    final /* synthetic */ zzftu zza;

    zzftt(zzftu zzftuVar) {
        Objects.requireNonNull(zzftuVar);
        this.zza = zzftuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zza(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzD)).booleanValue()) {
            this.zza.zzl(z);
        }
    }
}
