package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class ud0 extends ContinuationImpl {
    public d8 b;
    public long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ vd0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud0(vd0 vd0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = vd0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, 0L, this);
    }
}
