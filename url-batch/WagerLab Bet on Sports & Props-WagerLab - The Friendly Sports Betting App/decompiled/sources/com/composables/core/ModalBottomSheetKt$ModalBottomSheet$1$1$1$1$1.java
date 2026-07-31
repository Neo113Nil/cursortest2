package com.composables.core;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: ModalBottomSheet.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ModalBottomSheetKt$ModalBottomSheet$1$1$1$1$1 implements PointerInputEventHandler {
    final /* synthetic */ ModalBottomSheetState $state;

    ModalBottomSheetKt$ModalBottomSheet$1$1$1$1$1(ModalBottomSheetState modalBottomSheetState) {
        this.$state = modalBottomSheetState;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final ModalBottomSheetState modalBottomSheetState = this.$state;
        Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new Function1() { // from class: com.composables.core.ModalBottomSheetKt$ModalBottomSheet$1$1$1$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$0;
                invoke$lambda$0 = ModalBottomSheetKt$ModalBottomSheet$1$1$1$1$1.invoke$lambda$0(ModalBottomSheetState.this, (Offset) obj);
                return invoke$lambda$0;
            }
        }, continuation, 7, null);
        return detectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(ModalBottomSheetState modalBottomSheetState, Offset offset) {
        if (modalBottomSheetState.getBottomSheetState().getConfirmDetentChange$core_release().invoke(SheetDetent.INSTANCE.getHidden()).booleanValue()) {
            modalBottomSheetState.setTargetDetent(SheetDetent.INSTANCE.getHidden());
        }
        return Unit.INSTANCE;
    }
}
