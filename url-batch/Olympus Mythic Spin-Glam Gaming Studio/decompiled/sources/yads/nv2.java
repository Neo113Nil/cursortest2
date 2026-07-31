package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class nv2 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ pv2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv2(pv2 pv2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = pv2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return pv2.a(this.c, null, this);
    }
}
