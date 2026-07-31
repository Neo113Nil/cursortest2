package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes11.dex */
public final class rg2 extends ContinuationImpl {
    public Context b;
    public Iterator c;
    public mg2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ sg2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg2(sg2 sg2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = sg2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a((Context) null, (List) null, this);
    }
}
