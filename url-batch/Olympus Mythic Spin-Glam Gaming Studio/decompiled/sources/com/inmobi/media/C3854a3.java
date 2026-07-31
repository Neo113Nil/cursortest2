package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.a3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C3854a3 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C3932d3 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3854a3(C3932d3 c3932d3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c3932d3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(0, 0, this);
    }
}
