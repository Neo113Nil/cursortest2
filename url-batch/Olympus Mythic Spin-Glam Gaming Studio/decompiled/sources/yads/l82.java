package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class l82 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ o82 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l82(o82 o82Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = o82Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return o82.a(this.c, null, this);
    }
}
