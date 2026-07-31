package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.media3.extractor.ts.TsExtractor;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyMessageList.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$11$1", f = "LazyMessageList.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_HDMV_DTS}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class LazyMessageListKt$LazyMessageList$11$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $isListAtTheBottom$delegate;
    final /* synthetic */ State<KeyboardState> $keyboardAsState$delegate;
    final /* synthetic */ MutableFloatState $keyboardScrollOffset$delegate;
    final /* synthetic */ LazyListState $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyMessageListKt$LazyMessageList$11$1(LazyListState lazyListState, State<KeyboardState> state, MutableState<Boolean> mutableState, MutableFloatState mutableFloatState, Continuation<? super LazyMessageListKt$LazyMessageList$11$1> continuation) {
        super(2, continuation);
        this.$lazyListState = lazyListState;
        this.$keyboardAsState$delegate = state;
        this.$isListAtTheBottom$delegate = mutableState;
        this.$keyboardScrollOffset$delegate = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LazyMessageListKt$LazyMessageList$11$1(this.$lazyListState, this.$keyboardAsState$delegate, this.$isListAtTheBottom$delegate, this.$keyboardScrollOffset$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LazyMessageListKt$LazyMessageList$11$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KeyboardState LazyMessageList$lambda$9;
        boolean LazyMessageList$lambda$18;
        float LazyMessageList$lambda$11;
        float LazyMessageList$lambda$112;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LazyMessageList$lambda$9 = LazyMessageListKt.LazyMessageList$lambda$9(this.$keyboardAsState$delegate);
            if (LazyMessageList$lambda$9.isDismissed()) {
                LazyMessageList$lambda$18 = LazyMessageListKt.LazyMessageList$lambda$18(this.$isListAtTheBottom$delegate);
                if (!LazyMessageList$lambda$18) {
                    LazyMessageList$lambda$11 = LazyMessageListKt.LazyMessageList$lambda$11(this.$keyboardScrollOffset$delegate);
                    if (LazyMessageList$lambda$11 > 0.0f) {
                        LazyListState lazyListState = this.$lazyListState;
                        LazyMessageList$lambda$112 = LazyMessageListKt.LazyMessageList$lambda$11(this.$keyboardScrollOffset$delegate);
                        this.label = 1;
                        if (ScrollExtensionsKt.animateScrollBy$default(lazyListState, -LazyMessageList$lambda$112, null, this, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
