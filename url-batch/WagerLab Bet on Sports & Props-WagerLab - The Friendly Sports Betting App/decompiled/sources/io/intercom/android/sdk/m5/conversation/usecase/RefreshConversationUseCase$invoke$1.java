package io.intercom.android.sdk.m5.conversation.usecase;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RefreshConversationUseCase.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase", f = "RefreshConversationUseCase.kt", i = {0, 0, 1, 1}, l = {34, 85}, m = "invoke", n = {"this", "clientStateFlow", "this", "conversation"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes8.dex */
final class RefreshConversationUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RefreshConversationUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RefreshConversationUseCase$invoke$1(RefreshConversationUseCase refreshConversationUseCase, Continuation<? super RefreshConversationUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = refreshConversationUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, this);
    }
}
