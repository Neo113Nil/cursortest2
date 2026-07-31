package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public class zzhct extends zzhcu {
    private final ListenableFuture zza;

    protected zzhct(ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzhcu, com.google.android.gms.internal.ads.zzhcs
    protected final /* synthetic */ Future zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhcs, com.google.android.gms.internal.ads.zzgxd
    protected final /* synthetic */ Object zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhcu
    protected final ListenableFuture zzc() {
        return this.zza;
    }
}
