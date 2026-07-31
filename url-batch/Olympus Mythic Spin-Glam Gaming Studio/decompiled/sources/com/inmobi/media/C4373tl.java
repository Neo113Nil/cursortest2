package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.tl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4373tl extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C4479xl b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4373tl(C4479xl c4479xl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4479xl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
