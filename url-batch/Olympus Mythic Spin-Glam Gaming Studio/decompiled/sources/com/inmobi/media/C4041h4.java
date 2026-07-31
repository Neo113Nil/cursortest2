package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.h4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4041h4 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C4067i4 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4041h4(C4067i4 c4067i4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4067i4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
