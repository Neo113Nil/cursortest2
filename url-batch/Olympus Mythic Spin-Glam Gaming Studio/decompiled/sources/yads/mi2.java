package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes5.dex */
public final class mi2 extends ContinuationImpl {
    public jx0 b;
    public Object c;
    public Mutex d;
    public /* synthetic */ Object e;
    public final /* synthetic */ pi2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi2(pi2 pi2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = pi2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, null, this);
    }
}
