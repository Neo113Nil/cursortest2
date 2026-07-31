package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public abstract class zzhbu extends AbstractExecutorService implements zzhdi {
    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzhdx.zze(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzhdi
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (ListenableFuture) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzhdi
    /* renamed from: zza */
    public final ListenableFuture submit(Runnable runnable) {
        return (ListenableFuture) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzhdi
    /* renamed from: zzb */
    public final ListenableFuture submit(Runnable runnable, Object obj) {
        return (ListenableFuture) super.submit(runnable, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhdi
    /* renamed from: zzc */
    public final ListenableFuture submit(Callable callable) {
        return (ListenableFuture) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return new zzhdx(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzhdi
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (ListenableFuture) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzhdi
    public final /* synthetic */ Future submit(Callable callable) {
        return (ListenableFuture) super.submit(callable);
    }
}
