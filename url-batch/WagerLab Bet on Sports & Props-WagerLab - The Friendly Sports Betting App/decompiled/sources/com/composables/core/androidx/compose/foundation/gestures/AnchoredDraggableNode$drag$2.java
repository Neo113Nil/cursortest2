package com.composables.core.androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import com.composables.core.androidx.compose.foundation.gestures.AnchoredDragScope;
import com.composables.core.androidx.compose.foundation.gestures.DragEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "T", "Lcom/composables/core/androidx/compose/foundation/gestures/AnchoredDragScope;", "it", "Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledDraggableAnchors;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.composables.core.androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", i = {}, l = {255}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class AnchoredDraggableNode$drag$2<T> extends SuspendLambda implements Function3<AnchoredDragScope, UnstyledDraggableAnchors<T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Function1<? super DragEvent.DragDelta, Unit>, Continuation<? super Unit>, Object> $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AnchoredDraggableNode<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnchoredDraggableNode$drag$2(Function2<? super Function1<? super DragEvent.DragDelta, Unit>, ? super Continuation<? super Unit>, ? extends Object> function2, AnchoredDraggableNode<T> anchoredDraggableNode, Continuation<? super AnchoredDraggableNode$drag$2> continuation) {
        super(3, continuation);
        this.$forEachDelta = function2;
        this.this$0 = anchoredDraggableNode;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(AnchoredDragScope anchoredDragScope, UnstyledDraggableAnchors<T> unstyledDraggableAnchors, Continuation<? super Unit> continuation) {
        AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$2 = new AnchoredDraggableNode$drag$2(this.$forEachDelta, this.this$0, continuation);
        anchoredDraggableNode$drag$2.L$0 = anchoredDragScope;
        return anchoredDraggableNode$drag$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            Function2<Function1<? super DragEvent.DragDelta, Unit>, Continuation<? super Unit>, Object> function2 = this.$forEachDelta;
            final AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
            Function1<? super DragEvent.DragDelta, Unit> function1 = new Function1() { // from class: com.composables.core.androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invokeSuspend$lambda$1;
                    invokeSuspend$lambda$1 = AnchoredDraggableNode$drag$2.invokeSuspend$lambda$1(AnchoredDraggableNode.this, anchoredDragScope, (DragEvent.DragDelta) obj2);
                    return invokeSuspend$lambda$1;
                }
            };
            this.label = 1;
            if (function2.invoke(function1, this) == coroutine_suspended) {
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
    public static final Unit invokeSuspend$lambda$1(final AnchoredDraggableNode anchoredDraggableNode, final AnchoredDragScope anchoredDragScope, DragEvent.DragDelta dragDelta) {
        OverscrollEffect overscrollEffect;
        OverscrollEffect overscrollEffect2;
        long m9429reverseIfNeededMKHz9U;
        UnstyledAnchoredDraggableState unstyledAnchoredDraggableState;
        long m9429reverseIfNeededMKHz9U2;
        float m9431toFloatk4lQ0M;
        overscrollEffect = anchoredDraggableNode.overscrollEffect;
        if (overscrollEffect == null) {
            unstyledAnchoredDraggableState = anchoredDraggableNode.state;
            m9429reverseIfNeededMKHz9U2 = anchoredDraggableNode.m9429reverseIfNeededMKHz9U(dragDelta.getDelta());
            m9431toFloatk4lQ0M = anchoredDraggableNode.m9431toFloatk4lQ0M(m9429reverseIfNeededMKHz9U2);
            AnchoredDragScope.DefaultImpls.dragTo$default(anchoredDragScope, unstyledAnchoredDraggableState.newOffsetForDelta$core_release(m9431toFloatk4lQ0M), 0.0f, 2, null);
        } else {
            overscrollEffect2 = anchoredDraggableNode.overscrollEffect;
            Intrinsics.checkNotNull(overscrollEffect2);
            m9429reverseIfNeededMKHz9U = anchoredDraggableNode.m9429reverseIfNeededMKHz9U(dragDelta.getDelta());
            Offset.m5402boximpl(overscrollEffect2.mo241applyToScrollRhakbz0(m9429reverseIfNeededMKHz9U, NestedScrollSource.INSTANCE.m6840getUserInputWNlRxjI(), new Function1() { // from class: com.composables.core.androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Offset invokeSuspend$lambda$1$lambda$0;
                    invokeSuspend$lambda$1$lambda$0 = AnchoredDraggableNode$drag$2.invokeSuspend$lambda$1$lambda$0(AnchoredDraggableNode.this, anchoredDragScope, (Offset) obj);
                    return invokeSuspend$lambda$1$lambda$0;
                }
            }));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset invokeSuspend$lambda$1$lambda$0(AnchoredDraggableNode anchoredDraggableNode, AnchoredDragScope anchoredDragScope, Offset offset) {
        UnstyledAnchoredDraggableState unstyledAnchoredDraggableState;
        float m9431toFloatk4lQ0M;
        UnstyledAnchoredDraggableState unstyledAnchoredDraggableState2;
        long m9432toOffsettuRUvjQ;
        unstyledAnchoredDraggableState = anchoredDraggableNode.state;
        m9431toFloatk4lQ0M = anchoredDraggableNode.m9431toFloatk4lQ0M(offset.m5423unboximpl());
        float newOffsetForDelta$core_release = unstyledAnchoredDraggableState.newOffsetForDelta$core_release(m9431toFloatk4lQ0M);
        unstyledAnchoredDraggableState2 = anchoredDraggableNode.state;
        m9432toOffsettuRUvjQ = anchoredDraggableNode.m9432toOffsettuRUvjQ(newOffsetForDelta$core_release - unstyledAnchoredDraggableState2.requireOffset());
        AnchoredDragScope.DefaultImpls.dragTo$default(anchoredDragScope, newOffsetForDelta$core_release, 0.0f, 2, null);
        return Offset.m5402boximpl(m9432toOffsettuRUvjQ);
    }
}
