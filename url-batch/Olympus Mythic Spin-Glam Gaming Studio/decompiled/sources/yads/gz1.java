package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class gz1 extends ContinuationImpl {
    public ph b;
    public /* synthetic */ Object c;
    public final /* synthetic */ kz1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz1(kz1 kz1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = kz1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return kz1.a(this.d, (ph) null, this);
    }
}
