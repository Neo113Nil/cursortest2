package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes15.dex */
public final class oi2 extends ContinuationImpl {
    public Mutex b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pi2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi2(pi2 pi2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = pi2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
