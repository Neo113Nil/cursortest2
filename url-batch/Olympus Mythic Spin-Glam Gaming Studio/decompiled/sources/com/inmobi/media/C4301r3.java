package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.r3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4301r3 extends ContinuationImpl {
    public Z2 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4328s3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4301r3(C4328s3 c4328s3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c4328s3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
