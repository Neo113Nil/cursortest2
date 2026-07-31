package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.rk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4319rk extends ContinuationImpl {
    public Dk a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C4425vk d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4319rk(C4425vk c4425vk, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c4425vk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
