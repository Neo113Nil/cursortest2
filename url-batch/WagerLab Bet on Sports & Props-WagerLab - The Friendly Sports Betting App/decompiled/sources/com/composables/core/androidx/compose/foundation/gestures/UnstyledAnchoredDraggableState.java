package com.composables.core.androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import com.composables.core.androidx.compose.foundation.gestures.AnchoredDragScope;
import com.composables.core.androidx.compose.foundation.gestures.UnstyledAnchoredDraggableState;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
@Metadata(d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n*\u0001]\b\u0007\u0018\u0000 q*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001qB\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\u0004\b\u0013\u0010\u0014B\u0091\u0001\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\u0004\b\u0013\u0010\u0017J\u0006\u0010:\u001a\u00020\u0006J\u001d\u0010=\u001a\u00020\u00062\u0006\u0010>\u001a\u00028\u00002\u0006\u0010?\u001a\u00028\u0000H\u0007¢\u0006\u0002\u0010@J#\u0010R\u001a\u00020S2\f\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\b\b\u0002\u0010U\u001a\u00028\u0000¢\u0006\u0002\u0010VJ\u0016\u0010W\u001a\u00020\u00062\u0006\u0010X\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010YJ%\u0010Z\u001a\u00028\u00002\u0006\u00103\u001a\u00020\u00062\u0006\u0010$\u001a\u00028\u00002\u0006\u0010X\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010[J\\\u0010_\u001a\u00020S2\b\b\u0002\u0010`\u001a\u00020a2B\u0010b\u001a>\b\u0001\u0012\u0004\u0012\u00020d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0e\u0012\u0006\u0012\u0004\u0018\u00010\u00020c¢\u0006\u0002\bfH\u0086@¢\u0006\u0002\u0010gJy\u0010_\u001a\u00020S2\u0006\u0010/\u001a\u00028\u00002\b\b\u0002\u0010`\u001a\u00020a2W\u0010b\u001aS\b\u0001\u0012\u0004\u0012\u00020d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(i\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(/\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0e\u0012\u0006\u0012\u0004\u0018\u00010\u00020h¢\u0006\u0002\bfH\u0086@¢\u0006\u0002\u0010jJ\u0015\u0010k\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u0006H\u0000¢\u0006\u0002\bmJ\u000e\u0010n\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u0006J\u0015\u0010o\u001a\u00020\u00122\u0006\u0010/\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010pR/\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR/\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010$\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R+\u0010+\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010*\u001a\u0004\b,\u0010&\"\u0004\b-\u0010(R\u001b\u0010/\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b0\u0010&R+\u00103\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0011\u0010;\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b;\u0010<R!\u0010=\u001a\u00020\u00068GX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bD\u00102\u0012\u0004\bA\u0010B\u001a\u0004\bC\u00105R+\u0010E\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bH\u00109\u001a\u0004\bF\u00105\"\u0004\bG\u00107R/\u0010I\u001a\u0004\u0018\u00018\u00002\b\u0010#\u001a\u0004\u0018\u00018\u00008@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010*\u001a\u0004\bJ\u0010&\"\u0004\bK\u0010(R7\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010*\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0010\u0010\\\u001a\u00020]X\u0082\u0004¢\u0006\u0004\n\u0002\u0010^¨\u0006r"}, d2 = {"Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledAnchoredDraggableState;", "T", "", "initialValue", "positionalThreshold", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "velocityThreshold", "Lkotlin/Function0;", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "confirmValueChange", "newValue", "", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;)V", "anchors", "Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledDraggableAnchors;", "(Ljava/lang/Object;Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledDraggableAnchors;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;)V", "getPositionalThreshold$core_release", "()Lkotlin/jvm/functions/Function1;", "getVelocityThreshold$core_release", "()Lkotlin/jvm/functions/Function0;", "getSnapAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "getDecayAnimationSpec", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "getConfirmValueChange$core_release", "dragMutex", "Landroidx/compose/foundation/MutatorMutex;", "<set-?>", "currentValue", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue$delegate", "Landroidx/compose/runtime/MutableState;", "settledValue", "getSettledValue", "setSettledValue", "settledValue$delegate", "targetValue", "getTargetValue", "targetValue$delegate", "Landroidx/compose/runtime/State;", "offset", "getOffset", "()F", "setOffset", "(F)V", "offset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "requireOffset", "isAnimationRunning", "()Z", "progress", "from", "to", "(Ljava/lang/Object;Ljava/lang/Object;)F", "getProgress$annotations", "()V", "getProgress", "progress$delegate", "lastVelocity", "getLastVelocity", "setLastVelocity", "lastVelocity$delegate", "dragTarget", "getDragTarget$core_release", "setDragTarget$core_release", "dragTarget$delegate", "getAnchors", "()Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledDraggableAnchors;", "setAnchors", "(Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledDraggableAnchors;)V", "anchors$delegate", "updateAnchors", "", "newAnchors", "newTarget", "(Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledDraggableAnchors;Ljava/lang/Object;)V", "settle", "velocity", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computeTarget", "(FLjava/lang/Object;F)Ljava/lang/Object;", "anchoredDragScope", "com/composables/core/androidx/compose/foundation/gestures/UnstyledAnchoredDraggableState$anchoredDragScope$1", "Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledAnchoredDraggableState$anchoredDragScope$1;", "anchoredDrag", "dragPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function3;", "Lcom/composables/core/androidx/compose/foundation/gestures/AnchoredDragScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function4;", "anchor", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newOffsetForDelta", "delta", "newOffsetForDelta$core_release", "dispatchRawDelta", "trySnapTo", "(Ljava/lang/Object;)Z", "Companion", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnstyledAnchoredDraggableState<T> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final UnstyledAnchoredDraggableState$anchoredDragScope$1 anchoredDragScope;

    /* renamed from: anchors$delegate, reason: from kotlin metadata */
    private final MutableState anchors;
    private final Function1<T, Boolean> confirmValueChange;

    /* renamed from: currentValue$delegate, reason: from kotlin metadata */
    private final MutableState currentValue;
    private final DecayAnimationSpec<Float> decayAnimationSpec;
    private final MutatorMutex dragMutex;

    /* renamed from: dragTarget$delegate, reason: from kotlin metadata */
    private final MutableState dragTarget;

    /* renamed from: lastVelocity$delegate, reason: from kotlin metadata */
    private final MutableFloatState lastVelocity;

    /* renamed from: offset$delegate, reason: from kotlin metadata */
    private final MutableFloatState offset;
    private final Function1<Float, Float> positionalThreshold;

    /* renamed from: progress$delegate, reason: from kotlin metadata */
    private final State progress;

    /* renamed from: settledValue$delegate, reason: from kotlin metadata */
    private final MutableState settledValue;
    private final AnimationSpec<Float> snapAnimationSpec;

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

    @Deprecated(message = "Use the progress function to query the progress between two specified anchors.", replaceWith = @ReplaceWith(expression = "progress(state.settledValue, state.targetValue)", imports = {}))
    public static /* synthetic */ void getProgress$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnstyledAnchoredDraggableState(T t, Function1<? super Float, Float> positionalThreshold, Function0<Float> velocityThreshold, AnimationSpec<Float> snapAnimationSpec, DecayAnimationSpec<Float> decayAnimationSpec, Function1<? super T, Boolean> confirmValueChange) {
        Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
        Intrinsics.checkNotNullParameter(velocityThreshold, "velocityThreshold");
        Intrinsics.checkNotNullParameter(snapAnimationSpec, "snapAnimationSpec");
        Intrinsics.checkNotNullParameter(decayAnimationSpec, "decayAnimationSpec");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        this.positionalThreshold = positionalThreshold;
        this.velocityThreshold = velocityThreshold;
        this.snapAnimationSpec = snapAnimationSpec;
        this.decayAnimationSpec = decayAnimationSpec;
        this.confirmValueChange = confirmValueChange;
        this.dragMutex = new MutatorMutex();
        this.currentValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.settledValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.targetValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.composables.core.androidx.compose.foundation.gestures.UnstyledAnchoredDraggableState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object targetValue_delegate$lambda$3;
                targetValue_delegate$lambda$3 = UnstyledAnchoredDraggableState.targetValue_delegate$lambda$3(UnstyledAnchoredDraggableState.this);
                return targetValue_delegate$lambda$3;
            }
        });
        this.offset = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        this.progress = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0() { // from class: com.composables.core.androidx.compose.foundation.gestures.UnstyledAnchoredDraggableState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                float progress_delegate$lambda$5;
                progress_delegate$lambda$5 = UnstyledAnchoredDraggableState.progress_delegate$lambda$5(UnstyledAnchoredDraggableState.this);
                return Float.valueOf(progress_delegate$lambda$5);
            }
        });
        this.lastVelocity = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragTarget = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnchoredDraggableKt.emptyDraggableAnchors(), null, 2, null);
        this.anchoredDragScope = new UnstyledAnchoredDraggableState$anchoredDragScope$1(this);
    }

    public final Function1<Float, Float> getPositionalThreshold$core_release() {
        return this.positionalThreshold;
    }

    public final Function0<Float> getVelocityThreshold$core_release() {
        return this.velocityThreshold;
    }

    public final AnimationSpec<Float> getSnapAnimationSpec() {
        return this.snapAnimationSpec;
    }

    public final DecayAnimationSpec<Float> getDecayAnimationSpec() {
        return this.decayAnimationSpec;
    }

    public /* synthetic */ UnstyledAnchoredDraggableState(Object obj, Function1 function1, Function0 function0, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function1, function0, animationSpec, decayAnimationSpec, (i & 32) != 0 ? new Function1() { // from class: com.composables.core.androidx.compose.foundation.gestures.UnstyledAnchoredDraggableState$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                boolean _init_$lambda$0;
                _init_$lambda$0 = UnstyledAnchoredDraggableState._init_$lambda$0(obj2);
                return Boolean.valueOf(_init_$lambda$0);
            }
        } : function12);
    }

    public final Function1<T, Boolean> getConfirmValueChange$core_release() {
        return this.confirmValueChange;
    }

    public /* synthetic */ UnstyledAnchoredDraggableState(Object obj, UnstyledDraggableAnchors unstyledDraggableAnchors, Function1 function1, Function0 function0, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, unstyledDraggableAnchors, function1, function0, animationSpec, decayAnimationSpec, (i & 64) != 0 ? new Function1() { // from class: com.composables.core.androidx.compose.foundation.gestures.UnstyledAnchoredDraggableState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                boolean _init_$lambda$1;
                _init_$lambda$1 = UnstyledAnchoredDraggableState._init_$lambda$1(obj2);
                return Boolean.valueOf(_init_$lambda$1);
            }
        } : function12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UnstyledAnchoredDraggableState(T t, UnstyledDraggableAnchors<T> anchors, Function1<? super Float, Float> positionalThreshold, Function0<Float> velocityThreshold, AnimationSpec<Float> snapAnimationSpec, DecayAnimationSpec<Float> decayAnimationSpec, Function1<? super T, Boolean> confirmValueChange) {
        this(t, positionalThreshold, velocityThreshold, snapAnimationSpec, decayAnimationSpec, confirmValueChange);
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
        Intrinsics.checkNotNullParameter(velocityThreshold, "velocityThreshold");
        Intrinsics.checkNotNullParameter(snapAnimationSpec, "snapAnimationSpec");
        Intrinsics.checkNotNullParameter(decayAnimationSpec, "decayAnimationSpec");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        setAnchors(anchors);
        trySnapTo(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t) {
        this.currentValue.setValue(t);
    }

    public final T getCurrentValue() {
        return this.currentValue.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSettledValue(T t) {
        this.settledValue.setValue(t);
    }

    public final T getSettledValue() {
        return this.settledValue.getValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object targetValue_delegate$lambda$3(UnstyledAnchoredDraggableState unstyledAnchoredDraggableState) {
        Object dragTarget$core_release = unstyledAnchoredDraggableState.getDragTarget$core_release();
        if (dragTarget$core_release != null) {
            return dragTarget$core_release;
        }
        if (!Float.isNaN(unstyledAnchoredDraggableState.getOffset())) {
            T closestAnchor = unstyledAnchoredDraggableState.getAnchors().closestAnchor(unstyledAnchoredDraggableState.getOffset());
            return closestAnchor == null ? unstyledAnchoredDraggableState.getCurrentValue() : closestAnchor;
        }
        return unstyledAnchoredDraggableState.getCurrentValue();
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
        return getDragTarget$core_release() != null;
    }

    public final float progress(T from, T to) {
        float positionOf = getAnchors().positionOf(from);
        float positionOf2 = getAnchors().positionOf(to);
        float coerceIn = (RangesKt.coerceIn(getOffset(), Math.min(positionOf, positionOf2), Math.max(positionOf, positionOf2)) - positionOf) / (positionOf2 - positionOf);
        if (Float.isNaN(coerceIn)) {
            return 1.0f;
        }
        if (coerceIn < 1.0E-6f) {
            return 0.0f;
        }
        if (coerceIn > 0.999999f) {
            return 1.0f;
        }
        return Math.abs(coerceIn);
    }

    public final float getProgress() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final float progress_delegate$lambda$5(UnstyledAnchoredDraggableState unstyledAnchoredDraggableState) {
        float positionOf = unstyledAnchoredDraggableState.getAnchors().positionOf(unstyledAnchoredDraggableState.getSettledValue());
        float positionOf2 = unstyledAnchoredDraggableState.getAnchors().positionOf(unstyledAnchoredDraggableState.getTargetValue()) - positionOf;
        float abs = Math.abs(positionOf2);
        if (Float.isNaN(abs) || abs <= 1.0E-6f) {
            return 1.0f;
        }
        float requireOffset = (unstyledAnchoredDraggableState.requireOffset() - positionOf) / positionOf2;
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

    public final T getDragTarget$core_release() {
        return this.dragTarget.getValue();
    }

    public final void setDragTarget$core_release(T t) {
        this.dragTarget.setValue(t);
    }

    private final void setAnchors(UnstyledDraggableAnchors<T> unstyledDraggableAnchors) {
        this.anchors.setValue(unstyledDraggableAnchors);
    }

    public final UnstyledDraggableAnchors<T> getAnchors() {
        return (UnstyledDraggableAnchors) this.anchors.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$default(UnstyledAnchoredDraggableState unstyledAnchoredDraggableState, UnstyledDraggableAnchors unstyledDraggableAnchors, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            if (!Float.isNaN(unstyledAnchoredDraggableState.getOffset())) {
                obj = unstyledDraggableAnchors.closestAnchor(unstyledAnchoredDraggableState.getOffset());
                if (obj == null) {
                    obj = unstyledAnchoredDraggableState.getTargetValue();
                }
            } else {
                obj = unstyledAnchoredDraggableState.getTargetValue();
            }
        }
        unstyledAnchoredDraggableState.updateAnchors(unstyledDraggableAnchors, obj);
    }

    public final void updateAnchors(UnstyledDraggableAnchors<T> newAnchors, T newTarget) {
        Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
        if (Intrinsics.areEqual(getAnchors(), newAnchors)) {
            return;
        }
        setAnchors(newAnchors);
        if (trySnapTo(newTarget)) {
            return;
        }
        setDragTarget$core_release(newTarget);
    }

    public final Object settle(float f, Continuation<? super Float> continuation) {
        T currentValue = getCurrentValue();
        T computeTarget = computeTarget(requireOffset(), currentValue, f);
        if (this.confirmValueChange.invoke(computeTarget).booleanValue()) {
            return AnchoredDraggableKt.animateToWithDecay(this, computeTarget, f, continuation);
        }
        return AnchoredDraggableKt.animateToWithDecay(this, currentValue, f, continuation);
    }

    private final T computeTarget(float offset, T currentValue, float velocity) {
        UnstyledDraggableAnchors<T> anchors = getAnchors();
        float positionOf = anchors.positionOf(currentValue);
        float floatValue = this.velocityThreshold.invoke().floatValue();
        if (positionOf != offset && !Float.isNaN(positionOf)) {
            if (Math.abs(velocity) >= Math.abs(floatValue)) {
                T closestAnchor = anchors.closestAnchor(offset, Math.signum(velocity) > 0.0f);
                Intrinsics.checkNotNull(closestAnchor);
                return closestAnchor;
            }
            T closestAnchor2 = anchors.closestAnchor(offset, offset - positionOf > 0.0f);
            Intrinsics.checkNotNull(closestAnchor2);
            if (Math.abs(positionOf - offset) > Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(positionOf - anchors.positionOf(closestAnchor2)))).floatValue())) {
                return closestAnchor2;
            }
        }
        return currentValue;
    }

    public static /* synthetic */ Object anchoredDrag$default(UnstyledAnchoredDraggableState unstyledAnchoredDraggableState, MutatePriority mutatePriority, Function3 function3, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return unstyledAnchoredDraggableState.anchoredDrag(mutatePriority, function3, continuation);
    }

    public final Object anchoredDrag(MutatePriority mutatePriority, Function3<? super AnchoredDragScope, ? super UnstyledDraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object mutate = this.dragMutex.mutate(mutatePriority, new UnstyledAnchoredDraggableState$anchoredDrag$2(this, function3, null), continuation);
        return mutate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mutate : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object anchoredDrag(T t, MutatePriority mutatePriority, Function4<? super AnchoredDragScope, ? super UnstyledDraggableAnchors<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function4, Continuation<? super Unit> continuation) {
        UnstyledAnchoredDraggableState$anchoredDrag$3 unstyledAnchoredDraggableState$anchoredDrag$3;
        int i;
        try {
            if (continuation instanceof UnstyledAnchoredDraggableState$anchoredDrag$3) {
                unstyledAnchoredDraggableState$anchoredDrag$3 = (UnstyledAnchoredDraggableState$anchoredDrag$3) continuation;
                if ((unstyledAnchoredDraggableState$anchoredDrag$3.label & Integer.MIN_VALUE) != 0) {
                    unstyledAnchoredDraggableState$anchoredDrag$3.label -= Integer.MIN_VALUE;
                    Object obj = unstyledAnchoredDraggableState$anchoredDrag$3.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = unstyledAnchoredDraggableState$anchoredDrag$3.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (getAnchors().hasAnchorFor(t)) {
                            MutatorMutex mutatorMutex = this.dragMutex;
                            UnstyledAnchoredDraggableState$anchoredDrag$4 unstyledAnchoredDraggableState$anchoredDrag$4 = new UnstyledAnchoredDraggableState$anchoredDrag$4(this, t, function4, null);
                            unstyledAnchoredDraggableState$anchoredDrag$3.label = 1;
                            if (mutatorMutex.mutate(mutatePriority, unstyledAnchoredDraggableState$anchoredDrag$4, unstyledAnchoredDraggableState$anchoredDrag$3) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (this.confirmValueChange.invoke(t).booleanValue()) {
                                setSettledValue(t);
                                setCurrentValue(t);
                            }
                            return Unit.INSTANCE;
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
            if (i != 0) {
            }
            return Unit.INSTANCE;
        } finally {
            setDragTarget$core_release(null);
        }
        unstyledAnchoredDraggableState$anchoredDrag$3 = new UnstyledAnchoredDraggableState$anchoredDrag$3(this, continuation);
        Object obj2 = unstyledAnchoredDraggableState$anchoredDrag$3.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = unstyledAnchoredDraggableState$anchoredDrag$3.label;
    }

    public static /* synthetic */ Object anchoredDrag$default(UnstyledAnchoredDraggableState unstyledAnchoredDraggableState, Object obj, MutatePriority mutatePriority, Function4 function4, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return unstyledAnchoredDraggableState.anchoredDrag(obj, mutatePriority, function4, continuation);
    }

    public final float newOffsetForDelta$core_release(float delta) {
        return RangesKt.coerceIn((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + delta, getAnchors().minAnchor(), getAnchors().maxAnchor());
    }

    public final float dispatchRawDelta(float delta) {
        float newOffsetForDelta$core_release = newOffsetForDelta$core_release(delta);
        float offset = Float.isNaN(getOffset()) ? 0.0f : getOffset();
        setOffset(newOffsetForDelta$core_release);
        return newOffsetForDelta$core_release - offset;
    }

    private final boolean trySnapTo(T targetValue) {
        MutatorMutex mutatorMutex = this.dragMutex;
        boolean tryLock = mutatorMutex.tryLock();
        if (!tryLock) {
            return tryLock;
        }
        try {
            UnstyledAnchoredDraggableState$anchoredDragScope$1 unstyledAnchoredDraggableState$anchoredDragScope$1 = this.anchoredDragScope;
            float positionOf = getAnchors().positionOf(targetValue);
            if (!Float.isNaN(positionOf)) {
                AnchoredDragScope.DefaultImpls.dragTo$default(unstyledAnchoredDraggableState$anchoredDragScope$1, positionOf, 0.0f, 2, null);
                setDragTarget$core_release(null);
            }
            setCurrentValue(targetValue);
            setSettledValue(targetValue);
            return tryLock;
        } finally {
            mutatorMutex.unlock();
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0085\u0001\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\b\b\u0001\u0010\u0007*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00150\u000e¨\u0006\u0016"}, d2 = {"Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledAnchoredDraggableState$Companion;", "", "<init>", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledAnchoredDraggableState;", "T", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "positionalThreshold", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "distance", "velocityThreshold", "Lkotlin/Function0;", "confirmValueChange", "", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean Saver$lambda$0(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return true;
        }

        private Companion() {
        }

        public static /* synthetic */ Saver Saver$default(Companion companion, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, Function1 function1, Function0 function0, Function1 function12, int i, Object obj) {
            if ((i & 16) != 0) {
                function12 = new Function1() { // from class: com.composables.core.androidx.compose.foundation.gestures.UnstyledAnchoredDraggableState$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        boolean Saver$lambda$0;
                        Saver$lambda$0 = UnstyledAnchoredDraggableState.Companion.Saver$lambda$0(obj2);
                        return Boolean.valueOf(Saver$lambda$0);
                    }
                };
            }
            return companion.Saver(animationSpec, decayAnimationSpec, function1, function0, function12);
        }

        public final <T> Saver<UnstyledAnchoredDraggableState<T>, T> Saver(final AnimationSpec<Float> snapAnimationSpec, final DecayAnimationSpec<Float> decayAnimationSpec, final Function1<? super Float, Float> positionalThreshold, final Function0<Float> velocityThreshold, final Function1<? super T, Boolean> confirmValueChange) {
            Intrinsics.checkNotNullParameter(snapAnimationSpec, "snapAnimationSpec");
            Intrinsics.checkNotNullParameter(decayAnimationSpec, "decayAnimationSpec");
            Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
            Intrinsics.checkNotNullParameter(velocityThreshold, "velocityThreshold");
            Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
            return SaverKt.Saver(new Function2() { // from class: com.composables.core.androidx.compose.foundation.gestures.UnstyledAnchoredDraggableState$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Object Saver$lambda$1;
                    Saver$lambda$1 = UnstyledAnchoredDraggableState.Companion.Saver$lambda$1((SaverScope) obj, (UnstyledAnchoredDraggableState) obj2);
                    return Saver$lambda$1;
                }
            }, new Function1() { // from class: com.composables.core.androidx.compose.foundation.gestures.UnstyledAnchoredDraggableState$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    UnstyledAnchoredDraggableState Saver$lambda$2;
                    Saver$lambda$2 = UnstyledAnchoredDraggableState.Companion.Saver$lambda$2(Function1.this, velocityThreshold, snapAnimationSpec, decayAnimationSpec, confirmValueChange, obj);
                    return Saver$lambda$2;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object Saver$lambda$1(SaverScope Saver, UnstyledAnchoredDraggableState it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getCurrentValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UnstyledAnchoredDraggableState Saver$lambda$2(Function1 function1, Function0 function0, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, Function1 function12, Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new UnstyledAnchoredDraggableState(it, function1, function0, animationSpec, decayAnimationSpec, function12);
        }
    }
}
