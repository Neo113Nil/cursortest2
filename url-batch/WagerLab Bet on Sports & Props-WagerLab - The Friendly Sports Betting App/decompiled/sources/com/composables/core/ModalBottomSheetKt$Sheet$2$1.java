package com.composables.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ModalBottomSheet.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.composables.core.ModalBottomSheetKt$Sheet$2$1", f = "ModalBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ModalBottomSheetKt$Sheet$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ModalContext $context;
    final /* synthetic */ ModalBottomSheetScope $this_Sheet;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModalBottomSheetKt$Sheet$2$1(ModalBottomSheetScope modalBottomSheetScope, ModalContext modalContext, Continuation<? super ModalBottomSheetKt$Sheet$2$1> continuation) {
        super(2, continuation);
        this.$this_Sheet = modalBottomSheetScope;
        this.$context = modalContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModalBottomSheetKt$Sheet$2$1(this.$this_Sheet, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModalBottomSheetKt$Sheet$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$this_Sheet.getSheetState().isIdle()) {
            if (Intrinsics.areEqual(this.$this_Sheet.getSheetState().getTargetDetent(), SheetDetent.INSTANCE.getHidden())) {
                this.$context.getOnDismissRequest().invoke();
                this.$this_Sheet.getModalState().setModalDetent$core_release(SheetDetent.INSTANCE.getHidden());
            } else {
                this.$this_Sheet.getModalState().setModalDetent$core_release(this.$this_Sheet.getSheetState().getCurrentDetent());
            }
        }
        return Unit.INSTANCE;
    }
}
