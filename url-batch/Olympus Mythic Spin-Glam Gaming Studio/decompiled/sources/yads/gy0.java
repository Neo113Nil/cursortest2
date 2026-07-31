package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class gy0 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ hy0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy0(hy0 hy0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = hy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
