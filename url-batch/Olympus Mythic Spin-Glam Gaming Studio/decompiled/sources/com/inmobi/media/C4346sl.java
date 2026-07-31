package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.sl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4346sl extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    public C4346sl(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return C4479xl.a(this);
    }
}
