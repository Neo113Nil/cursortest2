package com.composables.core.androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DragGestureDetector.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.composables.core.androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {895}, m = "awaitLongPressOrCancellation-rnUCldI", n = {"initialDown", "longPress"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class DragGestureDetectorKt$awaitLongPressOrCancellation$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    DragGestureDetectorKt$awaitLongPressOrCancellation$1(Continuation<? super DragGestureDetectorKt$awaitLongPressOrCancellation$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m9451awaitLongPressOrCancellationrnUCldI(null, 0L, this);
    }
}
