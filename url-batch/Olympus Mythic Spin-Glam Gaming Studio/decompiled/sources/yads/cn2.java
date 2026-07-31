package yads;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes3.dex */
public final class cn2 extends Lambda implements Function1 {
    public final /* synthetic */ CancellableContinuationImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn2(CancellableContinuationImpl cancellableContinuationImpl) {
        super(1);
        this.b = cancellableContinuationImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.b.resumeWith(Result.m8023constructorimpl(Result.m8022boximpl(Result.m8023constructorimpl((s80) obj))));
        return Unit.INSTANCE;
    }
}
