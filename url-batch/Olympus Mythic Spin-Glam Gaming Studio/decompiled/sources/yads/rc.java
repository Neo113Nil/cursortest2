package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class rc extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ tc c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(tc tcVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = tcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
