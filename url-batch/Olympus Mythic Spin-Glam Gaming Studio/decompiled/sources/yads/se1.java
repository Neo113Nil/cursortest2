package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class se1 extends ContinuationImpl {
    public bu2 b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ve1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se1(ve1 ve1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = ve1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}
