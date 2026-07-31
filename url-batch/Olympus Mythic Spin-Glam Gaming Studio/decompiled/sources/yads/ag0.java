package yads;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes9.dex */
public final class ag0 extends Lambda implements Function0 {
    public final /* synthetic */ CancellableContinuationImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag0(CancellableContinuationImpl cancellableContinuationImpl) {
        super(0);
        this.b = cancellableContinuationImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        if (this.b.isActive()) {
            CancellableContinuationImpl cancellableContinuationImpl = this.b;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(Result.m8022boximpl(Result.m8023constructorimpl(Unit.INSTANCE))));
        }
        return Unit.INSTANCE;
    }
}
