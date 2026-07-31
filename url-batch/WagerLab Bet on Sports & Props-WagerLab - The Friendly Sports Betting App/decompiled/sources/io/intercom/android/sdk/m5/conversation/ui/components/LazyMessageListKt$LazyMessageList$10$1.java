package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyMessageList.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$10$1", f = "LazyMessageList.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class LazyMessageListKt$LazyMessageList$10$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ float $intercomBadgeOffset;
    final /* synthetic */ State<KeyboardState> $keyboardAsState$delegate;
    final /* synthetic */ MutableFloatState $keyboardScrollOffset$delegate;
    final /* synthetic */ LazyListState $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyMessageListKt$LazyMessageList$10$1(float f, LazyListState lazyListState, State<KeyboardState> state, MutableFloatState mutableFloatState, Continuation<? super LazyMessageListKt$LazyMessageList$10$1> continuation) {
        super(2, continuation);
        this.$intercomBadgeOffset = f;
        this.$lazyListState = lazyListState;
        this.$keyboardAsState$delegate = state;
        this.$keyboardScrollOffset$delegate = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LazyMessageListKt$LazyMessageList$10$1(this.$intercomBadgeOffset, this.$lazyListState, this.$keyboardAsState$delegate, this.$keyboardScrollOffset$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LazyMessageListKt$LazyMessageList$10$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KeyboardState LazyMessageList$lambda$9;
        KeyboardState LazyMessageList$lambda$92;
        KeyboardState LazyMessageList$lambda$93;
        float LazyMessageList$lambda$11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LazyMessageList$lambda$9 = LazyMessageListKt.LazyMessageList$lambda$9(this.$keyboardAsState$delegate);
            if (LazyMessageList$lambda$9.isVisible()) {
                LazyMessageList$lambda$92 = LazyMessageListKt.LazyMessageList$lambda$9(this.$keyboardAsState$delegate);
                if (!LazyMessageList$lambda$92.isAnimating()) {
                    MutableFloatState mutableFloatState = this.$keyboardScrollOffset$delegate;
                    LazyMessageList$lambda$93 = LazyMessageListKt.LazyMessageList$lambda$9(this.$keyboardAsState$delegate);
                    mutableFloatState.setFloatValue(RangesKt.coerceAtLeast(LazyMessageList$lambda$93.getKeyboardHeight() - this.$intercomBadgeOffset, 0.0f));
                    LazyListState lazyListState = this.$lazyListState;
                    LazyMessageList$lambda$11 = LazyMessageListKt.LazyMessageList$lambda$11(this.$keyboardScrollOffset$delegate);
                    this.label = 1;
                    if (ScrollExtensionsKt.animateScrollBy$default(lazyListState, LazyMessageList$lambda$11, null, this, 2, null) == coroutine_suspended) {
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
