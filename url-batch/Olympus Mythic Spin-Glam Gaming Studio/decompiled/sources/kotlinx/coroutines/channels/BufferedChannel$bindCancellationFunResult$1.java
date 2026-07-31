package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BufferedChannel.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class BufferedChannel$bindCancellationFunResult$1 extends FunctionReferenceImpl implements Function3 {
    BufferedChannel$bindCancellationFunResult$1(Object obj) {
        super(3, obj, BufferedChannel.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m8218invoke5_sEAP8((Throwable) obj, ((ChannelResult) obj2).m8228unboximpl(), (CoroutineContext) obj3);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-5_sEAP8, reason: not valid java name */
    public final void m8218invoke5_sEAP8(Throwable th, Object obj, CoroutineContext coroutineContext) {
        ((BufferedChannel) this.receiver).m8211onCancellationChannelResultImplDoNotCall5_sEAP8(th, obj, coroutineContext);
    }
}
