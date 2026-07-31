package com.composables.core.androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.unit.Velocity;
import androidx.core.app.NotificationCompat;
import com.composables.core.androidx.compose.foundation.gestures.DragEvent;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.Channel;

/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B7\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJM\u0010\u001d\u001a\u00020\u001e2=\u0010\u001f\u001a9\b\u0001\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u001e0\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0%\u0012\u0006\u0012\u0004\u0018\u00010&0 H¦@¢\u0006\u0002\u0010'J\u0017\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*H&¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020/H&¢\u0006\u0004\b0\u0010,J\b\u00101\u001a\u00020\u0007H&J\b\u00102\u001a\u00020\u001eH\u0002J\b\u00105\u001a\u00020\u001eH\u0016J'\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>J\b\u0010?\u001a\u000204H\u0002J\b\u0010@\u001a\u00020\u001eH\u0016J\u0016\u0010A\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020CH\u0082@¢\u0006\u0002\u0010DJ\u0016\u0010E\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020FH\u0082@¢\u0006\u0002\u0010GJ\u000e\u0010H\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010IJ\u0006\u0010J\u001a\u00020\u001eJH\u0010K\u001a\u00020\u001e2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010L\u001a\u00020\u0007R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R6\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\n@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/composables/core/androidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "canDrag", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", ViewProps.ENABLED, "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "orientationLock", "Landroidx/compose/foundation/gestures/Orientation;", "<init>", "(Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;)V", "value", "getCanDrag", "()Lkotlin/jvm/functions/Function1;", "getEnabled", "()Z", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "_canDrag", "channel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/composables/core/androidx/compose/foundation/gestures/DragEvent;", "dragInteraction", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "isListeningForEvents", "drag", "", "forEachDelta", "Lkotlin/Function2;", "Lcom/composables/core/androidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", "name", "dragDelta", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDragStarted", "startedPosition", "Landroidx/compose/ui/geometry/Offset;", "onDragStarted-k-4lQ0M", "(J)V", "onDragStopped", "velocity", "Landroidx/compose/ui/unit/Velocity;", "onDragStopped-TH1AsA0", "startDragImmediately", "startListeningForEvents", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "onDetach", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "initializePointerInputNode", "onCancelPointerInput", "processDragStart", NotificationCompat.CATEGORY_EVENT, "Lcom/composables/core/androidx/compose/foundation/gestures/DragEvent$DragStarted;", "(Lcom/composables/core/androidx/compose/foundation/gestures/DragEvent$DragStarted;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragStop", "Lcom/composables/core/androidx/compose/foundation/gestures/DragEvent$DragStopped;", "(Lcom/composables/core/androidx/compose/foundation/gestures/DragEvent$DragStopped;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragCancel", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disposeInteractionSource", "update", "shouldResetPointerInputHandling", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class DragGestureNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private final Function1<PointerInputChange, Boolean> _canDrag;
    private Function1<? super PointerInputChange, Boolean> canDrag;
    private Channel<DragEvent> channel;
    private DragInteraction.Start dragInteraction;
    private boolean enabled;
    private MutableInteractionSource interactionSource;
    private boolean isListeningForEvents;
    private Orientation orientationLock;
    private SuspendingPointerInputModifierNode pointerInputNode;

    public abstract Object drag(Function2<? super Function1<? super DragEvent.DragDelta, Unit>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation);

    /* renamed from: onDragStarted-k-4lQ0M */
    public abstract void mo9434onDragStartedk4lQ0M(long startedPosition);

    /* renamed from: onDragStopped-TH1AsA0 */
    public abstract void mo9435onDragStoppedTH1AsA0(long velocity);

    public abstract boolean startDragImmediately();

    public DragGestureNode(Function1<? super PointerInputChange, Boolean> canDrag, boolean z, MutableInteractionSource mutableInteractionSource, Orientation orientation) {
        Intrinsics.checkNotNullParameter(canDrag, "canDrag");
        this.orientationLock = orientation;
        this.canDrag = canDrag;
        this.enabled = z;
        this.interactionSource = mutableInteractionSource;
        this._canDrag = new Function1() { // from class: com.composables.core.androidx.compose.foundation.gestures.DragGestureNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean _canDrag$lambda$0;
                _canDrag$lambda$0 = DragGestureNode._canDrag$lambda$0(DragGestureNode.this, (PointerInputChange) obj);
                return Boolean.valueOf(_canDrag$lambda$0);
            }
        };
    }

    protected final Function1<PointerInputChange, Boolean> getCanDrag() {
        return this.canDrag;
    }

    protected final boolean getEnabled() {
        return this.enabled;
    }

    protected final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _canDrag$lambda$0(DragGestureNode dragGestureNode, PointerInputChange it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return dragGestureNode.canDrag.invoke(it).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startListeningForEvents() {
        this.isListeningForEvents = true;
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new DragGestureNode$startListeningForEvents$1(this, null), 3, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.isListeningForEvents = false;
        disposeInteractionSource();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo232onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pass, "pass");
        if (this.enabled && this.pointerInputNode == null) {
            this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(initializePointerInputNode());
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.mo232onPointerEventH0pRuoY(pointerEvent, pass, bounds);
        }
    }

    private final SuspendingPointerInputModifierNode initializePointerInputNode() {
        return SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new DragGestureNode$initializePointerInputNode$1(this));
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.onCancelPointerInput();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        if (r2.emit(r5, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragStart(DragEvent.DragStarted dragStarted, Continuation<? super Unit> continuation) {
        DragGestureNode$processDragStart$1 dragGestureNode$processDragStart$1;
        int i;
        DragInteraction.Start start;
        MutableInteractionSource mutableInteractionSource;
        DragEvent.DragStarted dragStarted2;
        DragInteraction.Start start2;
        if (continuation instanceof DragGestureNode$processDragStart$1) {
            dragGestureNode$processDragStart$1 = (DragGestureNode$processDragStart$1) continuation;
            if ((dragGestureNode$processDragStart$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragStart$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureNode$processDragStart$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureNode$processDragStart$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DragInteraction.Start start3 = this.dragInteraction;
                    if (start3 != null && (r2 = this.interactionSource) != null) {
                        DragInteraction.Cancel cancel = new DragInteraction.Cancel(start3);
                        dragGestureNode$processDragStart$1.L$0 = dragStarted;
                        dragGestureNode$processDragStart$1.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        start2 = (DragInteraction.Start) dragGestureNode$processDragStart$1.L$1;
                        dragStarted2 = (DragEvent.DragStarted) dragGestureNode$processDragStart$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        start = start2;
                        dragStarted = dragStarted2;
                        this.dragInteraction = start;
                        mo9434onDragStartedk4lQ0M(dragStarted.getStartPoint());
                        return Unit.INSTANCE;
                    }
                    dragStarted = (DragEvent.DragStarted) dragGestureNode$processDragStart$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                start = new DragInteraction.Start();
                mutableInteractionSource = this.interactionSource;
                if (mutableInteractionSource != null) {
                    dragGestureNode$processDragStart$1.L$0 = dragStarted;
                    dragGestureNode$processDragStart$1.L$1 = start;
                    dragGestureNode$processDragStart$1.label = 2;
                    if (mutableInteractionSource.emit(start, dragGestureNode$processDragStart$1) != coroutine_suspended) {
                        dragStarted2 = dragStarted;
                        start2 = start;
                        start = start2;
                        dragStarted = dragStarted2;
                    }
                    return coroutine_suspended;
                }
                this.dragInteraction = start;
                mo9434onDragStartedk4lQ0M(dragStarted.getStartPoint());
                return Unit.INSTANCE;
            }
        }
        dragGestureNode$processDragStart$1 = new DragGestureNode$processDragStart$1(this, continuation);
        Object obj2 = dragGestureNode$processDragStart$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureNode$processDragStart$1.label;
        if (i != 0) {
        }
        start = new DragInteraction.Start();
        mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
        }
        this.dragInteraction = start;
        mo9434onDragStartedk4lQ0M(dragStarted.getStartPoint());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragStop(DragEvent.DragStopped dragStopped, Continuation<? super Unit> continuation) {
        DragGestureNode$processDragStop$1 dragGestureNode$processDragStop$1;
        int i;
        if (continuation instanceof DragGestureNode$processDragStop$1) {
            dragGestureNode$processDragStop$1 = (DragGestureNode$processDragStop$1) continuation;
            if ((dragGestureNode$processDragStop$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragStop$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureNode$processDragStop$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureNode$processDragStop$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DragInteraction.Start start = this.dragInteraction;
                    if (start != null) {
                        MutableInteractionSource mutableInteractionSource = this.interactionSource;
                        if (mutableInteractionSource != null) {
                            DragInteraction.Stop stop = new DragInteraction.Stop(start);
                            dragGestureNode$processDragStop$1.L$0 = dragStopped;
                            dragGestureNode$processDragStop$1.label = 1;
                            if (mutableInteractionSource.emit(stop, dragGestureNode$processDragStop$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    mo9435onDragStoppedTH1AsA0(dragStopped.getVelocity());
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dragStopped = (DragEvent.DragStopped) dragGestureNode$processDragStop$1.L$0;
                ResultKt.throwOnFailure(obj);
                this.dragInteraction = null;
                mo9435onDragStoppedTH1AsA0(dragStopped.getVelocity());
                return Unit.INSTANCE;
            }
        }
        dragGestureNode$processDragStop$1 = new DragGestureNode$processDragStop$1(this, continuation);
        Object obj2 = dragGestureNode$processDragStop$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureNode$processDragStop$1.label;
        if (i != 0) {
        }
        this.dragInteraction = null;
        mo9435onDragStoppedTH1AsA0(dragStopped.getVelocity());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragCancel(Continuation<? super Unit> continuation) {
        DragGestureNode$processDragCancel$1 dragGestureNode$processDragCancel$1;
        int i;
        if (continuation instanceof DragGestureNode$processDragCancel$1) {
            dragGestureNode$processDragCancel$1 = (DragGestureNode$processDragCancel$1) continuation;
            if ((dragGestureNode$processDragCancel$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragCancel$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureNode$processDragCancel$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureNode$processDragCancel$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DragInteraction.Start start = this.dragInteraction;
                    if (start != null) {
                        MutableInteractionSource mutableInteractionSource = this.interactionSource;
                        if (mutableInteractionSource != null) {
                            DragInteraction.Cancel cancel = new DragInteraction.Cancel(start);
                            dragGestureNode$processDragCancel$1.label = 1;
                            if (mutableInteractionSource.emit(cancel, dragGestureNode$processDragCancel$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    mo9435onDragStoppedTH1AsA0(Velocity.INSTANCE.m8650getZero9UxMQ8M());
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.dragInteraction = null;
                mo9435onDragStoppedTH1AsA0(Velocity.INSTANCE.m8650getZero9UxMQ8M());
                return Unit.INSTANCE;
            }
        }
        dragGestureNode$processDragCancel$1 = new DragGestureNode$processDragCancel$1(this, continuation);
        Object obj2 = dragGestureNode$processDragCancel$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureNode$processDragCancel$1.label;
        if (i != 0) {
        }
        this.dragInteraction = null;
        mo9435onDragStoppedTH1AsA0(Velocity.INSTANCE.m8650getZero9UxMQ8M());
        return Unit.INSTANCE;
    }

    public final void disposeInteractionSource() {
        DragInteraction.Start start = this.dragInteraction;
        if (start != null) {
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.tryEmit(new DragInteraction.Cancel(start));
            }
            this.dragInteraction = null;
        }
    }

    public static /* synthetic */ void update$default(DragGestureNode dragGestureNode, Function1 function1, boolean z, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i & 1) != 0) {
            function1 = dragGestureNode.canDrag;
        }
        if ((i & 2) != 0) {
            z = dragGestureNode.enabled;
        }
        if ((i & 4) != 0) {
            mutableInteractionSource = dragGestureNode.interactionSource;
        }
        if ((i & 8) != 0) {
            orientation = dragGestureNode.orientationLock;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        Function1 function12 = function1;
        dragGestureNode.update(function12, z, mutableInteractionSource2, orientation, z3);
    }

    public final void update(Function1<? super PointerInputChange, Boolean> canDrag, boolean enabled, MutableInteractionSource interactionSource, Orientation orientationLock, boolean shouldResetPointerInputHandling) {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode;
        Intrinsics.checkNotNullParameter(canDrag, "canDrag");
        this.canDrag = canDrag;
        boolean z = true;
        if (this.enabled != enabled) {
            this.enabled = enabled;
            if (!enabled) {
                disposeInteractionSource();
                SuspendingPointerInputModifierNode suspendingPointerInputModifierNode2 = this.pointerInputNode;
                if (suspendingPointerInputModifierNode2 != null) {
                    undelegate(suspendingPointerInputModifierNode2);
                }
                this.pointerInputNode = null;
            }
            shouldResetPointerInputHandling = true;
        }
        if (!Intrinsics.areEqual(this.interactionSource, interactionSource)) {
            disposeInteractionSource();
            this.interactionSource = interactionSource;
        }
        if (this.orientationLock != orientationLock) {
            this.orientationLock = orientationLock;
        } else {
            z = shouldResetPointerInputHandling;
        }
        if (!z || (suspendingPointerInputModifierNode = this.pointerInputNode) == null) {
            return;
        }
        suspendingPointerInputModifierNode.resetPointerInputHandler();
    }
}
