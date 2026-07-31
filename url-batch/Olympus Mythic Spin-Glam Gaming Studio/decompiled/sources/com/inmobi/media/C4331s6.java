package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.s6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4331s6 extends ContinuationImpl {
    public long a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C4358t6 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4331s6(C4358t6 c4358t6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c4358t6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(0L, 0L, this);
    }
}
