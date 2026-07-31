package yads;

import java.util.List;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes4.dex */
public final class gh3 implements vo2 {
    public final /* synthetic */ CancellableContinuationImpl a;

    public gh3(CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = cancellableContinuationImpl;
    }

    @Override // yads.vo2
    public final void a(le3 le3Var) {
        le3Var.a();
        boolean z = ob1.a;
        if (this.a.isActive()) {
            CancellableContinuationImpl cancellableContinuationImpl = this.a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(new dh3(le3Var)));
        }
    }

    @Override // yads.vo2
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        if (this.a.isActive()) {
            CancellableContinuationImpl cancellableContinuationImpl = this.a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(new eh3(list)));
        }
    }
}
