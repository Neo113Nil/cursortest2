package yads;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class yf extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ bg c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf(bg bgVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = bgVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object a = this.c.a(this);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
    }
}
