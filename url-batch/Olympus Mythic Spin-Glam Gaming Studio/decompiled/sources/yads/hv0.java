package yads;

import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes6.dex */
public final class hv0 implements wp2 {
    public final /* synthetic */ CancellableContinuationImpl a;

    public hv0(CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = cancellableContinuationImpl;
    }

    @Override // yads.wp2
    public final void a(Object obj) {
        this.a.resumeWith(Result.m8023constructorimpl((byte[]) obj));
    }
}
