package com.composables.core.androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.VelocityKt;
import com.composables.core.androidx.compose.foundation.gestures.DragEvent;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;

/* compiled from: Draggable.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DragGestureNode$initializePointerInputNode$1 implements PointerInputEventHandler {
    final /* synthetic */ DragGestureNode this$0;

    DragGestureNode$initializePointerInputNode$1(DragGestureNode dragGestureNode) {
        this.this$0 = dragGestureNode;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final VelocityTracker velocityTracker = new VelocityTracker();
        final DragGestureNode dragGestureNode = this.this$0;
        Function2 function2 = new Function2() { // from class: com.composables.core.androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit invoke$lambda$0;
                invoke$lambda$0 = DragGestureNode$initializePointerInputNode$1.invoke$lambda$0(DragGestureNode.this, (PointerInputChange) obj, (Offset) obj2);
                return invoke$lambda$0;
            }
        };
        final DragGestureNode dragGestureNode2 = this.this$0;
        Function1 function1 = new Function1() { // from class: com.composables.core.androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$1;
                invoke$lambda$1 = DragGestureNode$initializePointerInputNode$1.invoke$lambda$1(VelocityTracker.this, dragGestureNode2, (PointerInputChange) obj);
                return invoke$lambda$1;
            }
        };
        final DragGestureNode dragGestureNode3 = this.this$0;
        Function0 function0 = new Function0() { // from class: com.composables.core.androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$2;
                invoke$lambda$2 = DragGestureNode$initializePointerInputNode$1.invoke$lambda$2(DragGestureNode.this);
                return invoke$lambda$2;
            }
        };
        final DragGestureNode dragGestureNode4 = this.this$0;
        Function0 function02 = new Function0() { // from class: com.composables.core.androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean invoke$lambda$3;
                invoke$lambda$3 = DragGestureNode$initializePointerInputNode$1.invoke$lambda$3(DragGestureNode.this);
                return Boolean.valueOf(invoke$lambda$3);
            }
        };
        final DragGestureNode dragGestureNode5 = this.this$0;
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass1(this.this$0, pointerInputScope, function2, function1, function0, function02, new Function2() { // from class: com.composables.core.androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit invoke$lambda$4;
                invoke$lambda$4 = DragGestureNode$initializePointerInputNode$1.invoke$lambda$4(VelocityTracker.this, dragGestureNode5, (PointerInputChange) obj, (Offset) obj2);
                return invoke$lambda$4;
            }
        }, null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(DragGestureNode dragGestureNode, PointerInputChange startEvent, Offset offset) {
        boolean z;
        Channel channel;
        Channel channel2;
        Intrinsics.checkNotNullParameter(startEvent, "startEvent");
        if (dragGestureNode.getCanDrag().invoke(startEvent).booleanValue()) {
            z = dragGestureNode.isListeningForEvents;
            if (!z) {
                channel2 = dragGestureNode.channel;
                if (channel2 == null) {
                    dragGestureNode.channel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                }
                dragGestureNode.startListeningForEvents();
            }
            long m5423unboximpl = offset.m5423unboximpl();
            float signum = Math.signum(Float.intBitsToFloat((int) (startEvent.getPosition() >> 32)));
            float signum2 = Math.signum(Float.intBitsToFloat((int) (startEvent.getPosition() & 4294967295L)));
            long position = startEvent.getPosition();
            float intBitsToFloat = Float.intBitsToFloat((int) (m5423unboximpl >> 32)) * signum;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (m5423unboximpl & 4294967295L)) * signum2;
            long m5417minusMKHz9U = Offset.m5417minusMKHz9U(position, Offset.m5405constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L)));
            channel = dragGestureNode.channel;
            if (channel != null) {
                ChannelResult.m13901boximpl(channel.mo8997trySendJP2dKIU(new DragEvent.DragStarted(m5417minusMKHz9U, null)));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(VelocityTracker velocityTracker, DragGestureNode dragGestureNode, PointerInputChange upEvent) {
        Channel channel;
        long m9476toValidVelocityTH1AsA0;
        Intrinsics.checkNotNullParameter(upEvent, "upEvent");
        VelocityTrackerKt.addPointerInputChange(velocityTracker, upEvent);
        float maximumFlingVelocity = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(dragGestureNode, CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
        long m7046calculateVelocityAH228Gc = velocityTracker.m7046calculateVelocityAH228Gc(VelocityKt.Velocity(maximumFlingVelocity, maximumFlingVelocity));
        velocityTracker.resetTracking();
        channel = dragGestureNode.channel;
        if (channel != null) {
            m9476toValidVelocityTH1AsA0 = DraggableKt.m9476toValidVelocityTH1AsA0(m7046calculateVelocityAH228Gc);
            ChannelResult.m13901boximpl(channel.mo8997trySendJP2dKIU(new DragEvent.DragStopped(m9476toValidVelocityTH1AsA0, null)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(DragGestureNode dragGestureNode) {
        Channel channel;
        channel = dragGestureNode.channel;
        if (channel != null) {
            ChannelResult.m13901boximpl(channel.mo8997trySendJP2dKIU(DragEvent.DragCancelled.INSTANCE));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$3(DragGestureNode dragGestureNode) {
        return !dragGestureNode.getStartDragImmediately();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4(VelocityTracker velocityTracker, DragGestureNode dragGestureNode, PointerInputChange change, Offset offset) {
        Channel channel;
        Intrinsics.checkNotNullParameter(change, "change");
        VelocityTrackerKt.addPointerInputChange(velocityTracker, change);
        channel = dragGestureNode.channel;
        if (channel != null) {
            ChannelResult.m13901boximpl(channel.mo8997trySendJP2dKIU(new DragEvent.DragDelta(offset.m5423unboximpl(), null)));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.composables.core.androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", i = {0}, l = {524}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"})
    /* renamed from: com.composables.core.androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function1<PointerInputChange, Unit> $onDragEnd;
        final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDragStart;
        final /* synthetic */ Function0<Boolean> $shouldAwaitTouchSlop;
        final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DragGestureNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(DragGestureNode dragGestureNode, PointerInputScope pointerInputScope, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Function1<? super PointerInputChange, Unit> function1, Function0<Unit> function0, Function0<Boolean> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function22, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = dragGestureNode;
            this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
            this.$onDragStart = function2;
            this.$onDragEnd = function1;
            this.$onDragCancel = function0;
            this.$shouldAwaitTouchSlop = function02;
            this.$onDrag = function22;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_SuspendingPointerInputModifierNode, this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$shouldAwaitTouchSlop, this.$onDrag, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.CoroutineScope] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Channel channel;
            Orientation orientation;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                if (r1 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    orientation = this.this$0.orientationLock;
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    r1 = coroutineScope;
                    if (DragGestureDetectorKt.detectDragGestures(this.$this_SuspendingPointerInputModifierNode, this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$shouldAwaitTouchSlop, orientation, this.$onDrag, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (r1 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    r1 = coroutineScope2;
                }
            } catch (CancellationException e) {
                channel = this.this$0.channel;
                if (channel != null) {
                    ChannelResult.m13901boximpl(channel.mo8997trySendJP2dKIU(DragEvent.DragCancelled.INSTANCE));
                }
                if (!CoroutineScopeKt.isActive(r1)) {
                    throw e;
                }
            }
            return Unit.INSTANCE;
        }
    }
}
