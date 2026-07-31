package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.s, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4324s extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C4430w b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4324s(C4430w c4430w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4430w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return C4430w.a(this.b, null, null, 0, this);
    }
}
