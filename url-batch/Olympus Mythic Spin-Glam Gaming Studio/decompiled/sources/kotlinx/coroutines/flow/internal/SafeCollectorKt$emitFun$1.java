package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: SafeCollector.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements Function3 {
    public static final SafeCollectorKt$emitFun$1 INSTANCE = new SafeCollectorKt$emitFun$1();

    SafeCollectorKt$emitFun$1() {
        super(3, FlowCollector.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector flowCollector, Object obj, Continuation continuation) {
        return flowCollector.emit(obj, continuation);
    }
}
