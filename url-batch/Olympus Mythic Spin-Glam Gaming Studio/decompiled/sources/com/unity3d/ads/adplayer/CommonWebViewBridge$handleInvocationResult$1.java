package com.unity3d.ads.adplayer;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonWebViewBridge.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.CommonWebViewBridge", f = "CommonWebViewBridge.kt", l = {150, 158, 160, 164, 166, 181, 186}, m = "handleInvocationResult")
/* loaded from: classes11.dex */
final class CommonWebViewBridge$handleInvocationResult$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonWebViewBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonWebViewBridge$handleInvocationResult$1(CommonWebViewBridge commonWebViewBridge, Continuation continuation) {
        super(continuation);
        this.this$0 = commonWebViewBridge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object handleInvocationResult;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleInvocationResult = this.this$0.handleInvocationResult(null, null, this);
        return handleInvocationResult;
    }
}
