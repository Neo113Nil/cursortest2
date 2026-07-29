package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfvl implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzftr zzb;

    zzfvl(Executor executor, zzftr zzftrVar) {
        this.zza = executor;
        this.zzb = zzftrVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.zzb.zze(e);
        }
    }
}
