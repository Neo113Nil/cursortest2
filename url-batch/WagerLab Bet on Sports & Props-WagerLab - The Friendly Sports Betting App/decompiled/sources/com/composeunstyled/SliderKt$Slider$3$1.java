package com.composeunstyled;

import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$3$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SliderKt$Slider$3$1 extends SuspendLambda implements Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> {
    final /* synthetic */ FocusRequester $focusRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderKt$Slider$3$1(FocusRequester focusRequester, Continuation<? super SliderKt$Slider$3$1> continuation) {
        super(3, continuation);
        this.$focusRequester = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Offset offset, Continuation<? super Unit> continuation) {
        return m9534invoked4ec7I(coroutineScope, offset.m5423unboximpl(), continuation);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m9534invoked4ec7I(CoroutineScope coroutineScope, long j, Continuation<? super Unit> continuation) {
        return new SliderKt$Slider$3$1(this.$focusRequester, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FocusRequester.m5320requestFocus3ESFkO8$default(this.$focusRequester, 0, 1, null);
        return Unit.INSTANCE;
    }
}
