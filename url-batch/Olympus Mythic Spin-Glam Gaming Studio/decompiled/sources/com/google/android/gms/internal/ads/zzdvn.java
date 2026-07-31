package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzdvn implements zzhcv {
    final /* synthetic */ String zza = "sendMessageToNativeJs";
    final /* synthetic */ Map zzb;

    zzdvn(zzdvv zzdvvVar, String str, Map map) {
        this.zzb = map;
        Objects.requireNonNull(zzdvvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzclm) obj).zze(this.zza, this.zzb);
    }
}
