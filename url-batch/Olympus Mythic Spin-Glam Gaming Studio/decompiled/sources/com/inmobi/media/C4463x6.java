package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.x6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4463x6 extends ContinuationImpl {
    public int a;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C6 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4463x6(C6 c6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = c6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(0, this);
    }
}
