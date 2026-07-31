package com.composables.core.androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AnchoredDraggable.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.composables.core.androidx.compose.foundation.gestures.UnstyledAnchoredDraggableState", f = "AnchoredDraggable.kt", i = {}, l = {883}, m = "anchoredDrag", n = {}, s = {})
/* loaded from: classes3.dex */
final class UnstyledAnchoredDraggableState$anchoredDrag$3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UnstyledAnchoredDraggableState<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnstyledAnchoredDraggableState$anchoredDrag$3(UnstyledAnchoredDraggableState<T> unstyledAnchoredDraggableState, Continuation<? super UnstyledAnchoredDraggableState$anchoredDrag$3> continuation) {
        super(continuation);
        this.this$0 = unstyledAnchoredDraggableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.anchoredDrag(null, null, null, this);
    }
}
