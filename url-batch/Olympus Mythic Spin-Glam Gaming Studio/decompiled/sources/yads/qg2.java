package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class qg2 extends ContinuationImpl {
    public mg2 b;
    public qu c;
    public /* synthetic */ Object d;
    public final /* synthetic */ sg2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg2(sg2 sg2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = sg2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((Context) null, (mg2) null, this);
    }
}
