package com.composables.core.androidx.compose.foundation.gestures;

import com.composables.core.androidx.compose.foundation.gestures.AnchoredDragScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", "", "T", "Lcom/composables/core/androidx/compose/foundation/gestures/AnchoredDragScope;", "anchors", "Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledDraggableAnchors;", "latestTarget"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.composables.core.androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class AnchoredDraggableKt$snapTo$2<T> extends SuspendLambda implements Function4<AnchoredDragScope, UnstyledDraggableAnchors<T>, T, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    AnchoredDraggableKt$snapTo$2(Continuation<? super AnchoredDraggableKt$snapTo$2> continuation) {
        super(4, continuation);
    }

    public final Object invoke(AnchoredDragScope anchoredDragScope, UnstyledDraggableAnchors<T> unstyledDraggableAnchors, T t, Continuation<? super Unit> continuation) {
        AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$2 = new AnchoredDraggableKt$snapTo$2(continuation);
        anchoredDraggableKt$snapTo$2.L$0 = anchoredDragScope;
        anchoredDraggableKt$snapTo$2.L$1 = unstyledDraggableAnchors;
        anchoredDraggableKt$snapTo$2.L$2 = t;
        return anchoredDraggableKt$snapTo$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope anchoredDragScope, Object obj, Object obj2, Continuation<? super Unit> continuation) {
        return invoke(anchoredDragScope, (UnstyledDraggableAnchors<UnstyledDraggableAnchors<T>>) obj, (UnstyledDraggableAnchors<T>) obj2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
        float positionOf = ((UnstyledDraggableAnchors) this.L$1).positionOf(this.L$2);
        if (!Float.isNaN(positionOf)) {
            AnchoredDragScope.DefaultImpls.dragTo$default(anchoredDragScope, positionOf, 0.0f, 2, null);
        }
        return Unit.INSTANCE;
    }
}
