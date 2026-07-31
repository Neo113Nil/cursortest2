package io.intercom.android.sdk.m5.conversation.ui;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableState;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: ConversationScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$8", f = "ConversationScreen.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class ConversationScreenKt$ConversationScreen$8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ConversationViewModel $conversationViewModel;
    final /* synthetic */ MutableState<Pair<Boolean, String>> $showUploadSizeLimitDialog$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationScreenKt$ConversationScreen$8(ConversationViewModel conversationViewModel, Context context, MutableState<Pair<Boolean, String>> mutableState, Continuation<? super ConversationScreenKt$ConversationScreen$8> continuation) {
        super(2, continuation);
        this.$conversationViewModel = conversationViewModel;
        this.$context = context;
        this.$showUploadSizeLimitDialog$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationScreenKt$ConversationScreen$8(this.$conversationViewModel, this.$context, this.$showUploadSizeLimitDialog$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationScreenKt$ConversationScreen$8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow<ConversationUiEffect> uiEffect = this.$conversationViewModel.getUiEffect();
            final Context context = this.$context;
            final MutableState<Pair<Boolean, String>> mutableState = this.$showUploadSizeLimitDialog$delegate;
            this.label = 1;
            if (uiEffect.collect(new FlowCollector() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$8.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((ConversationUiEffect) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(ConversationUiEffect conversationUiEffect, Continuation<? super Unit> continuation) {
                    ComponentActivity componentActivity;
                    if (!(conversationUiEffect instanceof ConversationUiEffect.ShowUploadSizeLimitDialog)) {
                        if (conversationUiEffect instanceof ConversationUiEffect.LockScreenOrientation) {
                            Context context2 = context;
                            componentActivity = context2 instanceof ComponentActivity ? (ComponentActivity) context2 : null;
                            if (componentActivity != null) {
                                componentActivity.setRequestedOrientation(14);
                            }
                        } else {
                            if (!(conversationUiEffect instanceof ConversationUiEffect.UnlockScreenOrientation)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Context context3 = context;
                            componentActivity = context3 instanceof ComponentActivity ? (ComponentActivity) context3 : null;
                            if (componentActivity != null) {
                                componentActivity.setRequestedOrientation(-1);
                            }
                        }
                    } else {
                        mutableState.setValue(TuplesKt.to(Boxing.boxBoolean(true), ((ConversationUiEffect.ShowUploadSizeLimitDialog) conversationUiEffect).getUploadSizeLimitMB()));
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
