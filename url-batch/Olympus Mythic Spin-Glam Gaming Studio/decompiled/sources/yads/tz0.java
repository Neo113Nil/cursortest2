package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class tz0 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ uz0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz0(uz0 uz0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = uz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
