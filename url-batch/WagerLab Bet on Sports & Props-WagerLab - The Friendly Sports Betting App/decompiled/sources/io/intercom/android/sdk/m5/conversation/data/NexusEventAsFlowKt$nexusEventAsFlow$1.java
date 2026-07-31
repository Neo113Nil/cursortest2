package io.intercom.android.sdk.m5.conversation.data;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.nexus.NexusListener;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: NexusEventAsFlow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt$nexusEventAsFlow$1", f = "NexusEventAsFlow.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class NexusEventAsFlowKt$nexusEventAsFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super ParsedNexusEvent>, Continuation<? super Unit>, Object> {
    final /* synthetic */ NexusClient $nexusClient;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NexusEventAsFlowKt$nexusEventAsFlow$1(NexusClient nexusClient, Continuation<? super NexusEventAsFlowKt$nexusEventAsFlow$1> continuation) {
        super(2, continuation);
        this.$nexusClient = nexusClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NexusEventAsFlowKt$nexusEventAsFlow$1 nexusEventAsFlowKt$nexusEventAsFlow$1 = new NexusEventAsFlowKt$nexusEventAsFlow$1(this.$nexusClient, continuation);
        nexusEventAsFlowKt$nexusEventAsFlow$1.L$0 = obj;
        return nexusEventAsFlowKt$nexusEventAsFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super ParsedNexusEvent> producerScope, Continuation<? super Unit> continuation) {
        return ((NexusEventAsFlowKt$nexusEventAsFlow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt$nexusEventAsFlow$1$listener$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final ?? r1 = new NexusListener() { // from class: io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt$nexusEventAsFlow$1$listener$1
                @Override // io.intercom.android.nexus.NexusListener
                public void notifyEvent(NexusEvent nexusEvent) {
                    ParsedNexusEvent asNexusData;
                    Intrinsics.checkNotNullParameter(nexusEvent, "nexusEvent");
                    Log.d("nexus", "notifyEvent " + nexusEvent.getEventType() + ": " + nexusEvent.getEventData());
                    ProducerScope<ParsedNexusEvent> producerScope2 = producerScope;
                    asNexusData = NexusEventAsFlowKt.asNexusData(nexusEvent);
                    producerScope2.mo8997trySendJP2dKIU(asNexusData);
                }

                @Override // io.intercom.android.nexus.NexusListener
                public void onConnect() {
                    Log.d("nexus", "onConnect");
                    producerScope.mo8997trySendJP2dKIU(ParsedNexusEvent.NexusConnected.INSTANCE);
                }

                @Override // io.intercom.android.nexus.NexusListener
                public void onConnectFailed() {
                    Log.d("nexus", "onConnectFailed");
                }

                @Override // io.intercom.android.nexus.NexusListener
                public void onShutdown() {
                    Log.d("nexus", "onShutdown");
                    SendChannel.DefaultImpls.close$default(producerScope.getChannel(), null, 1, null);
                }
            };
            this.$nexusClient.addEventListener((NexusListener) r1);
            final NexusClient nexusClient = this.$nexusClient;
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt$nexusEventAsFlow$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = NexusEventAsFlowKt$nexusEventAsFlow$1.invokeSuspend$lambda$0(NexusClient.this, r1);
                    return invokeSuspend$lambda$0;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(NexusClient nexusClient, NexusEventAsFlowKt$nexusEventAsFlow$1$listener$1 nexusEventAsFlowKt$nexusEventAsFlow$1$listener$1) {
        nexusClient.removeEventListener(nexusEventAsFlowKt$nexusEventAsFlow$1$listener$1);
        return Unit.INSTANCE;
    }
}
