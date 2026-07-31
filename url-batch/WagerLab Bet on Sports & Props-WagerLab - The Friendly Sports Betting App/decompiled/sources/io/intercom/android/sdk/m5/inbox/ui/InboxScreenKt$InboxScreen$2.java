package io.intercom.android.sdk.m5.inbox.ui;

import androidx.media3.container.MdtaMetadataEntry;
import androidx.paging.compose.LazyPagingItems;
import io.intercom.android.sdk.m5.inbox.InboxViewModel;
import io.intercom.android.sdk.m5.inbox.states.InboxUiEffects;
import io.intercom.android.sdk.models.Conversation;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: InboxScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$2", f = "InboxScreen.kt", i = {}, l = {MdtaMetadataEntry.TYPE_INDICATOR_UNSIGNED_INT64}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class InboxScreenKt$InboxScreen$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyPagingItems<Conversation> $lazyPagingItems;
    final /* synthetic */ Function1<InboxUiEffects.NavigateToConversation, Unit> $onConversationClicked;
    final /* synthetic */ InboxViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InboxScreenKt$InboxScreen$2(InboxViewModel inboxViewModel, Function1<? super InboxUiEffects.NavigateToConversation, Unit> function1, LazyPagingItems<Conversation> lazyPagingItems, Continuation<? super InboxScreenKt$InboxScreen$2> continuation) {
        super(2, continuation);
        this.$viewModel = inboxViewModel;
        this.$onConversationClicked = function1;
        this.$lazyPagingItems = lazyPagingItems;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InboxScreenKt$InboxScreen$2(this.$viewModel, this.$onConversationClicked, this.$lazyPagingItems, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InboxScreenKt$InboxScreen$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow<InboxUiEffects> effect = this.$viewModel.getEffect();
            final Function1<InboxUiEffects.NavigateToConversation, Unit> function1 = this.$onConversationClicked;
            final LazyPagingItems<Conversation> lazyPagingItems = this.$lazyPagingItems;
            this.label = 1;
            if (effect.collect(new FlowCollector() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((InboxUiEffects) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(InboxUiEffects inboxUiEffects, Continuation<? super Unit> continuation) {
                    if (inboxUiEffects instanceof InboxUiEffects.NavigateToConversation) {
                        function1.invoke(inboxUiEffects);
                    } else {
                        if (!(inboxUiEffects instanceof InboxUiEffects.RefreshInbox)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lazyPagingItems.refresh();
                    }
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
        throw new KotlinNothingValueException();
    }
}
