package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.media3.extractor.ts.TsExtractor;
import io.intercom.android.sdk.m5.conversation.states.ComposerUiEffect;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: MessageComposer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$11", f = "MessageComposer.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_DTS_UHD}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class MessageComposerKt$MessageComposer$11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SharedFlow<ComposerUiEffect> $composerUiEffect;
    final /* synthetic */ String $reportAiMessage;
    final /* synthetic */ MutableState<TextFieldValue> $textFieldValue$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MessageComposerKt$MessageComposer$11(SharedFlow<? extends ComposerUiEffect> sharedFlow, String str, MutableState<TextFieldValue> mutableState, Continuation<? super MessageComposerKt$MessageComposer$11> continuation) {
        super(2, continuation);
        this.$composerUiEffect = sharedFlow;
        this.$reportAiMessage = str;
        this.$textFieldValue$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageComposerKt$MessageComposer$11(this.$composerUiEffect, this.$reportAiMessage, this.$textFieldValue$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageComposerKt$MessageComposer$11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow<ComposerUiEffect> sharedFlow = this.$composerUiEffect;
            if (sharedFlow == null) {
                return Unit.INSTANCE;
            }
            final String str = this.$reportAiMessage;
            final MutableState<TextFieldValue> mutableState = this.$textFieldValue$delegate;
            this.label = 1;
            if (sharedFlow.collect(new FlowCollector() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$11.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((ComposerUiEffect) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(ComposerUiEffect composerUiEffect, Continuation<? super Unit> continuation) {
                    if (Intrinsics.areEqual(composerUiEffect, ComposerUiEffect.ReportAiAnswer.INSTANCE)) {
                        MutableState<TextFieldValue> mutableState2 = mutableState;
                        String str2 = str;
                        mutableState2.setValue(new TextFieldValue(str2, TextRangeKt.TextRange(str2.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                    } else {
                        if (!(composerUiEffect instanceof ComposerUiEffect.UpdateTranscribedText)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ComposerUiEffect.UpdateTranscribedText updateTranscribedText = (ComposerUiEffect.UpdateTranscribedText) composerUiEffect;
                        mutableState.setValue(new TextFieldValue(updateTranscribedText.getText(), TextRangeKt.TextRange(updateTranscribedText.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                    }
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
