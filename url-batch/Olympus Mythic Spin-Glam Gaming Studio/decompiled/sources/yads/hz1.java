package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class hz1 extends ContinuationImpl {
    public dz1 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ kz1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz1(kz1 kz1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = kz1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((Context) null, (dz1) null, this);
    }
}
