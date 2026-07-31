package expo.modules.devmenu.fab;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
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
@DebugMetadata(c = "expo.modules.devmenu.fab.MovableFloatingActionButtonKt$handleRelease$1", f = "MovableFloatingActionButton.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class MovableFloatingActionButtonKt$handleRelease$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatedOffset;
    final /* synthetic */ long $newOffset;
    final /* synthetic */ ExpoVelocityTracker.PointF $velocity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MovableFloatingActionButtonKt$handleRelease$1(Animatable<Offset, AnimationVector2D> animatable, long j, ExpoVelocityTracker.PointF pointF, Continuation<? super MovableFloatingActionButtonKt$handleRelease$1> continuation) {
        super(2, continuation);
        this.$animatedOffset = animatable;
        this.$newOffset = j;
        this.$velocity = pointF;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MovableFloatingActionButtonKt$handleRelease$1(this.$animatedOffset, this.$newOffset, this.$velocity, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MovableFloatingActionButtonKt$handleRelease$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Animatable<Offset, AnimationVector2D> animatable = this.$animatedOffset;
            Offset m5402boximpl = Offset.m5402boximpl(this.$newOffset);
            SpringSpec spring$default = AnimationSpecKt.spring$default(0.65f, 200.0f, null, 4, null);
            float x = this.$velocity.getX();
            float y = this.$velocity.getY();
            long floatToRawIntBits = Float.floatToRawIntBits(x);
            long floatToRawIntBits2 = Float.floatToRawIntBits(y) & 4294967295L;
            this.label = 1;
            if (Animatable.animateTo$default(animatable, m5402boximpl, spring$default, Offset.m5402boximpl(Offset.m5405constructorimpl(floatToRawIntBits2 | (floatToRawIntBits << 32))), null, this, 8, null) == coroutine_suspended) {
                return coroutine_suspended;
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
