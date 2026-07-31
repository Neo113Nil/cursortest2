package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.o6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4227o6 extends ContinuationImpl {
    public long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4358t6 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4227o6(C4358t6 c4358t6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c4358t6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0L, this);
    }
}
