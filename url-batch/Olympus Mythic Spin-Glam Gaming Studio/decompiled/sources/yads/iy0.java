package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes11.dex */
public final class iy0 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ jy0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy0(jy0 jy0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = jy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
