package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.runtime.MutableFloatState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SoundWaveVisualization.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.components.composer.SoundWaveVisualizationKt$SoundWaveVisualization$1", f = "SoundWaveVisualization.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class SoundWaveVisualizationKt$SoundWaveVisualization$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableFloatState $canvasWidth$delegate;
    final /* synthetic */ float $elementSpacingPx;
    final /* synthetic */ WaveformBuffer $waveformBuffer;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SoundWaveVisualizationKt$SoundWaveVisualization$1(float f, WaveformBuffer waveformBuffer, MutableFloatState mutableFloatState, Continuation<? super SoundWaveVisualizationKt$SoundWaveVisualization$1> continuation) {
        super(2, continuation);
        this.$elementSpacingPx = f;
        this.$waveformBuffer = waveformBuffer;
        this.$canvasWidth$delegate = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SoundWaveVisualizationKt$SoundWaveVisualization$1(this.$elementSpacingPx, this.$waveformBuffer, this.$canvasWidth$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SoundWaveVisualizationKt$SoundWaveVisualization$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float SoundWaveVisualization_FNF3uiM$lambda$5;
        float SoundWaveVisualization_FNF3uiM$lambda$52;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            SoundWaveVisualization_FNF3uiM$lambda$5 = SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$5(this.$canvasWidth$delegate);
            if (SoundWaveVisualization_FNF3uiM$lambda$5 > 0.0f) {
                SoundWaveVisualization_FNF3uiM$lambda$52 = SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$5(this.$canvasWidth$delegate);
                this.$waveformBuffer.resizeBuffer(SoundWaveVisualizationKt.calculateOptimalBufferSize(SoundWaveVisualization_FNF3uiM$lambda$52, this.$elementSpacingPx));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
