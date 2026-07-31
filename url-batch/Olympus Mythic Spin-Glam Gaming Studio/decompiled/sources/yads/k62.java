package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class k62 extends ContinuationImpl {
    public boolean b;
    public Object c;
    public z30 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ n62 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k62(n62 n62Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = n62Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(false, (Context) null, (dz1) null, (z30) null, (ContinuationImpl) this);
    }
}
