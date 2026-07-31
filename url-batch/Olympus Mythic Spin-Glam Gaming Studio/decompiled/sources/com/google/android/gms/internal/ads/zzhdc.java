package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzhdc implements ListenableFuture {
    static final ListenableFuture zza = new zzhdc(null);
    private static final zzhdg zzb = new zzhdg(zzhdc.class);
    private final Object zzc;

    zzhdc(Object obj) {
        this.zzc = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        zzguk.zzk(runnable, "Runnable was null.");
        zzguk.zzk(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger zza2 = zzb.zza();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            zza2.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb.toString(), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.zzc;
        String obj2 = super.toString();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(obj2).length() + 25 + valueOf.length() + 2);
        sb.append(obj2);
        sb.append("[status=SUCCESS, result=[");
        sb.append(valueOf);
        sb.append("]]");
        return sb.toString();
    }
}
