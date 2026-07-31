package com.unity3d.ads.core.domain.events;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GetOperativeEventRequest.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.events.GetOperativeEventRequest", f = "GetOperativeEventRequest.kt", l = {37}, m = "invoke")
/* loaded from: classes5.dex */
final class GetOperativeEventRequest$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetOperativeEventRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetOperativeEventRequest$invoke$1(GetOperativeEventRequest getOperativeEventRequest, Continuation continuation) {
        super(continuation);
        this.this$0 = getOperativeEventRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, null, null, null, this);
    }
}
