package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class lv0 extends ContinuationImpl {
    public fn2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pv0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv0(pv0 pv0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = pv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
