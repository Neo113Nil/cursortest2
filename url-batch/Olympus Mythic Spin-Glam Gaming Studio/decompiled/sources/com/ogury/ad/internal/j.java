package com.ogury.ad.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class j extends ContinuationImpl {
    public l a;
    public b b;
    public Object c;
    public we d;
    public ze e;
    public /* synthetic */ Object f;
    public final /* synthetic */ l g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, null, null, this);
    }
}
