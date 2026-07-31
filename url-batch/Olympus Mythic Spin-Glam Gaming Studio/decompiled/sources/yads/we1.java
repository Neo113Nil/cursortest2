package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class we1 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ xe1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we1(xe1 xe1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = xe1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
