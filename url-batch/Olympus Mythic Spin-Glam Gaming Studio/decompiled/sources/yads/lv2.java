package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class lv2 extends ContinuationImpl {
    public i5 b;
    public h5 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ pv2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv2(pv2 pv2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = pv2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
