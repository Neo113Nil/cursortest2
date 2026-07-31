package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class oh2 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ rh2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh2(rh2 rh2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = rh2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return rh2.a(this.c, null, null, null, null, 0L, this);
    }
}
