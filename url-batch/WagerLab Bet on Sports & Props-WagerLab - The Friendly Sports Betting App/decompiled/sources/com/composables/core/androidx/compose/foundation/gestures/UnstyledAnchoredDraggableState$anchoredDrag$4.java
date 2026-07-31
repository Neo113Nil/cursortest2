package com.composables.core.androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.composables.core.androidx.compose.foundation.gestures.UnstyledAnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", i = {}, l = {885}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class UnstyledAnchoredDraggableState$anchoredDrag$4 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Function4<AnchoredDragScope, UnstyledDraggableAnchors<T>, T, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ T $targetValue;
    int label;
    final /* synthetic */ UnstyledAnchoredDraggableState<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UnstyledAnchoredDraggableState$anchoredDrag$4(UnstyledAnchoredDraggableState<T> unstyledAnchoredDraggableState, T t, Function4<? super AnchoredDragScope, ? super UnstyledDraggableAnchors<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function4, Continuation<? super UnstyledAnchoredDraggableState$anchoredDrag$4> continuation) {
        super(1, continuation);
        this.this$0 = unstyledAnchoredDraggableState;
        this.$targetValue = t;
        this.$block = function4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UnstyledAnchoredDraggableState$anchoredDrag$4(this.this$0, this.$targetValue, this.$block, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((UnstyledAnchoredDraggableState$anchoredDrag$4) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object restartable;
        UnstyledAnchoredDraggableState$anchoredDragScope$1 unstyledAnchoredDraggableState$anchoredDragScope$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.setDragTarget$core_release(this.$targetValue);
            final UnstyledAnchoredDraggableState<T> unstyledAnchoredDraggableState = this.this$0;
            this.label = 1;
            restartable = AnchoredDraggableKt.restartable(new Function0() { // from class: com.composables.core.androidx.compose.foundation.gestures.UnstyledAnchoredDraggableState$anchoredDrag$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Pair invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = UnstyledAnchoredDraggableState$anchoredDrag$4.invokeSuspend$lambda$0(UnstyledAnchoredDraggableState.this);
                    return invokeSuspend$lambda$0;
                }
            }, new AnonymousClass2(this.$block, this.this$0, null), this);
            if (restartable == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) this.this$0.getConfirmValueChange$core_release().invoke(this.$targetValue)).booleanValue()) {
            float positionOf = this.this$0.getAnchors().positionOf(this.$targetValue);
            unstyledAnchoredDraggableState$anchoredDragScope$1 = ((UnstyledAnchoredDraggableState) this.this$0).anchoredDragScope;
            unstyledAnchoredDraggableState$anchoredDragScope$1.dragTo(positionOf, this.this$0.getLastVelocity());
            this.this$0.setSettledValue(this.$targetValue);
            this.this$0.setCurrentValue(this.$targetValue);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "T", "<destruct>", "Lkotlin/Pair;", "Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledDraggableAnchors;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.composables.core.androidx.compose.foundation.gestures.UnstyledAnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", i = {}, l = {888}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.composables.core.androidx.compose.foundation.gestures.UnstyledAnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
    static final class AnonymousClass2<T> extends SuspendLambda implements Function2<Pair<? extends UnstyledDraggableAnchors<T>, ? extends T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function4<AnchoredDragScope, UnstyledDraggableAnchors<T>, T, Continuation<? super Unit>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UnstyledAnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function4<? super AnchoredDragScope, ? super UnstyledDraggableAnchors<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function4, UnstyledAnchoredDraggableState<T> unstyledAnchoredDraggableState, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$block = function4;
            this.this$0 = unstyledAnchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Pair<? extends UnstyledDraggableAnchors<T>, ? extends T> pair, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UnstyledAnchoredDraggableState$anchoredDragScope$1 unstyledAnchoredDraggableState$anchoredDragScope$1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                UnstyledDraggableAnchors unstyledDraggableAnchors = (UnstyledDraggableAnchors) pair.component1();
                Object component2 = pair.component2();
                Function4<AnchoredDragScope, UnstyledDraggableAnchors<T>, T, Continuation<? super Unit>, Object> function4 = this.$block;
                unstyledAnchoredDraggableState$anchoredDragScope$1 = ((UnstyledAnchoredDraggableState) this.this$0).anchoredDragScope;
                this.label = 1;
                if (function4.invoke(unstyledAnchoredDraggableState$anchoredDragScope$1, unstyledDraggableAnchors, component2, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair invokeSuspend$lambda$0(UnstyledAnchoredDraggableState unstyledAnchoredDraggableState) {
        return TuplesKt.to(unstyledAnchoredDraggableState.getAnchors(), unstyledAnchoredDraggableState.getTargetValue());
    }
}
