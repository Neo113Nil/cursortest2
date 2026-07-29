package expo.modules.updates.procedures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FetchUpdateProcedure.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.procedures.FetchUpdateProcedure", f = "FetchUpdateProcedure.kt", i = {0, 1}, l = {37, 38}, m = "run", n = {"procedureContext", "procedureContext"}, s = {"L$0", "L$0"})
/* loaded from: classes2.dex */
final class FetchUpdateProcedure$run$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FetchUpdateProcedure this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchUpdateProcedure$run$1(FetchUpdateProcedure fetchUpdateProcedure, Continuation<? super FetchUpdateProcedure$run$1> continuation) {
        super(continuation);
        this.this$0 = fetchUpdateProcedure;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.run(null, this);
    }
}
