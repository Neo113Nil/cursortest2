package io.intercom.android.sdk.m5.conversation;

import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ConversationViewModel.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$6$1", f = "ConversationViewModel.kt", i = {0, 0}, l = {336}, m = "emit", n = {"this", "newNetworkState"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class ConversationViewModel$6$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConversationViewModel.AnonymousClass6.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ConversationViewModel$6$1$emit$1(ConversationViewModel.AnonymousClass6.AnonymousClass1<? super T> anonymousClass1, Continuation<? super ConversationViewModel$6$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((NetworkState) null, (Continuation<? super Unit>) this);
    }
}
