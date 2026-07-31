package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class be2 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ ge2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be2(ge2 ge2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = ge2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0L, this);
    }
}
