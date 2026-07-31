package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 j*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001jBs\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0005¢\u0006\u0004\b\u0011\u0010\u0012B\u0083\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0005¢\u0006\u0004\b\u0011\u0010\u0015J\u0006\u00109\u001a\u00020\u0006J#\u0010L\u001a\u00020M2\f\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\b\b\u0002\u0010O\u001a\u00028\u0000¢\u0006\u0002\u0010PJ\u0016\u0010Q\u001a\u00020M2\u0006\u0010R\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010SJ%\u0010T\u001a\u00028\u00002\u0006\u00102\u001a\u00020\u00062\u0006\u0010$\u001a\u00028\u00002\u0006\u0010R\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010UJ\u001d\u0010V\u001a\u00028\u00002\u0006\u00102\u001a\u00020\u00062\u0006\u0010$\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010WJ\\\u0010Z\u001a\u00020M2\b\b\u0002\u0010[\u001a\u00020\\2B\u0010]\u001a>\b\u0001\u0012\u0004\u0012\u00020Y\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0_\u0012\u0006\u0012\u0004\u0018\u00010\u00020^¢\u0006\u0002\b`H\u0086@¢\u0006\u0002\u0010aJy\u0010Z\u001a\u00020M2\u0006\u0010+\u001a\u00028\u00002\b\b\u0002\u0010[\u001a\u00020\\2W\u0010]\u001aS\b\u0001\u0012\u0004\u0012\u00020Y\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(+\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0_\u0012\u0006\u0012\u0004\u0018\u00010\u00020b¢\u0006\u0002\b`H\u0086@¢\u0006\u0002\u0010cJ\u0015\u0010d\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u0006H\u0000¢\u0006\u0002\bfJ\u000e\u0010g\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u0006J\u0015\u0010h\u001a\u00020\u00102\u0006\u0010+\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010iR/\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR/\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R+\u0010$\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001b\u0010+\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b,\u0010&R\u001b\u0010/\u001a\u00028\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b0\u0010&R+\u00102\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0011\u0010:\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001b\u0010<\u001a\u00020\u00068GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u0010.\u001a\u0004\b=\u00104R+\u0010?\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bB\u00108\u001a\u0004\b@\u00104\"\u0004\bA\u00106R/\u0010C\u001a\u0004\u0018\u00018\u00002\b\u0010#\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010*\u001a\u0004\bD\u0010&\"\u0004\bE\u0010(R7\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010*\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u000e\u0010X\u001a\u00020YX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006k"}, d2 = {"Landroidx/compose/material/AnchoredDraggableState;", "T", "", "initialValue", "positionalThreshold", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "velocityThreshold", "Lkotlin/Function0;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmValueChange", "newValue", "", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "anchors", "Landroidx/compose/material/DraggableAnchors;", "(Ljava/lang/Object;Landroidx/compose/material/DraggableAnchors;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "getPositionalThreshold$material", "()Lkotlin/jvm/functions/Function1;", "getVelocityThreshold$material", "()Lkotlin/jvm/functions/Function0;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "getConfirmValueChange$material", "dragMutex", "Landroidx/compose/material/InternalMutatorMutex;", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material", "()Landroidx/compose/foundation/gestures/DraggableState;", "<set-?>", "currentValue", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue$delegate", "Landroidx/compose/runtime/MutableState;", "targetValue", "getTargetValue", "targetValue$delegate", "Landroidx/compose/runtime/State;", "closestValue", "getClosestValue$material", "closestValue$delegate", "offset", "getOffset", "()F", "setOffset", "(F)V", "offset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "requireOffset", "isAnimationRunning", "()Z", "progress", "getProgress", "progress$delegate", "lastVelocity", "getLastVelocity", "setLastVelocity", "lastVelocity$delegate", "dragTarget", "getDragTarget", "setDragTarget", "dragTarget$delegate", "getAnchors", "()Landroidx/compose/material/DraggableAnchors;", "setAnchors", "(Landroidx/compose/material/DraggableAnchors;)V", "anchors$delegate", "updateAnchors", "", "newAnchors", "newTarget", "(Landroidx/compose/material/DraggableAnchors;Ljava/lang/Object;)V", "settle", "velocity", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computeTarget", "(FLjava/lang/Object;F)Ljava/lang/Object;", "computeTargetWithoutThresholds", "(FLjava/lang/Object;)Ljava/lang/Object;", "anchoredDragScope", "Landroidx/compose/material/AnchoredDragScope;", "anchoredDrag", "dragPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function4;", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newOffsetForDelta", "delta", "newOffsetForDelta$material", "dispatchRawDelta", "trySnapTo", "(Ljava/lang/Object;)Z", "Companion", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnchoredDraggableState<T> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AnchoredDragScope anchoredDragScope;

    /* renamed from: anchors$delegate, reason: from kotlin metadata */
    private final MutableState anchors;
    private final AnimationSpec<Float> animationSpec;

    /* renamed from: closestValue$delegate, reason: from kotlin metadata */
    private final State closestValue;
    private final Function1<T, Boolean> confirmValueChange;

    /* renamed from: currentValue$delegate, reason: from kotlin metadata */
    private final MutableState currentValue;
    private final InternalMutatorMutex dragMutex;

    /* renamed from: dragTarget$delegate, reason: from kotlin metadata */
    private final MutableState dragTarget;
    private final DraggableState draggableState;

    /* renamed from: lastVelocity$delegate, reason: from kotlin metadata */
    private final MutableFloatState lastVelocity;

    /* renamed from: offset$delegate, reason: from kotlin metadata */
    private final MutableFloatState offset;
    private final Function1<Float, Float> positionalThreshold;

    /* renamed from: progress$delegate, reason: from kotlin metadata */
    private final State progress;

    /* renamed from: targetValue$delegate, reason: from kotlin metadata */
    private final State targetValue;
    private final Function0<Float> velocityThreshold;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(Object obj) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState(T t, Function1<? super Float, Float> function1, Function0<Float> function0, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function12) {
        MapDraggableAnchors emptyDraggableAnchors;
        this.positionalThreshold = function1;
        this.velocityThreshold = function0;
        this.animationSpec = animationSpec;
        this.confirmValueChange = function12;
        this.dragMutex = new InternalMutatorMutex();
        this.draggableState = new AnchoredDraggableState$draggableState$1(this);
        this.currentValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.targetValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.material.AnchoredDraggableState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object targetValue_delegate$lambda$3;
                targetValue_delegate$lambda$3 = AnchoredDraggableState.targetValue_delegate$lambda$3(AnchoredDraggableState.this);
                return targetValue_delegate$lambda$3;
            }
        });
        this.closestValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.material.AnchoredDraggableState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object closestValue_delegate$lambda$5;
                closestValue_delegate$lambda$5 = AnchoredDraggableState.closestValue_delegate$lambda$5(AnchoredDraggableState.this);
                return closestValue_delegate$lambda$5;
            }
        });
        this.offset = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        this.progress = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0() { // from class: androidx.compose.material.AnchoredDraggableState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                float progress_delegate$lambda$7;
                progress_delegate$lambda$7 = AnchoredDraggableState.progress_delegate$lambda$7(AnchoredDraggableState.this);
                return Float.valueOf(progress_delegate$lambda$7);
            }
        });
        this.lastVelocity = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragTarget = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        emptyDraggableAnchors = AnchoredDraggableKt.emptyDraggableAnchors();
        this.anchors = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(emptyDraggableAnchors, null, 2, null);
        this.anchoredDragScope = new AnchoredDragScope(this) { // from class: androidx.compose.material.AnchoredDraggableState$anchoredDragScope$1
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.compose.material.AnchoredDragScope
            public void dragTo(float newOffset, float lastKnownVelocity) {
                this.this$0.setOffset(newOffset);
                this.this$0.setLastVelocity(lastKnownVelocity);
            }
        };
    }

    public final Function1<Float, Float> getPositionalThreshold$material() {
        return this.positionalThreshold;
    }

    public final Function0<Float> getVelocityThreshold$material() {
        return this.velocityThreshold;
    }

    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, Function1 function1, Function0 function0, AnimationSpec animationSpec, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function1, function0, animationSpec, (i & 16) != 0 ? new Function1() { // from class: androidx.compose.material.AnchoredDraggableState$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                boolean _init_$lambda$0;
                _init_$lambda$0 = AnchoredDraggableState._init_$lambda$0(obj2);
                return Boolean.valueOf(_init_$lambda$0);
            }
        } : function12);
    }

    public final Function1<T, Boolean> getConfirmValueChange$material() {
        return this.confirmValueChange;
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, DraggableAnchors draggableAnchors, Function1 function1, Function0 function0, AnimationSpec animationSpec, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, draggableAnchors, function1, function0, animationSpec, (i & 32) != 0 ? new Function1() { // from class: androidx.compose.material.AnchoredDraggableState$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                boolean _init_$lambda$1;
                _init_$lambda$1 = AnchoredDraggableState._init_$lambda$1(obj2);
                return Boolean.valueOf(_init_$lambda$1);
            }
        } : function12);
    }

    public AnchoredDraggableState(T t, DraggableAnchors<T> draggableAnchors, Function1<? super Float, Float> function1, Function0<Float> function0, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function12) {
        this(t, function1, function0, animationSpec, function12);
        setAnchors(draggableAnchors);
        trySnapTo(t);
    }

    /* renamed from: getDraggableState$material, reason: from getter */
    public final DraggableState getDraggableState() {
        return this.draggableState;
    }

    private final void setCurrentValue(T t) {
        this.currentValue.setValue(t);
    }

    public final T getCurrentValue() {
        return this.currentValue.getValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object targetValue_delegate$lambda$3(AnchoredDraggableState anchoredDraggableState) {
        Object dragTarget = anchoredDraggableState.getDragTarget();
        if (dragTarget != null) {
            return dragTarget;
        }
        float offset = anchoredDraggableState.getOffset();
        if (!Float.isNaN(offset)) {
            return anchoredDraggableState.computeTarget(offset, anchoredDraggableState.getCurrentValue(), 0.0f);
        }
        return anchoredDraggableState.getCurrentValue();
    }

    public final T getClosestValue$material() {
        return (T) this.closestValue.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object closestValue_delegate$lambda$5(AnchoredDraggableState anchoredDraggableState) {
        Object dragTarget = anchoredDraggableState.getDragTarget();
        if (dragTarget != null) {
            return dragTarget;
        }
        float offset = anchoredDraggableState.getOffset();
        if (!Float.isNaN(offset)) {
            return anchoredDraggableState.computeTargetWithoutThresholds(offset, anchoredDraggableState.getCurrentValue());
        }
        return anchoredDraggableState.getCurrentValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOffset(float f) {
        this.offset.setFloatValue(f);
    }

    public final float getOffset() {
        return this.offset.getFloatValue();
    }

    public final float requireOffset() {
        if (Float.isNaN(getOffset())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
        }
        return getOffset();
    }

    public final boolean isAnimationRunning() {
        return getDragTarget() != null;
    }

    public final float getProgress() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final float progress_delegate$lambda$7(AnchoredDraggableState anchoredDraggableState) {
        float positionOf = anchoredDraggableState.getAnchors().positionOf(anchoredDraggableState.getCurrentValue());
        float positionOf2 = anchoredDraggableState.getAnchors().positionOf(anchoredDraggableState.getClosestValue$material()) - positionOf;
        float abs = Math.abs(positionOf2);
        if (Float.isNaN(abs) || abs <= 1.0E-6f) {
            return 1.0f;
        }
        float requireOffset = (anchoredDraggableState.requireOffset() - positionOf) / positionOf2;
        if (requireOffset < 1.0E-6f) {
            return 0.0f;
        }
        if (requireOffset > 0.999999f) {
            return 1.0f;
        }
        return requireOffset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLastVelocity(float f) {
        this.lastVelocity.setFloatValue(f);
    }

    public final float getLastVelocity() {
        return this.lastVelocity.getFloatValue();
    }

    private final T getDragTarget() {
        return this.dragTarget.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragTarget(T t) {
        this.dragTarget.setValue(t);
    }

    private final void setAnchors(DraggableAnchors<T> draggableAnchors) {
        this.anchors.setValue(draggableAnchors);
    }

    public final DraggableAnchors<T> getAnchors() {
        return (DraggableAnchors) this.anchors.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$default(AnchoredDraggableState anchoredDraggableState, DraggableAnchors draggableAnchors, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            if (!Float.isNaN(anchoredDraggableState.getOffset())) {
                obj = draggableAnchors.closestAnchor(anchoredDraggableState.getOffset());
                if (obj == null) {
                    obj = anchoredDraggableState.getTargetValue();
                }
            } else {
                obj = anchoredDraggableState.getTargetValue();
            }
        }
        anchoredDraggableState.updateAnchors(draggableAnchors, obj);
    }

    public final void updateAnchors(DraggableAnchors<T> newAnchors, T newTarget) {
        if (Intrinsics.areEqual(getAnchors(), newAnchors)) {
            return;
        }
        setAnchors(newAnchors);
        if (trySnapTo(newTarget)) {
            return;
        }
        setDragTarget(newTarget);
    }

    public final Object settle(float f, Continuation<? super Unit> continuation) {
        T currentValue = getCurrentValue();
        T computeTarget = computeTarget(requireOffset(), currentValue, f);
        if (this.confirmValueChange.invoke(computeTarget).booleanValue()) {
            Object animateTo = AnchoredDraggableKt.animateTo(this, computeTarget, f, continuation);
            return animateTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo : Unit.INSTANCE;
        }
        Object animateTo2 = AnchoredDraggableKt.animateTo(this, currentValue, f, continuation);
        return animateTo2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo2 : Unit.INSTANCE;
    }

    private final T computeTarget(float offset, T currentValue, float velocity) {
        DraggableAnchors<T> anchors = getAnchors();
        float positionOf = anchors.positionOf(currentValue);
        float floatValue = this.velocityThreshold.invoke().floatValue();
        if (positionOf != offset && !Float.isNaN(positionOf)) {
            if (positionOf < offset) {
                if (velocity >= floatValue) {
                    T closestAnchor = anchors.closestAnchor(offset, true);
                    Intrinsics.checkNotNull(closestAnchor);
                    return closestAnchor;
                }
                T closestAnchor2 = anchors.closestAnchor(offset, true);
                Intrinsics.checkNotNull(closestAnchor2);
                if (offset >= Math.abs(positionOf + Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(anchors.positionOf(closestAnchor2) - positionOf))).floatValue()))) {
                    return closestAnchor2;
                }
            } else {
                if (velocity <= (-floatValue)) {
                    T closestAnchor3 = anchors.closestAnchor(offset, false);
                    Intrinsics.checkNotNull(closestAnchor3);
                    return closestAnchor3;
                }
                T closestAnchor4 = anchors.closestAnchor(offset, false);
                Intrinsics.checkNotNull(closestAnchor4);
                float abs = Math.abs(positionOf - Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(positionOf - anchors.positionOf(closestAnchor4)))).floatValue()));
                if (offset >= 0.0f ? offset <= abs : Math.abs(offset) >= abs) {
                    return closestAnchor4;
                }
            }
        }
        return currentValue;
    }

    private final T computeTargetWithoutThresholds(float offset, T currentValue) {
        DraggableAnchors<T> anchors = getAnchors();
        float positionOf = anchors.positionOf(currentValue);
        if (positionOf != offset && !Float.isNaN(positionOf)) {
            if (positionOf < offset) {
                T closestAnchor = anchors.closestAnchor(offset, true);
                if (closestAnchor != null) {
                    return closestAnchor;
                }
            } else {
                T closestAnchor2 = anchors.closestAnchor(offset, false);
                if (closestAnchor2 != null) {
                    return closestAnchor2;
                }
            }
        }
        return currentValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object anchoredDrag(MutatePriority mutatePriority, Function3<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        AnchoredDraggableState$anchoredDrag$1 anchoredDraggableState$anchoredDrag$1;
        int i;
        T closestAnchor;
        try {
            if (continuation instanceof AnchoredDraggableState$anchoredDrag$1) {
                anchoredDraggableState$anchoredDrag$1 = (AnchoredDraggableState$anchoredDrag$1) continuation;
                if ((anchoredDraggableState$anchoredDrag$1.label & Integer.MIN_VALUE) != 0) {
                    anchoredDraggableState$anchoredDrag$1.label -= Integer.MIN_VALUE;
                    Object obj = anchoredDraggableState$anchoredDrag$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anchoredDraggableState$anchoredDrag$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        InternalMutatorMutex internalMutatorMutex = this.dragMutex;
                        AnchoredDraggableState$anchoredDrag$2 anchoredDraggableState$anchoredDrag$2 = new AnchoredDraggableState$anchoredDrag$2(this, function3, null);
                        anchoredDraggableState$anchoredDrag$1.label = 1;
                        if (internalMutatorMutex.mutate(mutatePriority, anchoredDraggableState$anchoredDrag$2, anchoredDraggableState$anchoredDrag$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    if (closestAnchor != null && Math.abs(getOffset() - getAnchors().positionOf(closestAnchor)) <= 0.5f && this.confirmValueChange.invoke(closestAnchor).booleanValue()) {
                        setCurrentValue(closestAnchor);
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            if (closestAnchor != null) {
                setCurrentValue(closestAnchor);
            }
            return Unit.INSTANCE;
        } finally {
            closestAnchor = getAnchors().closestAnchor(getOffset());
            if (closestAnchor != null && Math.abs(getOffset() - getAnchors().positionOf(closestAnchor)) <= 0.5f && this.confirmValueChange.invoke(closestAnchor).booleanValue()) {
                setCurrentValue(closestAnchor);
            }
        }
        anchoredDraggableState$anchoredDrag$1 = new AnchoredDraggableState$anchoredDrag$1(this, continuation);
        Object obj2 = anchoredDraggableState$anchoredDrag$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anchoredDraggableState$anchoredDrag$1.label;
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, Function3 function3, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, function3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object anchoredDrag(T t, MutatePriority mutatePriority, Function4<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function4, Continuation<? super Unit> continuation) {
        AnchoredDraggableState$anchoredDrag$3 anchoredDraggableState$anchoredDrag$3;
        int i;
        T closestAnchor;
        try {
            if (continuation instanceof AnchoredDraggableState$anchoredDrag$3) {
                anchoredDraggableState$anchoredDrag$3 = (AnchoredDraggableState$anchoredDrag$3) continuation;
                if ((anchoredDraggableState$anchoredDrag$3.label & Integer.MIN_VALUE) != 0) {
                    anchoredDraggableState$anchoredDrag$3.label -= Integer.MIN_VALUE;
                    Object obj = anchoredDraggableState$anchoredDrag$3.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anchoredDraggableState$anchoredDrag$3.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (getAnchors().hasAnchorFor(t)) {
                            InternalMutatorMutex internalMutatorMutex = this.dragMutex;
                            AnchoredDraggableState$anchoredDrag$4 anchoredDraggableState$anchoredDrag$4 = new AnchoredDraggableState$anchoredDrag$4(this, t, function4, null);
                            anchoredDraggableState$anchoredDrag$3.label = 1;
                            if (internalMutatorMutex.mutate(mutatePriority, anchoredDraggableState$anchoredDrag$4, anchoredDraggableState$anchoredDrag$3) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            setCurrentValue(t);
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    if (closestAnchor != null && Math.abs(getOffset() - getAnchors().positionOf(closestAnchor)) <= 0.5f && this.confirmValueChange.invoke(closestAnchor).booleanValue()) {
                        setCurrentValue(closestAnchor);
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            if (closestAnchor != null) {
                setCurrentValue(closestAnchor);
            }
            return Unit.INSTANCE;
        } finally {
            setDragTarget(null);
            closestAnchor = getAnchors().closestAnchor(getOffset());
            if (closestAnchor != null && Math.abs(getOffset() - getAnchors().positionOf(closestAnchor)) <= 0.5f && this.confirmValueChange.invoke(closestAnchor).booleanValue()) {
                setCurrentValue(closestAnchor);
            }
        }
        anchoredDraggableState$anchoredDrag$3 = new AnchoredDraggableState$anchoredDrag$3(this, continuation);
        Object obj2 = anchoredDraggableState$anchoredDrag$3.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anchoredDraggableState$anchoredDrag$3.label;
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, Function4 function4, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, function4, continuation);
    }

    public final float newOffsetForDelta$material(float delta) {
        return RangesKt.coerceIn((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + delta, getAnchors().minAnchor(), getAnchors().maxAnchor());
    }

    public final float dispatchRawDelta(float delta) {
        float newOffsetForDelta$material = newOffsetForDelta$material(delta);
        float offset = Float.isNaN(getOffset()) ? 0.0f : getOffset();
        setOffset(newOffsetForDelta$material);
        return newOffsetForDelta$material - offset;
    }

    private final boolean trySnapTo(final T targetValue) {
        return this.dragMutex.tryMutate(new Function0() { // from class: androidx.compose.material.AnchoredDraggableState$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit trySnapTo$lambda$9;
                trySnapTo$lambda$9 = AnchoredDraggableState.trySnapTo$lambda$9(AnchoredDraggableState.this, targetValue);
                return trySnapTo$lambda$9;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit trySnapTo$lambda$9(AnchoredDraggableState anchoredDraggableState, Object obj) {
        AnchoredDragScope anchoredDragScope = anchoredDraggableState.anchoredDragScope;
        float positionOf = anchoredDraggableState.getAnchors().positionOf(obj);
        if (!Float.isNaN(positionOf)) {
            AnchoredDragScope.dragTo$default(anchoredDragScope, positionOf, 0.0f, 2, null);
            anchoredDraggableState.setDragTarget(null);
        }
        anchoredDraggableState.setCurrentValue(obj);
        return Unit.INSTANCE;
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jw\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\b\b\u0001\u0010\u0007*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\r0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n0\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/material/AnchoredDraggableState$Companion;", "", "<init>", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/AnchoredDraggableState;", "T", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "Lkotlin/Function1;", "", "positionalThreshold", "Lkotlin/ParameterName;", "name", "distance", "velocityThreshold", "Lkotlin/Function0;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(final AnimationSpec<Float> animationSpec, final Function1<? super T, Boolean> confirmValueChange, final Function1<? super Float, Float> positionalThreshold, final Function0<Float> velocityThreshold) {
            return SaverKt.Saver(new Function2() { // from class: androidx.compose.material.AnchoredDraggableState$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Object Saver$lambda$0;
                    Saver$lambda$0 = AnchoredDraggableState.Companion.Saver$lambda$0((SaverScope) obj, (AnchoredDraggableState) obj2);
                    return Saver$lambda$0;
                }
            }, new Function1() { // from class: androidx.compose.material.AnchoredDraggableState$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    AnchoredDraggableState Saver$lambda$1;
                    Saver$lambda$1 = AnchoredDraggableState.Companion.Saver$lambda$1(Function1.this, velocityThreshold, animationSpec, confirmValueChange, obj);
                    return Saver$lambda$1;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object Saver$lambda$0(SaverScope saverScope, AnchoredDraggableState anchoredDraggableState) {
            return anchoredDraggableState.getCurrentValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AnchoredDraggableState Saver$lambda$1(Function1 function1, Function0 function0, AnimationSpec animationSpec, Function1 function12, Object obj) {
            return new AnchoredDraggableState(obj, function1, function0, animationSpec, function12);
        }
    }
}
