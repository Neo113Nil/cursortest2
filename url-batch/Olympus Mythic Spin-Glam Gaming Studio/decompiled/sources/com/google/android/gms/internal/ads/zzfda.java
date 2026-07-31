package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfda implements zzfdi {
    private final boolean zza;

    zzfda(@Nullable zzfiy zzfiyVar) {
        this.zza = zzfiyVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return zzhcy.zza(new zzfcz(this.zza, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 36;
    }
}
