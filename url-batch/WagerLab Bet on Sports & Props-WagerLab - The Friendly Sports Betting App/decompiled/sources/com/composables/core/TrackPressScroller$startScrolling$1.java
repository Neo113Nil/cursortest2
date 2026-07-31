package com.composables.core;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ScrollArea.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.composables.core.TrackPressScroller$startScrolling$1", f = "ScrollArea.kt", i = {}, l = {600, 601, TypedValues.MotionType.TYPE_EASING, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class TrackPressScroller$startScrolling$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TrackPressScroller this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrackPressScroller$startScrolling$1(TrackPressScroller trackPressScroller, Continuation<? super TrackPressScroller$startScrolling$1> continuation) {
        super(2, continuation);
        this.this$0 = trackPressScroller;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackPressScroller$startScrolling$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackPressScroller$startScrolling$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(100, r6) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r7 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(300, r6) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        if (r7 == r0) goto L25;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0061 -> B:13:0x0048). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object scrollTowardsCurrentOffset;
        Object scrollTowardsCurrentOffset2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            scrollTowardsCurrentOffset = this.this$0.scrollTowardsCurrentOffset(this);
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 4;
                } else if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.throwOnFailure(obj);
            this.label = 3;
            scrollTowardsCurrentOffset2 = this.this$0.scrollTowardsCurrentOffset(this);
        } else {
            ResultKt.throwOnFailure(obj);
        }
        this.label = 2;
    }
}
