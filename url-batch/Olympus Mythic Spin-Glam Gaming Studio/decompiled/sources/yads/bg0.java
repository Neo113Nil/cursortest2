package yads;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes13.dex */
public final class bg0 extends Lambda implements Function1 {
    public final /* synthetic */ CancellableContinuationImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg0(CancellableContinuationImpl cancellableContinuationImpl) {
        super(1);
        this.b = cancellableContinuationImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (this.b.isActive()) {
            CancellableContinuationImpl cancellableContinuationImpl = this.b;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(th)));
        }
        return Unit.INSTANCE;
    }
}
