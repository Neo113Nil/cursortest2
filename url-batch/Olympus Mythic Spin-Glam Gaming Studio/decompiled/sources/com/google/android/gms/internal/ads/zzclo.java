package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzclo implements zzhcv {
    final /* synthetic */ List zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Uri zzc;
    final /* synthetic */ zzclx zzd;

    zzclo(zzclx zzclxVar, List list, String str, Uri uri) {
        this.zza = list;
        this.zzb = str;
        this.zzc = uri;
        Objects.requireNonNull(zzclxVar);
        this.zzd = zzclxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        String valueOf = String.valueOf(this.zzc);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to parse gmsg params for: ".concat(valueOf));
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list = this.zza;
        String str = this.zzb;
        this.zzd.zzaa((Map) obj, list, str);
    }
}
