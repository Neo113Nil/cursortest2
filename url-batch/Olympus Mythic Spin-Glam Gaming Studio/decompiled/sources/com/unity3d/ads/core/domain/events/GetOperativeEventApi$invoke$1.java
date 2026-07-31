package com.unity3d.ads.core.domain.events;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GetOperativeEventApi.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.events.GetOperativeEventApi", f = "GetOperativeEventApi.kt", l = {21}, m = "invoke")
/* loaded from: classes9.dex */
final class GetOperativeEventApi$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetOperativeEventApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetOperativeEventApi$invoke$1(GetOperativeEventApi getOperativeEventApi, Continuation continuation) {
        super(continuation);
        this.this$0 = getOperativeEventApi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, null, null, null, this);
    }
}
