package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes10.dex */
public final class Dj extends ContinuationImpl {
    public Bj a;
    public Bj b;
    public Mutex c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Ej e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dj(Ej ej, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = ej;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
