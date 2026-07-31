package yads;

import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes13.dex */
public final class dx1 implements ww1 {
    public final ix1 a;
    public final ij1 b;
    public final ex1 c;

    public dx1(ix1 ix1Var, ij1 ij1Var, ex1 ex1Var) {
        this.a = ix1Var;
        this.b = ij1Var;
        this.c = ex1Var;
    }

    @Override // yads.ww1
    public final void a() {
        ix1 ix1Var = this.a;
        ex1 ex1Var = this.c;
        if (ex1Var.a && ex1Var.b.isActive()) {
            CancellableContinuationImpl cancellableContinuationImpl = ex1Var.b;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // yads.ww1
    public final void b() {
        ex1 ex1Var = this.c;
        if (ex1Var.a && ex1Var.b.isActive()) {
            CancellableContinuationImpl cancellableContinuationImpl = ex1Var.b;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
        }
    }
}
