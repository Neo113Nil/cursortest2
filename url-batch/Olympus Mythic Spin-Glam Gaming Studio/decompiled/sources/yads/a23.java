package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes6.dex */
public final class a23 extends ContinuationImpl {
    public Mutex b;
    public /* synthetic */ Object c;
    public final /* synthetic */ b23 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a23(b23 b23Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = b23Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
