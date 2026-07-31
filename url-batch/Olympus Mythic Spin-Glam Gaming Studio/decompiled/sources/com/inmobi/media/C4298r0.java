package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.r0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4298r0 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C4325s0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4298r0(C4325s0 c4325s0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4325s0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
