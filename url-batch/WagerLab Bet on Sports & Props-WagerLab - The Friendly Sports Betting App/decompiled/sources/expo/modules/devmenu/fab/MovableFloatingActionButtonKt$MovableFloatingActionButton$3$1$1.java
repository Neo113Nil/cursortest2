package expo.modules.devmenu.fab;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.geometry.Offset;
import expo.modules.devmenu.fab.ExpoVelocityTracker;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MovableFloatingActionButton.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3$1$1", f = "MovableFloatingActionButton.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class MovableFloatingActionButtonKt$MovableFloatingActionButton$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatedOffset;
    final /* synthetic */ long $bounds;
    final /* synthetic */ Offset $previousBounds;
    final /* synthetic */ long $totalFabSizePx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MovableFloatingActionButtonKt$MovableFloatingActionButton$3$1$1(Offset offset, Animatable<Offset, AnimationVector2D> animatable, long j, long j2, Continuation<? super MovableFloatingActionButtonKt$MovableFloatingActionButton$3$1$1> continuation) {
        super(2, continuation);
        this.$previousBounds = offset;
        this.$animatedOffset = animatable;
        this.$bounds = j;
        this.$totalFabSizePx = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MovableFloatingActionButtonKt$MovableFloatingActionButton$3$1$1(this.$previousBounds, this.$animatedOffset, this.$bounds, this.$totalFabSizePx, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MovableFloatingActionButtonKt$MovableFloatingActionButton$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Offset offset = this.$previousBounds;
            if (offset != null) {
                Animatable<Offset, AnimationVector2D> animatable = this.$animatedOffset;
                long j = this.$bounds;
                long j2 = this.$totalFabSizePx;
                offset.m5423unboximpl();
                float intBitsToFloat = Float.intBitsToFloat((int) (animatable.getValue().m5423unboximpl() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (animatable.getValue().m5423unboximpl() & 4294967295L));
                float intBitsToFloat3 = (intBitsToFloat / Float.intBitsToFloat((int) (offset.m5423unboximpl() >> 32))) * Float.intBitsToFloat((int) (j >> 32));
                float intBitsToFloat4 = (intBitsToFloat2 / Float.intBitsToFloat((int) (offset.m5423unboximpl() & 4294967295L))) * Float.intBitsToFloat((int) (j & 4294967295L));
                Offset m5402boximpl = Offset.m5402boximpl(FabUtilsKt.m10883calculateTargetPositionIEwrmTk(Offset.m5405constructorimpl((Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L)), new ExpoVelocityTracker.PointF(0.0f, 0.0f), j, Float.intBitsToFloat((int) (j2 >> 32))));
                this.label = 1;
                if (animatable.snapTo(m5402boximpl, this) == coroutine_suspended) {
                    return coroutine_suspended;
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
