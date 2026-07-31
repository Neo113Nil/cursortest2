package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.material.MenuKt;
import androidx.media3.extractor.ts.TsExtractor;
import expo.modules.notifications.serverregistration.InstallationId;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SendMediaUseCase.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase", f = "SendMediaUseCase.kt", i = {0, 0, 0, 0, 1, 2, 2, 2, 2, 3}, l = {MenuKt.InTransitionDuration, TsExtractor.TS_STREAM_TYPE_AC3, 132, 182}, m = "sendMedia", n = {"this", "clientState", "uiEffect", InstallationId.LEGACY_PREFERENCES_UUID_KEY, "compressedMediaData", "this", "clientState", InstallationId.LEGACY_PREFERENCES_UUID_KEY, "compressedMediaData", "compressedMediaData"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$0", "L$1", "L$2", "L$3", "L$0"})
/* loaded from: classes8.dex */
final class SendMediaUseCase$sendMedia$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendMediaUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendMediaUseCase$sendMedia$1(SendMediaUseCase sendMediaUseCase, Continuation<? super SendMediaUseCase$sendMedia$1> continuation) {
        super(continuation);
        this.this$0 = sendMediaUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object sendMedia;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendMedia = this.this$0.sendMedia(null, null, null, null, this);
        return sendMedia;
    }
}
