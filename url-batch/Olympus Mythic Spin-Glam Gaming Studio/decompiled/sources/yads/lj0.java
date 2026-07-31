package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class lj0 extends ContinuationImpl {
    public i5 b;
    public h5 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ pj0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj0(pj0 pj0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = pj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}
