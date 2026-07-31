package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.jg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4105jg extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C4131kg b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4105jg(C4131kg c4131kg, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4131kg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
