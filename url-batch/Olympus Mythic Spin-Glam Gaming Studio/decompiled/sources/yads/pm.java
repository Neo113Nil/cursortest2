package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class pm extends ContinuationImpl {
    public i5 b;
    public h5 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ wm e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm(wm wmVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = wmVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
