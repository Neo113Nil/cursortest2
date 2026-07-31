package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Job;

/* loaded from: classes6.dex */
public final class hv2 extends ContinuationImpl {
    public Object b;
    public i5 c;
    public h5 d;
    public Job e;
    public /* synthetic */ Object f;
    public final /* synthetic */ pv2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv2(pv2 pv2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = pv2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}
