package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SendPrivacyUpdateRequest.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.SendPrivacyUpdateRequest", f = "SendPrivacyUpdateRequest.kt", l = {21, 23}, m = "invoke")
/* loaded from: classes8.dex */
final class SendPrivacyUpdateRequest$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendPrivacyUpdateRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendPrivacyUpdateRequest$invoke$1(SendPrivacyUpdateRequest sendPrivacyUpdateRequest, Continuation continuation) {
        super(continuation);
        this.this$0 = sendPrivacyUpdateRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(0, null, this);
    }
}
