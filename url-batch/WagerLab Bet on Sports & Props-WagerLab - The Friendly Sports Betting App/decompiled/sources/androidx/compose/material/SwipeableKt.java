package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Swipeable.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u001aZ\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062#\b\u0002\u0010\b\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\tH\u0007¢\u0006\u0002\u0010\u000e\u001aI\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0010\u001a\u0002H\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00120\t2\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0002\u0010\u0013\u001a³\u0001\u0010\u0014\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0002*\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e28\b\u0002\u0010\u001f\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(!\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020#0 2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010&\u001a\u00020'H\u0007¢\u0006\u0004\b(\u0010)\u001a$\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070+2\u0006\u0010,\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070-H\u0002\u001aP\u0010.\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070-2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070 2\u0006\u00100\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0002\u001a-\u00101\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00020\u00182\u0006\u0010\u0016\u001a\u0002H\u0002H\u0002¢\u0006\u0002\u00102\"*\u00103\u001a\u000204\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00018@X\u0081\u0004¢\u0006\f\u0012\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u000e\u00109\u001a\u00020:X\u0082T¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"rememberSwipeableState", "Landroidx/compose/material/SwipeableState;", "T", "", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/SwipeableState;", "rememberSwipeableStateFor", "value", "onValueChange", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/SwipeableState;", "swipeable", "Landroidx/compose/ui/Modifier;", "state", "anchors", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", ViewProps.ENABLED, "reverseDirection", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "thresholds", "Lkotlin/Function2;", "from", "to", "Landroidx/compose/material/ThresholdConfig;", "resistance", "Landroidx/compose/material/ResistanceConfig;", "velocityThreshold", "Landroidx/compose/ui/unit/Dp;", "swipeable-pPrIpRY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SwipeableState;Ljava/util/Map;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/ResistanceConfig;F)Landroidx/compose/ui/Modifier;", "findBounds", "", "offset", "", "computeTarget", "lastValue", "velocity", "getOffset", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;", "PreUpPostDownNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getPreUpPostDownNestedScrollConnection$annotations", "(Landroidx/compose/material/SwipeableState;)V", "getPreUpPostDownNestedScrollConnection", "(Landroidx/compose/material/SwipeableState;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "SwipeableDeprecation", "", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeableKt {
    private static final String SwipeableDeprecation = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.";

    public static /* synthetic */ void getPreUpPostDownNestedScrollConnection$annotations(SwipeableState swipeableState) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberSwipeableState$lambda$1$lambda$0(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberSwipeableStateFor$lambda$5$lambda$4(Object obj) {
        return true;
    }

    @Deprecated(message = SwipeableDeprecation)
    public static final <T> SwipeableState<T> rememberSwipeableState(final T t, final AnimationSpec<Float> animationSpec, final Function1<? super T, Boolean> function1, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1237755169, "C(rememberSwipeableState)N(initialValue,animationSpec,confirmStateChange)465@19542L8,473@19778L178,467@19586L370:Swipeable.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 4) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, 223231207, "CC(remember):Swipeable.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material.SwipeableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean rememberSwipeableState$lambda$1$lambda$0;
                        rememberSwipeableState$lambda$1$lambda$0 = SwipeableKt.rememberSwipeableState$lambda$1$lambda$0(obj);
                        return Boolean.valueOf(rememberSwipeableState$lambda$1$lambda$0);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function1 = (Function1) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1237755169, i, -1, "androidx.compose.material.rememberSwipeableState (Swipeable.kt:466)");
        }
        Object[] objArr = new Object[0];
        Saver<SwipeableState<T>, T> Saver = SwipeableState.INSTANCE.Saver(animationSpec, function1);
        ComposerKt.sourceInformationMarkerStart(composer, 223238929, "CC(remember):Swipeable.kt#9igjgp");
        boolean z = true;
        boolean changedInstance = ((((i & 14) ^ 6) > 4 && composer.changedInstance(t)) || (i & 6) == 4) | composer.changedInstance(animationSpec);
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(function1)) && (i & 384) != 256) {
            z = false;
        }
        boolean z2 = changedInstance | z;
        Object rememberedValue2 = composer.rememberedValue();
        if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: androidx.compose.material.SwipeableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    SwipeableState rememberSwipeableState$lambda$3$lambda$2;
                    rememberSwipeableState$lambda$3$lambda$2 = SwipeableKt.rememberSwipeableState$lambda$3$lambda$2(t, animationSpec, function1);
                    return rememberSwipeableState$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        SwipeableState<T> swipeableState = (SwipeableState) RememberSaveableKt.m5103rememberSaveable(objArr, (Saver) Saver, (Function0) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return swipeableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwipeableState rememberSwipeableState$lambda$3$lambda$2(Object obj, AnimationSpec animationSpec, Function1 function1) {
        return new SwipeableState(obj, animationSpec, function1);
    }

    @Deprecated(message = SwipeableDeprecation)
    public static final <T> SwipeableState<T> rememberSwipeableStateFor(final T t, final Function1<? super T, Unit> function1, AnimationSpec<Float> animationSpec, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1156387078, "C(rememberSwipeableStateFor)N(value,onValueChange,animationSpec)498@20818L170,505@21019L34,506@21107L113,506@21058L162,511@21271L212,511@21225L258:Swipeable.kt#jmzs0o");
        if ((i2 & 4) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1156387078, i, -1, "androidx.compose.material.rememberSwipeableStateFor (Swipeable.kt:497)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -1108538832, "CC(remember):Swipeable.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new SwipeableState(t, animationSpec, new Function1() { // from class: androidx.compose.material.SwipeableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean rememberSwipeableStateFor$lambda$5$lambda$4;
                    rememberSwipeableStateFor$lambda$5$lambda$4 = SwipeableKt.rememberSwipeableStateFor$lambda$5$lambda$4(obj);
                    return Boolean.valueOf(rememberSwipeableStateFor$lambda$5$lambda$4);
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        final SwipeableState<T> swipeableState = (SwipeableState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -1108532536, "CC(remember):Swipeable.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        final MutableState mutableState = (MutableState) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        Object value = mutableState.getValue();
        ComposerKt.sourceInformationMarkerStart(composer, -1108529641, "CC(remember):Swipeable.kt#9igjgp");
        int i3 = (i & 14) ^ 6;
        boolean z = (i3 > 4 && composer.changedInstance(t)) || (i & 6) == 4;
        SwipeableKt$rememberSwipeableStateFor$1$1 rememberedValue3 = composer.rememberedValue();
        if (z || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new SwipeableKt$rememberSwipeableStateFor$1$1(t, swipeableState, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        int i4 = i & 8;
        EffectsKt.LaunchedEffect(t, value, (Function2) rememberedValue3, composer, i & 14);
        T currentValue = swipeableState.getCurrentValue();
        ComposerKt.sourceInformationMarkerStart(composer, -1108524294, "CC(remember):Swipeable.kt#9igjgp");
        boolean z2 = ((i3 > 4 && composer.changedInstance(t)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(function1)) || (i & 48) == 32);
        Object rememberedValue4 = composer.rememberedValue();
        if (z2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function1() { // from class: androidx.compose.material.SwipeableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    DisposableEffectResult rememberSwipeableStateFor$lambda$10$lambda$9;
                    rememberSwipeableStateFor$lambda$10$lambda$9 = SwipeableKt.rememberSwipeableStateFor$lambda$10$lambda$9(t, swipeableState, function1, mutableState, (DisposableEffectScope) obj);
                    return rememberSwipeableStateFor$lambda$10$lambda$9;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.DisposableEffect(currentValue, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue4, composer, i4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return swipeableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult rememberSwipeableStateFor$lambda$10$lambda$9(Object obj, SwipeableState swipeableState, Function1 function1, MutableState mutableState, DisposableEffectScope disposableEffectScope) {
        if (!Intrinsics.areEqual(obj, swipeableState.getCurrentValue())) {
            function1.invoke(swipeableState.getCurrentValue());
            mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
        }
        return new DisposableEffectResult() { // from class: androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$lambda$10$lambda$9$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FixedThreshold swipeable_pPrIpRY$lambda$11(Object obj, Object obj2) {
        return new FixedThreshold(Dp.m8401constructorimpl(56), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object] */
    public static final List<Float> findBounds(float f, Set<Float> set) {
        Object obj;
        Set<Float> set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set2) {
            if (((Number) obj2).floatValue() <= f + 0.001d) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = arrayList;
        Float f2 = null;
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(0);
            float floatValue = ((Number) obj).floatValue();
            int lastIndex = CollectionsKt.getLastIndex(arrayList2);
            if (1 <= lastIndex) {
                int i = 1;
                while (true) {
                    Object obj3 = arrayList2.get(i);
                    float floatValue2 = ((Number) obj3).floatValue();
                    if (Float.compare(floatValue, floatValue2) < 0) {
                        obj = obj3;
                        floatValue = floatValue2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        Float f3 = (Float) obj;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : set2) {
            if (((Number) obj4).floatValue() >= f - 0.001d) {
                arrayList3.add(obj4);
            }
        }
        ArrayList arrayList4 = arrayList3;
        if (!arrayList4.isEmpty()) {
            ?? r13 = arrayList4.get(0);
            float floatValue3 = ((Number) r13).floatValue();
            int lastIndex2 = CollectionsKt.getLastIndex(arrayList4);
            if (1 <= lastIndex2) {
                int i2 = 1;
                boolean z = r13;
                while (true) {
                    Object obj5 = arrayList4.get(i2);
                    float floatValue4 = ((Number) obj5).floatValue();
                    r13 = z;
                    if (Float.compare(floatValue3, floatValue4) > 0) {
                        r13 = obj5;
                        floatValue3 = floatValue4;
                    }
                    if (i2 == lastIndex2) {
                        break;
                    }
                    i2++;
                    z = r13;
                }
            }
            f2 = r13;
        }
        Float f4 = f2;
        if (f3 == null) {
            return CollectionsKt.listOfNotNull(f4);
        }
        if (f4 == null) {
            return CollectionsKt.listOf(f3);
        }
        return Intrinsics.areEqual(f3, f4) ? CollectionsKt.listOf(f3) : CollectionsKt.listOf((Object[]) new Float[]{f3, f4});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float computeTarget(float f, float f2, Set<Float> set, Function2<? super Float, ? super Float, Float> function2, float f3, float f4) {
        List<Float> findBounds = findBounds(f, set);
        int size = findBounds.size();
        if (size == 0) {
            return f2;
        }
        if (size == 1) {
            return findBounds.get(0).floatValue();
        }
        float floatValue = findBounds.get(0).floatValue();
        float floatValue2 = findBounds.get(1).floatValue();
        return (f2 > f ? f3 > (-f4) && f > function2.invoke(Float.valueOf(floatValue2), Float.valueOf(floatValue)).floatValue() : f3 >= f4 || f >= function2.invoke(Float.valueOf(floatValue), Float.valueOf(floatValue2)).floatValue()) ? floatValue2 : floatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Float getOffset(Map<Float, ? extends T> map, T t) {
        T t2;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (Intrinsics.areEqual(((Map.Entry) t2).getValue(), t)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) t2;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    public static final <T> NestedScrollConnection getPreUpPostDownNestedScrollConnection(SwipeableState<T> swipeableState) {
        return new SwipeableKt$PreUpPostDownNestedScrollConnection$1(swipeableState);
    }

    @Deprecated(message = SwipeableDeprecation)
    /* renamed from: swipeable-pPrIpRY, reason: not valid java name */
    public static final <T> Modifier m2184swipeablepPrIpRY(Modifier modifier, final SwipeableState<T> swipeableState, final Map<Float, ? extends T> map, final Orientation orientation, final boolean z, final boolean z2, final MutableInteractionSource mutableInteractionSource, final Function2<? super T, ? super T, ? extends ThresholdConfig> function2, final ResistanceConfig resistanceConfig, final float f) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("swipeable");
                inspectorInfo.getProperties().set("state", SwipeableState.this);
                inspectorInfo.getProperties().set("anchors", map);
                inspectorInfo.getProperties().set("orientation", orientation);
                inspectorInfo.getProperties().set(ViewProps.ENABLED, Boolean.valueOf(z));
                inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("thresholds", function2);
                inspectorInfo.getProperties().set("resistance", resistanceConfig);
                inspectorInfo.getProperties().set("velocityThreshold", Dp.m8399boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.SwipeableKt$swipeable$3
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.startReplaceGroup(43594985);
                ComposerKt.sourceInformation(composer, "C589@25416L7,591@25497L495,591@25466L526,610@26281L55:Swipeable.kt#jmzs0o");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(43594985, i, -1, "androidx.compose.material.swipeable.<anonymous> (Swipeable.kt:585)");
                }
                if (map.isEmpty()) {
                    throw new IllegalArgumentException("You must have at least one anchor.".toString());
                }
                if (CollectionsKt.distinct(map.values()).size() != map.size()) {
                    throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
                }
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = composer.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Density density = (Density) consume;
                swipeableState.ensureInit$material(map);
                Object obj = map;
                Object obj2 = swipeableState;
                ComposerKt.sourceInformationMarkerStart(composer, -1054880872, "CC(remember):Swipeable.kt#9igjgp");
                boolean changed = composer.changed(swipeableState) | composer.changedInstance(map) | composer.changed(resistanceConfig) | composer.changed(function2) | composer.changed(density) | composer.changed(f);
                SwipeableState<T> swipeableState2 = swipeableState;
                Map<Float, T> map2 = map;
                ResistanceConfig resistanceConfig2 = resistanceConfig;
                Function2<T, T, ThresholdConfig> function22 = function2;
                float f2 = f;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (Function2) new SwipeableKt$swipeable$3$3$1(swipeableState2, map2, resistanceConfig2, density, function22, f2, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                EffectsKt.LaunchedEffect(obj, obj2, (Function2) rememberedValue, composer, 0);
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean isAnimationRunning = swipeableState.isAnimationRunning();
                DraggableState draggableState = swipeableState.getDraggableState();
                Modifier.Companion companion2 = companion;
                Orientation orientation2 = orientation;
                boolean z3 = z;
                MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                ComposerKt.sourceInformationMarkerStart(composer, -1054856224, "CC(remember):Swipeable.kt#9igjgp");
                boolean changed2 = composer.changed(swipeableState);
                SwipeableState<T> swipeableState3 = swipeableState;
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (Function3) new SwipeableKt$swipeable$3$4$1(swipeableState3, null);
                    composer.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                Modifier draggable$default = DraggableKt.draggable$default(companion2, draggableState, orientation2, z3, mutableInteractionSource2, isAnimationRunning, null, (Function3) rememberedValue2, z2, 32, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return draggable$default;
            }
        });
    }
}
