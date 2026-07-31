package yads;

import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes10.dex */
public final class iv0 implements vp2 {
    public final /* synthetic */ CancellableContinuationImpl a;

    public iv0(CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = cancellableContinuationImpl;
    }

    @Override // yads.vp2
    public final void a(hm3 hm3Var) {
        boolean z = ob1.a;
        this.a.resumeWith(Result.m8023constructorimpl(null));
    }
}
