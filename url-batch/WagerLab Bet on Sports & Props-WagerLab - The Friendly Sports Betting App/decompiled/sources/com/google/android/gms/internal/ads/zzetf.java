package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzetf implements zzeup {
    private final Bundle zza;

    zzetf(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return zzgot.zza(new zzetg(this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 30;
    }
}
