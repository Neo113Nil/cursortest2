package com.composables.core;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: ScrollArea.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.composables.core.ScrollAreaKt$detectScrollViaTrackGestures$2", f = "ScrollArea.kt", i = {0, 1, 1, 2, 2}, l = {662, 666, 667}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "$this$awaitEachGesture", "down"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class ScrollAreaKt$detectScrollViaTrackGestures$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ TrackPressScroller $scroller;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollAreaKt$detectScrollViaTrackGestures$2(TrackPressScroller trackPressScroller, boolean z, Continuation<? super ScrollAreaKt$detectScrollViaTrackGestures$2> continuation) {
        super(2, continuation);
        this.$scroller = trackPressScroller;
        this.$isVertical = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScrollAreaKt$detectScrollViaTrackGestures$2 scrollAreaKt$detectScrollViaTrackGestures$2 = new ScrollAreaKt$detectScrollViaTrackGestures$2(this.$scroller, this.$isVertical, continuation);
        scrollAreaKt$detectScrollViaTrackGestures$2.L$0 = obj;
        return scrollAreaKt$detectScrollViaTrackGestures$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return ((ScrollAreaKt$detectScrollViaTrackGestures$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        if (r12 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0094 -> B:7:0x0097). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        float detectScrollViaTrackGestures$onScrollAxis;
        AwaitPointerEventScope awaitPointerEventScope2;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        float detectScrollViaTrackGestures$onScrollAxis2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
            this.L$0 = awaitPointerEventScope3;
            this.label = 1;
            obj = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope3, false, null, this, 3, null);
            if (obj != coroutine_suspended) {
                awaitPointerEventScope = awaitPointerEventScope3;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                pointerInputChange = (PointerInputChange) this.L$1;
                awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                pointerInputChange2 = (PointerInputChange) obj;
                if (pointerInputChange2 == null) {
                }
                return Unit.INSTANCE;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pointerInputChange = (PointerInputChange) this.L$1;
            awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            pointerInputChange2 = (PointerInputChange) obj;
            if (pointerInputChange2 == null) {
                if (!pointerInputChange2.getPressed()) {
                    this.$scroller.onRelease();
                } else {
                    TrackPressScroller trackPressScroller = this.$scroller;
                    detectScrollViaTrackGestures$onScrollAxis2 = ScrollAreaKt.detectScrollViaTrackGestures$onScrollAxis(pointerInputChange2.getPosition(), this.$isVertical);
                    trackPressScroller.onMovePressed(detectScrollViaTrackGestures$onScrollAxis2);
                    if (this.$isVertical) {
                        this.L$0 = awaitPointerEventScope2;
                        this.L$1 = pointerInputChange;
                        this.label = 3;
                        obj = DragGestureDetectorKt.m479awaitHorizontalDragOrCancellationrnUCldI(awaitPointerEventScope2, pointerInputChange.getId(), this);
                    } else {
                        this.L$0 = awaitPointerEventScope2;
                        this.L$1 = pointerInputChange;
                        this.label = 2;
                        Object m487awaitVerticalDragOrCancellationrnUCldI = DragGestureDetectorKt.m487awaitVerticalDragOrCancellationrnUCldI(awaitPointerEventScope2, pointerInputChange.getId(), this);
                        if (m487awaitVerticalDragOrCancellationrnUCldI != coroutine_suspended) {
                            pointerInputChange2 = (PointerInputChange) m487awaitVerticalDragOrCancellationrnUCldI;
                            if (pointerInputChange2 == null) {
                                this.$scroller.onGestureCancelled();
                            }
                        }
                    }
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
        TrackPressScroller trackPressScroller2 = this.$scroller;
        detectScrollViaTrackGestures$onScrollAxis = ScrollAreaKt.detectScrollViaTrackGestures$onScrollAxis(pointerInputChange3.getPosition(), this.$isVertical);
        trackPressScroller2.onPress(detectScrollViaTrackGestures$onScrollAxis);
        awaitPointerEventScope2 = awaitPointerEventScope;
        pointerInputChange = pointerInputChange3;
        if (this.$isVertical) {
        }
        return coroutine_suspended;
    }
}
