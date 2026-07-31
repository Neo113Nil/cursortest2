package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfkm implements zzazc {
    final /* synthetic */ zzfko zza;

    zzfkm(zzfko zzfkoVar) {
        Objects.requireNonNull(zzfkoVar);
        this.zza = zzfkoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zza(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzx)).booleanValue()) {
            this.zza.zzj(z);
        }
    }
}
