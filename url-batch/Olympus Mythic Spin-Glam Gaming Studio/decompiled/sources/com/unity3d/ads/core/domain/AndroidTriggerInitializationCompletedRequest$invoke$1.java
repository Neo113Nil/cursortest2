package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidTriggerInitializationCompletedRequest.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest", f = "AndroidTriggerInitializationCompletedRequest.kt", l = {30, 32}, m = "invoke")
/* loaded from: classes9.dex */
final class AndroidTriggerInitializationCompletedRequest$invoke$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidTriggerInitializationCompletedRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidTriggerInitializationCompletedRequest$invoke$1(AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest, Continuation continuation) {
        super(continuation);
        this.this$0 = androidTriggerInitializationCompletedRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
