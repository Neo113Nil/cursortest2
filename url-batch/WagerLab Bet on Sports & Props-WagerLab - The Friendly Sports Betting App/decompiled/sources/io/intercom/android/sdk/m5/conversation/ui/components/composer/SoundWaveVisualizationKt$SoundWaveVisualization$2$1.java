package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
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
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.components.composer.SoundWaveVisualizationKt$SoundWaveVisualization$2$1", f = "SoundWaveVisualization.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class SoundWaveVisualizationKt$SoundWaveVisualization$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<Float> $amplitude$delegate;
    final /* synthetic */ DrawingConstants $drawingConstants;
    final /* synthetic */ MutableFloatState $lastRawAmplitude$delegate;
    final /* synthetic */ MutableFloatState $smoothedAmplitude$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SoundWaveVisualizationKt$SoundWaveVisualization$2$1(DrawingConstants drawingConstants, State<Float> state, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, Continuation<? super SoundWaveVisualizationKt$SoundWaveVisualization$2$1> continuation) {
        super(2, continuation);
        this.$drawingConstants = drawingConstants;
        this.$amplitude$delegate = state;
        this.$lastRawAmplitude$delegate = mutableFloatState;
        this.$smoothedAmplitude$delegate = mutableFloatState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SoundWaveVisualizationKt$SoundWaveVisualization$2$1(this.$drawingConstants, this.$amplitude$delegate, this.$lastRawAmplitude$delegate, this.$smoothedAmplitude$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SoundWaveVisualizationKt$SoundWaveVisualization$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float SoundWaveVisualization_FNF3uiM$lambda$0;
        float SoundWaveVisualization_FNF3uiM$lambda$17;
        float SoundWaveVisualization_FNF3uiM$lambda$14;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            SoundWaveVisualization_FNF3uiM$lambda$0 = SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$0(this.$amplitude$delegate);
            SoundWaveVisualization_FNF3uiM$lambda$17 = SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$17(this.$lastRawAmplitude$delegate);
            if (Math.abs(SoundWaveVisualization_FNF3uiM$lambda$0 - SoundWaveVisualization_FNF3uiM$lambda$17) >= this.$drawingConstants.getAmplitudeDeadZone()) {
                MutableFloatState mutableFloatState = this.$smoothedAmplitude$delegate;
                float amplitudeSmoothingFactor = this.$drawingConstants.getAmplitudeSmoothingFactor() * SoundWaveVisualization_FNF3uiM$lambda$0;
                float amplitudeSmoothingFactor2 = 1.0f - this.$drawingConstants.getAmplitudeSmoothingFactor();
                SoundWaveVisualization_FNF3uiM$lambda$14 = SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$14(this.$smoothedAmplitude$delegate);
                mutableFloatState.setFloatValue(amplitudeSmoothingFactor + (amplitudeSmoothingFactor2 * SoundWaveVisualization_FNF3uiM$lambda$14));
                this.$lastRawAmplitude$delegate.setFloatValue(SoundWaveVisualization_FNF3uiM$lambda$0);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
