package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class ob0 extends ContinuationImpl {
    public ib0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pb0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob0(pb0 pb0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = pb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
