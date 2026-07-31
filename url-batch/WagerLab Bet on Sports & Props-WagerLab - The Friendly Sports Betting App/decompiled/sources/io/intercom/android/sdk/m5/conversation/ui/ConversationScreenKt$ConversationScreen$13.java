package io.intercom.android.sdk.m5.conversation.ui;

import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ConversationScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
/* synthetic */ class ConversationScreenKt$ConversationScreen$13 extends FunctionReferenceImpl implements Function0<Unit> {
    ConversationScreenKt$ConversationScreen$13(Object obj) {
        super(0, obj, ConversationViewModel.class, "stopVoiceRecordingAndTranscribe", "stopVoiceRecordingAndTranscribe()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ConversationViewModel) this.receiver).stopVoiceRecordingAndTranscribe();
    }
}
