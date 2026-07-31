package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.facebook.imagepipeline.common.RotationOptions;
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
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$15$2$2$1", f = "LazyMessageList.kt", i = {}, l = {RotationOptions.ROTATE_270}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class LazyMessageListKt$LazyMessageList$15$2$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableIntState $firstVisibleItemIndex$delegate;
    final /* synthetic */ int $index;
    final /* synthetic */ MutableState<Boolean> $isListAtTheBottom$delegate;
    final /* synthetic */ LazyListState $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyMessageListKt$LazyMessageList$15$2$2$1(int i, LazyListState lazyListState, MutableState<Boolean> mutableState, MutableIntState mutableIntState, Continuation<? super LazyMessageListKt$LazyMessageList$15$2$2$1> continuation) {
        super(2, continuation);
        this.$index = i;
        this.$lazyListState = lazyListState;
        this.$isListAtTheBottom$delegate = mutableState;
        this.$firstVisibleItemIndex$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LazyMessageListKt$LazyMessageList$15$2$2$1(this.$index, this.$lazyListState, this.$isListAtTheBottom$delegate, this.$firstVisibleItemIndex$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LazyMessageListKt$LazyMessageList$15$2$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean LazyMessageList$lambda$18;
        int LazyMessageList$lambda$15;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LazyMessageList$lambda$18 = LazyMessageListKt.LazyMessageList$lambda$18(this.$isListAtTheBottom$delegate);
            if (LazyMessageList$lambda$18) {
                LazyMessageList$lambda$15 = LazyMessageListKt.LazyMessageList$lambda$15(this.$firstVisibleItemIndex$delegate);
                if (LazyMessageList$lambda$15 < this.$index) {
                    this.label = 1;
                    if (LazyListState.animateScrollToItem$default(this.$lazyListState, Integer.MAX_VALUE, 0, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
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
