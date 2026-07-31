package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MessageList.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$12$1", f = "MessageList.kt", i = {}, l = {164, 166, TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class MessageListKt$MessageList$12$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $autoScrollEnabled$delegate;
    final /* synthetic */ MutableState<MessageListCoordinates> $currentBounds$delegate;
    final /* synthetic */ MutableState<Boolean> $hasUserScrolled$delegate;
    final /* synthetic */ State<KeyboardState> $keyboardAsState$delegate;
    final /* synthetic */ MutableState<MessageListCoordinates> $oldBounds$delegate;
    final /* synthetic */ ScrollState $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageListKt$MessageList$12$1(ScrollState scrollState, MutableState<MessageListCoordinates> mutableState, MutableState<MessageListCoordinates> mutableState2, State<KeyboardState> state, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4, Continuation<? super MessageListKt$MessageList$12$1> continuation) {
        super(2, continuation);
        this.$scrollState = scrollState;
        this.$oldBounds$delegate = mutableState;
        this.$currentBounds$delegate = mutableState2;
        this.$keyboardAsState$delegate = state;
        this.$hasUserScrolled$delegate = mutableState3;
        this.$autoScrollEnabled$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageListKt$MessageList$12$1(this.$scrollState, this.$oldBounds$delegate, this.$currentBounds$delegate, this.$keyboardAsState$delegate, this.$hasUserScrolled$delegate, this.$autoScrollEnabled$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListKt$MessageList$12$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(r7.$scrollState, r8, r7) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x010e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        if (androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(r7.$scrollState, r8, r7) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010c, code lost:
    
        if (androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(r7.$scrollState, r8, r7) == r0) goto L39;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MessageListCoordinates MessageList$lambda$11;
        MessageListCoordinates MessageList$lambda$112;
        MessageListCoordinates MessageList$lambda$14;
        boolean MessageList$lambda$17;
        boolean MessageList$lambda$20;
        MessageListCoordinates MessageList$lambda$142;
        MessageListCoordinates MessageList$lambda$113;
        MessageListCoordinates MessageList$lambda$143;
        MessageListCoordinates MessageList$lambda$114;
        MessageListCoordinates MessageList$lambda$144;
        MessageListCoordinates MessageList$lambda$115;
        MessageListCoordinates MessageList$lambda$145;
        KeyboardState MessageList$lambda$9;
        boolean MessageList$lambda$202;
        MessageListCoordinates MessageList$lambda$146;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MessageList$lambda$11 = MessageListKt.MessageList$lambda$11(this.$oldBounds$delegate);
            if (!MessageList$lambda$11.isZero()) {
                MessageList$lambda$143 = MessageListKt.MessageList$lambda$14(this.$currentBounds$delegate);
                if (!MessageList$lambda$143.isZero()) {
                    MessageList$lambda$114 = MessageListKt.MessageList$lambda$11(this.$oldBounds$delegate);
                    Rect boundsInParent = MessageList$lambda$114.getBoundsInParent();
                    MessageList$lambda$144 = MessageListKt.MessageList$lambda$14(this.$currentBounds$delegate);
                    if (!Intrinsics.areEqual(boundsInParent, MessageList$lambda$144.getBoundsInParent())) {
                        MessageList$lambda$115 = MessageListKt.MessageList$lambda$11(this.$oldBounds$delegate);
                        float bottom = MessageList$lambda$115.getBoundsInParent().getBottom();
                        MessageList$lambda$145 = MessageListKt.MessageList$lambda$14(this.$currentBounds$delegate);
                        float bottom2 = bottom - MessageList$lambda$145.getBoundsInParent().getBottom();
                        if (bottom2 > 0.0f) {
                            this.label = 1;
                        } else {
                            MessageList$lambda$9 = MessageListKt.MessageList$lambda$9(this.$keyboardAsState$delegate);
                            if (MessageList$lambda$9.isAnimating()) {
                                MessageList$lambda$202 = MessageListKt.MessageList$lambda$20(this.$hasUserScrolled$delegate);
                                if (MessageList$lambda$202) {
                                    this.label = 2;
                                }
                            }
                        }
                    }
                }
            }
            MessageList$lambda$112 = MessageListKt.MessageList$lambda$11(this.$oldBounds$delegate);
            long m11293getSizeNHjbRc = MessageList$lambda$112.m11293getSizeNHjbRc();
            MessageList$lambda$14 = MessageListKt.MessageList$lambda$14(this.$currentBounds$delegate);
            if (!Size.m5478equalsimpl0(m11293getSizeNHjbRc, MessageList$lambda$14.m11293getSizeNHjbRc())) {
                MessageList$lambda$17 = MessageListKt.MessageList$lambda$17(this.$autoScrollEnabled$delegate);
                if (MessageList$lambda$17) {
                    MessageList$lambda$20 = MessageListKt.MessageList$lambda$20(this.$hasUserScrolled$delegate);
                    if (!MessageList$lambda$20) {
                        MessageList$lambda$142 = MessageListKt.MessageList$lambda$14(this.$currentBounds$delegate);
                        float intBitsToFloat = Float.intBitsToFloat((int) (MessageList$lambda$142.m11293getSizeNHjbRc() & 4294967295L));
                        MessageList$lambda$113 = MessageListKt.MessageList$lambda$11(this.$oldBounds$delegate);
                        float intBitsToFloat2 = intBitsToFloat - Float.intBitsToFloat((int) (MessageList$lambda$113.m11293getSizeNHjbRc() & 4294967295L));
                        if (intBitsToFloat2 > 0.0f) {
                            this.label = 3;
                        }
                    }
                }
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        MutableState<MessageListCoordinates> mutableState = this.$oldBounds$delegate;
        MessageList$lambda$146 = MessageListKt.MessageList$lambda$14(this.$currentBounds$delegate);
        mutableState.setValue(MessageList$lambda$146);
        return Unit.INSTANCE;
    }
}
