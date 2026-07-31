package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.v9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4414v9 extends ContinuationImpl {
    public C4440w9 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4440w9 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4414v9(C4440w9 c4440w9, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c4440w9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
