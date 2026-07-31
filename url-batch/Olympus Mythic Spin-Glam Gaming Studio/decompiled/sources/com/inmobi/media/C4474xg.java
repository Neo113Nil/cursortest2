package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.xg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4474xg extends ContinuationImpl {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AbstractC4500yg c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4474xg(AbstractC4500yg abstractC4500yg, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = abstractC4500yg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((String) null, this);
    }
}
