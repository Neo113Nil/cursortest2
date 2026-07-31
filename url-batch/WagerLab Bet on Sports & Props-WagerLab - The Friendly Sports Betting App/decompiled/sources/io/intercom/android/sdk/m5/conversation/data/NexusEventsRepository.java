package io.intercom.android.sdk.m5.conversation.data;

import io.intercom.android.nexus.NexusClient;
import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: NexusEventsRepository.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/NexusEventsRepository;", "", "nexusClient", "Lio/intercom/android/nexus/NexusClient;", "userIdentity", "Lio/intercom/android/sdk/identity/UserIdentity;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lio/intercom/android/nexus/NexusClient;Lio/intercom/android/sdk/identity/UserIdentity;Lkotlinx/coroutines/CoroutineScope;)V", "typingEventsFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lio/intercom/android/nexus/NexusEvent;", "markAsSeen", "", "conversationId", "", "userTyping", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NexusEventsRepository {
    public static final int $stable = 8;
    private final NexusClient nexusClient;
    private final CoroutineScope scope;
    private final MutableSharedFlow<NexusEvent> typingEventsFlow;
    private final UserIdentity userIdentity;

    public NexusEventsRepository(NexusClient nexusClient, UserIdentity userIdentity, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(nexusClient, "nexusClient");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.nexusClient = nexusClient;
        this.userIdentity = userIdentity;
        this.scope = scope;
        this.typingEventsFlow = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new AnonymousClass1(null), 3, null);
    }

    public /* synthetic */ NexusEventsRepository(NexusClient nexusClient, UserIdentity userIdentity, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Injector.get().getNexusClient() : nexusClient, (i & 2) != 0 ? Injector.get().getUserIdentity() : userIdentity, coroutineScope);
    }

    /* compiled from: NexusEventsRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository$1", f = "NexusEventsRepository.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NexusEventsRepository.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow sample = FlowKt.sample(NexusEventsRepository.this.typingEventsFlow, 200L);
                final NexusEventsRepository nexusEventsRepository = NexusEventsRepository.this;
                this.label = 1;
                if (sample.collect(new FlowCollector() { // from class: io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((NexusEvent) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(NexusEvent nexusEvent, Continuation<? super Unit> continuation) {
                        NexusEventsRepository.this.nexusClient.fire(nexusEvent);
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
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

    public final void markAsSeen(String conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        this.nexusClient.fire(NexusEvent.getConversationSeenEvent(conversationId, this.userIdentity.getIntercomId()));
    }

    public final void userTyping(String conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new NexusEventsRepository$userTyping$1(this, conversationId, null), 3, null);
    }
}
