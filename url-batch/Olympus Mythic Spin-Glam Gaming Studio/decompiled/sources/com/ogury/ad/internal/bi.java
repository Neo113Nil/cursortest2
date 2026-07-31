package com.ogury.ad.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class bi extends ContinuationImpl {
    public ci a;
    public b b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ci e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(ci ciVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = ciVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, 0, 0, 0, this);
    }
}
