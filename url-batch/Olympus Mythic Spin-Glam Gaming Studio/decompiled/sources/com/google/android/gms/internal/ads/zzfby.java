package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfby implements zzfdi {

    @Nullable
    private final Bundle zza;

    zzfby(@Nullable Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return zzhcy.zza(new zzfbz(this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 30;
    }
}
