package yads;

import android.view.View;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes3.dex */
public final class r0 extends ContinuationImpl {
    public View b;
    public Ref$ObjectRef c;
    public Iterator d;
    public /* synthetic */ Object e;
    public final /* synthetic */ s0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = s0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, null, this);
    }
}
