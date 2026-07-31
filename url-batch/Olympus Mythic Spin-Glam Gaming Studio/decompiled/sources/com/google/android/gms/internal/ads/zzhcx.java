package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzhcx {
    private final boolean zza;
    private final zzgxm zzb;

    /* synthetic */ zzhcx(boolean z, zzgxm zzgxmVar, byte[] bArr) {
        this.zza = z;
        this.zzb = zzgxmVar;
    }

    public final ListenableFuture zza(Callable callable, Executor executor) {
        return new zzhcm(this.zzb, this.zza, executor, callable);
    }
}
