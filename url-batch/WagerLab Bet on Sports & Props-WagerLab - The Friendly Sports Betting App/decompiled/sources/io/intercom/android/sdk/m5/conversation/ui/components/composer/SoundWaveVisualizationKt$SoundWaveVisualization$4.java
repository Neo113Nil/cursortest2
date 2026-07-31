package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: SoundWaveVisualization.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.components.composer.SoundWaveVisualizationKt$SoundWaveVisualization$4", f = "SoundWaveVisualization.kt", i = {}, l = {385}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class SoundWaveVisualizationKt$SoundWaveVisualization$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableLongState $animationFrameCounter$delegate;
    final /* synthetic */ long $animationFrameRateMs;
    final /* synthetic */ float $animationSpeedPxPerMs;
    final /* synthetic */ MutableFloatState $canvasWidth$delegate;
    final /* synthetic */ float $elementSpacingPx;
    final /* synthetic */ WaveformBuffer $waveformBuffer;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SoundWaveVisualizationKt$SoundWaveVisualization$4(float f, float f2, WaveformBuffer waveformBuffer, long j, MutableFloatState mutableFloatState, MutableLongState mutableLongState, Continuation<? super SoundWaveVisualizationKt$SoundWaveVisualization$4> continuation) {
        super(2, continuation);
        this.$elementSpacingPx = f;
        this.$animationSpeedPxPerMs = f2;
        this.$waveformBuffer = waveformBuffer;
        this.$animationFrameRateMs = j;
        this.$canvasWidth$delegate = mutableFloatState;
        this.$animationFrameCounter$delegate = mutableLongState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SoundWaveVisualizationKt$SoundWaveVisualization$4(this.$elementSpacingPx, this.$animationSpeedPxPerMs, this.$waveformBuffer, this.$animationFrameRateMs, this.$canvasWidth$delegate, this.$animationFrameCounter$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SoundWaveVisualizationKt$SoundWaveVisualization$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float SoundWaveVisualization_FNF3uiM$lambda$5;
        float SoundWaveVisualization_FNF3uiM$lambda$52;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        do {
            SoundWaveVisualization_FNF3uiM$lambda$5 = SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$5(this.$canvasWidth$delegate);
            if (SoundWaveVisualization_FNF3uiM$lambda$5 > 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                SoundWaveVisualization_FNF3uiM$lambda$52 = SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$5(this.$canvasWidth$delegate);
                this.$waveformBuffer.cleanupOldElements(currentTimeMillis, (long) ((SoundWaveVisualization_FNF3uiM$lambda$52 + this.$elementSpacingPx) / this.$animationSpeedPxPerMs));
                this.$animationFrameCounter$delegate.setLongValue(currentTimeMillis);
            }
            this.label = 1;
        } while (DelayKt.delay(this.$animationFrameRateMs, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
