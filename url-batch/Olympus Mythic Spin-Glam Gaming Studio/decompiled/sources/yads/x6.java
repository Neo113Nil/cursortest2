package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class x6 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ z6 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(z6 z6Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = z6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, null, this);
    }
}
