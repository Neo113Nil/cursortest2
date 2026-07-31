package io.intercom.android.sdk;

import com.intercom.twig.Twig;
import io.ably.lib.realtime.AblyRealtime;
import io.ably.lib.realtime.Channel;
import io.ably.lib.realtime.ConnectionStateListener;
import io.ably.lib.types.Message;
import io.intercom.android.sdk.m5.conversation.data.ParsedAblyEvent;
import io.intercom.android.sdk.m5.conversation.data.ParsedAblyEventKt;
import io.intercom.android.sdk.metrics.MetricTracker;
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

/* compiled from: AblyManager.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.AblyManager$createAblyEventFlow$1", f = "AblyManager.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class AblyManager$createAblyEventFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super ParsedAblyEvent>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AblyManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AblyManager$createAblyEventFlow$1(AblyManager ablyManager, Continuation<? super AblyManager$createAblyEventFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = ablyManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AblyManager$createAblyEventFlow$1 ablyManager$createAblyEventFlow$1 = new AblyManager$createAblyEventFlow$1(this.this$0, continuation);
        ablyManager$createAblyEventFlow$1.L$0 = obj;
        return ablyManager$createAblyEventFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super ParsedAblyEvent> producerScope, Continuation<? super Unit> continuation) {
        return ((AblyManager$createAblyEventFlow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AblyRealtime ablyRealtime;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final AblyManager ablyManager = this.this$0;
            Channel.MessageListener messageListener = new Channel.MessageListener() { // from class: io.intercom.android.sdk.AblyManager$createAblyEventFlow$1$$ExternalSyntheticLambda0
                @Override // io.ably.lib.realtime.ChannelBase.MessageListener
                public final void onMessage(Message message) {
                    AblyManager$createAblyEventFlow$1.invokeSuspend$lambda$0(AblyManager.this, producerScope, message);
                }
            };
            final AblyManager ablyManager2 = this.this$0;
            ConnectionStateListener connectionStateListener = new ConnectionStateListener() { // from class: io.intercom.android.sdk.AblyManager$createAblyEventFlow$1$$ExternalSyntheticLambda1
                @Override // io.ably.lib.realtime.ConnectionStateListener
                public final void onConnectionStateChanged(ConnectionStateListener.ConnectionStateChange connectionStateChange) {
                    AblyManager$createAblyEventFlow$1.invokeSuspend$lambda$1(ProducerScope.this, ablyManager2, connectionStateChange);
                }
            };
            this.this$0.messageListener = messageListener;
            this.this$0.connectionListener = connectionStateListener;
            ablyRealtime = this.this$0.ablyRealtime;
            if (ablyRealtime == null) {
                this.this$0.connect();
            }
            final AblyManager ablyManager3 = this.this$0;
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, new Function0() { // from class: io.intercom.android.sdk.AblyManager$createAblyEventFlow$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokeSuspend$lambda$2;
                    invokeSuspend$lambda$2 = AblyManager$createAblyEventFlow$1.invokeSuspend$lambda$2(AblyManager.this);
                    return invokeSuspend$lambda$2;
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
    public static final void invokeSuspend$lambda$0(AblyManager ablyManager, ProducerScope producerScope, Message message) {
        Twig twig;
        Twig twig2;
        twig = ablyManager.twig;
        twig.d("AblyManager: Received message: " + message.name, new Object[0]);
        Intrinsics.checkNotNull(message);
        ParsedAblyEvent asAblyData = ParsedAblyEventKt.asAblyData(message);
        twig2 = ablyManager.twig;
        twig2.d("AblyManager: Parsed event: " + asAblyData, new Object[0]);
        producerScope.mo8997trySendJP2dKIU(asAblyData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(ProducerScope producerScope, AblyManager ablyManager, ConnectionStateListener.ConnectionStateChange connectionStateChange) {
        Twig twig;
        Twig twig2;
        String name = connectionStateChange.current.name();
        int hashCode = name.hashCode();
        if (hashCode == -1357520532) {
            if (name.equals("closed")) {
                producerScope.mo8997trySendJP2dKIU(ParsedAblyEvent.AblyClosed.INSTANCE);
                twig = ablyManager.twig;
                twig.d("AblyManager: Connection closed", new Object[0]);
                return;
            }
            return;
        }
        if (hashCode != -1281977283) {
            if (hashCode == -579210487 && name.equals("connected")) {
                producerScope.mo8997trySendJP2dKIU(ParsedAblyEvent.AblyConnected.INSTANCE);
                return;
            }
            return;
        }
        if (name.equals(MetricTracker.Action.FAILED)) {
            producerScope.mo8997trySendJP2dKIU(ParsedAblyEvent.AblyFailed.INSTANCE);
            twig2 = ablyManager.twig;
            twig2.e("AblyManager: Connection failed", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(AblyManager ablyManager) {
        ablyManager.removeListeners();
        return Unit.INSTANCE;
    }
}
