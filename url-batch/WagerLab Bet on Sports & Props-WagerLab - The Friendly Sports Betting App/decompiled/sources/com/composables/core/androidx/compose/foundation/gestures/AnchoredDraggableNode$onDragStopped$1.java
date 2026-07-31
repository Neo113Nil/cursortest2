package com.composables.core.androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.composables.core.androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", f = "AnchoredDraggable.kt", i = {}, l = {279, 281}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class AnchoredDraggableNode$onDragStopped$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $velocity;
    Object L$0;
    int label;
    final /* synthetic */ AnchoredDraggableNode<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableNode$onDragStopped$1(AnchoredDraggableNode<T> anchoredDraggableNode, long j, Continuation<? super AnchoredDraggableNode$onDragStopped$1> continuation) {
        super(2, continuation);
        this.this$0 = anchoredDraggableNode;
        this.$velocity = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AnchoredDraggableNode$onDragStopped$1(this.this$0, this.$velocity, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AnchoredDraggableNode$onDragStopped$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        if (r8.mo240applyToFlingBMRW4eQ(r3, new com.composables.core.androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1.AnonymousClass1(r7.this$0, null), r7) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OverscrollEffect overscrollEffect;
        OverscrollEffect overscrollEffect2;
        long m9428reverseIfNeededAH228Gc;
        UnstyledAnchoredDraggableState unstyledAnchoredDraggableState;
        long m9428reverseIfNeededAH228Gc2;
        float m9430toFloatTH1AsA0;
        AnchoredDraggableNode anchoredDraggableNode;
        long m9433toVelocityadjELrA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            overscrollEffect = ((AnchoredDraggableNode) this.this$0).overscrollEffect;
            if (overscrollEffect != null) {
                overscrollEffect2 = ((AnchoredDraggableNode) this.this$0).overscrollEffect;
                Intrinsics.checkNotNull(overscrollEffect2);
                m9428reverseIfNeededAH228Gc = this.this$0.m9428reverseIfNeededAH228Gc(this.$velocity);
                this.label = 2;
            } else {
                AnchoredDraggableNode anchoredDraggableNode2 = this.this$0;
                unstyledAnchoredDraggableState = anchoredDraggableNode2.state;
                AnchoredDraggableNode<T> anchoredDraggableNode3 = this.this$0;
                m9428reverseIfNeededAH228Gc2 = anchoredDraggableNode3.m9428reverseIfNeededAH228Gc(this.$velocity);
                m9430toFloatTH1AsA0 = anchoredDraggableNode3.m9430toFloatTH1AsA0(m9428reverseIfNeededAH228Gc2);
                this.L$0 = anchoredDraggableNode2;
                this.label = 1;
                Object obj2 = unstyledAnchoredDraggableState.settle(m9430toFloatTH1AsA0, this);
                if (obj2 != coroutine_suspended) {
                    anchoredDraggableNode = anchoredDraggableNode2;
                    obj = obj2;
                    m9433toVelocityadjELrA = anchoredDraggableNode.m9433toVelocityadjELrA(((Number) obj).floatValue());
                    Velocity.m8630boximpl(m9433toVelocityadjELrA);
                }
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            anchoredDraggableNode = (AnchoredDraggableNode) this.L$0;
            ResultKt.throwOnFailure(obj);
            m9433toVelocityadjELrA = anchoredDraggableNode.m9433toVelocityadjELrA(((Number) obj).floatValue());
            Velocity.m8630boximpl(m9433toVelocityadjELrA);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Velocity;", "availableVelocity"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.composables.core.androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", f = "AnchoredDraggable.kt", i = {0}, l = {284}, m = "invokeSuspend", n = {"availableVelocity"}, s = {"J$0"})
    /* renamed from: com.composables.core.androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<Velocity, Continuation<? super Velocity>, Object> {
        /* synthetic */ long J$0;
        Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnchoredDraggableNode<T> anchoredDraggableNode, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = anchoredDraggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.J$0 = ((Velocity) obj).getPackedValue();
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, Continuation<? super Velocity> continuation) {
            return m9437invokesFctU(velocity.getPackedValue(), continuation);
        }

        /* renamed from: invoke-sF-c-tU, reason: not valid java name */
        public final Object m9437invokesFctU(long j, Continuation<? super Velocity> continuation) {
            return ((AnonymousClass1) create(Velocity.m8630boximpl(j), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UnstyledAnchoredDraggableState unstyledAnchoredDraggableState;
            float m9430toFloatTH1AsA0;
            AnchoredDraggableNode anchoredDraggableNode;
            long j;
            long m9433toVelocityadjELrA;
            UnstyledAnchoredDraggableState unstyledAnchoredDraggableState2;
            UnstyledAnchoredDraggableState unstyledAnchoredDraggableState3;
            UnstyledAnchoredDraggableState unstyledAnchoredDraggableState4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j2 = this.J$0;
                AnchoredDraggableNode anchoredDraggableNode2 = this.this$0;
                unstyledAnchoredDraggableState = anchoredDraggableNode2.state;
                m9430toFloatTH1AsA0 = this.this$0.m9430toFloatTH1AsA0(j2);
                this.L$0 = anchoredDraggableNode2;
                this.J$0 = j2;
                this.label = 1;
                Object obj2 = unstyledAnchoredDraggableState.settle(m9430toFloatTH1AsA0, this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anchoredDraggableNode = anchoredDraggableNode2;
                obj = obj2;
                j = j2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                anchoredDraggableNode = (AnchoredDraggableNode) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            m9433toVelocityadjELrA = anchoredDraggableNode.m9433toVelocityadjELrA(((Number) obj).floatValue());
            unstyledAnchoredDraggableState2 = ((AnchoredDraggableNode) this.this$0).state;
            float requireOffset = unstyledAnchoredDraggableState2.requireOffset();
            unstyledAnchoredDraggableState3 = ((AnchoredDraggableNode) this.this$0).state;
            float minAnchor = unstyledAnchoredDraggableState3.getAnchors().minAnchor();
            unstyledAnchoredDraggableState4 = ((AnchoredDraggableNode) this.this$0).state;
            if (requireOffset >= unstyledAnchoredDraggableState4.getAnchors().maxAnchor() || requireOffset <= minAnchor) {
                j = m9433toVelocityadjELrA;
            }
            return Velocity.m8630boximpl(j);
        }
    }
}
