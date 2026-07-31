package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ConversationScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$36$4$1$4$2", f = "ConversationScreen.kt", i = {}, l = {818, 823}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class ConversationScreenKt$ConversationScreenContent$36$4$1$4$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Density $density;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ BoxWithConstraintsScope $this_BoxWithConstraints;
    final /* synthetic */ ConversationUiState $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationScreenKt$ConversationScreenContent$36$4$1$4$2(ConversationUiState conversationUiState, ScrollState scrollState, BoxWithConstraintsScope boxWithConstraintsScope, Density density, Continuation<? super ConversationScreenKt$ConversationScreenContent$36$4$1$4$2> continuation) {
        super(2, continuation);
        this.$uiState = conversationUiState;
        this.$scrollState = scrollState;
        this.$this_BoxWithConstraints = boxWithConstraintsScope;
        this.$density = density;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationScreenKt$ConversationScreenContent$36$4$1$4$2(this.$uiState, this.$scrollState, this.$this_BoxWithConstraints, this.$density, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationScreenKt$ConversationScreenContent$36$4$1$4$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r8 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r8 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int scrollToPosition = ((FloatingIndicatorState.JumpToBottomIndicator) ((ConversationUiState.Content) this.$uiState).getFloatingIndicatorState()).getJumpToBottomButtonState().getScrollToPosition();
            ScrollState scrollState = this.$scrollState;
            BoxWithConstraintsScope boxWithConstraintsScope = this.$this_BoxWithConstraints;
            Density density = this.$density;
            if (scrollToPosition == -1) {
                int maxValue = scrollState.getMaxValue();
                this.label = 1;
                obj = scrollState.scrollTo(maxValue, this);
            } else {
                float m8401constructorimpl = Dp.m8401constructorimpl(boxWithConstraintsScope.mo724getMaxHeightD9Ej5fM() - MessageComposerKt.getComposerHalfSize());
                f = ConversationScreenKt.JumpToBottomNewMessagesTopOffset;
                int mo418roundToPx0680j_4 = scrollToPosition + density.mo418roundToPx0680j_4(Dp.m8401constructorimpl(m8401constructorimpl - f));
                this.label = 2;
                obj = scrollState.scrollTo(mo418roundToPx0680j_4, this);
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
            ((Number) obj).floatValue();
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((Number) obj).floatValue();
        }
        return Unit.INSTANCE;
    }
}
