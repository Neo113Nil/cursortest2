package yads;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class ag extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ bg c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(bg bgVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = bgVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object b = this.c.b(this);
        return b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Result.m8022boximpl(b);
    }
}
