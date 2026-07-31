package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.z6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4516z6 extends ContinuationImpl {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C6 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4516z6(C6 c6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return C6.a(this.c, this);
    }
}
