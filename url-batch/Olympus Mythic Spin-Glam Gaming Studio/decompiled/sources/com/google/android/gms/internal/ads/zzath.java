package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
final class zzath implements Executor {
    final /* synthetic */ Handler zza;

    zzath(zzatj zzatjVar, Handler handler) {
        this.zza = handler;
        Objects.requireNonNull(zzatjVar);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
