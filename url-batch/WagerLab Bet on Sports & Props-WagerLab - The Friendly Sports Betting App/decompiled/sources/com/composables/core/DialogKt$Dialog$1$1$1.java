package com.composables.core;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: Dialog.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DialogKt$Dialog$1$1$1 implements PointerInputEventHandler {
    final /* synthetic */ State<Function0<Unit>> $currentDismiss$delegate;
    final /* synthetic */ DialogScope $scope;

    /* JADX WARN: Multi-variable type inference failed */
    DialogKt$Dialog$1$1$1(DialogScope dialogScope, State<? extends Function0<Unit>> state) {
        this.$scope = dialogScope;
        this.$currentDismiss$delegate = state;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final DialogScope dialogScope = this.$scope;
        final State<Function0<Unit>> state = this.$currentDismiss$delegate;
        Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new Function1() { // from class: com.composables.core.DialogKt$Dialog$1$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$0;
                invoke$lambda$0 = DialogKt$Dialog$1$1$1.invoke$lambda$0(DialogScope.this, state, (Offset) obj);
                return invoke$lambda$0;
            }
        }, continuation, 7, null);
        return detectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(DialogScope dialogScope, State state, Offset offset) {
        Function0 Dialog$lambda$6;
        Dialog$lambda$6 = DialogKt.Dialog$lambda$6(state);
        Dialog$lambda$6.invoke();
        dialogScope.getDialogState$core_release().setVisible(false);
        return Unit.INSTANCE;
    }
}
