package yads;

import android.view.View;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class jb0 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ kb0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb0(kb0 kb0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = kb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((View) null, (ib0) null, this);
    }
}
