package io.intercom.android.sdk.m5.conversation.utils.audio;

import android.media.MediaRecorder;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: AudioRecordingManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.utils.audio.AudioRecordingManager$startAmplitudeMonitoring$1", f = "AudioRecordingManager.kt", i = {0}, l = {346}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class AudioRecordingManager$startAmplitudeMonitoring$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MediaRecorder $recorder;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AudioRecordingManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AudioRecordingManager$startAmplitudeMonitoring$1(MediaRecorder mediaRecorder, AudioRecordingManager audioRecordingManager, Continuation<? super AudioRecordingManager$startAmplitudeMonitoring$1> continuation) {
        super(2, continuation);
        this.$recorder = mediaRecorder;
        this.this$0 = audioRecordingManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AudioRecordingManager$startAmplitudeMonitoring$1 audioRecordingManager$startAmplitudeMonitoring$1 = new AudioRecordingManager$startAmplitudeMonitoring$1(this.$recorder, this.this$0, continuation);
        audioRecordingManager$startAmplitudeMonitoring$1.L$0 = obj;
        return audioRecordingManager$startAmplitudeMonitoring$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioRecordingManager$startAmplitudeMonitoring$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        MutableStateFlow mutableStateFlow;
        float normalizeAmplitude;
        MutableStateFlow mutableStateFlow2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (CoroutineScopeKt.isActive(coroutineScope)) {
            try {
                normalizeAmplitude = this.this$0.normalizeAmplitude(this.$recorder.getMaxAmplitude());
                mutableStateFlow2 = this.this$0._amplitudeLevel;
                mutableStateFlow2.setValue(Boxing.boxFloat(normalizeAmplitude));
            } catch (Exception unused) {
                mutableStateFlow = this.this$0._amplitudeLevel;
                mutableStateFlow.setValue(Boxing.boxFloat(0.0f));
            }
            this.L$0 = coroutineScope;
            this.label = 1;
            if (DelayKt.delay(60L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
