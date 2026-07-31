package yads;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes.dex */
public final class ni2 extends ContinuationImpl {
    public jx0 b;
    public Mutex c;
    public /* synthetic */ Object d;
    public final /* synthetic */ pi2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni2(pi2 pi2Var, Continuation continuation) {
        super(continuation);
        this.e = pi2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
