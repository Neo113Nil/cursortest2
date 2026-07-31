package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzcgt implements zzhcv {
    final /* synthetic */ zzcgv zza;

    zzcgt(zzcgv zzcgvVar) {
        Objects.requireNonNull(zzcgvVar);
        this.zza = zzcgvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        this.zza.zzj().set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zzb(@Nullable Object obj) {
        this.zza.zzj().set(1);
    }
}
