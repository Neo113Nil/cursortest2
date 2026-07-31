package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class q7 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ r7 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(r7 r7Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = r7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, null, null, null, this);
    }
}
