package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.el, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3978el extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C4084il b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3978el(C4084il c4084il, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4084il;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((ContinuationImpl) this);
    }
}
