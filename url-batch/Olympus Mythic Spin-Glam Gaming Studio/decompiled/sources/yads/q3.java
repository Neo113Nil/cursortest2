package yads;

import android.view.View;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class q3 extends ContinuationImpl {
    public View b;
    public kf1 c;
    public k52 d;
    public g32 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ r3 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(r3 r3Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = r3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, null, null, null, null, this);
    }
}
