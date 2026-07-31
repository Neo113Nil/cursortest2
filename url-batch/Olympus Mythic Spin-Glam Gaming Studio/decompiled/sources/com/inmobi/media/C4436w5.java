package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.w5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4436w5 extends ContinuationImpl {
    public C4053hg a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4462x5 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4436w5(C4462x5 c4462x5, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c4462x5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((C4053hg) null, this);
    }
}
