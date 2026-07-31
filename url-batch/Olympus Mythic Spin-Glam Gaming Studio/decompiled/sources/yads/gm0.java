package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class gm0 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ hm0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm0(hm0 hm0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = hm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
