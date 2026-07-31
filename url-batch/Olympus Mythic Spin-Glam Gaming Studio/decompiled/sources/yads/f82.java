package yads;

import android.content.Context;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class f82 extends ContinuationImpl {
    public Context b;
    public dz1 c;
    public Object d;
    public h5 e;
    public Iterator f;
    public /* synthetic */ Object g;
    public final /* synthetic */ g82 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f82(g82 g82Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.h = g82Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, null, this);
    }
}
