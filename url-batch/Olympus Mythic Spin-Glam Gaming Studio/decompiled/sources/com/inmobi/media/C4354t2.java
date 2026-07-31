package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* renamed from: com.inmobi.media.t2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4354t2 extends ContinuationImpl {
    public Mutex a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AbstractC4459x2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4354t2(AbstractC4459x2 abstractC4459x2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = abstractC4459x2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return AbstractC4459x2.a(this.c, this);
    }
}
