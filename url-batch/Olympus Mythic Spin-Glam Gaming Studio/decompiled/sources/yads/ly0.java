package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class ly0 extends ContinuationImpl {
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ my0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly0(my0 my0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = my0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
