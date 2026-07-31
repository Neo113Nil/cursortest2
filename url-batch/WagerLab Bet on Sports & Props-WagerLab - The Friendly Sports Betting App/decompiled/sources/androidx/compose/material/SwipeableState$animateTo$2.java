package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.MutableFloatState;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: Swipeable.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class SwipeableState$animateTo$2<T> implements FlowCollector {
    final /* synthetic */ AnimationSpec<Float> $anim;
    final /* synthetic */ T $targetValue;
    final /* synthetic */ SwipeableState<T> this$0;

    SwipeableState$animateTo$2(T t, SwipeableState<T> swipeableState, AnimationSpec<Float> animationSpec) {
        this.$targetValue = t;
        this.this$0 = swipeableState;
        this.$anim = animationSpec;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return emit((Map) obj, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Map<Float, ? extends T> map, Continuation<? super Unit> continuation) {
        SwipeableState$animateTo$2$emit$1 swipeableState$animateTo$2$emit$1;
        int i;
        MutableFloatState mutableFloatState;
        Float offset;
        Object animateInternalToOffset;
        MutableFloatState mutableFloatState2;
        Object firstOrNull;
        try {
            if (continuation instanceof SwipeableState$animateTo$2$emit$1) {
                swipeableState$animateTo$2$emit$1 = (SwipeableState$animateTo$2$emit$1) continuation;
                if ((swipeableState$animateTo$2$emit$1.label & Integer.MIN_VALUE) != 0) {
                    swipeableState$animateTo$2$emit$1.label -= Integer.MIN_VALUE;
                    Object obj = swipeableState$animateTo$2$emit$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = swipeableState$animateTo$2$emit$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        offset = SwipeableKt.getOffset(map, this.$targetValue);
                        if (offset == null) {
                            throw new IllegalArgumentException("The target value must have an associated anchor.".toString());
                        }
                        SwipeableState<T> swipeableState = this.this$0;
                        float floatValue = offset.floatValue();
                        AnimationSpec<Float> animationSpec = this.$anim;
                        swipeableState$animateTo$2$emit$1.L$0 = map;
                        swipeableState$animateTo$2$emit$1.label = 1;
                        animateInternalToOffset = swipeableState.animateInternalToOffset(floatValue, animationSpec, swipeableState$animateTo$2$emit$1);
                        if (animateInternalToOffset == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        map = (Map) swipeableState$animateTo$2$emit$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    mutableFloatState2 = ((SwipeableState) this.this$0).absoluteOffset;
                    float floatValue2 = mutableFloatState2.getFloatValue();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<Float, ? extends T> entry : map.entrySet()) {
                        if (Math.abs(entry.getKey().floatValue() - floatValue2) < 0.5f) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    firstOrNull = CollectionsKt.firstOrNull(linkedHashMap.values());
                    if (firstOrNull == null) {
                        firstOrNull = this.this$0.getCurrentValue();
                    }
                    this.this$0.setCurrentValue(firstOrNull);
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            mutableFloatState2 = ((SwipeableState) this.this$0).absoluteOffset;
            float floatValue22 = mutableFloatState2.getFloatValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while (r7.hasNext()) {
            }
            firstOrNull = CollectionsKt.firstOrNull(linkedHashMap2.values());
            if (firstOrNull == null) {
            }
            this.this$0.setCurrentValue(firstOrNull);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutableFloatState = ((SwipeableState) this.this$0).absoluteOffset;
            float floatValue3 = mutableFloatState.getFloatValue();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry<Float, ? extends T> entry2 : map.entrySet()) {
                if (Math.abs(entry2.getKey().floatValue() - floatValue3) < 0.5f) {
                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                }
            }
            Object firstOrNull2 = CollectionsKt.firstOrNull(linkedHashMap3.values());
            if (firstOrNull2 == null) {
                firstOrNull2 = this.this$0.getCurrentValue();
            }
            this.this$0.setCurrentValue(firstOrNull2);
            throw th;
        }
        swipeableState$animateTo$2$emit$1 = new SwipeableState$animateTo$2$emit$1(this, continuation);
        Object obj2 = swipeableState$animateTo$2$emit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = swipeableState$animateTo$2$emit$1.label;
    }
}
