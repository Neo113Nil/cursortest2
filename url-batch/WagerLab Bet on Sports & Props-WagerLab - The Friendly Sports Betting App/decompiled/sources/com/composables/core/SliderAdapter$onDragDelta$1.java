package com.composables.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: ScrollArea.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.composables.core.SliderAdapter$onDragDelta$1", f = "ScrollArea.kt", i = {0, 1, 1, 1}, l = {1121, 1110}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "dragDelta", "sliderDelta"}, s = {"L$0", "L$0", "F$0", "D$0"})
/* loaded from: classes3.dex */
final class SliderAdapter$onDragDelta$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $offset;
    double D$0;
    float F$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SliderAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderAdapter$onDragDelta$1(SliderAdapter sliderAdapter, long j, Continuation<? super SliderAdapter$onDragDelta$1> continuation) {
        super(2, continuation);
        this.this$0 = sliderAdapter;
        this.$offset = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SliderAdapter$onDragDelta$1(this.this$0, this.$offset, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SliderAdapter$onDragDelta$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        SliderAdapter sliderAdapter;
        long j;
        Mutex mutex2;
        boolean z;
        double scrollScale;
        double d;
        Object position;
        float f;
        double d2;
        double d3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.this$0.dragMutex;
                SliderAdapter sliderAdapter2 = this.this$0;
                long j2 = this.$offset;
                this.L$0 = mutex;
                this.L$1 = sliderAdapter2;
                this.J$0 = j2;
                this.label = 1;
                if (mutex.lock(null, this) != coroutine_suspended) {
                    sliderAdapter = sliderAdapter2;
                    j = j2;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d2 = this.D$0;
                f = this.F$0;
                sliderAdapter = (SliderAdapter) this.L$1;
                mutex2 = (Mutex) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    d3 = sliderAdapter.unscrolledDragDistance;
                    sliderAdapter.unscrolledDragDistance = d3 + (f - d2);
                    Unit unit = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            j = this.J$0;
            SliderAdapter sliderAdapter3 = (SliderAdapter) this.L$1;
            Mutex mutex3 = (Mutex) this.L$0;
            ResultKt.throwOnFailure(obj);
            sliderAdapter = sliderAdapter3;
            mutex = mutex3;
            z = sliderAdapter.isVertical;
            float intBitsToFloat = z ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j >> 32));
            double maxScrollOffset = ScrollAreaKt.getMaxScrollOffset(sliderAdapter.getAdapter());
            scrollScale = sliderAdapter.getScrollScale();
            double d4 = maxScrollOffset * scrollScale;
            double position2 = sliderAdapter.getPosition();
            d = sliderAdapter.unscrolledDragDistance;
            double coerceIn = RangesKt.coerceIn(d + (intBitsToFloat + position2), 0.0d, d4) - position2;
            double position3 = sliderAdapter.getPosition() + coerceIn;
            this.L$0 = mutex;
            this.L$1 = sliderAdapter;
            this.F$0 = intBitsToFloat;
            this.D$0 = coerceIn;
            this.label = 2;
            position = sliderAdapter.setPosition(position3, this);
            if (position != coroutine_suspended) {
                f = intBitsToFloat;
                mutex2 = mutex;
                d2 = coerceIn;
                d3 = sliderAdapter.unscrolledDragDistance;
                sliderAdapter.unscrolledDragDistance = d3 + (f - d2);
                Unit unit2 = Unit.INSTANCE;
                mutex2.unlock(null);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }
}
