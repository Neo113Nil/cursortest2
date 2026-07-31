package expo.modules.devmenu.fab;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MovableFloatingActionButton.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3$2$2$1$1$1$2$1", f = "MovableFloatingActionButton.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class MovableFloatingActionButtonKt$MovableFloatingActionButton$3$2$2$1$1$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatedOffset;
    final /* synthetic */ Ref.LongRef $dragOffset;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MovableFloatingActionButtonKt$MovableFloatingActionButton$3$2$2$1$1$1$2$1(Animatable<Offset, AnimationVector2D> animatable, Ref.LongRef longRef, Continuation<? super MovableFloatingActionButtonKt$MovableFloatingActionButton$3$2$2$1$1$1$2$1> continuation) {
        super(2, continuation);
        this.$animatedOffset = animatable;
        this.$dragOffset = longRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MovableFloatingActionButtonKt$MovableFloatingActionButton$3$2$2$1$1$1$2$1(this.$animatedOffset, this.$dragOffset, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MovableFloatingActionButtonKt$MovableFloatingActionButton$3$2$2$1$1$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (Animatable.animateTo$default(this.$animatedOffset, Offset.m5402boximpl(this.$dragOffset.element), null, null, null, this, 14, null) == coroutine_suspended) {
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
