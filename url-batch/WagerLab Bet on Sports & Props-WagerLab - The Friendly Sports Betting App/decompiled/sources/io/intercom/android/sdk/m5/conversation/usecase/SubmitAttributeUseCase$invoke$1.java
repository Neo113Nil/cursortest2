package io.intercom.android.sdk.m5.conversation.usecase;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SubmitAttributeUseCase.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.usecase.SubmitAttributeUseCase", f = "SubmitAttributeUseCase.kt", i = {0, 0}, l = {27}, m = "invoke", n = {"clientStateFlow", "attribute"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class SubmitAttributeUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubmitAttributeUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubmitAttributeUseCase$invoke$1(SubmitAttributeUseCase submitAttributeUseCase, Continuation<? super SubmitAttributeUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = submitAttributeUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, this);
    }
}
