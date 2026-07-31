package com.composables.core;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.node.DrawModifierNodeKt;
import com.composables.core.FocusRingIndicationNodeFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: FocusRingIndication.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.composables.core.FocusRingIndicationNodeFactory$FocusRingIndicationInstance$onAttach$1", f = "FocusRingIndication.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class FocusRingIndicationNodeFactory$FocusRingIndicationInstance$onAttach$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FocusRingIndicationNodeFactory.FocusRingIndicationInstance this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FocusRingIndicationNodeFactory$FocusRingIndicationInstance$onAttach$1(FocusRingIndicationNodeFactory.FocusRingIndicationInstance focusRingIndicationInstance, Continuation<? super FocusRingIndicationNodeFactory$FocusRingIndicationInstance$onAttach$1> continuation) {
        super(2, continuation);
        this.this$0 = focusRingIndicationInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FocusRingIndicationNodeFactory$FocusRingIndicationInstance$onAttach$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FocusRingIndicationNodeFactory$FocusRingIndicationInstance$onAttach$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InteractionSource interactionSource;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            interactionSource = this.this$0.interactionSource;
            Flow<Interaction> interactions = interactionSource.getInteractions();
            final FocusRingIndicationNodeFactory.FocusRingIndicationInstance focusRingIndicationInstance = this.this$0;
            this.label = 1;
            if (interactions.collect(new FlowCollector() { // from class: com.composables.core.FocusRingIndicationNodeFactory$FocusRingIndicationInstance$onAttach$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Interaction) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Interaction interaction, Continuation<? super Unit> continuation) {
                    boolean z;
                    boolean z2;
                    if (interaction instanceof FocusInteraction.Focus) {
                        z2 = FocusRingIndicationNodeFactory.FocusRingIndicationInstance.this.isFocused;
                        if (!z2) {
                            FocusRingIndicationNodeFactory.FocusRingIndicationInstance.this.isFocused = true;
                            DrawModifierNodeKt.invalidateDraw(FocusRingIndicationNodeFactory.FocusRingIndicationInstance.this);
                        }
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        z = FocusRingIndicationNodeFactory.FocusRingIndicationInstance.this.isFocused;
                        if (z) {
                            FocusRingIndicationNodeFactory.FocusRingIndicationInstance.this.isFocused = false;
                            DrawModifierNodeKt.invalidateDraw(FocusRingIndicationNodeFactory.FocusRingIndicationInstance.this);
                        }
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
        return Unit.INSTANCE;
    }
}
