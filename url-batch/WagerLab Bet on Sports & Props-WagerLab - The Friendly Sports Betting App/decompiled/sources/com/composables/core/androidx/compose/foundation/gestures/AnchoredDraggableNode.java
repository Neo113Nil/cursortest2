package com.composables.core.androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.composables.core.androidx.compose.foundation.gestures.DragEvent;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BK\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010JM\u0010\u0014\u001a\u00020\u00152=\u0010\u0016\u001a9\b\u0001\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00150\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0017H\u0096@¢\u0006\u0002\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010$J\b\u0010\u000e\u001a\u00020\bH\u0016JO\u0010)\u001a\u00020\u00152\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0002\u0010\u0010J\u0013\u0010*\u001a\u00020\"*\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020'*\u00020+H\u0002¢\u0006\u0004\b/\u0010-J\u0013\u00100\u001a\u00020+*\u00020'H\u0002¢\u0006\u0004\b1\u00102J\u0013\u00100\u001a\u00020+*\u00020\"H\u0002¢\u0006\u0004\b3\u00102J\u0013\u00104\u001a\u00020'*\u00020'H\u0002¢\u0006\u0004\b5\u00106J\u0013\u00104\u001a\u00020\"*\u00020\"H\u0002¢\u0006\u0004\b7\u00106R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u00068"}, d2 = {"Lcom/composables/core/androidx/compose/foundation/gestures/AnchoredDraggableNode;", "T", "Lcom/composables/core/androidx/compose/foundation/gestures/DragGestureNode;", "state", "Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledAnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", ViewProps.ENABLED, "", "reverseDirection", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "startDragImmediately", "<init>", "(Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledAnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLjava/lang/Boolean;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/OverscrollEffect;Z)V", "Ljava/lang/Boolean;", "isReverseDirection", "()Z", "drag", "", "forEachDelta", "Lkotlin/Function2;", "Lkotlin/Function1;", "Lcom/composables/core/androidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", "name", "dragDelta", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDragStarted", "startedPosition", "Landroidx/compose/ui/geometry/Offset;", "onDragStarted-k-4lQ0M", "(J)V", "onDragStopped", "velocity", "Landroidx/compose/ui/unit/Velocity;", "onDragStopped-TH1AsA0", "update", "toOffset", "", "toOffset-tuRUvjQ", "(F)J", "toVelocity", "toVelocity-adjELrA", "toFloat", "toFloat-TH1AsA0", "(J)F", "toFloat-k-4lQ0M", "reverseIfNeeded", "reverseIfNeeded-AH228Gc", "(J)J", "reverseIfNeeded-MK-Hz9U", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AnchoredDraggableNode<T> extends DragGestureNode {
    private Orientation orientation;
    private OverscrollEffect overscrollEffect;
    private Boolean reverseDirection;
    private boolean startDragImmediately;
    private UnstyledAnchoredDraggableState<T> state;

    @Override // com.composables.core.androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M, reason: not valid java name */
    public void mo9434onDragStartedk4lQ0M(long startedPosition) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AnchoredDraggableNode(UnstyledAnchoredDraggableState<T> state, Orientation orientation, boolean z, Boolean bool, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z2) {
        super(r0, z, mutableInteractionSource, orientation);
        Function1 function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        function1 = AnchoredDraggableKt.AlwaysDrag;
        this.state = state;
        this.orientation = orientation;
        this.reverseDirection = bool;
        this.overscrollEffect = overscrollEffect;
        this.startDragImmediately = z2;
    }

    private final boolean isReverseDirection() {
        Boolean bool = this.reverseDirection;
        if (bool == null) {
            return DelegatableNodeKt.requireLayoutDirection(this) == LayoutDirection.Rtl && this.orientation == Orientation.Horizontal;
        }
        Intrinsics.checkNotNull(bool);
        return bool.booleanValue();
    }

    @Override // com.composables.core.androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(Function2<? super Function1<? super DragEvent.DragDelta, Unit>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object anchoredDrag$default = UnstyledAnchoredDraggableState.anchoredDrag$default(this.state, null, new AnchoredDraggableNode$drag$2(function2, this, null), continuation, 1, null);
        return anchoredDrag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? anchoredDrag$default : Unit.INSTANCE;
    }

    @Override // com.composables.core.androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStopped-TH1AsA0, reason: not valid java name */
    public void mo9435onDragStoppedTH1AsA0(long velocity) {
        if (getIsAttached()) {
            BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AnchoredDraggableNode$onDragStopped$1(this, velocity, null), 3, null);
        }
    }

    @Override // com.composables.core.androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: startDragImmediately, reason: from getter */
    public boolean getStartDragImmediately() {
        return this.startDragImmediately;
    }

    public final void update(UnstyledAnchoredDraggableState<T> state, Orientation orientation, boolean enabled, Boolean reverseDirection, MutableInteractionSource interactionSource, OverscrollEffect overscrollEffect, boolean startDragImmediately) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (Intrinsics.areEqual(this.state, state)) {
            z = false;
        } else {
            this.state = state;
            z = true;
        }
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z = true;
        }
        if (Intrinsics.areEqual(this.reverseDirection, reverseDirection)) {
            z2 = z;
        } else {
            this.reverseDirection = reverseDirection;
            z2 = true;
        }
        this.startDragImmediately = startDragImmediately;
        this.overscrollEffect = overscrollEffect;
        DragGestureNode.update$default(this, null, enabled, interactionSource, orientation, z2, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m9432toOffsettuRUvjQ(float f) {
        float f2 = this.orientation == Orientation.Horizontal ? f : 0.0f;
        if (this.orientation != Orientation.Vertical) {
            f = 0.0f;
        }
        return Offset.m5405constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m9433toVelocityadjELrA(float f) {
        float f2 = this.orientation == Orientation.Horizontal ? f : 0.0f;
        if (this.orientation != Orientation.Vertical) {
            f = 0.0f;
        }
        return VelocityKt.Velocity(f2, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m9430toFloatTH1AsA0(long j) {
        return this.orientation == Orientation.Vertical ? Velocity.m8640getYimpl(j) : Velocity.m8639getXimpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m9431toFloatk4lQ0M(long j) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Vertical ? j & 4294967295L : j >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-AH228Gc, reason: not valid java name */
    public final long m9428reverseIfNeededAH228Gc(long j) {
        return Velocity.m8645timesadjELrA(j, isReverseDirection() ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m9429reverseIfNeededMKHz9U(long j) {
        return Offset.m5420timestuRUvjQ(j, isReverseDirection() ? -1.0f : 1.0f);
    }
}
