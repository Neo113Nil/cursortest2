package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.m7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4174m7 extends ContinuationImpl {
    public long a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C4385u7 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4174m7(C4385u7 c4385u7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c4385u7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
