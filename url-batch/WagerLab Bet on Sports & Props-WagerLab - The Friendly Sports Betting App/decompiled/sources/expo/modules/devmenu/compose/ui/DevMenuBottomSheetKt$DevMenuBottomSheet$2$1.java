package expo.modules.devmenu.compose.ui;

import androidx.compose.runtime.MutableState;
import com.composables.core.ModalBottomSheetState;
import com.composables.core.SheetDetent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DevMenuBottomSheet.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.devmenu.compose.ui.DevMenuBottomSheetKt$DevMenuBottomSheet$2$1", f = "DevMenuBottomSheet.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class DevMenuBottomSheetKt$DevMenuBottomSheet$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ModalBottomSheetState $bottomSheetState;
    final /* synthetic */ boolean $isOpen;
    final /* synthetic */ MutableState<Boolean> $shouldShowOnboarding;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DevMenuBottomSheetKt$DevMenuBottomSheet$2$1(boolean z, ModalBottomSheetState modalBottomSheetState, MutableState<Boolean> mutableState, Continuation<? super DevMenuBottomSheetKt$DevMenuBottomSheet$2$1> continuation) {
        super(2, continuation);
        this.$isOpen = z;
        this.$bottomSheetState = modalBottomSheetState;
        this.$shouldShowOnboarding = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DevMenuBottomSheetKt$DevMenuBottomSheet$2$1(this.$isOpen, this.$bottomSheetState, this.$shouldShowOnboarding, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DevMenuBottomSheetKt$DevMenuBottomSheet$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$isOpen) {
                this.$bottomSheetState.setTargetDetent(BottomSheetScaffoldKt.getPeek());
            } else if (!Intrinsics.areEqual(this.$bottomSheetState.getCurrentDetent(), SheetDetent.INSTANCE.getHidden())) {
                this.label = 1;
                if (this.$bottomSheetState.animateTo(SheetDetent.INSTANCE.getHidden(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$shouldShowOnboarding.setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
