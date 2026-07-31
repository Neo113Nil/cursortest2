package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.y3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4487y3 extends ContinuationImpl {
    public Z2 a;
    public C3851a0 b;
    public InterfaceC4466x9 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ E3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4487y3(E3 e3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = e3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, null, this);
    }
}
