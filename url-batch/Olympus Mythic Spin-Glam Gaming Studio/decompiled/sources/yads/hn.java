package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class hn extends ContinuationImpl {
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ in d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(in inVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = inVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return in.a(this.d, null, null, this);
    }
}
