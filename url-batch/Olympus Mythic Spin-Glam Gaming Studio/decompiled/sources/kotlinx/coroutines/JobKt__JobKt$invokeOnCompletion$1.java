package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: Job.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class JobKt__JobKt$invokeOnCompletion$1 extends FunctionReferenceImpl implements Function1 {
    JobKt__JobKt$invokeOnCompletion$1(Object obj) {
        super(1, obj, JobNode.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Throwable th) {
        ((JobNode) this.receiver).invoke(th);
    }
}
