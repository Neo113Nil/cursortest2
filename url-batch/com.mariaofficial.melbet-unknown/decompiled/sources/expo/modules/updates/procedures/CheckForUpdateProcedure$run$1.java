package expo.modules.updates.procedures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CheckForUpdateProcedure.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.procedures.CheckForUpdateProcedure", f = "CheckForUpdateProcedure.kt", i = {0, 0}, l = {44}, m = "run", n = {"procedureContext", "embeddedUpdate"}, s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
final class CheckForUpdateProcedure$run$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckForUpdateProcedure this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckForUpdateProcedure$run$1(CheckForUpdateProcedure checkForUpdateProcedure, Continuation<? super CheckForUpdateProcedure$run$1> continuation) {
        super(continuation);
        this.this$0 = checkForUpdateProcedure;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.run(null, this);
    }
}
