package com.composables.core.androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.composables.core.androidx.collection.MutableObjectFloatMap;
import com.composables.core.androidx.collection.ObjectFloatMap;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u001aN\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0006\u001aT\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\f\u001a\u00020\u0006H\u0000\u001a5\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0013\"\b\b\u0000\u0010\u0002*\u00020\u00142\u001d\u0010\u0015\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0010¢\u0006\u0002\b\u0018\u001a&\u0010\u0019\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u001a\u001a\u0002H\u0002H\u0086@¢\u0006\u0002\u0010\u001b\u001aD\u0010\u001c\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00132\u0006\u0010\"\u001a\u0002H\u0002H\u0082@¢\u0006\u0002\u0010#\u001a&\u0010\u001c\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u001a\u001a\u0002H\u0002H\u0086@¢\u0006\u0002\u0010\u001b\u001a.\u0010$\u001a\u00020\u001e\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u001a\u001a\u0002H\u00022\u0006\u0010\u001d\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010%\u001a\u0014\u0010&\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010'\u001a\u00020\u001eH\u0002\u001aF\u0010(\u001a\u00020\u0017\"\u0004\b\u0000\u0010)2\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H)0+2\"\u0010,\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170.\u0012\u0006\u0012\u0004\u0018\u00010\u00140-H\u0082@¢\u0006\u0002\u0010/\u001a\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002H\u000201\"\u0004\b\u0000\u0010\u0002H\u0002\u001a\u0018\u00102\u001a\u00020\u001e\"\u0004\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304H\u0002\u001a\u0018\u00105\u001a\u00020\u001e\"\u0004\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304H\u0002\u001a\u0017\u00107\u001a\u00020\u00172\f\u00108\u001a\b\u0012\u0004\u0012\u0002090+H\u0082\b\"\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0010X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"unstyledAnchoredDraggable", "Landroidx/compose/ui/Modifier;", "T", "state", "Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledAnchoredDraggableState;", "reverseDirection", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", ViewProps.ENABLED, "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "startDragImmediately", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "AlwaysDrag", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "UnstyledDraggableAnchors", "Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledDraggableAnchors;", "", "builder", "Lcom/composables/core/androidx/compose/foundation/gestures/DraggableAnchorsConfig;", "", "Lkotlin/ExtensionFunctionType;", "snapTo", "targetValue", "(Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledAnchoredDraggableState;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "velocity", "", "anchoredDragScope", "Lcom/composables/core/androidx/compose/foundation/gestures/AnchoredDragScope;", "anchors", "latestTarget", "(Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledAnchoredDraggableState;FLcom/composables/core/androidx/compose/foundation/gestures/AnchoredDragScope;Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledDraggableAnchors;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToWithDecay", "(Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledAnchoredDraggableState;Ljava/lang/Object;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coerceToTarget", TypedValues.AttributesType.S_TARGET, "restartable", "I", "inputs", "Lkotlin/Function0;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emptyDraggableAnchors", "Lcom/composables/core/androidx/compose/foundation/gestures/MapUnstyledDraggableAnchors;", "minValueOrNaN", "K", "Lcom/composables/core/androidx/collection/ObjectFloatMap;", "maxValueOrNaN", "DEBUG", "debugLog", "generateMsg", "", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnchoredDraggableKt {
    private static final Function1<PointerInputChange, Boolean> AlwaysDrag = new Function1() { // from class: com.composables.core.androidx.compose.foundation.gestures.AnchoredDraggableKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            boolean AlwaysDrag$lambda$0;
            AlwaysDrag$lambda$0 = AnchoredDraggableKt.AlwaysDrag$lambda$0((PointerInputChange) obj);
            return Boolean.valueOf(AlwaysDrag$lambda$0);
        }
    };
    private static final boolean DEBUG = false;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AlwaysDrag$lambda$0(PointerInputChange it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    private static final void debugLog(Function0<String> function0) {
    }

    public static /* synthetic */ Modifier unstyledAnchoredDraggable$default(Modifier modifier, UnstyledAnchoredDraggableState unstyledAnchoredDraggableState, boolean z, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            mutableInteractionSource = null;
        }
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 32) != 0) {
            z3 = unstyledAnchoredDraggableState.isAnimationRunning();
        }
        return unstyledAnchoredDraggable(modifier, unstyledAnchoredDraggableState, z, orientation, z4, mutableInteractionSource2, z3);
    }

    public static final <T> Modifier unstyledAnchoredDraggable(Modifier modifier, UnstyledAnchoredDraggableState<T> state, boolean z, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return modifier.then(new AnchoredDraggableElement(state, orientation, z2, Boolean.valueOf(z), mutableInteractionSource, z3, null));
    }

    public static /* synthetic */ Modifier unstyledAnchoredDraggable$default(Modifier modifier, UnstyledAnchoredDraggableState unstyledAnchoredDraggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        MutableInteractionSource mutableInteractionSource2 = (i & 8) != 0 ? null : mutableInteractionSource;
        OverscrollEffect overscrollEffect2 = (i & 16) != 0 ? null : overscrollEffect;
        if ((i & 32) != 0) {
            z2 = unstyledAnchoredDraggableState.isAnimationRunning();
        }
        return unstyledAnchoredDraggable(modifier, unstyledAnchoredDraggableState, orientation, z3, mutableInteractionSource2, overscrollEffect2, z2);
    }

    public static final <T> Modifier unstyledAnchoredDraggable(Modifier modifier, UnstyledAnchoredDraggableState<T> state, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return modifier.then(new AnchoredDraggableElement(state, orientation, z, null, mutableInteractionSource, z2, overscrollEffect));
    }

    public static final <T> UnstyledDraggableAnchors<T> UnstyledDraggableAnchors(Function1<? super DraggableAnchorsConfig<T>, Unit> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        builder.invoke(draggableAnchorsConfig);
        return new MapUnstyledDraggableAnchors(draggableAnchorsConfig.getAnchors$core_release());
    }

    public static final <T> Object snapTo(UnstyledAnchoredDraggableState<T> unstyledAnchoredDraggableState, T t, Continuation<? super Unit> continuation) {
        Object anchoredDrag$default = UnstyledAnchoredDraggableState.anchoredDrag$default(unstyledAnchoredDraggableState, t, null, new AnchoredDraggableKt$snapTo$2(null), continuation, 2, null);
        return anchoredDrag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? anchoredDrag$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object animateTo(UnstyledAnchoredDraggableState<T> unstyledAnchoredDraggableState, float f, final AnchoredDragScope anchoredDragScope, UnstyledDraggableAnchors<T> unstyledDraggableAnchors, T t, Continuation<? super Unit> continuation) {
        Object animate;
        float positionOf = unstyledDraggableAnchors.positionOf(t);
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = Float.isNaN(unstyledAnchoredDraggableState.getOffset()) ? 0.0f : unstyledAnchoredDraggableState.getOffset();
        return (Float.isNaN(positionOf) || floatRef.element == positionOf || (animate = SuspendAnimationKt.animate(floatRef.element, positionOf, f, unstyledAnchoredDraggableState.getSnapAnimationSpec(), new Function2() { // from class: com.composables.core.androidx.compose.foundation.gestures.AnchoredDraggableKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit animateTo$lambda$3$lambda$2;
                animateTo$lambda$3$lambda$2 = AnchoredDraggableKt.animateTo$lambda$3$lambda$2(AnchoredDragScope.this, floatRef, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                return animateTo$lambda$3$lambda$2;
            }
        }, continuation)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : animate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit animateTo$lambda$3$lambda$2(AnchoredDragScope anchoredDragScope, Ref.FloatRef floatRef, float f, float f2) {
        anchoredDragScope.dragTo(f, f2);
        floatRef.element = f;
        return Unit.INSTANCE;
    }

    public static final <T> Object animateTo(UnstyledAnchoredDraggableState<T> unstyledAnchoredDraggableState, T t, Continuation<? super Unit> continuation) {
        Object anchoredDrag$default = UnstyledAnchoredDraggableState.anchoredDrag$default(unstyledAnchoredDraggableState, t, null, new AnchoredDraggableKt$animateTo$4(unstyledAnchoredDraggableState, null), continuation, 2, null);
        return anchoredDrag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? anchoredDrag$default : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object animateToWithDecay(UnstyledAnchoredDraggableState<T> unstyledAnchoredDraggableState, T t, float f, Continuation<? super Float> continuation) {
        AnchoredDraggableKt$animateToWithDecay$1 anchoredDraggableKt$animateToWithDecay$1;
        int i;
        Ref.FloatRef floatRef;
        if (continuation instanceof AnchoredDraggableKt$animateToWithDecay$1) {
            anchoredDraggableKt$animateToWithDecay$1 = (AnchoredDraggableKt$animateToWithDecay$1) continuation;
            if ((anchoredDraggableKt$animateToWithDecay$1.label & Integer.MIN_VALUE) != 0) {
                anchoredDraggableKt$animateToWithDecay$1.label -= Integer.MIN_VALUE;
                AnchoredDraggableKt$animateToWithDecay$1 anchoredDraggableKt$animateToWithDecay$12 = anchoredDraggableKt$animateToWithDecay$1;
                Object obj = anchoredDraggableKt$animateToWithDecay$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anchoredDraggableKt$animateToWithDecay$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    floatRef2.element = f;
                    AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$2 = new AnchoredDraggableKt$animateToWithDecay$2(unstyledAnchoredDraggableState, f, floatRef2, null);
                    anchoredDraggableKt$animateToWithDecay$12.L$0 = floatRef2;
                    anchoredDraggableKt$animateToWithDecay$12.F$0 = f;
                    anchoredDraggableKt$animateToWithDecay$12.label = 1;
                    if (UnstyledAnchoredDraggableState.anchoredDrag$default(unstyledAnchoredDraggableState, t, null, anchoredDraggableKt$animateToWithDecay$2, anchoredDraggableKt$animateToWithDecay$12, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef = floatRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f = anchoredDraggableKt$animateToWithDecay$12.F$0;
                    floatRef = (Ref.FloatRef) anchoredDraggableKt$animateToWithDecay$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxFloat(f - floatRef.element);
            }
        }
        anchoredDraggableKt$animateToWithDecay$1 = new AnchoredDraggableKt$animateToWithDecay$1(continuation);
        AnchoredDraggableKt$animateToWithDecay$1 anchoredDraggableKt$animateToWithDecay$122 = anchoredDraggableKt$animateToWithDecay$1;
        Object obj2 = anchoredDraggableKt$animateToWithDecay$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anchoredDraggableKt$animateToWithDecay$122.label;
        if (i != 0) {
        }
        return Boxing.boxFloat(f - floatRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float coerceToTarget(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f2 > 0.0f ? RangesKt.coerceAtMost(f, f2) : RangesKt.coerceAtLeast(f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <I> Object restartable(Function0<? extends I> function0, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        AnchoredDraggableKt$restartable$1 anchoredDraggableKt$restartable$1;
        int i;
        if (continuation instanceof AnchoredDraggableKt$restartable$1) {
            anchoredDraggableKt$restartable$1 = (AnchoredDraggableKt$restartable$1) continuation;
            if ((anchoredDraggableKt$restartable$1.label & Integer.MIN_VALUE) != 0) {
                anchoredDraggableKt$restartable$1.label -= Integer.MIN_VALUE;
                Object obj = anchoredDraggableKt$restartable$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anchoredDraggableKt$restartable$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(function0, function2, null);
                    anchoredDraggableKt$restartable$1.label = 1;
                    if (CoroutineScopeKt.coroutineScope(anchoredDraggableKt$restartable$2, anchoredDraggableKt$restartable$1) == coroutine_suspended) {
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
        anchoredDraggableKt$restartable$1 = new AnchoredDraggableKt$restartable$1(continuation);
        Object obj2 = anchoredDraggableKt$restartable$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anchoredDraggableKt$restartable$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> MapUnstyledDraggableAnchors<T> emptyDraggableAnchors() {
        return new MapUnstyledDraggableAnchors<>(new MutableObjectFloatMap(0, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K> float minValueOrNaN(ObjectFloatMap<K> objectFloatMap) {
        if (objectFloatMap.get_size() == 1) {
            return Float.NaN;
        }
        float[] fArr = objectFloatMap.values;
        long[] jArr = objectFloatMap.metadata;
        int length = jArr.length - 2;
        float f = Float.POSITIVE_INFINITY;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            float f2 = fArr[(i << 3) + i3];
                            if (f2 <= f) {
                                f = f2;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return f;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K> float maxValueOrNaN(ObjectFloatMap<K> objectFloatMap) {
        if (objectFloatMap.get_size() == 1) {
            return Float.NaN;
        }
        float[] fArr = objectFloatMap.values;
        long[] jArr = objectFloatMap.metadata;
        int length = jArr.length - 2;
        float f = Float.NEGATIVE_INFINITY;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            float f2 = fArr[(i << 3) + i3];
                            if (f2 >= f) {
                                f = f2;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return f;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return f;
    }
}
