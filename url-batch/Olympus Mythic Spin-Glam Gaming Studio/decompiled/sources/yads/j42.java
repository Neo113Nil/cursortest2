package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class j42 extends ContinuationImpl {
    public ri2 b;
    public dz1 c;
    public i5 d;
    public h5 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ m42 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j42(m42 m42Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = m42Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, null, null, this);
    }
}
