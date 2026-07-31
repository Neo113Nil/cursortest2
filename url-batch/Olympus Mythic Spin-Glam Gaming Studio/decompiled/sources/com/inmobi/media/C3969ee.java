package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.ee, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3969ee extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C4025ge b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3969ee(C4025ge c4025ge, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4025ge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
