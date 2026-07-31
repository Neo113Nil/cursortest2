package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* renamed from: com.inmobi.media.nf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4209nf extends ContinuationImpl {
    public Mutex a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4288qf c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4209nf(C4288qf c4288qf, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c4288qf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(this);
    }
}
