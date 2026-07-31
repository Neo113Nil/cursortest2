package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.sk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4345sk extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    public C4345sk(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return C4425vk.b(this);
    }
}
