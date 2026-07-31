package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzegx implements zzhcv {
    final /* synthetic */ Context zza;

    zzegx(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        if (((Boolean) zzbkz.zzh.zze()).booleanValue() && (th instanceof com.google.android.gms.ads.internal.util.zzaz)) {
            zzbir.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbkz.zzj.zze()).booleanValue()) {
            zzbir.zze(this.zza);
        }
    }
}
