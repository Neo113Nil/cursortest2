package expo.modules.imagemanipulator;

import android.graphics.Bitmap;
import expo.modules.imagemanipulator.transformers.ImageTransformer;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* compiled from: ImageManipulatorContext.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0010J\u0006\u0010\u0016\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lexpo/modules/imagemanipulator/ManipulatorTask;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "loader", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Landroid/graphics/Bitmap;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "task", "Lkotlinx/coroutines/Deferred;", "Lexpo/modules/imagemanipulator/ManipulatorResult;", "launchLoader", "addTransformer", "", "transformer", "Lexpo/modules/imagemanipulator/transformers/ImageTransformer;", "render", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reset", "cancel", "expo-image-manipulator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ManipulatorTask {
    private final CoroutineScope coroutineScope;
    private final Function1<Continuation<? super Bitmap>, Object> loader;
    private Deferred<ManipulatorResult> task;

    /* JADX WARN: Multi-variable type inference failed */
    public ManipulatorTask(CoroutineScope coroutineScope, Function1<? super Continuation<? super Bitmap>, ? extends Object> loader) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(loader, "loader");
        this.coroutineScope = coroutineScope;
        this.loader = loader;
        this.task = launchLoader();
    }

    private final Deferred<ManipulatorResult> launchLoader() {
        Deferred<ManipulatorResult> async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this.coroutineScope, null, null, new ManipulatorTask$launchLoader$1(this, null), 3, null);
        return async$default;
    }

    public final void addTransformer(ImageTransformer transformer) {
        Deferred<ManipulatorResult> async$default;
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        async$default = BuildersKt__Builders_commonKt.async$default(this.coroutineScope, null, null, new ManipulatorTask$addTransformer$1(this.task, transformer, null), 3, null);
        this.task = async$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object render(Continuation<? super Bitmap> continuation) {
        ManipulatorTask$render$1 manipulatorTask$render$1;
        int i;
        if (continuation instanceof ManipulatorTask$render$1) {
            manipulatorTask$render$1 = (ManipulatorTask$render$1) continuation;
            if ((manipulatorTask$render$1.label & Integer.MIN_VALUE) != 0) {
                manipulatorTask$render$1.label -= Integer.MIN_VALUE;
                Object obj = manipulatorTask$render$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manipulatorTask$render$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Deferred<ManipulatorResult> deferred = this.task;
                    manipulatorTask$render$1.label = 1;
                    obj = deferred.await(manipulatorTask$render$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((ManipulatorResult) obj).get();
            }
        }
        manipulatorTask$render$1 = new ManipulatorTask$render$1(this, continuation);
        Object obj2 = manipulatorTask$render$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manipulatorTask$render$1.label;
        if (i != 0) {
        }
        return ((ManipulatorResult) obj2).get();
    }

    public final void reset() {
        Job.DefaultImpls.cancel$default((Job) this.task, (CancellationException) null, 1, (Object) null);
        this.task = launchLoader();
    }

    public final void cancel() {
        Job.DefaultImpls.cancel$default((Job) this.task, (CancellationException) null, 1, (Object) null);
    }
}
