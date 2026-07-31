package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes11.dex */
public final class im0 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ jm0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im0(jm0 jm0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = jm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
