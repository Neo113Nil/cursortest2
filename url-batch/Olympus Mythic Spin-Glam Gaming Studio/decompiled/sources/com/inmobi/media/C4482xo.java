package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.xo, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4482xo extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C4508yo b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4482xo(C4508yo c4508yo, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4508yo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
