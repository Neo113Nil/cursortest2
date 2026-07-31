package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BufferedChannel.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class BufferedChannel$bindCancellationFun$2 extends FunctionReferenceImpl implements Function3 {
    BufferedChannel$bindCancellationFun$2(Object obj) {
        super(3, obj, BufferedChannel.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Throwable) obj, obj2, (CoroutineContext) obj3);
        return Unit.INSTANCE;
    }

    public final void invoke(Throwable th, Object obj, CoroutineContext coroutineContext) {
        ((BufferedChannel) this.receiver).onCancellationImplDoNotCall(th, obj, coroutineContext);
    }
}
