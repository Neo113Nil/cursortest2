package yads;

import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes4.dex */
public final class m62 {
    public final /* synthetic */ CancellableContinuationImpl a;

    public m62(CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = cancellableContinuationImpl;
    }

    public final void a() {
        CancellableContinuationImpl cancellableContinuationImpl = this.a;
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
    }
}
