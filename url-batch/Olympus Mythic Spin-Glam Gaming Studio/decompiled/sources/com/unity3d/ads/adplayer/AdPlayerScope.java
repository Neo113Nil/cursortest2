package com.unity3d.ads.adplayer;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdPlayerScope.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/adplayer/AdPlayerScope;", "Lkotlinx/coroutines/CoroutineScope;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "sdkErrorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineExceptionHandler;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdPlayerScope implements CoroutineScope {
    private final /* synthetic */ CoroutineScope $$delegate_0;

    @NotNull
    private final CoroutineDispatcher defaultDispatcher;

    @NotNull
    private final CoroutineExceptionHandler sdkErrorHandler;

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public AdPlayerScope(@NotNull CoroutineDispatcher defaultDispatcher, @NotNull CoroutineExceptionHandler sdkErrorHandler) {
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(sdkErrorHandler, "sdkErrorHandler");
        this.$$delegate_0 = CoroutineScopeKt.CoroutineScope(defaultDispatcher.plus(sdkErrorHandler));
        this.defaultDispatcher = defaultDispatcher;
        this.sdkErrorHandler = sdkErrorHandler;
    }
}
