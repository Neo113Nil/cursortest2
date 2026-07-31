package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes10.dex */
public final class Ab extends ContinuationImpl {
    public String a;
    public Object b;
    public Mutex c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Cb e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ab(Cb cb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = cb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
