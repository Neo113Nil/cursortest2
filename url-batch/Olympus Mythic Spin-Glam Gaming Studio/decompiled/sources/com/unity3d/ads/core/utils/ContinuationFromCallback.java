package com.unity3d.ads.core.utils;

import com.unity3d.ads.core.data.model.exception.ExposureException;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContinuationFromCallback.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\n\"\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0002\u0010\u000bJ3\u0010\f\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\n\"\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0002\u0010\u000eR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/utils/ContinuationFromCallback;", "Lcom/unity3d/services/core/webview/bridge/WebViewCallback;", "continuation", "Lkotlin/coroutines/Continuation;", "", "<init>", "(Lkotlin/coroutines/Continuation;)V", "invoke", "", "params", "", "([Ljava/lang/Object;)V", "error", "", "(Ljava/lang/Enum;[Ljava/lang/Object;)V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContinuationFromCallback extends WebViewCallback {

    @NotNull
    private final Continuation continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinuationFromCallback(@NotNull Continuation continuation) {
        super("", 0);
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.continuation = continuation;
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void invoke(@NotNull Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.continuation.resumeWith(Result.m8023constructorimpl(params));
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void error(@Nullable Enum<?> error, @NotNull Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Continuation continuation = this.continuation;
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(new ExposureException("Invocation failed with: " + error, params))));
    }
}
