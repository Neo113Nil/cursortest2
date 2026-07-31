package io.intercom.android.sdk.m5.conversation.data;

import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.sdk.identity.UserIdentity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* compiled from: NexusEventsRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository$userTyping$1", f = "NexusEventsRepository.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class NexusEventsRepository$userTyping$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $conversationId;
    int label;
    final /* synthetic */ NexusEventsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NexusEventsRepository$userTyping$1(NexusEventsRepository nexusEventsRepository, String str, Continuation<? super NexusEventsRepository$userTyping$1> continuation) {
        super(2, continuation);
        this.this$0 = nexusEventsRepository;
        this.$conversationId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NexusEventsRepository$userTyping$1(this.this$0, this.$conversationId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NexusEventsRepository$userTyping$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UserIdentity userIdentity;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow mutableSharedFlow = this.this$0.typingEventsFlow;
            String str = this.$conversationId;
            userIdentity = this.this$0.userIdentity;
            NexusEvent userIsTypingEvent = NexusEvent.getUserIsTypingEvent(str, userIdentity.getIntercomId());
            Intrinsics.checkNotNullExpressionValue(userIsTypingEvent, "getUserIsTypingEvent(...)");
            this.label = 1;
            if (mutableSharedFlow.emit(userIsTypingEvent, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
