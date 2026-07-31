package io.intercom.android.sdk.m5.conversation.ui;

import android.content.Context;
import androidx.compose.material3.SnackbarHostState;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ConversationScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$11", f = "ConversationScreen.kt", i = {}, l = {237}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class ConversationScreenKt$ConversationScreen$11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ConversationUiState $conversationUiState;
    final /* synthetic */ ConversationViewModel $conversationViewModel;
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationScreenKt$ConversationScreen$11(ConversationUiState conversationUiState, SnackbarHostState snackbarHostState, Context context, ConversationViewModel conversationViewModel, Continuation<? super ConversationScreenKt$ConversationScreen$11> continuation) {
        super(2, continuation);
        this.$conversationUiState = conversationUiState;
        this.$snackbarHostState = snackbarHostState;
        this.$context = context;
        this.$conversationViewModel = conversationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationScreenKt$ConversationScreen$11(this.$conversationUiState, this.$snackbarHostState, this.$context, this.$conversationViewModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationScreenKt$ConversationScreen$11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object showNetworkMessage;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            NetworkState networkState = ((ConversationUiState.Content) this.$conversationUiState).getNetworkState();
            SnackbarHostState snackbarHostState = this.$snackbarHostState;
            Context context = this.$context;
            final ConversationViewModel conversationViewModel = this.$conversationViewModel;
            this.label = 1;
            showNetworkMessage = ConversationScreenKt.showNetworkMessage(networkState, snackbarHostState, context, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$11$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = ConversationScreenKt$ConversationScreen$11.invokeSuspend$lambda$0(ConversationViewModel.this);
                    return invokeSuspend$lambda$0;
                }
            }, this);
            if (showNetworkMessage == coroutine_suspended) {
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
    public static final Unit invokeSuspend$lambda$0(ConversationViewModel conversationViewModel) {
        conversationViewModel.onNetworkMessageDismissed();
        return Unit.INSTANCE;
    }
}
