package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.pk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4267pk extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C4425vk b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4267pk(C4425vk c4425vk, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4425vk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((ContinuationImpl) this);
    }
}
