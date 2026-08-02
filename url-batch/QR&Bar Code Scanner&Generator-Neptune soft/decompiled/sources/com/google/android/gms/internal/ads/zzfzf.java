package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfzf {
    private final boolean zza;
    private final zzfvn zzb;

    /* synthetic */ zzfzf(boolean z, zzfvn zzfvnVar, zzfzd zzfzdVar) {
        this.zza = z;
        this.zzb = zzfvnVar;
    }

    public final zzfzp zza(Callable callable, Executor executor) {
        return new zzfyt(this.zzb, this.zza, executor, callable);
    }
}
