package yads;

import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes6.dex */
public final class n52 implements wd3 {
    public final /* synthetic */ CancellableContinuationImpl a;

    public n52(CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = cancellableContinuationImpl;
    }

    @Override // yads.wd3
    public final void a() {
        CancellableContinuationImpl cancellableContinuationImpl = this.a;
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
    }
}
