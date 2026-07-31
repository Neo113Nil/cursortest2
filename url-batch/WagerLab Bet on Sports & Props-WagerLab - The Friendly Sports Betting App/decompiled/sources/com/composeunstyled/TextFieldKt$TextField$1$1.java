package com.composeunstyled;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.composeunstyled.TextFieldKt$TextField$1$1", f = "TextField.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class TextFieldKt$TextField$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $editable;
    final /* synthetic */ MutableState<TextRange> $textRange$delegate;
    final /* synthetic */ String $value;
    final /* synthetic */ MutableState<Boolean> $wasEditable$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldKt$TextField$1$1(boolean z, String str, MutableState<Boolean> mutableState, MutableState<TextRange> mutableState2, Continuation<? super TextFieldKt$TextField$1$1> continuation) {
        super(2, continuation);
        this.$editable = z;
        this.$value = str;
        this.$wasEditable$delegate = mutableState;
        this.$textRange$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TextFieldKt$TextField$1$1(this.$editable, this.$value, this.$wasEditable$delegate, this.$textRange$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TextFieldKt$TextField$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean TextField_RM0IcR4$lambda$1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            TextField_RM0IcR4$lambda$1 = TextFieldKt.TextField_RM0IcR4$lambda$1(this.$wasEditable$delegate);
            if (!TextField_RM0IcR4$lambda$1 && this.$editable) {
                TextFieldKt.TextField_RM0IcR4$lambda$5(this.$textRange$delegate, TextRangeKt.TextRange(0, this.$value.length()));
            }
            TextFieldKt.TextField_RM0IcR4$lambda$2(this.$wasEditable$delegate, this.$editable);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
