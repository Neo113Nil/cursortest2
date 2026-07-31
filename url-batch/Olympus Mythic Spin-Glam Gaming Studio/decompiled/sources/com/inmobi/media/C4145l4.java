package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.l4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4145l4 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C4277q4 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4145l4(C4277q4 c4277q4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4277q4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
