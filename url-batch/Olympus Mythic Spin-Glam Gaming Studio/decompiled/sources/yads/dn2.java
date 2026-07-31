package yads;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.serialization.SerializationException;

/* loaded from: classes5.dex */
public final class dn2 extends Lambda implements Function1 {
    public final /* synthetic */ CancellableContinuationImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn2(CancellableContinuationImpl cancellableContinuationImpl) {
        super(1);
        this.b = cancellableContinuationImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        hm3 hm3Var = (hm3) obj;
        if (hm3Var.getCause() instanceof SerializationException) {
            throw hm3Var;
        }
        CancellableContinuationImpl cancellableContinuationImpl = this.b;
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(Result.m8022boximpl(Result.m8023constructorimpl(ResultKt.createFailure(hm3Var)))));
        return Unit.INSTANCE;
    }
}
