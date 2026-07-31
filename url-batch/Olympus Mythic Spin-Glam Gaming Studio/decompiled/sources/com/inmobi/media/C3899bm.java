package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.bm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3899bm extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C3979em b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3899bm(C3979em c3979em, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c3979em;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((String) null, this);
    }
}
