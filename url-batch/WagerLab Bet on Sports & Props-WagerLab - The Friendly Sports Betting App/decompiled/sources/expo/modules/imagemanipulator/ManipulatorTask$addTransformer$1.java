package expo.modules.imagemanipulator;

import expo.modules.imagemanipulator.transformers.ImageTransformer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: ImageManipulatorContext.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lexpo/modules/imagemanipulator/ManipulatorResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.imagemanipulator.ManipulatorTask$addTransformer$1", f = "ImageManipulatorContext.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class ManipulatorTask$addTransformer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ManipulatorResult>, Object> {
    final /* synthetic */ Deferred<ManipulatorResult> $oldTask;
    final /* synthetic */ ImageTransformer $transformer;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManipulatorTask$addTransformer$1(Deferred<ManipulatorResult> deferred, ImageTransformer imageTransformer, Continuation<? super ManipulatorTask$addTransformer$1> continuation) {
        super(2, continuation);
        this.$oldTask = deferred;
        this.$transformer = imageTransformer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ManipulatorTask$addTransformer$1(this.$oldTask, this.$transformer, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ManipulatorResult> continuation) {
        return ((ManipulatorTask$addTransformer$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.$oldTask.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((ManipulatorResult) obj).map(this.$transformer);
    }
}
