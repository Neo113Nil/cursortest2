package io.intercom.android.sdk;

import com.intercom.twig.Twig;
import io.ably.lib.realtime.AblyRealtime;
import io.ably.lib.realtime.Channel;
import io.ably.lib.realtime.Connection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AblyManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.AblyManager$disconnect$1", f = "AblyManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class AblyManager$disconnect$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AblyManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AblyManager$disconnect$1(AblyManager ablyManager, Continuation<? super AblyManager$disconnect$1> continuation) {
        super(2, continuation);
        this.this$0 = ablyManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AblyManager$disconnect$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AblyManager$disconnect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Twig twig;
        Channel channel;
        AblyRealtime ablyRealtime;
        Twig twig2;
        Connection connection;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                channel = this.this$0.currentChannel;
                if (channel != null) {
                    channel.unsubscribe();
                }
                ablyRealtime = this.this$0.ablyRealtime;
                if (ablyRealtime != null && (connection = ablyRealtime.connection) != null) {
                    connection.close();
                }
                this.this$0.ablyRealtime = null;
                this.this$0.currentChannel = null;
                this.this$0.messageListener = null;
                this.this$0.connectionListener = null;
                this.this$0._sharedEventFlow = null;
                twig2 = this.this$0.twig;
                twig2.d("AblyManager: Disconnected from Ably", new Object[0]);
            } catch (Exception e) {
                twig = this.this$0.twig;
                twig.e("AblyManager: Disconnect error: " + e.getMessage(), new Object[0]);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
