package com.composables.core;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import com.composables.core.androidx.compose.foundation.gestures.AnchoredDraggableKt;
import com.composables.core.androidx.compose.foundation.gestures.UnstyledAnchoredDraggableState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BottomSheet.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0088\u0001\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u0012!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n0\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u00107\u001a\u00020\n2\u0006\u0010;\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u0003J\u0016\u0010@\u001a\u00020A2\u0006\u0010.\u001a\u00020\u0003H\u0086@¢\u0006\u0002\u0010BJ\u000e\u0010C\u001a\u00020A2\u0006\u0010.\u001a\u00020\u0003R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR+\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010$\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010!R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030(X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010-R$\u0010/\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010-\"\u0004\b1\u00102R\u001b\u00103\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b3\u00104R\u001a\u00107\u001a\u00020\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u00109\u001a\u0004\b:\u0010\u001fR\u001b\u0010=\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b>\u0010\u001f¨\u0006D"}, d2 = {"Lcom/composables/core/BottomSheetState;", "", "initialDetent", "Lcom/composables/core/SheetDetent;", "detents", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "velocityThreshold", "Lkotlin/Function0;", "positionalThreshold", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "totalDistance", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "confirmDetentChange", "", "<init>", "(Lcom/composables/core/SheetDetent;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;)V", "getDetents$core_release", "()Ljava/util/List;", "getConfirmDetentChange$core_release", "()Lkotlin/jvm/functions/Function1;", "<set-?>", "closestDentToTop", "getClosestDentToTop$core_release", "()F", "setClosestDentToTop$core_release", "(F)V", "closestDentToTop$delegate", "Landroidx/compose/runtime/MutableState;", "fullContentHeight", "getFullContentHeight$core_release", "setFullContentHeight$core_release", "anchoredDraggableState", "Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledAnchoredDraggableState;", "getAnchoredDraggableState$core_release", "()Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledAnchoredDraggableState;", "currentDetent", "getCurrentDetent", "()Lcom/composables/core/SheetDetent;", "value", "targetDetent", "getTargetDetent", "setTargetDetent", "(Lcom/composables/core/SheetDetent;)V", "isIdle", "()Z", "isIdle$delegate", "Landroidx/compose/runtime/State;", "progress", "getProgress$annotations", "()V", "getProgress", "from", "to", "offset", "getOffset", "offset$delegate", "animateTo", "", "(Lcom/composables/core/SheetDetent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jumpTo", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BottomSheetState {
    public static final int $stable = 8;
    private final UnstyledAnchoredDraggableState<SheetDetent> anchoredDraggableState;

    /* renamed from: closestDentToTop$delegate, reason: from kotlin metadata */
    private final MutableState closestDentToTop;
    private final Function1<SheetDetent, Boolean> confirmDetentChange;
    private final CoroutineScope coroutineScope;
    private final List<SheetDetent> detents;
    private float fullContentHeight;

    /* renamed from: isIdle$delegate, reason: from kotlin metadata */
    private final State isIdle;

    /* renamed from: offset$delegate, reason: from kotlin metadata */
    private final State offset;

    @Deprecated(message = "Use the progress function and provide the detents you need instead.")
    public static /* synthetic */ void getProgress$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetState(SheetDetent initialDetent, List<SheetDetent> detents, CoroutineScope coroutineScope, AnimationSpec<Float> animationSpec, Function0<Float> velocityThreshold, Function1<? super Float, Float> positionalThreshold, DecayAnimationSpec<Float> decayAnimationSpec, Function1<? super SheetDetent, Boolean> confirmDetentChange) {
        Intrinsics.checkNotNullParameter(initialDetent, "initialDetent");
        Intrinsics.checkNotNullParameter(detents, "detents");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(velocityThreshold, "velocityThreshold");
        Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
        Intrinsics.checkNotNullParameter(decayAnimationSpec, "decayAnimationSpec");
        Intrinsics.checkNotNullParameter(confirmDetentChange, "confirmDetentChange");
        this.detents = detents;
        this.coroutineScope = coroutineScope;
        this.confirmDetentChange = confirmDetentChange;
        if (detents.isEmpty()) {
            throw new IllegalStateException("Tried to create a bottom sheet without any detents. Make sure to pass at least one detent when creating your sheet's state.".toString());
        }
        if (!detents.contains(initialDetent)) {
            throw new IllegalStateException(("The initialDetent " + initialDetent.getIdentifier() + " was not part of the included detents while creating the sheet's state.").toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : detents) {
            String identifier = ((SheetDetent) obj).getIdentifier();
            Object obj2 = linkedHashMap.get(identifier);
            if (obj2 == null) {
                obj2 = (List) new ArrayList();
                linkedHashMap.put(identifier, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((List) entry.getValue()).size() > 1) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        Iterator it = linkedHashMap2.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            this.closestDentToTop = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(Float.NaN), null, 2, null);
            this.fullContentHeight = Float.NaN;
            this.anchoredDraggableState = new UnstyledAnchoredDraggableState<>(initialDetent, positionalThreshold, velocityThreshold, animationSpec, decayAnimationSpec, this.confirmDetentChange);
            this.isIdle = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.composables.core.BottomSheetState$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean isIdle_delegate$lambda$8;
                    isIdle_delegate$lambda$8 = BottomSheetState.isIdle_delegate$lambda$8(BottomSheetState.this);
                    return Boolean.valueOf(isIdle_delegate$lambda$8);
                }
            });
            this.offset = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.composables.core.BottomSheetState$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    float offset_delegate$lambda$9;
                    offset_delegate$lambda$9 = BottomSheetState.offset_delegate$lambda$9(BottomSheetState.this);
                    return Float.valueOf(offset_delegate$lambda$9);
                }
            });
            return;
        }
        throw new IllegalStateException(("Detent identifiers need to be unique, but you passed the following detents multiple times: " + CollectionsKt.joinToString$default(arrayList2, null, null, null, 0, null, new Function1() { // from class: com.composables.core.BottomSheetState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return BottomSheetState.lambda$6$lambda$5((String) obj3);
            }
        }, 31, null) + ".").toString());
    }

    public final List<SheetDetent> getDetents$core_release() {
        return this.detents;
    }

    public final Function1<SheetDetent, Boolean> getConfirmDetentChange$core_release() {
        return this.confirmDetentChange;
    }

    static final CharSequence lambda$6$lambda$5(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getClosestDentToTop$core_release() {
        return ((Number) this.closestDentToTop.getValue()).floatValue();
    }

    public final void setClosestDentToTop$core_release(float f) {
        this.closestDentToTop.setValue(Float.valueOf(f));
    }

    /* renamed from: getFullContentHeight$core_release, reason: from getter */
    public final float getFullContentHeight() {
        return this.fullContentHeight;
    }

    public final void setFullContentHeight$core_release(float f) {
        this.fullContentHeight = f;
    }

    public final UnstyledAnchoredDraggableState<SheetDetent> getAnchoredDraggableState$core_release() {
        return this.anchoredDraggableState;
    }

    public final SheetDetent getCurrentDetent() {
        return this.anchoredDraggableState.getSettledValue();
    }

    public final SheetDetent getTargetDetent() {
        if (this.anchoredDraggableState.getDragTarget$core_release() != null) {
            SheetDetent dragTarget$core_release = this.anchoredDraggableState.getDragTarget$core_release();
            Intrinsics.checkNotNull(dragTarget$core_release, "null cannot be cast to non-null type com.composables.core.SheetDetent");
            return dragTarget$core_release;
        }
        float offset = this.anchoredDraggableState.getOffset();
        if (Float.isNaN(offset)) {
            return getCurrentDetent();
        }
        SheetDetent closestAnchor = this.anchoredDraggableState.getAnchors().closestAnchor(offset, !(offset < this.anchoredDraggableState.getAnchors().positionOf(getCurrentDetent())));
        return closestAnchor == null ? getCurrentDetent() : closestAnchor;
    }

    public final void setTargetDetent(SheetDetent value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.detents.contains(value)) {
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new BottomSheetState$targetDetent$2(this, value, null), 3, null);
        } else {
            throw new IllegalStateException(("Tried to set currentDetent to an unknown detent with identifier " + value.getIdentifier() + ". Make sure that the detent is passed to the list of detents when instantiating the sheet's state.").toString());
        }
    }

    public final boolean isIdle() {
        return ((Boolean) this.isIdle.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isIdle_delegate$lambda$8(BottomSheetState bottomSheetState) {
        return Intrinsics.areEqual(bottomSheetState.getCurrentDetent(), bottomSheetState.getTargetDetent()) && !bottomSheetState.anchoredDraggableState.isAnimationRunning();
    }

    public final float getProgress() {
        return this.anchoredDraggableState.progress(getCurrentDetent(), getTargetDetent());
    }

    public final float progress(SheetDetent from, SheetDetent to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        return this.anchoredDraggableState.progress(from, to);
    }

    public final float getOffset() {
        return ((Number) this.offset.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float offset_delegate$lambda$9(BottomSheetState bottomSheetState) {
        if (Float.isNaN(bottomSheetState.anchoredDraggableState.getOffset()) || Float.isNaN(bottomSheetState.getClosestDentToTop$core_release())) {
            return 0.0f;
        }
        return bottomSheetState.fullContentHeight - (bottomSheetState.anchoredDraggableState.getOffset() - bottomSheetState.getClosestDentToTop$core_release());
    }

    public final Object animateTo(SheetDetent sheetDetent, Continuation<? super Unit> continuation) {
        if (!this.detents.contains(sheetDetent)) {
            throw new IllegalStateException(("Tried to set currentDetent to an unknown detent with identifier " + sheetDetent.getIdentifier() + ". Make sure that the detent is passed to the list of detents when instantiating the sheet's state.").toString());
        }
        Object animateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, sheetDetent, continuation);
        return animateTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo : Unit.INSTANCE;
    }

    public final void jumpTo(SheetDetent value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.detents.contains(value)) {
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new BottomSheetState$jumpTo$2(this, value, null), 3, null);
        } else {
            throw new IllegalStateException(("Tried to set currentDetent to an unknown detent with identifier " + value.getIdentifier() + ". Make sure that the detent is passed to the list of detents when instantiating the sheet's state.").toString());
        }
    }
}
